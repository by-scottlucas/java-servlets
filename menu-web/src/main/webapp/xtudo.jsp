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

        <section class="layout">




            <h1 class="title">X-Tudo</h1>

            <p class="desc">
                90 g hambúrguer, queijo e salada. Pão de hambúrguer.
            </p>

            <p class="desc">
                Temperatura: ${sanduiche.getNome()}
            </p>

            <div class="btn">
                <p>R$ 20,00</p>
            </div>
        </section>

    </main>

</body>

</html>