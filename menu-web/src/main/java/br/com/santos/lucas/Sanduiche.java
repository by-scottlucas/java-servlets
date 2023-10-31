package br.com.santos.lucas;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;

@WebServlet(name = "Sanduiche", urlPatterns = {"/xsalada"})
public class Sanduiche extends HttpServlet {
    private String nome;
    private String temperatura;
    private double preco;

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

        Sanduiche sanduiche = new Sanduiche();

        sanduiche.setNome("X-Salada");
        sanduiche.setTemperatura("Quente");
        sanduiche.setPreco(10.00);


        request.setAttribute("nome", sanduiche.getNome());
        request.setAttribute("temperatura", sanduiche.getTemperatura());
        request.setAttribute("preco", sanduiche.getPreco());

        RequestDispatcher dispatcher = request.getRequestDispatcher("/xsalada.jsp");
        dispatcher.forward(request, response);
    }
}
