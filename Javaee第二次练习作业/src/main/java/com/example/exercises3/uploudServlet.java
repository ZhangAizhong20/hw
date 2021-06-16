package com.example.exercises3;

import javax.imageio.ImageIO;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import model.image;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

@WebServlet( urlPatterns = "/uploudServlet")
@MultipartConfig
public class uploudServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      Part part= request.getPart("image2");
      String a=request.getParameter("imagename");
       String pathname="D:/java1/Javaee练习作业/src/main/resources/"+a+".png";
       Path pa=Paths.get(pathname);
       String success= "your image has been uplouded successfully";
       request.setAttribute("success",success);
       part.write(pathname);
       request.setAttribute("pathname",pathname);
       image im=new image();
       im.setURLNAME(pathname);
      response.sendRedirect("result2.jsp");



    }

}
