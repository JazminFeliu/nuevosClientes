package com.example.nuevosClientes;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "nuevoCliente", value = "/nuevoCliente")
public class nuevoCliente extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body style='background-color: beige; padding:10px;'>");
        String nombre= request.getParameter("nombre");
        String cargo= request.getParameter("cargo");
        String empresa= request.getParameter("empresa");
        String telefono= request.getParameter("telefono");
        String email= request.getParameter("email");

        out.println("Nombre: "+nombre);
        out.println("Cargo: "+cargo);
        out.println("Empresa: "+empresa);
        out.println("Telefono: "+telefono);
        out.println("Email: "+email);

        out.println("</body></html>");


    }
}
