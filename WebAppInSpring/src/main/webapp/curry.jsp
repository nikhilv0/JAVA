<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Curry</title>
</head>
<body><form action="onClickCurry" method="post">
    <label>Name:</label>
    <input type="text" name="name" required><br>

    <label>Type (Veg/Non-Veg):</label>
    <input type="text" name="type" required><br>

    <label>Spice Level:</label>
    <input type="text" name="spiceLevel" required><br>

    <label>Quantity (plates):</label>
    <input type="number" name="quantity" required><br>

    <label>Price:</label>
    <input type="number" name="price" required><br>

    <input type="submit" value="Submit">
</form>

</body>
</html>