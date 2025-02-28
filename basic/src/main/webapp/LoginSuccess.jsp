<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Success</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body class="d-flex justify-content-center align-items-center vh-100 bg-light">
    <div class="card p-4 text-center shadow-lg">
        <h2 class="text-success">Welcome, <%= request.getAttribute("username") %>!</h2>
        <p class="text-muted">You have successfully logged in.</p>
        <a href="login.html" class="btn btn-primary mt-3">Go to Login Page</a>
    </div>
</body>
</html>
