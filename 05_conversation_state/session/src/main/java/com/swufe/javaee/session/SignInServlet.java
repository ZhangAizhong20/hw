package com.swufe.javaee.session;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(name = "SignInServlet", value = "/sign-in")
public class SignInServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("sign-in.html").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name= request.getParameter("inputName");
        String password=request.getParameter("inputpassword");
        String namepath="D:\\大一下\\Javaee\\java-ee-swufe-master\\05_conversation_state\\session\\src\\main\\resources\\namepassword.txt";
        String check=request.getParameter("remember");
        List<String> PandN= Files.readAllLines(Paths.get(namepath));
        Map<String,String> namepassword=new HashMap<>();
        for (String s : PandN) {
            String [] pwd=s.split(" ");
            namepassword.put(pwd[0],pwd[1]);
        }
        if(checkUser(namepassword,name)){
            if(checkPassword(namepassword,name,password)){
                request.getSession().setAttribute("UserId",name);
                response.sendRedirect("index");
                if(check!=null){
                    request.getSession().setMaxInactiveInterval(7*24*3600);
                }
            }
            else {
                String result="your password is not correct";
                request.getSession().setAttribute("result",result);
                RequestDispatcher view = request.getRequestDispatcher("passwordresult.jsp");
                view.forward(request, response); }
        }
        else {
            String result="your UserId is not EXIST";
            request.getSession().setAttribute("result",result);
            RequestDispatcher view = request.getRequestDispatcher("passwordresult.jsp");
            view.forward(request, response);
        }
    }
    public Boolean checkPassword(Map<String,String> namepassword,String name ,String password){
        if(namepassword.get(name).equals(password)){
            return true;
        }
        else {
            return false;
        }
    }
    public Boolean checkUser(Map<String,String> namepassword,String name){
        if(namepassword.containsKey(name)){
            return true;
        }
        else {return false;}
    }

}
