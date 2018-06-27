<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- 引入标签库 -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>环境参数列表列表</title>
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<link rel="stylesheet"
	href="${APP_PATH}/static/bootstrap/css/bootstrap.css">
<script type="text/javascript"
	src="${APP_PATH}/static/js/jquery-2.0.0.min.js"></script>
</head>
<body>
	<!--开始的相对路径，赵资源，以当前资源的路径为基准，经常容易处问题 
以/开始的相对路径，以服务器的路径为标准 
	http://localhost:3306/crud
-->

	<div class="containner">
		<!--标题-->
		<div class="row"></div>
		<div class="col-md-12">
			<h1>
			<table >
				<tr>
					<td><span class="glyphicon glyphicon-user" aria-hidden="true"></span></td>
					<td>环境参数</td>
				</tr>
			</table>
 				
 			</h1>
		</div>

		<!--表格数据-->
		<div class="row">
			<div class="col-md-12">
				<table class="table table-hover" id="colls_table">
					<thead>
						<tr>
							<th>id</th>
							<th>采集时间</th>
							<th>所在节点</th>
							<th>土壤温度</th>
							<th>土壤湿度</th>
							<th>空气温度</th>
							<th>空气湿度</th>
							<th>风速</th>
							<th>风向</th>
							<th>雨量</th>
						</tr>
					</thead>
					<tbody>
						<!-- 表格体 -->

					</tbody>

				</table>
			</div>
		</div>
		<!--分页信息-->
		<div class="row">
			<!--分页文字信息-->
			<div class="col-md-6" id="page_info_area"></div>
			<!--分页条信息-->
			<div class="col-md-6" id="page_nav"></div>
		</div>
	</div>
	<script type="text/javascript">
	
		 var totalRecord,currentPage;
		//1.在页面加载完成以后，直接去发送一个ajax请求,要到分页数据
		$(function() {
			//去首页
			to_page(1);
		});

		function to_page(pn) {
			$.ajax({
				url : "${APP_PATH}/colls",
				data : "pn=" + pn,
				type : "GET",
				success : function(result) {
					//console.log(result);
					//1.解析并显示环境参数数据
					build_colls_table(result);
					//2.解析并显示分页信息
					build_page_info(result);
					//解析显示分页条数据
					build_page_nav(result);

				}
			});
		}

		function build_colls_table(result) {
			//清空table 表格
			//colls_table tbody
		
			$("#colls_table tbody").empty();
			var colls = result.extend.pageInfo.list;
			
			
			
			//index表示索引，item表示当前对象
			$.each(colls, function(index, item) {
				var cIdTd = $("<td></td>").append(item.cId); 
				var cTimeTd = $("<td></td>").append(item.cTime);
				var pointIdTd = $("<td></td>").append(item.pointId);
				var soilTemperTd = $("<td></td>").append(item.soilTemper);
				var soilHumidTd = $("<td></td>").append(item.soilHumid);
				var airTemperTd =  $("<td></td>").append(item.airTemper);
				var airHumidTd = $("<td></td>").append(item.airHumid);
				var windSpeedTd =  $("<td></td>").append(item.windSpeed);
				var windDirectionTd = $("<td></td>").append(item.windDirection);
				var rainTd = $("<td></td>").append(item.rain);
				//append方法执行完成以后还是返回原来的元素
				$("<tr></tr>").append(cIdTd)
							.append(cTimeTd)
							.append(pointIdTd)
					     	.append(soilTemperTd)
					    	.append(soilHumidTd)
					    	.append(airTemperTd)
						    .append(airHumidTd)
						    .append(windSpeedTd)
					    	.append(windDirectionTd)
						    .append(rainTd)
						    .appendTo("#colls_table tbody")
			})
		}

		//解析显示分页信息
		function build_page_info(result) {
			//page_info_area
			$("#page_info_area ").empty();
			$("#page_info_area").append(
					"当前第" + result.extend.pageInfo.pageNum + "页,总"
							+ result.extend.pageInfo.pages + "页,总"
							+ result.extend.pageInfo.total + "条记录数");
		 totalRecord=result.extend.pageInfo.total; //赋值为总记录数
		 currentPage = result.extend.pageInfo.pageNum;

		}
		//解析显示分页条
		function build_page_nav(result) {
			//page_nav
			$("#page_nav ").empty();
			var ul = $("<ul></ul>").addClass("pagination");
			//构建元素
			var firstPageLi = $("<li></li>").append(
					$("<a></a>").append("首页").attr("href", "#"));
			var prePageLi = $("<li></li>").append(
					$("<a></a>").append("&laquo;"));
			if (result.extend.pageInfo.hasPreviousPage == false) {
				firstPageLi.addClass("disabled");
				prePageLi.addClass("disabled");
			}
			//为元素添加点击翻页的事件
			firstPageLi.click(function() {
				to_page(1);
			})

			prePageLi.click(function() {
				to_page(result.extend.pageInfo.pageNum - 1);
			})

			var nextPageLi = $("<li></li>").append(
					$("<a></a>").append("&raquo;"));

			var lastPageLi = $("<li></li>").append(
					$("<a></a>").append("末页").attr("href", "#"));

			if (result.extend.pageInfo.hasNextPage == false) {
				nextPageLi.addClass("disabled");
				lastPageLi.addClass("disabled");
			} else {
				nextPageLi.click(function() {
					to_page(result.extend.pageInfo.pageNum + 1);
				})

				lastPageLi.click(function() {
					to_page(result.extend.pageInfo.pages);
				})
			}

			//添加首页和前一页的提示
			ul.append(firstPageLi).append(prePageLi);
			//1.2.3遍历给ul中添加页码提示
			$.each(result.extend.pageInfo.navigatepageNums, function(index,
					item) {
				var numLi = $("<li></li>").append($("<a></a>").append(item));
				if (result.extend.pageInfo.pageNum == item) {
					numLi.addClass("active");
				}
				numLi.click(function() {
					to_page(item);
				})
				ul.append(numLi);
			});
			//添加下一页和末页提示
			ul.append(nextPageLi).append(lastPageLi);

			//把ul加入到nav元素中
			var navEle = $("<nav></nav>").append(ul);
			navEle.appendTo("#page_nav");

		}

	</script>

</body>
</html>