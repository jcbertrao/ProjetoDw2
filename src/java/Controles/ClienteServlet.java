package Controles;

import DAOs.DAOCliente;
import Entidades.Cliente;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ClienteServlet", urlPatterns = {"/cliente"})
public class ClienteServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String cpfCliente = "";
        String login = "";
        String senha = "";
        String nome = "";
        String rua = "";
        int numeroDaCasa = 0;
        String cep = "";

        DAOCliente daoCliente = new DAOCliente();
        Cliente cliente = new Cliente();
        try (PrintWriter out = response.getWriter()) {

            cpfCliente = request.getParameter("cpfCliente");
            cliente.setCpf(cpfCliente);

            login = request.getParameter("loginCliente");
            cliente.setNome(login);

            senha = request.getParameter("senhaCliente");
            cliente.setSenha(senha);

            nome = request.getParameter("nomeCliente");
            cliente.setLogin(nome);

            rua = request.getParameter("ruaCliente");
            cliente.setRua(rua);

            numeroDaCasa = Integer.parseInt(request.getParameter("numeroCasaCliente"));
            cliente.setNumeroCasa(numeroDaCasa);

            cep = request.getParameter("cepCliente");
            cliente.setCep(cep);

            daoCliente.inserir(cliente);
            String resultado = "";

            resultado = listaClientesCadastrados();

            request.getSession().setAttribute("resultadoLista", resultado);
            response.sendRedirect(request.getContextPath() + "/paginas/cliente.jsp");
        }
    }

    protected String listaClienteId(String idCliente) {
        DAOCliente daoCliente = new DAOCliente();
        String tabela = "";
        List<Cliente> lista = daoCliente.listById(0);
        for (Cliente c : lista) {
            tabela += "<tr>"
                    + "<td>" + c.getCpf() + "</td>"
                    + "<td>" + c.getLogin() + "</td>"
                    + "<td>" + c.getSenha() + "</td>"
                    + "<td>" + c.getNome() + "</td>"
                    + "<td>" + c.getRua() + "</td>"
                    + "<td>" + String.valueOf(c.getNumeroCasa()) + "</td>"
                    + "<td>" + c.getCep() + "</td>"
                    + "</tr>";
        }
        return tabela;
    }

    protected String listaClientesCadastrados() {
        DAOCliente daoCliente = new DAOCliente();
        String tabela = "";
        List<Cliente> lista = daoCliente.listInOrderNome();
        for (Cliente c : lista) {
            tabela += "<tr>"
                    + "<td>" + c.getCpf() + "</td>"
                    + "<td>" + c.getLogin() + "</td>"
                    + "<td>" + c.getSenha() + "</td>"
                    + "<td>" + c.getNome() + "</td>"
                    + "<td>" + c.getRua() + "</td>"
                    + "<td>" + String.valueOf(c.getNumeroCasa()) + "</td>"
                    + "<td>" + c.getCep() + "</td>"
                    + "</tr>";
        }
        return tabela;
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
        System.out.println("teste doget");
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
        System.out.println("teste dopost");
    }

    /**
     * Returns a short deion of the servlet.
     *
     * @return a String containing servlet deion
     */
    @Override
    public String getServletInfo() {
        return "Short deion";
    }// </editor-fold>

}
