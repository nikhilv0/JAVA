<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Parota</title>
</head>
<body><form action="onClickParota" method="post">
    <label>Type (Kerala/Layered):</label>
    <input type="text" name="type" required><br>

    <label>Quantity:</label>
    <input type="number" name="quantity" required><br>

    <label>Size (inches):</label>
    <input type="number" name="size" required><br>

    <label>Ingredients:</label>
    <input type="text" name="ingredients" required><br>

    <label>Price:</label>
    <input type="number" name="price" required><br>

    <input type="submit" value="Submit">
</form>

</body>
</html>