<?php
session_start();

if (isset($_POST['name'])) {
    $_SESSION['name'] = $_POST['name'];
    $_SESSION['start_time'] = time();
}

if (isset($_POST['logout'])) {
    $duration = time() - $_SESSION['start_time'];
    $name = $_SESSION['name'];
    session_destroy();
    echo "<h2>Thank You, " . htmlspecialchars($name) . "!</h2>";
    echo "<p>You used the site for " . $duration . " seconds.</p>";
    exit;
}

if (isset($_SESSION['name'])) {
    $start = date("H:i:s", $_SESSION['start_time']);
    echo "<div style='text-align:right; font-size:12px;'>Session started at: " . $start . "</div>";
    echo "<h2>Hello, " . htmlspecialchars($_SESSION['name']) . "!</h2>";
    echo "<form method='post'>
            <input type='hidden' name='logout' value='1'>
            <input type='submit' value='Logout'>
          </form>";
} else {
    echo "<h2>Enter Your Name</h2>
          <form method='post'>
            <input type='text' name='name' placeholder='Your name' required>
            <input type='submit' value='Submit'>
          </form>";
}
?>
