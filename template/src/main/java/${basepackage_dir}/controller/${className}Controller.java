<#include "/java_copyright.include"> 
<#include "/macro.include">
<#assign className = table.className>   
<#assign classNameLower = className?uncap_first> 
package ${basepackage}.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.alibaba.fastjson.JSONObject;

import com.uxin.common.util.Pager;
import com.uxin.common.util.StringUtil;

import ${basepackage}.domain.${className};
import ${basepackage}.service.${className}Service;

import com.uxin.common.util.result.JsonResult;
import com.uxin.common.util.result.ResultStatus;
import com.uxin.www.controller.LoginController;

@Controller
@RequestMapping("/${classNameLowerCase}")
public class ${className}Controller {
	
    private static Logger log = LoggerFactory.getLogger(${className}Controller.class);
    @Resource
	private ${className}Service ${classNameLower}Service;
	
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	public JSONObject update(${className} ${classNameLower}) {
		${classNameLower}Service.update(${classNameLower});
		return JsonResult.success();
	}
	
	/**
	 * 添加
	 */
	@ResponseBody
	@RequestMapping("/add")
	public JSONObject add(${className} ${classNameLower}) {
		${classNameLower}Service.insert(${classNameLower});
		return JsonResult.success();
	}
	
	/**
	 * 删除
	 */
	@ResponseBody
	@RequestMapping("/delete")
	public JSONObject delete(@RequestParam Integer id) {
		${classNameLower}Service.delete(id);
		return JsonResult.success();
	}

	/**
	 * 获取单个记录
	 */
	@ResponseBody
	@RequestMapping("/get")
	public JSONObject get(@RequestParam Integer id) {
		return JsonResult.success(${classNameLower}Service.get(id));
	}
	
	/**
	 * 获取列表记录
	 */
	@ResponseBody
	@RequestMapping("/getList")
	public JSONObject getList(${className} ${classNameLower}) {
		return JsonResult.success(${classNameLower}Service.getList(${classNameLower}));
	}
	
	/**
     * 获取列表记录
     */
    @RequestMapping("/list")
    public ModelAndView list(${className} ${classNameLower}) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("list",${classNameLower}Service.getList(${classNameLower}));
        return mv;
    }
    
    @RequestMapping(value="/list/page/{page}",method=RequestMethod.GET)
    public ModelAndView getPageList(@PathVariable("page") Integer page,${className} ${classNameLower},
            HttpServletRequest request, HttpServletResponse response) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("${classNameLower}/list");
        PageList<${className}> pageList = ${classNameLower}Service.getPage(${classNameLower},page,10);
        mv.addObject("pageList",pageList);
        mv.addObject("pages",pageList.getPaginator().getPages());
        return mv;
    }
    
    @RequestMapping("/edit")
    public ModelAndView edit(Integer id) {
        ModelAndView mv = new ModelAndView();
        if(id != null){
            mv.addObject("${classNameLower}", ${classNameLower}Service.get(id));
        }
        mv.setViewName("${classNameLower}/edit");
        return mv;
    }
}
	