function validate() {
    var firstname = document.getElementById("firstname").value;
    var lastname = document.getElementById("lastname").value;
    var password = document.getElementById("password").value;
    var email = document.getElementById("email").value;
    var mobile = document.getElementById("mobile").value;
    var address = document.getElementById("address").value;

    // First Name: alphabets only, min 6 chars
    var namePattern = /^[A-Za-z]{6,}$/;
    if (!namePattern.test(firstname)) {
        alert("First Name must contain only alphabets and be at least 6 characters long.");
        return false;
    }

    // Last Name: should not be empty
    if (lastname.trim() == "") {
        alert("Last Name should not be empty.");
        return false;
    }

    // Password: min 6 chars
    if (password.length < 6) {
        alert("Password must be at least 6 characters long.");
        return false;
    }

    // Email: standard pattern name@domain.com
    var emailPattern = /^[a-zA-Z0-9._]+@[a-zA-Z0-9]+\.[a-zA-Z]{2,}$/;
    if (!emailPattern.test(email)) {
        alert("Enter a valid Email address (e.g. name@domain.com).");
        return false;
    }

    // Mobile: exactly 10 digits
    var mobilePattern = /^[0-9]{10}$/;
    if (!mobilePattern.test(mobile)) {
        alert("Mobile Number must contain exactly 10 digits.");
        return false;
    }

    // Address: should not be empty
    if (address.trim() == "") {
        alert("Address should not be empty.");
        return false;
    }

    alert("Registration Successful!");
    return true;
}
