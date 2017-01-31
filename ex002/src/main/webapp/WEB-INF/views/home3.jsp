<!DOCTYPE html>
<html>
<head lean="en">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>
<scrpit src="https://cdnjs.cloudflare.com/ajax/libs/hadlebars.js/3.0.1/handlebars.js"></scrpit>

<div id="displayDiv">

</div>

<script>
	var source = "<h1><p>{{name}}</p> <p>{{userid}}</p> <p>{{addr}}</p></h1>"
	var template = Handlebars.complie(source);
	var data = {name:"홍길동", userid:"user00", addr:"조선 한양"};
	
	$("#displayDiv").html(template(date));
</script>
</body>
</html>