package backend.java;

import java.io.IOException;



import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/submit1")

public class Myservlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String mysearch = req.getParameter("search1");
		resp.sendRedirect("https://www.google.com/search?q="+mysearch);
	}

}
