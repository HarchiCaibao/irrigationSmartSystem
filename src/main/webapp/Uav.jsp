<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>系统主界面</title>
<link rel="stylesheet" href="css/foundation.css" />
<link rel="stylesheet" href="css/font-awesome.css" />
<link rel="stylesheet" href="css/refineslide.css" />
<link rel="stylesheet" href="css/jquery.fancybox-1.3.4.css" />

<link rel="stylesheet" href="css/style.css" />


<link rel="shortcut icon" href="favicon.png" />
<link rel="apple-touch-icon" href="apple-touch-icon.png" />

<script src="js/modernizr.foundation.js"></script>

</head>
<body>
	<!-- Main container -->
	<div class="container">

		<!--<p align="center"><font size="6" color="#FF0000">适用浏览器：FireFox、Chrome、傲游、搜狗. 不支持IE8、360。</font></p>  -->

		<!-- Header -->
		<div class="box">
			<header class="row clearfix">

			<h1>
				<a href="index.html"><img src="img/logo.png" alt="Difference" /></a>
			</h1>

			<div class="widget_area">
				<a href="#" class="small theme_button"><i class="icon-phone"></i>
					Call 1-111-111-666</a>
			</div>

			<nav class="desktop">
			<ul>
				<li><a href="index.html" class="selected">数据查询</a>
					<ul>
					<!-- 待更改 -->
						<li><a href="index-3.jsp" class="selected">实时数据</a></li>
						<li><a href="index-3.jsp">历史数据</a></li>
					</ul></li>
				<li><a href="about.html">环境监控</a>
					<ul>
						<li><a href="pricing.html">打开摄像头</a></li>
					</ul></li>
				<li><a href="portfolio-4col.html">设备管理</a>
					<ul>
						<li><a href="portfolio-4col.html">大气温湿度传感器</a></li>
						<li><a href="portfolio-3col.html">土壤温湿度传感器</a></li>
						<li><a href="portfolio-2col.html">雨量传感器</a></li>
						<li><a href="portfolio-single.html">风速风向传感器</a></li>
					</ul></li>
				<li><a href="contact.html">帮助</a></li>
				<!--<li>-->
				<!--<a href="blog.html">Blog</a>-->
				<!--<ul>-->
				<!--<li><a href="blogpost.html">Blog article</a></li>-->
				<!--</ul>-->
				<!--</li>-->
			</ul>

			</nav> <!-- Tablet navigation --> <nav class="mobile tablet"></nav> </header>
		</div>


		<!-- Mobile navigation -->
		<nav class="mobile box"></nav>

		<!-- Slider -->
		<div class="slider box">

			<!-- Slides -->
			<ul class="photo_slider rs-slider">

				<li><img src="img/3.jpg" alt="" />
					<div class="rs-caption">
						<span class="rs-arrows"> <a href="#" class="rs-prev"><i
								class="icon-chevron-left"></i></a><a href="#" class="rs-next"><i
								class="icon-chevron-right"></i></a>
						</span>
						<h3>Unlimited colors</h3>
						<p>A pixel perfect design with attention to details. Lorem
							ipsum dolor sit amet, consectetur adipiscing elit. Lorem ipsum
							dolor.</p>
						<a href="#" class="theme_button medium">Buy on ThemeForest</a>
					</div></li>

				<li><img src="img/4.jpg" alt="" />
					<div class="rs-caption">
						<span class="rs-arrows"> <a href="#" class="rs-prev"><i
								class="icon-chevron-left"></i></a><a href="#" class="rs-next"><i
								class="icon-chevron-right"></i></a>
						</span>
						<h3>RefineSlide slider</h3>
						<p>Integer a purus ut est semper hendrerit eu at odio. In
							sollicitudin arcu et quam sagittis et sagittis eros posuere.
							Maecenas faucibus metus a diam malesuada vitae consectetur neque
							malesuada.</p>
						<a href="#" class="theme_button medium">Buy on ThemeForest</a>
					</div></li>

				<li><img src="img/5.jpg" alt="" />
					<div class="rs-caption">
						<span class="rs-arrows"> <a href="#" class="rs-prev"><i
								class="icon-chevron-left"></i></a><a href="#" class="rs-next"><i
								class="icon-chevron-right"></i></a>
						</span>
						<h3>Working AJAX contact form</h3>
						<p>Etiam egestas purus vel erat porta tincidunt. Sed et purus
							et lorem cursus dignissim pellentesque quis sem.</p>
						<a href="#" class="theme_button medium">Buy on ThemeForest</a>
					</div></li>

			</ul>

		</div>




	</div>
	<div id="footer">

		<a>关于我们@华南农业大学工程学院南楼410 &nbsp &nbsp|&nbsp &nbsp</a> <a>Copyright ©
			2017 汪锋 保留所有权利 粤ICP备110号-1</a>
	</div>


	<!-- Included JS Files -->
	<script src="js/jquery.min.js"></script>
	<script src="js/jquery.orbit-1.4.0.js"></script>
	<script src="js/jquery.placeholder.min.js"></script>
	<script src="js/jquery.fancybox-1.3.4.pack.js"></script>
	<script src="js/jquery.pretty.js"></script>
	<script src="js/jquery.masonry.min.js"></script>
	<script src="js/jquery.easing.min.js"></script>
	<script src="js/jquery.refineslide.js"></script>
	<script src="js/touch-scroll.js"></script>
	<script src="js/script.js"></script>

	<script type="text/javascript">
		$('#customization h3 a').click(function() {
			$('#customization .options').slideToggle();
		});
		$('#customization .colors a').each(function() {
			$(this).css('background', '#' + $(this).attr('data-color'));
		});
		$('#customization .colors a').click(
				function() {
					$('#customization a').removeClass('selected');
					$(this).addClass('selected');
					$('link[data-color=custom]').remove();
					if (document.createStyleSheet) {
						document.createStyleSheet(url);
					} else {
						$(
								'<link rel="stylesheet" href="css/colors/'
										+ $(this).attr('data-color')
										+ '.css" data-color="custom">')
								.appendTo('head');
					}
				});
	</script>

	<div style="display: none">
		<script src='http//v7.cnzz.com/stat.php?id=155540&web_id=155540'
			language='JavaScript' charset='gb2312'></script>
	</div>
  

</body>
</html>