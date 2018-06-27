package com.wangfeng.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wangfeng.bean.Collect;
import com.wangfeng.bean.CollectExample;
import com.wangfeng.bean.CollectExample.Criteria;
import com.wangfeng.dao.CollectMapper;



@Service
public class CollectService {
	@Autowired
	CollectMapper collectMapper;

	/**
	 * 查询环境参数数据(分页查询)
	 * @return
	 */
	public List<Collect> getAll(Integer pointId) {
		// TODO Auto-generated method stub
		CollectExample example = new CollectExample();
		Criteria criteria =  example.createCriteria();
		criteria.andPointIdEqualTo(pointId);
		//System.out.println("example: "+example);
		return  collectMapper.selectByExample(example); //根据节点查询
	}
	
	
	public List<Collect> getByTime(Date starTime,Date endTime) {
		// TODO Auto-generated method stub
		CollectExample example = new CollectExample();
		Criteria criteria =  example.createCriteria();
		criteria.andCTimeBetween(starTime, endTime);
		return  collectMapper.selectByExample(example); //根据时间段查询
	}
	
	
	public List<Collect> getById(Integer startId,Integer endId) {
		CollectExample example = new CollectExample();
		Criteria criteria =  example.createCriteria();
		criteria.andCIdBetween(startId, endId);
		return  collectMapper.selectByExample(example); //根据时间段查询
	}
	

}
