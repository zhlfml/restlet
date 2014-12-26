package me.thomas.restlet;

import me.thomas.restlet.resources.StudentResource;
import me.thomas.restlet.resources.StudentsResource;
import me.thomas.restlet.resources.UploadFileResource;
import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.routing.Router;

/**
 * Created by thomas on 12/24/14.
 */
public class StudentApplication extends Application {

    @Override
    public Restlet createInboundRoot() {
        Router router = new Router(getContext());
        router.attach("/student/{id}", StudentResource.class);
        router.attach("/students", StudentsResource.class);
        router.attach("/upload", UploadFileResource.class);

        return router;
    }
}
