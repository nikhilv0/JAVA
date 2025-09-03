<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en" xmlns:c="http://www.w3.org/1999/XSL/Transform">

<head>
    <meta charset="UTF-8">
    <title>Profile</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Bootstrap Icons -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons/font/bootstrap-icons.css" rel="stylesheet">

    <style>
        .error-message { color: red; font-size: 0.9rem; }
        .edit-icon {
            cursor: pointer;
            font-size: 1.2rem;
            transition: color 0.3s ease;
        }
        .edit-icon:hover {
            color: #198754; /* green hover */
        }
        .input-group-text {
            background: transparent;
            border: none;
        }
    </style>
</head>
<body class="bg-light">

<!-- Navbar -->
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="container-fluid">

        <a class="navbar-brand d-flex align-items-center" href="index.jsp">
            <img src="${pageContext.request.contextPath}/images/xworkz-logo.jpeg"
                 alt="Logo"
                 style="height:60px; width:auto; margin-right:10px;">
            <span style="font-size:22px; font-weight:bold;">MyWebsite</span>
        </a>

        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav">
            <span class="navbar-toggler-icon"></span>
        </button>


        <div class="collapse navbar-collapse justify-content-end" id="navbarNav">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link" href="SignUp.jsp">SignUp</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="SignIn.jsp">SignIn</a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<!-- Profile Content -->
<div class="container mt-5">
    <h3 class="mb-4 text-center">Profile</h3>

    <!-- Profile Card -->
    <c:if test="${not empty list}">
        <c:forEach var="user" items="${list}">
            <div class="card shadow-lg p-4 rounded-4 mx-auto" style="max-width: 600px;">
                <form id="profileForm" action="updateProfile" method="post">

                    <div class="mt-3">
                        <p class="text-danger">${error}</p>
                        <p class="text-success">${msg}</p>
                    </div>

                    <!-- Full Name -->
                    <div class="mb-3 position-relative">
                        <label class="form-label fw-bold">Full Name</label>
                        <div class="input-group">
                            <input type="text" class="form-control pe-5" id="fullName" name="fullName"
                                   value="${user.fullName}" readonly>
                            <span class="input-group-text position-absolute end-0 me-2">
                                <i class="bi bi-pencil text-primary edit-icon" onclick="toggleEdit(this)"></i>
                            </span>
                        </div>
                        <small id="fullNameError" class="error-message"></small>
                    </div>

                    <!-- Email -->
                    <div class="mb-3 position-relative">
                        <label class="form-label fw-bold">Email</label>
                        <div class="input-group">
                            <input type="email" class="form-control pe-5" id="email" name="email"
                                   value="${user.email}" readonly>
                            <span class="input-group-text position-absolute end-0 me-2">
                                <i class="bi bi-pencil text-primary edit-icon" onclick="toggleEdit(this)"></i>
                            </span>
                        </div>
                        <small id="emailError" class="error-message"></small>
                    </div>

                    <!-- Phone -->
                    <div class="mb-3 position-relative">
                        <label class="form-label fw-bold">Phone Number</label>
                        <div class="input-group">
                            <input type="text" class="form-control pe-5" id="phone" name="phone"
                                   value="${user.phone}" readonly>
                            <span class="input-group-text position-absolute end-0 me-2">
                                <i class="bi bi-pencil text-primary edit-icon" onclick="toggleEdit(this)"></i>
                            </span>
                        </div>
                        <small id="phoneError" class="error-message"></small>
                    </div>

                    <!-- Gender -->
                    <div class="mb-3 position-relative">
                        <label class="form-label fw-bold">Gender</label>
                        <div class="input-group">

                            <div class="form-check form-check-inline">
                                <input class="form-check-input" type="radio"
                                       name="gender" id="male" value="MALE"/>
                                <c:if test="${user.gender == 'MALE'}">checked</c:if>
                                <label class="form-check-label" for="male">Male</label>
                            </div>

                            <div class="form-check form-check-inline">
                                <input class="form-check-input" type="radio"
                                       name="gender" id="female" value="FEMALE"/>
                                <c:if test="${user.gender == 'FEMALE'}">checked</c:if>
                                <label class="form-check-label" for="female">Female</label>
                            </div>

                            <div class="form-check form-check-inline">
                                <input class="form-check-input" type="radio"
                                       name="gender" id="other" value="OTHER"/>
                                <c:if test="${user.gender == 'OTHER'}">checked</c:if>
                                <label class="form-check-label" for="other">Other</label>
                            </div>

                            <span class="input-group-text position-absolute end-0 me-2">
            <i class="bi bi-pencil text-primary edit-icon" onclick="toggleEdit(this)"></i>
        </span>
                        </div>
                        <small id="genderError" class="error-message"></small>
                    </div>


                    <!-- Age -->
                    <div class="mb-3 position-relative">
                        <label class="form-label fw-bold">Age</label>
                        <div class="input-group">
                            <input type="number" class="form-control pe-5" id="age" name="age"
                                   value="${user.age}" readonly>
                            <span class="input-group-text position-absolute end-0 me-2">
                                <i class="bi bi-pencil text-primary edit-icon" onclick="toggleEdit(this)"></i>
                            </span>
                        </div>
                        <small id="ageError" class="error-message"></small>
                    </div>

                    <!-- Address -->
                    <div class="mb-3 position-relative">
                        <label class="form-label fw-bold">Address</label>
                        <div class="input-group">
                            <textarea class="form-control pe-5" id="address" name="address" rows="2" readonly>${user.address}</textarea>
                            <span class="input-group-text position-absolute end-0 me-2">
                                <i class="bi bi-pencil text-primary edit-icon" onclick="toggleEdit(this)"></i>
                            </span>
                        </div>
                        <small id="addressError" class="error-message"></small>
                    </div>

                    <!-- Update Button -->
                    <div class="text-center mt-4">
                        <button type="submit" class="btn btn-success px-4">Update Profile</button>
                    </div>
                </form>
            </div>
        </c:forEach>
    </c:if>
