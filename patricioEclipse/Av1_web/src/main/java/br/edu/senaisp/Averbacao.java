package br.edu.senaisp;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/averb")
public class Averbacao extends HttpServlet {
	
	@Override
	protected void service (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
	
		
		String nome = req.getParameter("nome");
		String descricao = req.getParameter("descricao");
		int preco = Integer.parseInt(req.getParameter("preco"));
		
		resp.getWriter().append("<html><h1>" + nome + descricao + preco +"</h1></html>");
	
	}
}
	
	
