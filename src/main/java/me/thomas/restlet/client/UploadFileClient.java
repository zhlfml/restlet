package me.thomas.restlet.client;

import org.restlet.data.Disposition;
import org.restlet.data.Form;
import org.restlet.data.MediaType;
import org.restlet.representation.FileRepresentation;
import org.restlet.representation.Representation;
import org.restlet.resource.ClientResource;

import java.io.File;

/**
 * Created by thomas on 12/27/14.
 */
public class UploadFileClient {

    /**
     * Cannot upload a file to server by this client
     *
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        ClientResource client = new ClientResource("http://localhost:8080/restlet/rest/upload");
        File file = new File("/home/thomas/Pictures/t0125e533c809109624.jpg");
        Representation fileRepresentation = new FileRepresentation(file, MediaType.IMAGE_JPEG);
        Form form = new Form();
        form.add("name", "Thomas");
        form.add(Disposition.NAME_FILENAME, file.getName());
        fileRepresentation.setDisposition(new Disposition(Disposition.TYPE_INLINE, form));
        client.post(fileRepresentation, MediaType.MULTIPART_FORM_DATA);
    }
}
