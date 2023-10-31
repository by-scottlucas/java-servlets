package br.com.santos.lucas;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Sanduiche", urlPatterns = {"/xsalada.jsp"})
public class Sanduiche extends HttpServlet {
    public String nome;
    private String temperatura;
    private double preco;

    @Override
    public void init() throws ServletException {
        super.init();
        nome = "X-Salada";
        temperatura = "Quente";
        preco = 10.00;
    }

    // Métodos Getters e Setters (se necessário)

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setAttribute("nmxsalada", nome);
        request.setAttribute("tmpxsalada", temperatura);
        request.setAttribute("prcxsalada", preco);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/xsalada.jsp");
        dispatcher.forward(request, response);
    }
}
