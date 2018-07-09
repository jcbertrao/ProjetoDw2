
package Controles;

import DAOs.DAOVenda;
import Entidades.Venda;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.String.format;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "VendaServlet", urlPatterns = {"/venda"})
public class VendaServlet extends HttpServlet {
     SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        DAOVenda venda = new DAOVenda();
        String resultado = "";
        List<Venda> lista = venda.listInOrderNome();
        try (PrintWriter out = response.getWriter()) {
            for (Venda c : lista) {
                resultado += "<tr>"
                        + "<td>" + c.getCodVenda()+ "</td>"
                        + "<td>" + format.format(c.getData()) + "</td>"
                        + "<td>" + c.getClienteCpf() + "</td>"
                        + "</tr>";
            }
            System.out.println(resultado);
            request.getSession().setAttribute("resultado", resultado);
            response.sendRedirect(request.getContextPath() + "/paginas/venda.jsp");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
        processRequest(request, response);
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
