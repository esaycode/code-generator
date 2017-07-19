<#include "/macro.include"/>
<#include "/java_copyright.include">
<#assign className = table.className>
<#assign classNameLower = className?uncap_first> 
package ${basepackage}.imp.mybatis;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ${basepackage}.${className}Dao;
import ${basepackage}.imp.mybatis.mapper.${className}Mapper;
import ${basepackage}.model.${className}Model;

@Repository
public class ${className}DaoImpl implements UserDao{

	@Autowired
	${className}Mapper ${classNameLower}Mapper;

	@Override
	public int deleteByPrimaryKey(Object primaryKey) {
		assert (primaryKey != null);
		return ${classNameLower}Mapper.deleteByPrimaryKey((Long) primaryKey);
	}

	@Override
	public int deleteByPrimaryKeys(Object... primaryKeys) {
		assert (primaryKeys != null);
		return ${classNameLower}Mapper.deleteByPrimaryKeys(Arrays.asList((Long[]) primaryKeys));
	}

	@Override
	public int deleteByEntry(UserModel entity) {
		assert (entity != null);
		return ${classNameLower}Mapper.deleteByEntry(entity);
	}

	@Override
	public void insert(UserModel entity) {
		assert (entity != null);
		${classNameLower}Mapper.insert(entity);
	}

	@Override
	public void inserts(UserModel... entries) {
		assert (entries != null);
		${classNameLower}Mapper.inserts(Arrays.asList(entries));
	}

	@Override
	public int update(UserModel entity) {
		assert (entity != null);
		return ${classNameLower}Mapper.update(entity);
	}

	@Override
	public int updateByPrimaryKeys(UserModel entity, Object... primaryKeys) {
		assert (entity != null && primaryKeys != null);
		return ${classNameLower}Mapper.updateByPrimaryKeys(entity, Arrays.asList((Long[]) primaryKeys));

	}

	@Override
	public int updateByExample(UserModel entity, UserModel example) {
		assert (entity != null && example != null);
		return ${classNameLower}Mapper.updateByExample(entity, example);	
	}

	@Override
	public int updateNotNull(UserModel entity) {
		assert (entity != null);
		return ${classNameLower}Mapper.updateNotNull(entity);
	}

	@Override
	public int updateByPrimaryKeysNotNull(UserModel entity, Object... primaryKeys) {
		assert (entity != null && primaryKeys != null);
		return ${classNameLower}Mapper.updateByPrimaryKeyNotNull(entity, Arrays.asList((Long[]) primaryKeys));
		
	}

	@Override
	public int updateByExampleNotNull(UserModel entity, UserModel example) {
		assert (entity != null && example != null);
		return ${classNameLower}Mapper.updateByExampleNotNull(entity, example);	
	}

	@Override
	public UserModel selectByPrimaryKey(Object primaryKey) {
		assert (primaryKey != null);
		return ${classNameLower}Mapper.selectByPrimaryKey((Long)primaryKey);
	}

	@Override
	public List<UserModel> selectByPrimaryKeys(Object... primaryKeys) {
		assert (primaryKeys != null);
		return ${classNameLower}Mapper.selectByPrimaryKeys(Arrays.asList((Long[]) primaryKeys));
	}

	@Override
	public List<UserModel> selectListByStartRow(UserModel entity, Long startRow, Long limit) {
		assert (entity != null);
		assert (startRow >= 0);
		assert (limit >= 0);
		return 	${classNameLower}Mapper.selectListByStartRow(entity, startRow, limit.intValue());
	}

	@Override
	public List<UserModel> selectListByStartPrimaryKey(UserModel entity, Integer limit) {
		assert (entity != null);
		assert (limit >= 0);
		return ${classNameLower}Mapper.selectListByStartPrimaryKey(entity, limit.intValue());
	}

	@Override
	public long selectCount(UserModel entity) {
		assert (entity != null);
		return ${classNameLower}Mapper.selectCount(entity);
	}

	@Override
	public List<UserModel> selectAll() {
		return ${classNameLower}Mapper.selectAll();
	}

	@Override
	public List<UserModel> selectByEntry(UserModel entity) {
		assert (entity != null);
		return ${classNameLower}Mapper.selectByEntry(entity);
	}

}
