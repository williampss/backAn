package br.edu.senaisp.Dao

import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.List;

import br.edu.senaisp.util.Log;
import src.br.edu.senaisp.model.Funcionario;

public class FuncionarioDAO {

	private String pathBancoDados = "C:\\TEMP\\TesteDeArquivo\\BancoDeDados.csv";

	public boolean gravarFuncionario(List<Funcionario> funcionarios) throws Exception {

		// Escrita
		PrintWriter pw;
		try {
			pw = new PrintWriter(pathBancoDados, Charset.forName("UTF-8"));

			for (Funcionario a : funcionarios) {
				pw.print(a.getId());
				pw.print(";" + a.getNome());
				pw.print(";" + a.getCpf());
				pw.println();
			}

			pw.close();
			return true;
		} catch (Exception e) {
			Log.escrever("Erro ao tentar gravar Alunos: " + e.getMessage());
			throw new Exception("Erro ao tentar gravar Alunos: " + e.getMessage());
		}
	}

}
