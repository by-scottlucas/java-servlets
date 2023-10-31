<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="xtudo.css">
    <title>X-Tudo</title>
</head>

<body>

    <main class="container">

        <div class="btn2">
            <a href="index.html">Voltar</a>
        </div>

        <section class="layout">

            <img src="xtudo.jpg" alt="" class="xtudo">

            <h1 class="title">${nmXtudo}</h1>
            
            <p class="desc">
                Pão, 1 hambúrguer, queijo, presunto, alface, tomate, ovo, bacon, milho, ervilha, batata palha, maionese e catchup.
            </p>

            <p class="desc">
                Temperatura: <strong>${tmpXtudo}</strong>
            </p>

            <div class="btn">
                <p>R$ ${prcXtudo}</p>
            </div>
            
        </section>

    </main>

</body>

</html>