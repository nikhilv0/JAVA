<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Chutney</title>
</head>
<body>

    <form action="onClickChutney" method="post">
        <label>Name:</label>
        <input type="text" name="name" required><br>

        <label>Type (Tomato/Mint/Coconut):</label>
        <input type="text" name="type" required><br>

        <label>Spice Level:</label>
        <input type="text" name="spiceLevel" required><br>

        <label>Quantity (grams):</label>
        <input type="number" name="quantity" required><br>

        <label>Price:</label>
        <input type="number" name="price" required><br>

        <input type="submit" value="Submit">
    </form>

</body>
</html>