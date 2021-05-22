package com.example.nuevosClientes;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "nuevoServlet", value = "/nuevoServlet")
public class nuevoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String usuario=request.getParameter("usuario");
        String clave=request.getParameter("password");
        out.println("<html><body style='background-color: blue; padding:10px;'>");
        if(clave.equals("root"))
            out.println("Holaaaaaaaaaaaa "+ usuario);
        else
            out.println("Clave incorrecta");


        out.println("</body></html>");

    }

}

