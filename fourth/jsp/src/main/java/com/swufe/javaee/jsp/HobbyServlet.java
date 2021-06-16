package com.swufe.javaee.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.*;

@WebServlet(urlPatterns = "/hobbyFind")
public class HobbyServlet extends HttpServlet {
    private Map<String,List> userHobby;
   ;
    @Override
    public void init() {
       userHobby = new HashMap<>();
        List<String> BobHobby=new ArrayList<>();
        BobHobby.add("skiing");
        BobHobby.add("knitting");
        List<String> JamesHobby=new ArrayList<>();
        JamesHobby.add("scuba");
        List<String> JimHobby=new ArrayList<>();
        JimHobby.add("scuba");
        JimHobby.add("dating");
        List<String> FeiHobby=new ArrayList<>();
        FeiHobby.add("skiing");
        FeiHobby.add("knitting"); FeiHobby.add("scuba");FeiHobby.add("dating");
        List<String> JoneHobby=new ArrayList<>();
        JoneHobby.add("scuba");
        List<String> redFHobby=new ArrayList<>();
        redFHobby.add( "dating");
        List<String> Pradeep=new ArrayList<>();
        Pradeep.add("knitting");
        List<String> Philippe=new ArrayList<>();
        Philippe.add("knitting");
       int a = 0;
       userHobby.put("Bob", BobHobby);
       userHobby.put("Jim", JimHobby);
       userHobby.put("James", JamesHobby);
       userHobby.put("Fei", FeiHobby);
       userHobby.put("Jone", JoneHobby);
       userHobby.put("redF", redFHobby);
       userHobby.put("Pradeep", Pradeep);
       userHobby.put("Philippe", Philippe);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String hobby = request.getParameter("hobby");
       List<String> names = new ArrayList<>();
       userHobby.forEach((k, v) -> {
           if (v.contains(hobby)) {
               names.add(k);
           }
       });
       request.setAttribute("names", names);
       request.setAttribute("hobby", hobby);
       // Two JSPs have different UI styles.
      request.getRequestDispatcher("hobbyResult.jsp").forward(request, response);
       //request.getRequestDispatcher("hobbyResult2.jsp").forward(request, response);
    }

}
