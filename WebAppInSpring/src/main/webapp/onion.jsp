<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Onion</title>
</head>
<body><form action="onClickOnion" method="post">
    <label>Type (Red/White):</label>
    <input type="text" name="type" required><br>

    <label>Weight (kg):</label>
    <input type="number" name="weight" required><br>

    <label>Origin:</label>
    <input type="text" name="origin" required><br>

    <label>Quality Grade:</label>
    <input type="text" name="quality" required><br>

    <label>Price per Kg:</label>
    <input type="number" name="pricePerKg" required><br>

    <input type="submit" value="Submit">
</form>

</body>
</html>