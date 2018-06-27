package com.wangfeng.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wangfeng.bean.Point;
import com.wangfeng.service.PointService;

@Controller
public class PointController {
	@Autowired
	PointService  pointService;

 @RequestMapping("/points")
 public String getPoints(){
   List<Point> points =pointService.getPoints();
  return "list3";
}
}