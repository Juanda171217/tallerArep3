package edu.escuelaing.co.app;

import edu.escuelaing.co.app.framework.api.Face;

/**
 * Clase que sirve de controlador del servidor web
 */
public class HttpServerController {

    /**
     * Metodo que inicia el servidor web
     * 
     * @param args
     */
    public static void main(String[] args) {
        HttpServer servidor = HttpServer.getInstance();
        Face.addRoute("GET", "/hello", (req, res) -> {
            return "Hello, " + req.getParameter("name");
        });
        Face.addRoute("POST", "/hello", (req, res) -> {
            return "Hello, " + req.getParameter("name");
        });
        try {
            servidor.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
