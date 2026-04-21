<?php
$result = "";
if (isset($_POST['num1']) && isset($_POST['num2']) && isset($_POST['op'])) {
    $num1 = (float)$_POST['num1'];
    $num2 = (float)$_POST['num2'];
    $op   = $_POST['op'];
    switch ($op) {
        case '+': $result = $num1 + $num2; break;
        case '-': $result = $num1 - $num2; break;
        case '*': $result = $num1 * $num2; break;
        case '/':
            if ($num2 != 0) $result = $num1 / $num2;
            else $result = "Cannot divide by zero";
            break;
        default: $result = "Invalid operator";
    }
}
?>
<!DOCTYPE html>
<html>
<head><title>Calculator - PHP</title></head>
<body>
    <h2>Calculator (PHP)</h2>
    <form method="post">
        Number 1: <input type="text" name="num1"><br><br>
        Operator:
        <select name="op">
            <option value="+">+</option>
            <option value="-">-</option>
            <option value="*">*</option>
            <option value="/">/</option>
        </select><br><br>
        Number 2: <input type="text" name="num2"><br><br>
        <input type="submit" value="Calculate">
    </form>
    <?php if ($result !== "") echo "<h3>Result: " . $result . "</h3>"; ?>
</body>
</html>
