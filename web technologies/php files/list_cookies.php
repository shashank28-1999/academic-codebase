<?php
// Add a sample cookie if none exist
if (empty($_COOKIE)) {
    setcookie("sample_cookie", "HelloWorld", time() + 3600);
    setcookie("user", "TestUser", time() + 3600);
    echo "<p>No cookies found. Sample cookies added. <a href=''>Refresh</a> to see them.</p>";
} else {
    if (isset($_POST['list'])) {
        echo "<h2>Cookies Stored in Browser</h2>";
        echo "<table border='1' cellpadding='5'>";
        echo "<tr><th>Name</th><th>Value</th></tr>";
        foreach ($_COOKIE as $key => $value) {
            echo "<tr><td>" . htmlspecialchars($key) . "</td><td>" . htmlspecialchars($value) . "</td></tr>";
        }
        echo "</table>";
    }
}
?>
<!DOCTYPE html>
<html>
<head><title>List Cookies</title></head>
<body>
    <form method="post">
        <input type="submit" name="list" value="List Cookies">
    </form>
</body>
</html>
