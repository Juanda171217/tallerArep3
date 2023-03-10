package edu.escuelaing.co.app.framework.resources;

import edu.escuelaing.co.app.framework.output.Output;

public class ImageResource implements Resource {

    private String path = "";

    public ImageResource(String path) {
        this.path = path;
    }

    @Override
    public void print(Output output) {
        output.add("Content-Type", "image/" + path.substring(path.lastIndexOf(".") + 1));
        output.add("X-File", path);
        output.print(1);
    }

}