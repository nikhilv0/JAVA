<%@ page isELIgnored="false" %><html>
<head>
    <title>Egg</title>
</head>
<body><form action="onClickEgg" method="post">
    <label>Type (Brown/White):</label>
    <input type="text" name="type" required><br>

    <label>Quantity:</label>
    <input type="number" name="quantity" required><br>

    <label>Weight per Egg (grams):</label>
    <input type="number" name="weight" required><br>

    <label>Farm Name:</label>
    <input type="text" name="farmName" required><br>

    <label>Price per Dozen:</label>
    <input type="number" name="pricePerDozen" required><br>

    <input type="submit" value="Submit">
</form>

</body>
</html>