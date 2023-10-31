<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="/menu-web/src/main/webapp/xsalada-css/style.css">
    <title>X-Salada</title>
</head>

<body>

    <main class="container">

        <section class="layout">

            <img src="/menu-web/src/main/webapp/xsalada-css/assets/xsalada.jpg" alt="image" class="xsalada">

            <h1 class="title">${nmxsalada}</h1>

            <p class="desc">
                90 g hambúrguer, queijo e salada. Pão de hambúrguer
                A IMAGEM DESTE PRODUTO É MERAMENTE ILUSTRATIVA.
            </p>
            <p class="desc">${tmpxsalada}</p>

            <div class="btn">
                <p>${prcxsalada}</p>
            </div>
        </section>

    </main>

</body>

</html>