package TP3;

public class Professor extends Pessoa {
	
	private float salario;
	private float desconto;
	
	public Professor() {
		
	}
	
	public Professor(String nome) {
		super(nome);
	}
	
	
	public Professor(String nome, float salario, float desconto) {
		super(nome);
		this.salario = salario;
		this.desconto = desconto;
	}
	
	
	@Override
	public void consultarSituacao() throws Excecao {
			System.out.println("Docente: " + getNome());
			System.out.println("Salario Liquido: " + calcularSalarioLiquido());

	}
	
	
	private float calcularSalarioLiquido() {
		return salario - desconto;
	}
	
	
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public float getDesconto() {
		return desconto;
	}
	public void setDesconto(float desconto) {
		this.desconto = desconto;
	}
	
	

}
