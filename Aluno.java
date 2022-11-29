package TP3;

public class Aluno extends Pessoa {
	
	private float av1;
	private float av2;
	
	
	public Aluno() {
	
	}
	
	public Aluno(String nome) {
		super(nome);
	}
	
	public Aluno(String nome, float av1, float av2) {
		super(nome);
		this.av1 = av1;
		this.av2 = av2;
	}
	
	
	@Override
	public void consultarSituacao() throws Excecao {
		float media = mediaFinal();

		System.out.println("Discente: " + getNome());
		System.out.println("Media: " + media);
		System.out.println("Situação: " + situacao(media));
		
	}
	
	private float mediaFinal() {
		return (av1 + av2) / 2;
	}
	
	private  String situacao(float media) {
		if (media >= 7.0) {
			return "Aprovado";
		}else if (media >= 4.0 && media < 7.0 ) {
			return "Prova final";
		} else {
			return "Reprovado";
		}
	}
	
	
	public float getAv1() {
		return av1;
	}
	public void setAv1(float av1) {
		this.av1 = av1;
	}
	public float getAv2() {
		return av2;
	}
	public void setAv2(float av2) {
		this.av2 = av2;
	}
	
	
	

}
