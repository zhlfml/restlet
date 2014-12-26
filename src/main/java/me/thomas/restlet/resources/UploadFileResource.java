package me.thomas.restlet.resources;

import me.thomas.restlet.entity.UploadFile;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.restlet.data.MediaType;
import org.restlet.ext.fileupload.RestletFileUpload;
import org.restlet.representation.Representation;
import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;

import java.io.File;
import java.util.List;

/**
 * Created by thomas on 2014/12/26.
 */
public class UploadFileResource extends ServerResource {

    @Post
    public UploadFile uploadFile(Representation entity) throws Exception {
        if(entity == null || entity.getMediaType() == null || !MediaType.MULTIPART_FORM_DATA.isCompatible(entity.getMediaType())) {
            throw new IllegalArgumentException("The request should be of type " + MediaType.MULTIPART_FORM_DATA  + ".");
        }

        UploadFile uploadFile = new UploadFile();
        RestletFileUpload upload = new RestletFileUpload(new DiskFileItemFactory());
        List<FileItem> items = upload.parseRepresentation(entity);

        for (FileItem fileItem : items) {
            if (!fileItem.isFormField()) {
                String fileName = fileItem.getName();
                try {
                    fileItem.write(new File(fileName));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                uploadFile.getFileNames().add(fileName);
            } else {
                System.out.println(fileItem.getFieldName() + " -> " + fileItem.getString());
            }
        }

        return uploadFile;
    }
}
