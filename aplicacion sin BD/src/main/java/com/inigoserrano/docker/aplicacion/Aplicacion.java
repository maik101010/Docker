package com.inigoserrano.docker.aplicacion;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({ "/aplicacion" })
public class Aplicacion extends HttpServlet {

    @Override
    protected void doGet(final HttpServletRequest request, final HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Salida GET");
        response.getWriter().println("Salida GET");
        response.getWriter().flush();
    }

    @Override
    protected void doPost(final HttpServletRequest request, final HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Salida POST");
        response.getWriter().println("Salida POST");
        response.getWriter().flush();

    }

}
