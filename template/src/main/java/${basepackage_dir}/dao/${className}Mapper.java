<#include "/java_copyright.include"> 
<#include "/macro.include">
<#assign className = table.className>
<#assign sqlName = table.sqlName>
<#assign classNameLower = className?uncap_first> 
package ${basepackage}.imp.mybatis.mapper;

import ${basepackage}.model.${className}Model;
/**
 * 持久化接口
 */
public interface ${className}Mapper  extends LogicBaseMapper<${className}Model,Long>{

}