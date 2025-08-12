<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Milk</title>
</head>
<body><form action="onClickMilk" method="post">
    <label>Brand:</label>
    <input type="text" name="brand" required><br>

    <label>Type (Full Cream/Toned):</label>
    <input type="text" name="type" required><br>

    <label>Quantity (litres):</label>
    <input type="number" name="quantity" required><br>

    <label>Expiry Date:</label>
    <input type="date" name="expiryDate" required><br>

    <label>Price:</label>
    <input type="number" name="price" required><br>

    <input type="submit" value="Submit">
</form>

</body>
</html>