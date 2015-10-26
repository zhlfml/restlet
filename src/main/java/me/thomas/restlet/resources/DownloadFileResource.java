package me.thomas.restlet.resources;

import org.restlet.data.Disposition;
import org.restlet.data.MediaType;
import org.restlet.representation.FileRepresentation;
import org.restlet.representation.Representation;
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

import java.io.File;

/**
 * Created by thomas on 2014/12/26.
 */
public class DownloadFileResource extends ServerResource {

    @Get(value = "?pdf")
    public Representation downloadPdf(Representation entity) throws Exception {
        File file = new File("C:\\Users\\Public\\Documents\\letter.pdf");
        Representation fileRepresentation = new FileRepresentation(file, MediaType.APPLICATION_PDF);
        fileRepresentation.setDisposition(new Disposition(Disposition.TYPE_ATTACHMENT));
        fileRepresentation.getDisposition().setFilename(file.getName());
        fileRepresentation.getDisposition().setSize(file.length());
        return fileRepresentation;
    }

    @Get(value = "?jpg")
    public Representation downloadJpg(Representation entity) throws Exception {
        File file = new File("C:\\Users\\Public\\Pictures\\Sample Pictures\\829BJDH633AN.jpg");
        Representation fileRepresentation = new FileRepresentation(file, MediaType.IMAGE_JPEG);
        fileRepresentation.setDisposition(new Disposition(Disposition.TYPE_ATTACHMENT));
        fileRepresentation.getDisposition().setFilename(file.getName());
        fileRepresentation.getDisposition().setSize(file.length());
        return fileRepresentation;
    }
}
