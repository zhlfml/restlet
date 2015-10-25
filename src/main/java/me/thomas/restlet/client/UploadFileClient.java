package me.thomas.restlet.client;

import org.restlet.data.MediaType;
import org.restlet.ext.html.FormData;
import org.restlet.ext.html.FormDataSet;
import org.restlet.representation.FileRepresentation;
import org.restlet.representation.Representation;
import org.restlet.resource.ClientResource;

import java.io.File;

/**
 * Created by thomas on 12/27/14.
 */
public class UploadFileClient {

    /**
     * Upload a file to server by this client
     * 
     * @see <a href="http://restlet.com/technical-resources/restlet-framework/guide/2.3/extensions/html">FormDataSet</a>
     *
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\Public\\Pictures\\Sample Pictures\\829BJDH633AN.jpg");
        Representation fileRepresentation = new FileRepresentation(file, MediaType.IMAGE_JPEG);

        FormDataSet formDataSet = new FormDataSet();
        formDataSet.setMultipart(true);
        formDataSet.getEntries().add(new FormData("file", fileRepresentation));

        ClientResource client = new ClientResource("http://localhost:8080/restlet/rest/upload");
        client.post(formDataSet);
    }
}
