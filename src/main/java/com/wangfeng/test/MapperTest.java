package com.wangfeng.test;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wangfeng.bean.Collect;
import com.wangfeng.bean.CollectExample;
import com.wangfeng.bean.CollectExample.Criteria;
import com.wangfeng.bean.Equipment;
import com.wangfeng.bean.Point;
import com.wangfeng.bean.User;
import com.wangfeng.bean.UserExample;
import com.wangfeng.dao.CollectMapper;
import com.wangfeng.dao.EquipmentMapper;
import com.wangfeng.dao.PointMapper;
import com.wangfeng.dao.UserMapper;

/**
 * 测试dao层的工作
 * @author wp
 * 推荐Spring的项目就可以使用Spring的单元测试，可以自动注入我们需要的组件
 * 1.导入SpringText模块
 * 2.@ContextConfiguration指定Spring配置文件的位置
 * 3.直接autowired要使用的组件即可
 * 
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class MapperTest { 
	
	@Autowired
	CollectMapper collectMapper;
	
	@Autowired
	EquipmentMapper equipmentMapper;
	
	@Autowired
	UserMapper userMapper;
	
	@Autowired
	PointMapper pointMapper;
	
	@Autowired
	SqlSession sqlSession;
	
	 
	/**
	 * 测试DepartmentMapper
	 * @throws InterruptedException 
	 */

	@Test
	public void testCRUD() throws InterruptedException{
	//1.根据spring配置文件创建SpringIOC容器
	//	ApplicationContext ioc =new ClassPathXmlApplicationContext("applicationContext.xml");
	//2.从容器中获取mapper
		
		UserExample example = new UserExample();
		com.wangfeng.bean.UserExample.Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo("wangfeng");
		List<User> nameList = userMapper.selectByExample(example);
		if(nameList.isEmpty()) {
			System.out.println("该用户不存在！");
		}else {
			criteria.andPasswordEqualTo("19940417");
			List<User> result = userMapper.selectByExample(example);
			if(result.isEmpty()) {
				System.out.println("没有加入");
			}else {
				System.out.println("找到了！");
			}
		}
		
		
		
		
		
		
		
		
//	ioc.getBean(DepartmentMapper.class);
	//System.out.println(ioc);
		
//		System.out.println(equipmentMapper);
		
		//1.插入几个设备
	
//	equipmentMapper.insertSelective(new Equipment(null,"土壤温度传感器","12","格力"));
//		CollectExample example = new CollectExample();
//		Criteria criteria =  example.createCriteria();
//		//criteria.andCTimeBetween(value1, value2)
//	    List<Collect> list =  collectMapper.selectByExample(example);
//	    System.out.println(list);
		
////		//2.生成环境参数数据
//		for(int i = 0;i<30;i++){
//			
//	       collectMapper.insertSelective(new Collect(null,new Date(),2,28.0,0.8,31.0,0.9,1.8,"west",40.0));
//	       Thread.sleep(3*1000);
//	      
//	       }
		//3.批量插入多个环境参数数据:批量:使用可以执行批量操作的sqlSession
		/*for(){
			employeeMapper.insertSelective(new Employee(null,"Jerry","M","Jerry@atguigu.com",1));
		}*/
//		利用sqlSession批量插入数据
		/*CollectMapper mapper=sqlSession.getMapper(CollectMapper.class);
		
		for(int i=0;i<1000;i++){ 
			String uid =UUID.randomUUID().toString().substring(0, 5)+i; //利用uid自动生成姓名
			mapper.insertSelective(new Collect(null, uid,"M",uid+"@atguigu.com",1)); //id自增 
		}
		System.out.println("批量完成");
		*/
		
		/*employeeMapper.selectByPrimaryKeyWithDept(2);
		 
		
		departmentMapper.selectByExample(null);
		System.out.println(departmentMapper);*/
		
		
	
		
	}
	
}
