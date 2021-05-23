package com.example.thirteen;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

public class FirstServlet extends HttpServlet {


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name = request.getParameter("name");
        String surName = request.getParameter("surName");

        PrintWriter pw = response.getWriter();


        pw.println("<html>");
        pw.println("<h1> yoyoyyo! " + name + " " + surName + " </h1>");
        pw.println("</html>");
    }

    public void destroy() {
    }
}