<#include "/java_copyright.include"> 
<#include "/macro.include">
<#assign className = table.className>
<#assign sqlName = table.sqlName>
<#assign classNameLower = className?uncap_first> 
package ${basepackage}.service;

import com.uxin.common.base.BaseService;
import ${basepackage}.domain.${className};

/**
 * ${table.remarks}业务逻辑接口
 */
public interface ${className}Service extends BaseService<${className}> {
	
}
