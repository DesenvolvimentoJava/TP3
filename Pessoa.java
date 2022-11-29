package TP3;

public abstract class Pessoa {
	
	private String nome;
	private String sobrenome;
	private String ultimoNome; 
		
	public Pessoa() {}
	
	public Pessoa(String nome) {
		this.nome = nome;
	}

	public String getNome() throws Excecao {
		
		if(nome == null || sobrenome == null || ultimoNome == null) {
			throw new Excecao("Digite o nome completo");
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(ultimoNome.toUpperCase());
		sb.append(", ");
		sb.append(nome.toUpperCase());
		sb.append(" ");
		sb.append(sobrenome.toUpperCase().charAt(0));
		sb.append(".");
		
		return sb.toString();
	}

	public void setNome(String nome) throws Excecao {
		
		if(nome == null) {
			throw new Excecao("Digite o nome completo");
		}
		
		int posInicial = nome.indexOf(" ");
		int posFinal = nome.lastIndexOf(" ");
		
		if(posInicial < 0 || posFinal < 0) {
			throw new Excecao("Digite o nome completo");
		}
		
		if(posInicial == posFinal) {
			throw new Excecao("Digite o nome completo 'Ex: José da Silva'");
		}
		
		this.nome = nome.substring(0, posInicial);
		this.sobrenome = nome.substring(posInicial, posFinal).trim();
		this.ultimoNome = nome.substring(posFinal).trim();

	}

	public abstract void consultarSituacao() throws Excecao;

}
