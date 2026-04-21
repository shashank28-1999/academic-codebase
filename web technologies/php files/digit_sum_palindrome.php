<?php
// a) Sum of Individual Digits
echo "<h2>a) Sum of Individual Digits</h2>";
$num = 12345;
$temp = $num;
$sum = 0;
while ($temp > 0) {
    $sum += $temp % 10;
    $temp = (int)($temp / 10);
}
echo "Number: " . $num . "<br>";
echo "Sum of digits: " . $sum . "<br>";

echo "<hr>";

// b) Palindrome Check
echo "<h2>b) Palindrome Check</h2>";
$num2 = 121;
$temp2 = $num2;
$rev = 0;
while ($temp2 > 0) {
    $rev = $rev * 10 + ($temp2 % 10);
    $temp2 = (int)($temp2 / 10);
}
echo "Number: " . $num2 . "<br>";
if ($num2 == $rev) {
    echo $num2 . " is a Palindrome.<br>";
} else {
    echo $num2 . " is NOT a Palindrome.<br>";
}
?>
