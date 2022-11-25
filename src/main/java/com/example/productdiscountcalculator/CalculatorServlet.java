package com.example.productdiscountcalculator;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculatorServlet", value = "/calculator")
public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");
        String desc = request.getParameter("desc");
        double price = Double.parseDouble(request.getParameter("price"));
        double discount = Double.parseDouble(request.getParameter("discount"));

        double discountAmt = price * discount * 0.01;
        double discountPrice = price - discountAmt;

        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<p> Description: " + desc + "</p>");
        out.println("<p> Price: $" + price + "</p>");
        out.println("<p> Discount: " + discount + "%</p>");
        out.println("<p> Discount Amount: " + discountAmt + "</p>");
        out.println("<p> Discount Price: " + discountPrice + "</p>");
        out.println("</html>");


    }
}
