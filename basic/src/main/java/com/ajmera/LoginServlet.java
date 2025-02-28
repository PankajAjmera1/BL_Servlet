package com.ajmera;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Pattern;

@WebServlet(
        description = "Login Servlet Testing",
        urlPatterns = {"/login"},
        initParams = {
                @WebInitParam(name="username", value="Ajmera"),
                @WebInitParam(name="password", value="pankaj")
        }
)
public class LoginServlet extends HttpServlet {

    private static final Pattern USERNAME_PATTERN = Pattern.compile("^[A-Z][a-zA-Z]{2,}$");

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("login.html");  // Redirect GET requests to login page
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        String userID = getServletConfig().getInitParameter("username");
        String userPassword = getServletConfig().getInitParameter("password");

        PrintWriter out = response.getWriter();

        if (username == null || !USERNAME_PATTERN.matcher(username).matches()) {
            out.println("<font color=red>Invalid username. Username must start with a capital letter and have at least 3 characters.</font>");
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/login.html");
            rd.include(request, response);
            return;
        }

        if (userID.equals(username) && userPassword.equals(password)) {
            request.setAttribute("username", username);
            request.getRequestDispatcher("/LoginSuccess.jsp").forward(request, response);
        } else {
            out.println("<font color=red>Either username or password is wrong.</font>");
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/login.html");
            rd.include(request, response);
        }
    }
}
