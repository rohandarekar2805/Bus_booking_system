package backend.java;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/mylogin")

public class dopost extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String myname= (String) req.getParameter("name1");
		String mypassword=(String) req.getParameter("pass1"); 
		
		System.out.println("Name : "+myname);
		System.out.println("Password :"+mypassword);
		
		if(myname.equals("rohan") && mypassword.equals("r123"))
		{
			System.out.print("success");
		}
		else
		{
			System.out.println("Failed");
		}
		
		
	}

}
