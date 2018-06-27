package com.wangfeng.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wangfeng.bean.Collect;
import com.wangfeng.bean.Msg;
import com.wangfeng.service.CollectService;
@Controller
public class CollectController {
	/**
	 * 查询员工数据(分页查询),采用ajax交互
	 * @return
	 */
	@Autowired
	CollectService  collectService;
	
    @RequestMapping("/colls")
	@ResponseBody
	public Msg  getCollsWithJson(@RequestParam(value="pn" ,defaultValue="1") Integer pn,@RequestParam(value="pointId" ,defaultValue="1") Integer pointId){ 
		
		//引入PageHelper分页插件
		//在查询之前只需要调用,传入页码，以及分页每一页的大小
		PageHelper.startPage(pn,10);
		//startPage后面紧跟的这个查询就是一个分页查询 
		List<Collect> colls =collectService.getAll(pointId);
		//使用pageInfo包装查询后的信息,只需要将pageinfo交给页面就行了。
		//封装了详细的分页信息,包括有我们查询出来的数据,传入:连续显示的页数
		PageInfo page=new PageInfo(colls,5); //5表示要连续显示的页数
		return Msg.success().add("pageInfo",page);
		
	}
    
    @RequestMapping(value="/times",method = RequestMethod.POST)
    @ResponseBody
    public Msg getCollsWithTime(@RequestParam(value="pn" ,defaultValue="1") Integer pn,@RequestParam(value="startTime" ) String startTime,
    		@RequestParam(value="endTime" ) String endTime) {
    	SimpleDateFormat format = new SimpleDateFormat("yy-MM-dd hh:mm:ss");
    	java.util.Date startTime2=null;
    	java.util.Date  endTime2=null;
		try {
			startTime2 = format.parse(startTime);
			endTime2 = format.parse(endTime);
		} catch (ParseException e) {
			e.printStackTrace();
		}
    	PageHelper.startPage(pn, 10);
    	List<Collect> times = collectService.getByTime(startTime2, endTime2);
    	PageInfo timePage = new PageInfo(times,5);
    	return Msg.success().add("timePage", timePage);
    }
      
    
    @RequestMapping("/ids")
    @ResponseBody
    public Msg getCollsWithid(@RequestParam(value="pn" ,defaultValue="1") Integer pn,@RequestParam(value="startId" ) Integer startId,
    		@RequestParam(value="endId" ) Integer endId) {
    	PageHelper.startPage(pn, 10);
    	List<Collect> times = collectService.getById(startId, endId);
    	PageInfo timePage = new PageInfo(times,5);
    	return Msg.success().add("pageInfo", timePage);
    }
}	
	
  
		
	
