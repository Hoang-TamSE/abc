/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package cal.prj321;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;

/**
 * @author Hoang Tam
 */
public class calculator extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request  servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException      if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String number1 = request.getParameter("a");
        String number2 = request.getParameter("b");
        String date = request.getParameter("date");
        double a = Double.parseDouble(number1);
        double b = Double.parseDouble(number2);
        String operator = request.getParameter("ope");
        double result = 0;
        switch (operator) {
            case "+":
                result = a + b;
                request.setAttribute("add", "selected");
                break;
            case "-":
                result = a - b;
                request.setAttribute("sub", "selected");
                break;
            case "*":
                result = a * b;
                request.setAttribute("multi", "selected");
                break;
            case "/":
                result = a / b;
                request.setAttribute("divv", "selected");
                break;
            default:
                throw new AssertionError();
        }
        if (operator.equals("/") && b == 0) {
            request.setAttribute("r", "không thể chia cho 0!!!");

        } else
            request.setAttribute("r", result);
        request.setAttribute("first", number1);
        request.setAttribute("second", number2);
        request.setAttribute("DATE", date);


        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request  servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException      if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request  servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException      if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
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

}
