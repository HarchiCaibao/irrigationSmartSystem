package com.wangfeng.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import com.wangfeng.bean.Equipment;
import com.wangfeng.service.EquipmentService;
@Controller
public class EquipmentController {
	 
		@Autowired
		EquipmentService  equipmentService;

	 @RequestMapping("/equips")
	 public String getEmps(){
       List<Equipment> equips =equipmentService.getAll();
      return "list2";
}
}