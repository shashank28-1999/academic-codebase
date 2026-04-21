<?php
$xmlFile = "../xml files/users.xml";
$xml = simplexml_load_file($xmlFile);

if (isset($_POST['submit'])) {
    $newUser = $xml->addChild('user');
    $newUser->addChild('id', 'U' . str_pad(count($xml->user) + 1, 3, '0', STR_PAD_LEFT));
    $newUser->addChild('n', htmlspecialchars($_POST['username']));
    $newUser->addChild('email', htmlspecialchars($_POST['email']));
    $newUser->addChild('phone', htmlspecialchars($_POST['mobile']));
    $newUser->addChild('city', htmlspecialchars($_POST['address']));

    $xml->asXML($xmlFile);
    echo "<p>User added to XML successfully.</p>";
    $xml = simplexml_load_file($xmlFile); // reload
}
?>
<!DOCTYPE html>
<html>
<head><title>XML Users</title></head>
<body>
    <h2>Add User to XML</h2>
    <form method="post">
        Username: <input type="text" name="username"><br><br>
        Email:    <input type="text" name="email"><br><br>
        Mobile:   <input type="text" name="mobile"><br><br>
        City:     <input type="text" name="address"><br><br>
        <input type="submit" name="submit" value="Add User">
    </form>

    <h2>All Users from XML</h2>
    <table border="1" cellpadding="5">
        <tr><th>ID</th><th>Name</th><th>Email</th><th>Phone</th><th>City</th></tr>
        <?php foreach ($xml->user as $user): ?>
        <tr>
            <td><?= $user->id ?></td>
            <td><?= $user->n ?></td>
            <td><?= $user->email ?></td>
            <td><?= $user->phone ?></td>
            <td><?= $user->city ?></td>
        </tr>
        <?php endforeach; ?>
    </table>
</body>
</html>
