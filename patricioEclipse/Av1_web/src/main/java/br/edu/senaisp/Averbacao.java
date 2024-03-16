package br.edu.senaisp;

import java.io.IOException;

import br.edu.senaisp.dao.SaborDao;
import br.edu.senaisp.model.Sabor;
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
		
		Sabor sab = new Sabor(); 
		sab.setNome(nome);
		sab.setPreco(preco);
		sab.setDescricao(descricao);
		
		SaborDao dao = new SaborDao();
		dao.novo(sab);
		
		
		
		System.out.println("Teste");
		
	
	}
}
	
	
