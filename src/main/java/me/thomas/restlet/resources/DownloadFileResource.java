package me.thomas.restlet.resources;

import me.thomas.restlet.entity.UploadFile;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.restlet.data.Disposition;
import org.restlet.data.MediaType;
import org.restlet.ext.fileupload.RestletFileUpload;
import org.restlet.representation.FileRepresentation;
import org.restlet.representation.Representation;
import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;

import java.io.File;
import java.util.List;

/**
 * Created by thomas on 2014/12/26.
 */
public class DownloadFileResource extends ServerResource {

    @Get(value = "pdf")
    public Representation downloadPdf(Representation entity) throws Exception {
        File file = new File("/home/thomas/Documents/hftp.pdf");
        Representation fileRepresentation = new FileRepresentation(file, MediaType.APPLICATION_PDF);
        fileRepresentation.setDisposition(new Disposition(Disposition.TYPE_ATTACHMENT));
        fileRepresentation.getDisposition().setFilename(file.getName());
        fileRepresentation.getDisposition().setSize(file.length());
        return fileRepresentation;
    }

    @Get(value = "jpg")
    public Representation downloadJpg(Representation entity) throws Exception {
        File file = new File("/home/thomas/Pictures/t0125e533c809109624.jpg");
        Representation fileRepresentation = new FileRepresentation(file, MediaType.IMAGE_JPEG);
        fileRepresentation.setDisposition(new Disposition(Disposition.TYPE_ATTACHMENT));
        fileRepresentation.getDisposition().setFilename(file.getName());
        fileRepresentation.getDisposition().setSize(file.length());
        return fileRepresentation;
    }
}
