<?php
$connect=mysqli_connect('localhost','root','','wtlab');
if(mysqli_connect_errno($connect)){
echo 'failed to connect to database: '.mysqli_connect_error();
}
else
echo 'connected successfully!!';
?>