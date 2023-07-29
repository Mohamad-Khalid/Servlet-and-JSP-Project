package com.example.servlettasks;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

@WebServlet(name = "Task2", value = "/Task2")
public class Task2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // get the dates in the request
        String startDate = request.getParameter("dt1");
        String endDate = request.getParameter("dt2");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-d");
        //convert String to LocalDate
        LocalDate birthDate = LocalDate.parse(startDate, formatter);
        LocalDate wantedDate = LocalDate.parse(endDate, formatter);
        // calculate the difference between the two dates
        Period period = Period.between(birthDate,wantedDate);
        long dayes = period.getYears()* 365L + period.getMonths()* 30L + period.getDays();

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html> <head> <style>h2,h3{padding-left:50%} </style>  <body>");
        out.println("<h2 style=height:50px;background-color:green>Age : </h2>");
        out.println("<h3>"+ period.getYears() +" Years</h3>");
        out.println("<h3>"+ dayes/30 +" Months</h3>");
        out.println("<h3>"+ dayes+" Days</h3>");
        out.println("<h3>"+ dayes*24 +" Hours</h3>");
        out.println("<h3>"+ dayes*24*60 +" Minutes</h3>");
        out.println("<h3>"+ dayes*24*60*60 +" Seconds</h3>");
        out.println("</body> </head> </html>");


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
