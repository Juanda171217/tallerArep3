package edu.escuelaing.co.app.framework.api;

public interface Face {

    public static void addRoute(String method, String path, ApiController value) {
        Routes.getInstance().addRoute(method + path, value);
    };
}
