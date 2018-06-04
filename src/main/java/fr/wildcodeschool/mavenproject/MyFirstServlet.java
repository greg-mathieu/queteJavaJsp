package fr.wildcodeschool.mavenproject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "MyFirstServlet", urlPatterns = "/first-servlet")
public class MyFirstServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<TestModel> testList = new ArrayList<TestModel>();
        testList.add(new TestModel("Bobby", "bobby@wild.fr", "bob31", "987613", "url"));

        testList.add(new TestModel("John", "john@wild.fr", "joe666", "93465", "url"));

        testList.add(new TestModel("Marie", "marie@wild.fr", "mama", "365123", "url"));

        testList.add(new TestModel("Pablo", "pablo@wild.fr", "pablito", "100613", "url"));

        testList.add(new TestModel("Georges", "georges@wild.fr", "marabou", "712345", "url"));

        request.setAttribute("testListValue", testList);
        this.getServletContext().getRequestDispatcher("/testList.jsp").forward(request, response);
    }
}
