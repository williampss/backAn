package br.edu.senaisp;

import java.io.IOException;
import java.rmi.server.ServerCloneException;

import org.apache.catalina.Server;

import br.edu.senaisp.util.Eoperacao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/calc")
public class EscolaWeb extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//
//		String valor = req.getParameter("p1");
//		String valor2 = req.getParameter("p2");
//		String valor3 = req.getParameter("p3");
//		int v2 = Integer.parseInt(valor2);
//		int v3 = Integer.parseInt(valor3);
		
//		if(valor.equals("soma")) {
//			int soma = v2+v3;
//		
//			resp.getWriter().append("<html><h1>  soma: " + soma + "<h1><html>");
//		}
		
		String operacao = req.getParameter("operacao");
		int valor2 = Integer.parseInt(req.getParameter("val1"));
		int valor3 = Integer.parseInt(req.getParameter("val2"));
		
		int r = 0;
		
        if(operacao.equals("DIVI"))
		
			
			r = valor2 / valor3;
		else
		    r = valor2 / valor3;
		
		
	
			
		
		if(operacao.equals(Eoperacao.SOMA.toString()))
		
			
			r = valor2 + valor3;
		else
		    r = valor2 + valor3;
		
		
	
			
		
        if(operacao.equals("SUBTRAIR"))
		
			
			r = valor2 - valor3;
		else
		    r = valor2 - valor3;
		
		
	
			
		
		if(operacao.equals("MULTIP"))
		
			
			r = valor2 * valor3;
		else
		    r = valor2 * valor3;
		
		
	
			
		
		
		
		if(operacao.equals("SUBTRAIR"))
		
			
			r = valor2 - valor3;
		else
		    r = valor2 - valor3;
		
		
	
			resp.getWriter().append ("<html><h1> " + operacao +"e "+r+ "<h1><html>");
		}
		
	
	
	}

