package com.ajmera;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/FirstServlet")
public class SimpleServlet  extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out =response.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>First Servlet</title>");
        out.println("<link rel='stylesheet' href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css'>");
        out.println("</head>");

        out.println("<body class='d-flex flex-column align-items-center justify-content-center vh-100 bg-light'>");

        out.println("<div class='card p-4 text-center shadow-lg'>");
        out.println("<h2>Welcome to the First Servlet</h2>");
        out.println("<h1>Pankaj Server</h1>");

        // Login Page Link
        out.println("<a href='login.html' class='btn btn-primary mt-3'>Go to Login Page</a>");

        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
        out.close();

    }
}
