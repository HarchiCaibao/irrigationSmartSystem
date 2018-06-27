<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">
<title>用户登录</title>
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<link rel="stylesheet"
	href="${APP_PATH}/static/bootstrap/css/bootstrap.css">
<script type="text/javascript"
	src="${APP_PATH}/static/js/jquery-2.0.0.min.js"></script>
	<script type="text/javascript"
		src="${APP_PATH}/static/bootstrap/js/bootstrap.js"></script>
		<link href="${APP_PATH}/static/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
    <style>
    body{
    background:url(img/bg.png) repeat-x;
    min-height: 600px;
    position: relative;

    }

    *{font-family:"微软雅黑"; margin:0; padding:0; border:0; font-size:14px;color:white;}
    html,body{height:100%; width:100%;;}

    .kuico{
    background:url(img/coolyun.png) no-repeat;
    display: inline-block;
    width:26px;
    height:16px;
    margin-right: 5px;
    }
    .kuintro{
    color:white;
    padding-right: 5px;
    rgba(255, 255, 255, 0.8);
    }

    .kutrg{
    background:url(img/triangle.png) no-repeat;
    display: inline-block;
    width:10px;
    height:6px;

    }
    a{
    text-decoration: none;
    color: rgba(255, 255, 255);
    cursor: pointer;
    }

    .robot{
    background:url(img/android.png) no-repeat;
    display: inline-block;
    width:18px;
    height:20px;
    padding-right: 5px;
    }

    .question{
    background:url(img/question.png) no-repeat;
    display: inline-block;
    width:20px;
    height:20px;
    padding-right: 5px;
    }

    .downIntro,.introYun,.account{
    float:left;
    margin-right: 25px;
    }

    .name,.pwd{
    width: 310px;
    height: 44px;
    line-height: 44px;
    padding-left: 15px;
    outline: none;
    border-radius: 20px;
    background-color: #0A3C78;
    border: 1px solid #329BE0;
    }
    .name:hover,.pwd:hover,.name:focus,.pwd:focus{

    background-color: #052b64;
    }

    #login{

    background: #3fb9ff;
    font-size: 18px;
    width: 329px;
    height: 44px;
    outline: none;
    color: white;
    background: -webkit-linear-gradient(#3fb9ff, #099be7, #229de3);
    background: -o-linear-gradient(#3fb9ff, #099be7, #229de3);
    background: -moz-linear-gradient(#3fb9ff, #099be7, #229de3);
    background: linear-gradient(#3fb9ff, #099be7, #229de3);
    border-radius: 20px;
    }
    
     #register{

    background: #3fb9ff;
    font-size: 18px;
    width: 329px;
    height: 44px;
    outline: none;
    color: white;
    background: -webkit-linear-gradient(#3fb9ff, #099be7, #229de3);
    background: -o-linear-gradient(#3fb9ff, #099be7, #229de3);
    background: -moz-linear-gradient(#3fb9ff, #099be7, #229de3);
    background: linear-gradient(#3fb9ff, #099be7, #229de3);
    border-radius: 20px;
    }
    #login:hover{
    background: -webkit-linear-gradient(#229de3, #099be7,#3fb9ff);
    background: -o-linear-gradient(#229de3, #099be7,#3fb9ff);
    background: -moz-linear-gradient(#229de3, #099be7,#3fb9ff);
    background: linear-gradient(#229de3, #099be7,#3fb9ff);
    }

    #hLeft{
    float: left;
    height: 32px;
    vertical-align: middle;
    line-height: 32px;
    width: 172px;
    text-align: center;
    cursor: pointer;
    }

    #hright{
    float: right;
    margin-right: 10px;

    }
    #head{
    height: 50px;
    padding-top: 25px;
    margin-left: 14px;
    }
    #middle{
    margin-top: 100px;
    /* height:600px; */

    }
    #footer{

    text-align: center;
    bottom: 15px;
    position: absolute;
    width: 100%;
    }
    #footer a{
    color:black;
    }

    #middle li {
    list-style-type:none;
    margin-top: 15px;
    }

    #children li {
    list-style-type: none;
    height: 42px;
    line-height: 42px;
    border-bottom: 1px double rgb(5, 33, 113);

    }

    #children li a{
    color: rgba(255, 255, 255);
    }
    .register{
    padding-right: 25px;
    }

    .downApk{
    background: url(img/android.png) no-repeat 30px;
    text-indent: 25px;
    display: inline-block;
    height: 32px;
    line-height: 32px;
    width: 232px;
    text-align: center;

    }

    .downApk:hover{
    background-color: #354d8d;
    border-radius: 16px;
    }

    .introduce{

    background: url(img/question.png) no-repeat 20px;
    text-indent: 20px;
    display: inline-block;
    height: 32px;
    line-height: 32px;
    width: 140px;
    text-align: center;
    }

    .introduce:hover{
    background-color: #354d8d;
    border-radius: 16px;
    }
    .reg{
    height: 32px;
    line-height: 32px;
    width: 129px;
    display: inline-block;
    text-align: center;

    }

    .reg:hover{
    background-color: #354d8d;
    border-radius: 16px;
    }

    .forgetPwd{

    height: 32px;
    line-height: 32px;
    width: 129px;
    display: inline-block;
    text-align: center;
    }

    .forgetPwd:hover{
    background-color: #354d8d;
    border-radius: 16px;

    }
    #children{
    position: absolute;
    margin-top: 35px;
    left: 14px;
    width: 172px;
    text-align: center;
    background-color: #1f377f;
    display:none;
    }
    #hLeft:hover{
    background-color: #1f377f;
    border-radius: 16px;

    }

    #children li:hover{
    background-color: #354d8d;

    }
    #cloud{
    background: url(img/cloud.png) repeat;
    width: 100%;
    height: 356px;
    position: absolute;
    bottom: 0px;
    -webkit-animation: cloud 60s linear infinite alternate;
    -moz-animation: clouds 60s linear infinite alternate;


    z-index: -10;

    }

    @-webkit-keyframes cloud {
    0%{background-position:top left}
    100%{background-position:top right}
    }

    @-moz-keyframes clouds {
    0%{background-position:top left}
    100%{background-position:top right}
    }

    #err{
    display:none;
    color:red;
    }
    #sky{
    background: url(img/sky.png) repeat;
    width: 100%;
    heigth: 462px;
    z-index: -20;
    height: 462px;
    position: absolute;
    top: 0px;
    }

    #valid {
    height: 44px;
    width: 150px;
    text-indent: 1em;
    vertical-align: middle;
    line-height: 46px;
    outline: none;
    border-radius: 20px;
    background-color: #0A3C78;
    border: 1px solid #329BE0;
    }

    #validcode {
    display: inline-block;
    width: 100px;
    height: 30px;
    margin-left: 5px;
    vertical-align: middle;
    }

    #changeimg {
    margin-left: 15px;
    cursor: pointer;
    }
    #tlogin:focus{outline:none;}


    </style>
