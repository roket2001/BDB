<%-- 
    Document   : Libro
    Created on : 28/09/2018, 08:58:27 AM
    Author     : Usuario
--%>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Formulario de Libro</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
        crossorigin="anonymous">
</head>

<body>
    <div class="container">
        <h1>Formulario para ingresar libros</h1>
        <form method="post" action="Libro">
            <div class="form-group">
                <label for="inputNombre">Nombre</label>
                <input name="nombre" type="text" class="form-control" id="inputNombre" aria-describedby="emailHelp" placeholder="Ingrese el nombre">
            </div>
            <div class="form-group">
                <label for="inputAutor">Autor</label>
                <input name="autor" type="text" class="form-control" id="inputAutor" aria-describedby="emailHelp" placeholder="Ingrese el autor">
            </div>
            <div class="form-group">
                <label for="inputAnio">Año de publicación</label>
                <input name="anioPublicacion" type="number" class="form-control" id="inputAnio" aria-describedby="emailHelp" placeholder="Ingrese año de publicación">
            </div>
            <div class="form-group">
                <label for="inputEditorial">Editorial</label>
                <input name="editorial" type="text" class="form-control" id="inputEditorial" aria-describedby="emailHelp" placeholder="Ingrese la Editorial">
            </div>
            <div class="form-group">
                <label for="inputSinopsis">Sinopsis</label>
                <input name="sinopsis" type="text" class="form-control" id="inputSinopsis" aria-describedby="emailHelp" placeholder="Ingrese su Sinopsis">
            </div>
            <div class="form-group">
                <label for="inputTematica">Temática</label>
                <input name="tematica" type="text" class="form-control" id="inputTematica" aria-describedby="emailHelp" placeholder="Ingrese la temática">
            </div>
            <button type="submit" class="btn btn-primary">Guardar Libro</button>
        </form>
        <div class="container">
            
        </div>
    </div>
</body>

</html>