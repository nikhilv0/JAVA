<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Shoe</title>
</head>
<body>
<form action="onClickShoe" method="post">
    <label>Brand:</label>
    <input type="text" name="brand" required><br>

    <label>Size:</label>
    <input type="number" name="size" required><br>

    <label>Color:</label>
    <input type="text" name="color" required><br>

    <label>Price:</label>
    <input type="number" name="price" required><br>

    <label>Material:</label>
    <input type="text" name="material" required><br>

    <input type="submit" value="Submit">
</form>

</body>
</html>