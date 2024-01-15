<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8" />
        <title>Page connect</title>
        <link rel='stylesheet' type='text/css' href='styles.css' />
    </head>
    <body>
        <h1>Bienvenue ${login} vous êtes connectés </h1>
        <p>Bonjour ${ u1.prenom } ${ u1.nom }</p>
        <p>${ u1.actif ? 'Vous êtes très actif !' : 'Vous êtes inactif !' }</p>
    </body>
</html>