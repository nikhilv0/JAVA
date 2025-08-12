<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Biryani</title>
</head>
<body>
<h2>${name}</h2>
<form action="onClickBiryani" method="post">
    <label for="name">Name</label>
        <input type="text" name="name"  id="name" required>
    <br>
    <label for="price">price</label>
        <input type="number" name="price"  id="price" required>
    <input type="submit" value="submit">
</form>
</body>
</html>