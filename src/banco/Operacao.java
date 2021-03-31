package banco;

import java.util.Scanner;

public class Operacao {

public static void main(String[] args) {
		
		

		    Scanner ler = new Scanner(System.in);
		    
		    Conta c = new Conta();
			ContaCorrente ccM = new ContaCorrente();
			ContaPoupanca cpM = new ContaPoupanca();

			System.out.println("Digite que operação você deseja fazer 1 para conta corrente e 2 para conta poupança: ");
			int opcao = ler.nextInt();
			
			switch (opcao) {
			case 1:
				
				
				   System.out.println("BEM VINDO A CONTA CORRENTE DO NEW BANK: ");
				   System.out.println("Digite 1 caso tenha uma conta ou 2 para criar uma conta: ");
				   int opcao2 = ler.nextInt();
					
					switch (opcao2) {
					case 1:
						System.out.println("digite sua conta");
						int conta = ler.nextInt();	
						System.out.println("digite sua senha");
						int senha = ler.nextInt();	
						
						ccM.verificarSenha(conta,senha);
						
						
						break;
					case 2:
						
				       c.abrirConta();
						
						break;
					
					default:
						System.err.println("Valor inválido");
						break;
					}
			
				break;
			case 2:
				System.out.println("BEM VINDO A CONTA POUPANÇA DO NEW BANK");
				System.out.println("Digite 1 caso tenha uma conta ou 2 para criar uma conta: ");
				
				 int opcao3 = ler.nextInt();
					
					switch (opcao3) {
					case 1:
						System.out.println("digite sua conta");
						int conta = ler.nextInt();	
						System.out.println("digite sua senha");
						int senha = ler.nextInt();	
						
						cpM.verificarSenha(conta,senha);
				break;
                    case 2:
				
                    	c.abrirConta();
                    	
			    break;
			default:
				System.err.println("Valor inválido");
				break;
			}
	       
	    }
    }
}

