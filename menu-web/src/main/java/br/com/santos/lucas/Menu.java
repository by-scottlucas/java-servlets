package br.com.santos.lucas;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/menu")
public class Menu extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<Sanduiche> sanduiches = new ArrayList<>();
        sanduiches.add(new XSalada("X-Salada |", " Quente | R$", 10.00));
        sanduiches.add(new XTudo("X-Tudo |", " Quente | R$", 30.00));

    }

}
