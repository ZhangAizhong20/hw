package com.example.exercises3;

import com.talanlabs.avatargenerator.Avatar;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(
        urlPatterns = "/123456789"
)
public class nameServlet extends HttpServlet {
    @Override
  //  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

   // }

   // @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name=request.getParameter("inputName");
        String password=request.getParameter("inputPassword");

        if(password.length()<20&1<password.length()&name.length()<15&1<name.length()){

        request.setAttribute("name",name);
        request.setAttribute("password",password);


        if(check(name,password)){
            boolean d=true;
            request.setAttribute("true",d);
        }
        else {
            boolean d=false;
            request.setAttribute("true",d);
        }
        }
        else {
            request.setAttribute("name",name);
        }
        RequestDispatcher view = request.getRequestDispatcher("/result.jsp");
        view.forward(request,response);
    }
    public boolean check(String a,String b)throws IOException{
        List<String> name;
        name = Files.readAllLines(Paths.get("D:/java1/Javaee练习作业/src/main/resources/namepassword.txt"));
        Map<String,String> namepassword=new HashMap<>();
        for (String s : name) {
            String [] pwd=s.split(" ");
            namepassword.put(pwd[0],pwd[1]);

        }
        if(namepassword.containsKey(a)){
            return true;
        }
        else
            return false;
    }
}