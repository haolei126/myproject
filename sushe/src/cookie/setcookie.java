package cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class setcookie extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String key = request.getParameter("username");
    	Cookie foo = new Cookie("kky", key); 
    	foo.setPath("/");
    	foo.setMaxAge(93312000);
		response.addCookie(foo);  
		System.out.println(key);
		PrintWriter out = response.getWriter();
		out.print("<center>");  
        out.print("setcookie success:"+"cookie="+key);  
        out.print("</center>");  
        out.flush();  
        out.close(); 
    }
}
