package edu.escuelaing.co.app.framework.api;

import edu.escuelaing.co.app.framework.Request;

@FunctionalInterface
public interface ApiController {

    public String response(Request req, String value);

}
