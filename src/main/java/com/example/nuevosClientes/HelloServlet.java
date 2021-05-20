package com.example.nuevosClientes;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        /* crear una web que muestre la temperatura y si está nublado, soleado, ventoso, con lluvias, con tormentas o con nieve
        la informacion del clima se reciba por parametro en la URL

        2do ejercicio: crear un formulario web que permita registrar nuevos clientes
        De los clientes se pide: nombre, cargo, empresa, telefono e email.
        Enviar los datos del formulario a un servlet usando POST.
        El servlet debe mostrar en pantalla los datos recibidos.
        OPCIONAL: en el servlet, crear un objeto Cliente con los datos recibidos y mostrarlo con el toString();
         */
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();


        out.println("<html><body style='background-color: beige; padding:10px;'>");
        out.println("Acceso denegado, ingrese por el formulario");

        out.println("</body></html>");

    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
       String usuario=request.getParameter("usuario");
        String clave=request.getParameter("password");
        out.println("<html><body style='background-color: beige; padding:10px;'>");
        if(clave.equals("root"))
        out.println("Hola "+ usuario);
        else
            out.println("Clave incorrecta");


        out.println("</body></html>");

    }

    public void destroy() {
    }
}