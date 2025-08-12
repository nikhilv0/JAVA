<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Bottle</title>
</head>
<body>
<h2>${name.name}</h2>
<h2>${name.price}</h2>
    <form action="onClickBottle" method="post">
        <label>Name:</label>
        <input type="text" name="name" required><br>

        <label>Price:</label>
        <input type="number" name="price" required><br>

        <label>Capacity (ml):</label>
        <input type="number" name="capacity" required><br>

        <label>Material:</label>
        <input type="text" name="material" required><br>

        <label>Color:</label>
        <input type="text" name="color" required><br>

        <input type="submit" value="Submit">
    </form>

</body>
</html>