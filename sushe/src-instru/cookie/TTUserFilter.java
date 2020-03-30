// ZOA_CREATED! DO NOT EDIT IT! -- 
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



import com.process.ZoaExp;
import com.process.ZoaThreadLocal;
public class TTUserFilter implements Filter {
    
    // �����������ĳ�ʼ��ֵ
    private String auther ;
    public void destroy() {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 10 0 10368195"); 
        
    }
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain) throws IOException, ServletException {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 10 1 10368195"); 
        HttpServletRequest req = (HttpServletRequest)request ;
        HttpServletResponse resp = (HttpServletResponse)response ;    

        Cookie[] cookies = (req).getCookies();     
        String id=null;
        if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 10 2 10368195")|| true) && (cookies != null? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 10 0 0 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 10 0 0 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 10 3 10368195"); {     
            for (Cookie c : /* TRUE */cookies){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 10 4 10368195");ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 10 5 10368195"); {     
                if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 10 6 10368195")|| true) && (c.getName().equals("kky")? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 10 1 1 1 0 ","10368195",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 10 1 1 0 0 ","10368195",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 10 7 10368195"); {     
                     id = c.getValue();
                     ZoaThreadLocal.G_Ins().A_CInfByID(id);//����cookie id
                     System.out.println("cookie:"+id);
                 } }      
             }}     
         } }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 10 14 10368195");
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
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 10 15 10368195"); 
        //ȡ�ó�ʼ��ֵ    
        auther = filterConfig.getInitParameter("auther");
    }
}
