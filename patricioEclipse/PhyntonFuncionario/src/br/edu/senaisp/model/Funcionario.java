

public class Funcionario {
		private Long id;
		private String nome;
		private String cpf;
		private String areas;
		private static String turma;
		
		
		public Funcionario(Long id, String nome, String cpf, String areas) {
			super();
			this.id = id;
			this.nome = nome;
			this.cpf = cpf;
			this.areas = areas;
		}


		public Long getId() {
			return id;
		}


		public void setId(Long id) {
			this.id = id;
		}


		public String getNome() {
			return nome;
		}


		public void setNome(String nome) {
			this.nome = nome;
		}


		public String getCpf() {
			return cpf;
		}


		public void setCpf(String cpf) {
			this.cpf = cpf;
		}


		public String getAreas() {
			return areas;
		}


		public void setAreas(String areas) {
			this.areas = areas;
		}
		
		@Override
		public String toString() {
			return "Nome: " + this.nome + "("+ this.cpf +")";
		}
		
		
		
}
	
	

