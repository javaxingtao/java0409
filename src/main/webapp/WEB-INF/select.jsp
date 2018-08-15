<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/8/14
  Time: 19:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
<head>
<title>手机号归属地查询</title>

</head>

<%-- <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.3.1.min.js"/> --%>

<body>

	<table>请输入手机号
	</table>

	<input id="mobile" type="text" name="mobile">

	<input id="but1" type="button" value="提交">

	<table id="dg" style="height: 99%; width: 99%;">
		<thead>
			<tr>
				<th>id</th>
				<th>号段</th>
				<th>归属地</th>
				<th>运营商</th>
				<th>地区号</th>
				<th>邮政编码</th>
			</tr>
		</thead>
	</table>


	<script type="text/javascript">
	
		$("#but1").click(
			function() {
				var number = $("#mobile").val().toString().substring(0, 7);
	
				$.ajax({
					url : '${pageContext.request.contextPath}/mobile/query',
					type : 'post',
					data : {
						number : number
					},
					dataType : 'json',
					success : function(result) {
						if (result != null) {
							console.log(result);
							var str = document.getElementById("dg");
							var result = "<td>" + result.id + "</td>" +
								"<td>" + result.number + "</td>" +
								"<td>" + result.area + "</td>" +
								"<td>" + result.type + "</td>" +
								"<td>" + result.areacode + "</td>" +
								"<td>" + result.postcode + "</td>";
							str.innerHTML = result;
	
						}
	
					},
					error : function() {
						alert('不存在提示，号码在号段库暂时不存在');
					}
				})
	
			}
		)
	</script>


</body>
</html>
