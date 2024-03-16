package br.edu.senaisp.view;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import br.edu.senaisp.model.Funcionario;

public class FuncionarioPrincipal extends JFrame{
	
	private JButton btnNovo = new JButton ("Novo");
	private JLabel lblLista = new JLabel ("Lista de funcionario");
	private JTextArea txtLista = new JTextArea();
	
	private List<Funcionario> funcionario =  new ArrayList<Funcionario>();
	
	public FuncionarioPrincipal() {
		inicializar();
		acoes();
		
		
		
		
	}
	
	
	
	
	

}
