<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Soap</title>
</head>
<body>
<form action="onClickSoap" method="post">
    <label>Name:</label>
    <input type="text" name="name" required><br>

    <label>Brand:</label>
    <input type="text" name="brand" required><br>

    <label>Price:</label>
    <input type="number" name="price" required><br>

    <label>Weight (grams):</label>
    <input type="number" name="weight" required><br>

    <label>Fragrance:</label>
    <input type="text" name="fragrance" required><br>

    <input type="submit" value="Submit">
</form>

</body>
</html>
