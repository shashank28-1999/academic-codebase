<html>
<head>
<title>
Even Num Tester
</title>
</head>
<body>
<h2>Even numbers are</h2>
<br/>
<ul>
<?php
$str=$_POST['num'];
$arr=explode(',',$str);
foreach($arr as $t){
if($t%2==0)
echo "<li>$t</li> \r\n";
}
?>
</ul>
</body>
</html>