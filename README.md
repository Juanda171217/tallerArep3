# Titulo

MICROFRAMEWORKS WEB

## Descripción

En esta aplciacion se puede ver un servidor web para soportar una funcionalidad similar a la de Spark, que devuelve imagenes, gifs y demas


### Prerrequisitos

Para correr este se debe tener instalado:

- Maven
- Java

### Guía de uso

Para compilar el proyecto se debe usar:

```
mvn package
```

Para ejecutarlo, se debe hacer de la siguiente forma

```
$ java -cp "target\classes" edu.escuelaing.co.app.HttpServerController
```

Una vez ejecute este comando podrá ingresar al servidor web desde su navegador con la siguiente ruta http://localhost:33000.

## Pruebas 

Pagina de inicio

[![mn.png](https://i.postimg.cc/VkvBDqT7/mn.png)](https://postimg.cc/0zgwNw9m)

Get y Post

[![lk.png](https://i.postimg.cc/FsBJF2WZ/lk.png)](https://postimg.cc/8jLCtnVJ)

Imagen

[![lkj.png](https://i.postimg.cc/RVBv7G3B/lkj.png)](https://postimg.cc/rzf6c1Cn)

Gif

[![lkh.png](https://i.postimg.cc/bJkKdc92/lkh.png)](https://postimg.cc/7GPBQRcx)

## Documentación

Para visualizar la documentación se debe ejecutar el siguiente comando:

```
mvn javadoc:javadoc
```

Una vez se realice este comando, se debe buscar en la siguiente ruta "target\site\apidocs\index.html"


## Autor

- **Juan David Martinez** 

## Fecha

16 de Febrero, 2023
