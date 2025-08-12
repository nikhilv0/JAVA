<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Chappal</title>
</head>
<body>
<form action="onClickChappal" method="post">
    <label>Brand:</label>
    <input type="text" name="brand" required><br>

    <label>Size:</label>
    <input type="number" name="size" required><br>

    <label>Color:</label>
    <input type="text" name="color" required><br>

    <label>Material:</label>
    <input type="text" name="material" required><br>

    <label>Price:</label>
    <input type="number" name="price" required><br>

    <input type="submit" value="Submit">
</form>

</body>
</html>