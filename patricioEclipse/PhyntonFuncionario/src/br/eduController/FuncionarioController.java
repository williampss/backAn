
import java.util.ArrayList;
import java.util.List;


public class FuncionarioController {
	
public static void main(String[] args) {
		
		FormPrincipal frmPri = new FormPrincipal();
		frmPri.show();
		
		// Gera��o de Alunos
				Funcionario a1 = new Funcionario (123L, "Yuri");
				Funcionario a2 = new Funcionario(124L, "Napole�o");
				Funcionario a3 = new Funcionario(125L, "Fabricio");
				Funcionario a4 = new Funcionario(126L, "Julia");
				

				// Listagem de Alunos
				List<Funcionario> lista = new ArrayList<Funcionario>();
				lista.add(a1);
				lista.add(a2);
				lista.add(a3);
				lista.add(a4);
				
				
				
				FuncionarioDAO dao = new Funcionario();
				try {
					dao.gravarAlunos(lista);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}

				// Leitura
				List<Funcionario> novaLista = new ArrayList<Funcionario>();
				novaLista = dao.lerAlunos();

				for (Funcionario funcionario : novaLista) {
					System.err.println(funcionario.getNome());
				}

			}

		

		

}
