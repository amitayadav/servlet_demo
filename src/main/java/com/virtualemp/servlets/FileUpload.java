package com.virtualemp.servlets;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.util.List;

public class FileUpload extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        try {
            ServletFileUpload sf = new ServletFileUpload(new DiskFileItemFactory());
            List<FileItem> multifiles = sf.parseRequest(request);

            for (FileItem item : multifiles) {
                item.write(new File("C:\\Users\\amitayadav\\Documents\\Amita_projects\\java\\servlet_demo\\" +
                        item.getName()));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("file uploaded successfully");
    }
}
