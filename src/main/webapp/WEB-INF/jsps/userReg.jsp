<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<script>
$(document).ready(function(){
	$("#id").change(function(){
		$.ajax({
				url:'ValidateEmail',
				data:{id:$("#id").val()},
				success:function(responseText){
					$("#errMsg").text(responseText);
					if(responseText!=""){
						$("#id").focus();
					}
				}
			});
	});
});
</script>

<title>Insert title here</title>
</head>
<body> 
<form action="registerUser" method="post">
<pre>
ID : <input type="text" name="id" id="id"><span id="errMsg"></span>
Name : <input type="text" name="name" id="name">
Email : <input type="text" name="email" id="email">
<input type="submit" name="register">
</pre>
</form>
</br>${result}

</body>
</html>