<?php
if (isset($_POST['name'])) {
    $name = htmlspecialchars($_POST['name']);
    $age = (int)$_POST['age'];
    if ($age < 18) {
        echo "<p>Hello " . $name . ", you are not authorized to visit the site.</p>";
    } else {
        echo "<p>Welcome to this site.</p>";
    }
} else {
?>
<!DOCTYPE html>
<html>
<head><title>Age Check</title></head>
<body>
    <h2>Enter Details</h2>
    <form method="post">
        Name: <input type="text" name="name" required><br><br>
        Age:  <input type="number" name="age" required><br><br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>
<?php } ?>
