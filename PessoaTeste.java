package TP3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PessoaTeste {
	
	
	private static final int TAMANHO = 2;
	private static Pessoa[] pessoas;
	
	public static void main(String[] args) throws Exception {
		
		Scanner in = new Scanner(System.in);
	
		pessoas = new Pessoa[TAMANHO];
			
		String opcao;
		int pos = 0;
		
		do {	
		System.out.println("\n[1] Cadastrar professor.");
		System.out.println("[2] Cadastrar aluno.");
		System.out.println("[3] Consultar situação de um docente/discente.");
		System.out.println("[4] Sair");

		
		System.out.print("\nInforme a Opção: ");
		opcao = in.next();
		System.out.println("\n--------------------\n");
	
		switch(opcao) {
		case "1":
			Professor prof = new Professor();
			
			if (pos < TAMANHO) {
				
				try {
					
					System.out.print("Informe o Nome do Processor(a): ");
					in.nextLine();
					prof.setNome(in.nextLine());
											
					System.out.print("Informe Salario: ");
					prof.setSalario(in.nextFloat());
							
					System.out.print("Informe Desconto: ");
					prof.setDesconto(in.nextFloat());
							
					System.out.println("\nProfessor(a) Registrado com Código: " + pos);
					System.out.println("\n--------------------\n");
							
					pessoas[pos] = prof; 
							
					pos++;
				} catch (Excecao e) {
					System.err.println(e.getMessage());
				} catch(InputMismatchException e1) {
					System.err.println("[ERRO] - Digite um valor!!!");
				}

			} else {
				System.out.println("Impossivel de Inserir Novo Registro!!!");
			}

			break;
		
		case "2":
			Aluno alunos = new Aluno();
			
				if (pos < TAMANHO) {
				
				try {
					System.out.print("Informe o Nome do Aluno(a): ");
					in.nextLine();
					alunos.setNome(in.nextLine());
				
					System.out.print("Informe Avaliação 1: ");
					alunos.setAv1(in.nextFloat());
					
					System.out.print("Informe Avaliação 2: ");
					alunos.setAv2(in.nextFloat());
					
					System.out.println("\nAluno(a) Registrado com Código: " + pos);
					System.out.println("\n--------------------\n");
					
					pessoas[pos] = alunos; 
					
					pos++;
				
			} catch (Excecao e) {
				System.err.println(e.getMessage());
			} catch(InputMismatchException e1) {
				System.err.println("[ERRO] - Digite um valor!!!");
			}
			
			} else {
				System.out.println("Impossivel de Inserir Novo Registro!!!");
			}	
			
			break;
			
		case "3":
			System.out.print("Informe Código de Registro: ");
			int registro = in.nextInt();
				
			if(registro >= 0 && registro < pos) {
				pessoas[registro].consultarSituacao();	
			} else {
				System.out.println("O índice [" + registro + "] é invalido !!!");
			}
			break;
			
		case "4":
			System.out.println("Saída");
			break;
			
		default:
			System.out.println("A opção [" + opcao + "] é inválida!!!");
			break;
		}
		
		} while(!"4".equals(opcao));
		
		System.out.println("Finalizado!!!");
		
		in.close();
	}
}


