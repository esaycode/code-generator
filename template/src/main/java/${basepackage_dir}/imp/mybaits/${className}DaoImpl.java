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
	public void deleteByPrimaryKey(Object primaryKey) {
		assert (primaryKey != null);
		${classNameLower}Mapper.deleteByPrimaryKey((Long) primaryKey);
	}

	@Override
	public void deleteByPrimaryKeys(Object... primaryKeys) {
		assert (primaryKeys != null);
		${classNameLower}Mapper.deleteByPrimaryKeys(Arrays.asList((Long[]) primaryKeys));
	}

	@Override
	public void deleteByEntry(UserModel entity) {
		assert (entity != null);
		${classNameLower}Mapper.deleteByEntry(entity);
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
	public void update(UserModel entity) {
		assert (entity != null);
		${classNameLower}Mapper.insert(entity);
	}

	@Override
	public void updateByPrimaryKey(UserModel entity, Object... primaryKeys) {
		assert (entity != null && primaryKeys != null);
		${classNameLower}Mapper.updateByPrimaryKeys(entity, Arrays.asList((Long[]) primaryKeys));

	}

	@Override
	public void updateByExample(UserModel entity, UserModel example) {
		assert (entity != null && example != null);
		${classNameLower}Mapper.updateByExample(entity, example);	
	}

	@Override
	public void updateList(List<UserModel> list) {
		assert(list !=null && list.size() > 0 );
	//	${classNameLower}Mapper.updateList(list);
	}

	@Override
	public void updateNotNull(UserModel entity) {
		assert (entity != null);
		${classNameLower}Mapper.updateNotNull(entity);
	}

	@Override
	public void updateByPrimaryKeyNotNull(UserModel entity, Object... primaryKeys) {
		assert (entity != null && primaryKeys != null);
		${classNameLower}Mapper.updateByPrimaryKeyNotNull(entity, Arrays.asList((Long[]) primaryKeys));
		
	}

	@Override
	public void updateByExampleNotNull(UserModel entity, UserModel example) {
		assert (entity != null && example != null);
		${classNameLower}Mapper.updateByExampleNotNull(entity, example);	
	}

	@Override
	public void updateListNotNull(List<UserModel> list) {
		assert(list !=null && list.size() > 0 );
	//	${classNameLower}Mapper.updateListNotNull(list);
		
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
	public List<UserModel> selectPageByStartRow(UserModel entity, Long startRow, Long limit) {
		assert (entity != null);
		assert (startRow >= 0);
		assert (limit >= 0);
		return 	${classNameLower}Mapper.selectListByStartRow(entity, startRow, limit.intValue());
	}

	@Override
	public List<UserModel> selectPageByStartPrimaryKey(UserModel entity, Integer limit) {
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
