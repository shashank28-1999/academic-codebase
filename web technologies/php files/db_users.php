<?php
$conn = mysqli_connect("localhost", "root", "", "bookstore");
if (!$conn) {
    die("Connection failed: " . mysqli_connect_error());
}

if (isset($_POST['submit'])) {
    $username = $_POST['username'];
    $password = $_POST['password'];
    $email    = $_POST['email'];
    $mobile   = $_POST['mobile'];
    $address  = $_POST['address'];

    $sql = "INSERT INTO users (username, password, email, mobile, address)
            VALUES ('$username', '$password', '$email', '$mobile', '$address')";
    if (mysqli_query($conn, $sql)) {
        echo "<p>User registered successfully.</p>";
    } else {
        echo "<p>Error: " . mysqli_error($conn) . "</p>";
    }
}

// Display all users
$result = mysqli_query($conn, "SELECT * FROM users");
echo "<h2>Registered Users</h2>";
echo "<table border='1' cellpadding='5'>
        <tr><th>ID</th><th>Username</th><th>Email</th><th>Mobile</th><th>Address</th></tr>";
while ($row = mysqli_fetch_assoc($result)) {
    echo "<tr>
            <td>" . $row['id'] . "</td>
            <td>" . $row['username'] . "</td>
            <td>" . $row['email'] . "</td>
            <td>" . $row['mobile'] . "</td>
            <td>" . $row['address'] . "</td>
          </tr>";
}
echo "</table>";
mysqli_close($conn);
?>
<!DOCTYPE html>
<html>
<head><title>Register User - DB</title></head>
<body>
    <h2>Register New User</h2>
    <form method="post">
        Username: <input type="text" name="username"><br><br>
        Password: <input type="password" name="password"><br><br>
        Email:    <input type="text" name="email"><br><br>
        Mobile:   <input type="text" name="mobile"><br><br>
        Address:  <textarea name="address"></textarea><br><br>
        <input type="submit" name="submit" value="Register">
    </form>
</body>
</html>
