package com.example.servlettasks;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;

@WebServlet(name = "Task1", value = "/Task1")
public class Task1 extends HttpServlet {
    public BigInteger factroial(int number){
        BigInteger result = new BigInteger("1");
        for(int i=2; i<= number; ++i){
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String num = request.getParameter("num"); // user request value
        int number = Integer.parseInt(num);         // parse string to int

        response.setContentType("text/html");       // specify the response format
        PrintWriter out = response.getWriter();    //  create out object to write the response

        // Draw HTML table
        out.println("<table border=1>");
        out.println("<tr>");
        out.println("<th>Number</th>");
        out.println("<th>Factorial</th>");
        out.println("</tr>");
        // Print the output in the table
        for(int i=0; i<=number; ++i){
            out.println("<tr>");
            out.println("<td>"+i+"</td>");
            out.println("<td>"+factroial(i)+"</td>");
            out.println("</tr>");
        }
        out.println("</table>");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
