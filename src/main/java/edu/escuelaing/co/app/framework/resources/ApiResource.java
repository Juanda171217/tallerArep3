package edu.escuelaing.co.app.framework.resources;

import edu.escuelaing.co.app.framework.Request;
import edu.escuelaing.co.app.framework.api.ApiController;
import edu.escuelaing.co.app.framework.api.Routes;
import edu.escuelaing.co.app.framework.output.Output;

public class ApiResource implements Resource {

    private String content = "text/plain";
    private int binary = 0;
    private String body = "";

    public ApiResource() {
    }

    public ApiResource(String method, String key, String path) {
        ApiController apiRes = Routes.getInstance().getRoute(key);
        this.body = apiRes.response(new Request(method, path), "");
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public void print(Output output) {
        output.add("Content-Type", content);
        output.add("X-Body", body);
        output.print(binary);
    }

}
