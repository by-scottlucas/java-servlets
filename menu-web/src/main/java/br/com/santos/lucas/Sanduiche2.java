package br.com.santos.lucas;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;

@WebServlet(name = "Sanduiche2", urlPatterns = {"/xtudo"})
public class Sanduiche2 extends HttpServlet {
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

        Sanduiche sanduiche2 = new Sanduiche();

        sanduiche2.setNome("X-Tudo");
        sanduiche2.setTemperatura("Quente");
        sanduiche2.setPreco(30.00);


        request.setAttribute("nmXtudo", sanduiche2.getNome());
        request.setAttribute("tmpXtudo", sanduiche2.getTemperatura());
        request.setAttribute("prcXtudo", sanduiche2.getPreco());

        RequestDispatcher dispatcher = request.getRequestDispatcher("/xtudo.jsp");
        dispatcher.forward(request, response);
    }
}
