import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/olababe")
public class OlaMundo  extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String valor = req.getParameter("param1");
		
		String html = "<html><h1>Teste de ola" + valor + "<h1><html>";
		resp.getWriter().append(html);
	}

}
