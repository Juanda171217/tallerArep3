package edu.escuelaing.co.app.framework;

import java.io.IOException;
import java.net.Socket;

import edu.escuelaing.co.app.framework.api.Routes;
import edu.escuelaing.co.app.framework.output.StringBuilderOutput;
import edu.escuelaing.co.app.framework.resources.ApiResource;
import edu.escuelaing.co.app.framework.resources.HtmlResource;
import edu.escuelaing.co.app.framework.resources.ImageResource;
import edu.escuelaing.co.app.framework.resources.NotFoundResource;
import edu.escuelaing.co.app.framework.resources.Resource;

public class Response {

    public static void response(String method, String path, Socket clientSocket) throws IOException {
        Resource resource = identifyResource(method, path, clientSocket);
        StringBuilder buf = new StringBuilder();
        resource.print(new StringBuilderOutput(buf, clientSocket));
    }

    private static Resource identifyResource(String method, String path, Socket clientSocket) throws IOException {
        if (path.endsWith(".html")) {
            return new HtmlResource(path);
        } else if (path.endsWith(".jpg") || path.endsWith(".png") || path.endsWith(".gif") || path.endsWith(".jpeg")) {
            return new ImageResource(path);
        } else if (path.contains("?")) {
            String key = path.substring(0, path.indexOf("?"));
            key = key.replace("resources", "");
            System.out.println("key: " + key);
            return Routes.getInstance().exists(method + key) ? new ApiResource(method,
                    method + key, path) : new NotFoundResource();
        } else {
            return new NotFoundResource();
        }

    }
}
