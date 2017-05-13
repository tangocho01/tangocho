<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="/tangocho/js/lib/jquery-3.2.1.js"></script>
<title>Insert title here</title>
</head>
<body>
	question:<span id="question"></span><br>
	answer:<span id="answer"></span><br>

	<script>
		$(document).ready(function() {
			console.log("ready!");
			var formData = {
				name : "aname",
				age : "31"
			}; //Array 

			$.ajax({
				url : "/tangocho/maincontroller",
				type : "post",
				encoding:"UTF-8",
				data : formData,
				dataType: "json",
				success : function(data, textStatus, jqXHR) {
					var response = data;
					$("#question").html(data.question);
					$("#answer").html(data.answer);
					console.log("success!"+data.question);
				},
				error : function(jqXHR, textStatus, errorThrown) {
					console.log("error!"+errorThrown);
				}
			});
		});
	</script>
</body>
</html>