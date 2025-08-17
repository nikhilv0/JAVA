<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Conference Paper Submission</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
<div class="container mt-5">
    <div class="card shadow-lg p-4">
        <h2 class="mb-4 text-center">Conference Paper Submission</h2>
        <form action="submitConferencePaper" method="post">
            <div class="mb-3">
                <label for="authorName" class="form-label">Author Name</label>
                <input type="text" id="authorName" class="form-control" name="authorName" required>
            </div>
            <div class="mb-3">
                <label for="email" class="form-label">Email</label>
                <input type="email" id="email" class="form-control" name="email" required>
            </div>
            <div class="mb-3">
                <label for="phone" class="form-label">Phone</label>
                <input type="number" id="phone" class="form-control" name="phone" required>
            </div>
            <div class="mb-3">
                <label for="paperTitle" class="form-label">Paper Title</label>
                <input type="text" id="paperTitle" class="form-control" name="paperTitle" required>
            </div>
            <div class="mb-3">
                <label for="abstract" class="form-label">Abstract</label>
                <textarea id="abstract" class="form-control" name="abstract" rows="3" required></textarea>
            </div>
            <div class="mb-3">
                <label for="keywords" class="form-label">Keywords</label>
                <input type="text" id="keywords" class="form-control" name="keywords" required>
            </div>
            <div class="mb-3">
                <label for="track" class="form-label">Track</label>
                <select id="track" class="form-select" name="track" required>
                    <option value="">Select</option>
                    <option>Artificial Intelligence</option>
                    <option>Data Science</option>
                    <option>Networking</option>
                    <option>Software Engineering</option>
                </select>
            </div>
            <button type="submit" class="btn btn-dark w-100">Submit Paper</button>
        </form>
    </div>
</div>
</body>
</html>