</div>

<!-- JS -->
<script>
    // Toggle readonly for individual field
    function toggleEdit(icon) {
        const input = icon.closest(".input-group").querySelector("input, textarea");

        if (input.hasAttribute("readonly")) {
            input.removeAttribute("readonly");
            input.focus();
            icon.classList.remove("bi-pencil", "text-primary");
            icon.classList.add("bi-check-lg", "text-success"); // show check
        } else {
            if (validateField(input.id)) { // validate before locking back
                input.setAttribute("readonly", true);
                icon.classList.remove("bi-check-lg", "text-success");
                icon.classList.add("bi-pencil", "text-primary"); // back to pencil
            }
        }
    }

    // Validation rules
    const validators = {
        fullName: (value) => value.length >= 3 ? "" : "Name must be at least 3 characters long!",
        email: (value) => /^(?=.*[0-9])[a-zA-Z0-9._%+-]+@gmail\.com$/.test(value) ? "" : "Enter a valid Gmail with at least one number.",
        phone: (value) => value.length === 10 && !isNaN(value) ? "" : "Phone number must be exactly 10 digits.",
        age: (value) => value >= 18 && value <= 70 ? "" : "Age must be between 18 and 70.",
        address: (value) => value.length >= 5 ? "" : "Address must be at least 5 characters long.",
        gender: (value) => ["MALE", "FEMALE", "OTHER"].includes(value.toUpperCase()) ? "" : "Gender must be MALE, FEMALE or OTHER."
    };

    function validateField(fieldId) {
        const input = document.getElementById(fieldId);
        const value = (input.value || "").trim();
        const error = validators[fieldId] ? validators[fieldId](value) : "";
        document.getElementById(fieldId + "Error").textContent = error;
        return !error;
    }

    // Real-time validation
    Object.keys(validators).forEach(fieldId => {
        const input = document.getElementById(fieldId);
        if (input) {
            input.addEventListener("input", () => validateField(fieldId));
        }
    });

    // Validate all on form submit
    document.getElementById("profileForm").addEventListener("submit", function (event) {
        let isValid = true;
        for (const fieldId in validators) {
            if (!validateField(fieldId)) {
                isValid = false;
            }
        }
        if (!isValid) {
            event.preventDefault();
        }
    });
</script>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