</head>
<body>
<!-- 员工添加的模态框-->
	<div class="modal fade" id="userAddModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 style="color:black" class="modal-title" id="myModalLabel">新用户注册</h4>
				</div>
				<div class="modal-body">
					<form class="form-horizontal" id="form">
						<div class="form-group">
							<label style="color:black" class="col-sm-2 control-label">用户名</label>
							<div class="col-sm-10">
								<input type="text" name="username" class="form-control"
									id="username_add_input" placeholder="用户名">
									<span  class="help-block"></span>
							</div>
						</div>

						<div class="form-group">
							<label style="color:black" class="col-sm-2 control-label">密码</label>
							
							<div class="col-sm-10"> 
								<input type="text" name="password" class="form-control"
									id="password_add_input" placeholder="密码">
									<span  class="help-block"></span>
							</div>
						</div>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
					<button type="button" class="btn btn-primary" id="user_save_btn">保存</button>
				</div>
			</div>
		</div>
	</div>
	
	
    <div id="sky"></div>
    <div id="head"></div>
    <div id="middle">
    <form id="form">
    <ul style="text-align: center;">
    <li style="font-size: 48px">可配置灌溉监测系统</li>


	<li style="font-size: 20px">用户名<input class="name" type="text" id="username"  placeholder="请输入用户名"/></li>
	<li style="font-size: 20px">密<span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>码<input class="pwd" type="password" id="password"  placeholder="请输入密码"></li>
	<li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<button type="button" id="login">立即登陆</button><font color="red">${errorMsg }</font></li>
    <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<button id="register" type="button">注册 </button>  
   

    </ul>
    </form>
    </div>
    <div id="footer">

    <a>关于我们@华南农业大学工程学院南楼410  &nbsp &nbsp|&nbsp &nbsp</a>


    <a>Copyright © 2017 汪锋  保留所有权利    粤ICP备110号-1</a>
    </div>
    <div id="cloud"></div>

	<script type="text/javascript">
	
	function login(username,password){
		$.ajax({
			url : "${APP_PATH}/login",
			data : "username=" + username+"&password="+password,
			type : "POST",
			success : function(result) {
				
				if(result.code==100){
					
					//登录成功则跳转到主页
					window.location.href="${APP_PATH}/Uav.jsp";
					//防止表单提交后刷新页面
					window.event.returnValue = false;
						
				}else{
					//登录不成功
				    alert("用户名或密码错误！");
					location.href="${APP_PATH}/login.jsp";
					window.event.returnValue = false;
					
				}
			}
		});
	}
	
	
	   //点击登录发送Ajax请求
	   
	   $("#login").click(function(){
		   var username = $("#username").val();
		   var password = $("#password").val();
		   login(username,password);
	   });
	  
	 
	   
	
			
			//清空表单样式以及内容
			function reset_form(ele){
				$(ele)[0].reset;
				//清空表单样式
				$(ele).find("*").removeClass("has-error has-success");
				$(ele).find(".help-block").text("");
			}
			
			//点击注册按钮弹出模态框
			$("#register").click(function() {
			//清除表单数据(表单完整重置(表单的数据，表单的样式))
			    reset_form("#userAddModal form");
				$("#userAddModal form")[0].reset();  
				//弹出模态框
				$("#userAddModal").modal({ //利用js创建模态框
					backdrop : "static"
				});
			});
			
		 //校验用户名是否可用
			$("#username_add_input").change(function(){
				//发送ajax请求校验用户名是否可用
				var username = this.value;
				$.ajax({
					url:"${APP_PATH}/checkuser",
					data: "username="+username,
					type:"POST",
					success:function(result){
						if(result.code==100){
							 show_validate_msg("#username_add_input","success","用户名可用");
							 $("#user_save_btn").attr("ajax_va","success"); //给按钮添加一个属性 内容为success
							
						}else{
							show_validate_msg("#username_add_input","error",result.extend.va_msg);
							 $("#user_save_btn").attr("ajax_va","error");
						}
					}
					 
				});
			}); 
			
			
			//点击保存，保存员工.
			$("#user_save_btn").click(function(){
				$.ajax({
					url:"${APP_PATH}/register",
					type:"POST",
					data:$("#userAddModal form").serialize(),
					success:function(result){
						$("#userAddModal").modal("hide");
					}
				});
			});
					
					
				/*  //1.模态框中填写的表单数据提交给服务器进行保存
			 //2.现对要提交给服务器的数据进行校验
				  if(!validate_add_form()){
					return false;
				}  
				//3.判断之前的ajax用户名校验是否成功，如果成功
				if($(this).attr("ajax_va")=="error"){
					return false;
				}   
				//4.发送ajax请求保存员工 
				//表格序列化：将表格数据转为字符串----alert($("#empAddModal form").serialize());
			 	 $.ajax({
					url:"${APP_PATH}/register",
					type:"POST",
					data:$("#userAddModal form").serialize(),
					success:function(result)
					{
				     if(result.code == 100)
				     { 
						    $("#userAddModal").modal("hide");
					 }else if(undefined != result.extend.errorFields.username)
					   {
							//显示员工名字的错误信息
							show_validate_msg("#username_add_input","error",result.extend.errorFields.username);
						}  									
					} 
				});
			});*/
			 	 
			
		  function validate_add_form(){
			//1.拿到要校验的数据.使用正则表达式
			var username = $("#username_add_input").val(); 
			var regName=  /(^[a-zA-Z0-9_-]{6,16}$)|(^[\u2E80-\u9FFF]{2,5})/;
			//小写或者大写的a-z或者0-9   或者_或者-  3到16位  或者中文2到5位
			if(!regName.test(username)){
				//alert("用户名可以是2-5位中文或者6-16位英文和数字的组合");
				show_validate_msg("#username_add_input","error","用户名可以是2-5位中文或者6-16位英文和数字的组合");
				return false;
			}else {
				show_validate_msg("#username_add_input","success"," ");
			} 
		  };
			
			//显示校验结果的提示信息
			function show_validate_msg(ele,status,msg){
				//清除当前元素的检验状态
				$(ele).parent().removeClass("has-success has-error");
				$(ele).next("span").text(" ");
				if("success"==status){
					$(ele).parent().addClass("has-success");
					$(ele).next("span").text(msg);
					
				}else if("error"==status){
					$(ele).parent().addClass("has-error");
					$(ele).next("span").text(msg);
				}
			}
		
		 
		 
			</script>
			
</body>
</html>