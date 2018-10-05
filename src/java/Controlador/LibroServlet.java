/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Libro;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
 *
 * @author Usuario
 */
public class LibroServlet extends HttpServlet {

/**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("jsp/Libro.jsp");
        
        List<Libro> listaLibro = new ArrayList<Libro>();
        request.setAttribute("lista", listaLibro);
        
        rd.forward(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("jsp/Libro.jsp");
        
        String nombre = request.getParameter("nombre");
        String autor = request.getParameter("autor");
        String anioPublicacionStr = request.getParameter("anioPublicacion");
        String editorial = request.getParameter("editorial");
        String sinopsis = request.getParameter("sinopsis");
        String tematica = request.getParameter("tematica");
        
        Libro lb = new Libro();
        lb.nombre = nombre;
        lb.autor = autor;
        lb.anioPublicacion = Integer.parseInt(anioPublicacionStr);
        lb.editorial = editorial;
        lb.sinopsis = sinopsis;
        lb.tematica = tematica;
        
        guardarLibro(lb);
        
        List<Libro> listaLibro = new ArrayList<Libro>();
        listaLibro.add(lb);
        
        request.setAttribute("lista", listaLibro);
        
        rd.forward(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private void guardarLibro(Libro lb) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/librosh", "root", "");
            PreparedStatement ps = conexion.prepareStatement("INSERT INTO libro (nombre, autor, anioPublicacion, editorial, sinopsis, tematica) VALUES (?, ?, ?, ?, ?, ?)");
            ps.setString(1, lb.nombre);
            ps.setString(2, lb.autor);
            ps.setInt(3, lb.anioPublicacion);
            ps.setString(4, lb.editorial);
            ps.setString(5, lb.sinopsis);
            ps.setString(6, lb.tematica);
            ps.execute();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LibroServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LibroServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
