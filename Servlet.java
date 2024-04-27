/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Umesha
 */
@WebServlet(urlPatterns = {"/Servlet"})
public class Servlet extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //Question 01
       // response.setContentType("text/plain");
        //response.getWriter().println("<h1>The first lab session for DEA module</h1>");
        
        //Question 02
            //Method o1
       // response.setContentType("text/html");
       // PrintWriter out=response.getWriter();
       // out.print("<html><body>");
       // out.print("<h1><b>The first lab session for DEA module</b></h1>");
       // out.print("</body></html>");
        
            //Method 02
        //response.setContentType("text/hmtl");
        //response.getWriter().println("<h1>The first lab session for DEA module</h1>");
        
       
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Question 03
        
       // response.setContentType("text/html");
       // String FirstName = request.getParameter("Fname");
        //String Surname = request.getParameter("Sname");
       // response.getWriter().println("Welcome "+FirstName+" "+ Surname );
       
       
       //Question 04
       response.setContentType("text/html");
       int a = Integer.parseInt(request.getParameter("n1"));
       int b = Integer.parseInt(request.getParameter("n2"));
       //int SUM = (Number1 + Number2);
       //response.getWriter().println("Total: "+SUM);
       
       String operation = request.getParameter("operation");
       switch(operation){
           case "Add": response.getWriter().print("Total:" + (a+b));break;
           case "Sub" : response.getWriter().print("Total:" + (a-b));break;
           case "Mul" : response.getWriter().print("Total:" + (a*b));break;
           case "Div" : response.getWriter().print("Total:" + (a/b));break;
       }
       
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
