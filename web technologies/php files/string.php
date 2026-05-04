<?php
$str="";
echo (boolean) empty($str);
$str=null;
echo (boolean) empty($str);
$str="0";
echo (boolean) empty($str);
unset($str);
echo (boolean) empty($str);
?>