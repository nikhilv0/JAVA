<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Reset Password</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light d-flex align-items-center justify-content-center" style="height:100vh;">

<div class="card shadow-lg p-4" style="width: 350px; border-radius: 15px;">
    <h3 class="text-center mb-3">Reset Password</h3>

    <div class="mt-3">
        <p class="text-danger">${error}</p>
        <p class="text-success">${msg}</p>
    </div>

    <form action="reset-password" method="post" onsubmit="return validateResetForm()">
        <input type="hidden" name="token" value="${token}">

        <div class="mb-3">
            <label for="password" class="form-label">New Password</label>
            <input type="password" id="password" name="password" class="form-control" placeholder="Enter new password" required>
        </div>

        <div class="mb-3">
            <label for="confirmPassword" class="form-label">Confirm Password</label>
            <input type="password" id="confirmPassword" name="confirmPassword" class="form-control" placeholder="Re-enter new password" required>
        </div>

        <div class="d-grid">
            <button type="submit" class="btn btn-primary">Reset Password</button>
        </div>
    </form>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

<script>
    function validateResetForm() {
        let password = document.getElementById("password").value;
        let confirmPassword = document.getElementById("confirmPassword").value;

        let strongPasswordPattern = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{8,}$/;

        if (!strongPasswordPattern.test(password)) {
            alert("Password must be at least 8 characters, include uppercase, lowercase, number, and special character!");
            return false;
        }

        if (password !== confirmPassword) {
            alert("Passwords do not match!");
            return false;
        }

        return true;
    }
</script>
</body>
</html>
