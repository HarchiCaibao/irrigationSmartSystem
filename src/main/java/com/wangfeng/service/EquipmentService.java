package com.wangfeng.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wangfeng.bean.Equipment;
import com.wangfeng.dao.EquipmentMapper;

@Service
public class EquipmentService {
	@Autowired
	EquipmentMapper equipmentMapper;

	/**
	 * 查询设备相关数据数据(分页查询)
	 * @return
	 */
	public List<Equipment> getAll() {
		// TODO Auto-generated method stub
		return equipmentMapper.selectByExample(null); //查询所有 没有条件
	}
}