<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="xsalada.css">
    <title>X-Salada</title>
</head>

<body>

    <main class="container">

        <div class="btn2">
            <a href="index.html">Voltar</a>
        </div>

        <section class="layout">

            <img src="xsalada.webp" alt="" class="xsalada">

            <h1 class="title">${nmXsalada}</h1>

            <p class="desc">
                Pão, 1 hambúrguer, presunto, queijo, alface, tomate, milho, ervilha, batata palha, maionese e catchup.
            </p>

            <p class="desc">
                Temperatura: <strong>${tmpXsalada}</strong>
            </p>

            <div class="btn">
                <p>R$ ${prcXsalada}</p>
            </div>

        </section>

    </main>

</body>

</html>