
package Controles;

import DAOs.DAOProduto;
import Entidades.Produto;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "PrdutoServlet", urlPatterns = {"/produto"})
public class PrdutoServlet extends HttpServlet {

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        DAOProduto produto = new DAOProduto();
        String resultado = "";
        List<Produto> lista = produto.listInOrderNome();
        try (PrintWriter out = response.getWriter()) {
            for (Produto c : lista) {
                resultado += "<tr>"
                        + "<td>" + c.getCodProduto() + "</td>"
                        + "<td>" + c.getPreco() + "</td>"
                        + "<td>" + c.getDescricao() + "</td>"
                        + "<td>" + c.getCaminho() + "</td>"
                        + "<td>" + c.getCodCor() + "</td>"
                        + "<td>" + c.getIdModelo() + "</td>"
                        + "</tr>";
            }
            System.out.println(resultado);
            request.getSession().setAttribute("resultado", resultado);
            response.sendRedirect(request.getContextPath() + "/paginas/produto.jsp");
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
