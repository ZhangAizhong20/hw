package com.example.exercises3;

import com.talanlabs.avatargenerator.Avatar;
import com.talanlabs.avatargenerator.TriangleAvatar;

import javax.imageio.ImageIO;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

@WebServlet(urlPatterns = "/123")
public class imageoutputServlet extends HttpServlet {
   @Override

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

       ServletOutputStream os = response.getOutputStream();int number=10;
   for(int i=1;i<10;i++){
       Avatar avatar = TriangleAvatar.newAvatarBuilder().build();
    long a=new Random().nextLong();
    byte[] b=avatar.createAsPngBytes(a);


       os.write(b);
       os.flush();
    }
       os.close();


   }

  //  @Override
    //protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    //ServletOutputStream os = response.getOutputStream();www
      //  os.write(b);
        //os.flush();
        //os.close();
    //}
}
