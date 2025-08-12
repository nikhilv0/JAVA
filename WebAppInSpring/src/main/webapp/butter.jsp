<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Butter</title>
</head>
<body>

<form action="onClickButter" method="post">
    <label>Name:</label>
    <input type="text" name="name" required><br>

    <label>Price:</label>
    <input type="number" name="price" required><br>

    <label>Brand:</label>
    <input type="text" name="brand" required><br>

    <label>Weight (grams):</label>
    <input type="number" name="weight" required><br>

    <label>Expiry Date:</label>
    <input type="date" name="expiryDate" required><br>

    <input type="submit" value="Submit">
</form>

</body>
</html>