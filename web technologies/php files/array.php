<?php
$cities=array('London','paris','marid','losangles','bombay','jakarta');
echo print_r ($cities);
echo "<br>";
for($i=0;$i<count($cities);$i++){
echo $cities[$i];
echo "<br>";
}
foreach($cities as $c){
echo $c;
echo "<br>";
?>