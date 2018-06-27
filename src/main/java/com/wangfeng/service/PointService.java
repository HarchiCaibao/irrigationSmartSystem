package com.wangfeng.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wangfeng.bean.Collect;
import com.wangfeng.bean.Msg;
import com.wangfeng.bean.Point;
import com.wangfeng.dao.PointMapper;

@Service
public class PointService {
	@Autowired
	PointMapper pointMapper;

	/**
	 * 查询节点相关数据数据(分页查询)
	 * @return
	 */
//	@RequestMapping("/pointIds")
//	@ResponseBody
//	public Msg getByPointId(Integer pointId) {
//	
//		List<Collect> pointList =  pointMapper.selectByPointId(pointId); //查询指定节点数据 
//		
//		return Msg.success().add("pointIds", pointList);
//	}
	public List<Point> getPoints(){
		List<Point> list = pointMapper.selectByExample(null);
		return list;
 	}
}