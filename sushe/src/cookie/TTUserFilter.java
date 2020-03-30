package cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.process.ZoaThreadLocal;



public class TTUserFilter implements Filter {
    
    // �����������ĳ�ʼ��ֵ
    private String auther ;
    public void destroy() {
        
    }
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest)request ;
        HttpServletResponse resp = (HttpServletResponse)response ;    

        Cookie[] cookies = (req).getCookies();     
        String id=null;
        if (cookies != null) {     
            for (Cookie c : cookies) {     
                if (c.getName().equals("kky")) {     
                     id = c.getValue();
                     ZoaThreadLocal.G_Ins().A_CInfByID(id);//����cookie id
                     System.out.println("cookie:"+id);
                 }      
             }     
         }
        /*
        PrintWriter out = response.getWriter();
		out.print("<center>");  
        out.print("getcookie success:"+"cookie="+id);  
        out.print("</center>");*/
       
        chain.doFilter(req, resp);
        
        //out.flush();  
       //out.close(); 
         
        
      
         }
    public void init(FilterConfig filterConfig) throws ServletException {
        //ȡ�ó�ʼ��ֵ    
        auther = filterConfig.getInitParameter("auther");
    }
}
