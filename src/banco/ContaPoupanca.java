package banco;

import java.util.Scanner;

public class ContaPoupanca extends Conta {
	private double bonus = 50;
	
	  Scanner ler = new Scanner(System.in);
	
	@Override
	boolean sacar(double valor) {
		this.setSaldo(this.getSaldo() - valor);
		this.setSaldo(this.getSaldo() + bonus);
		return true;
	}
	
	
	

	@Override
	void depositar(double valor) {
		this.setSaldo(this.getSaldo() + valor);
	}
	
	@Override
	void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		if (this.saldoOk == true) {
			contaDestino.depositar(valor);
		}
	}
	
	@Override
	void fecharConta() {
		if (this.contaAtiva == false) {
			System.out.println("Conta está inativa");
		} else {
			this.setAgencia(null);
			this.setNomeDono(null);
			this.setNumero(0);
			this.setSaldo(0);
			this.contaAtiva = false;
			System.out.println("Conta fechada com sucesso!");
		}
	}

	
	
	
	void verificarSenha(int digiteConta, int senha){
		if(digiteConta == 123 && senha == 456) {
			System.out.println("Bem vindo Sr. Lucas");
			
		    cc();
			
			
		}else if(digiteConta == 345 && senha == 567){
		         System.out.println("Bem Vindo Sr. Pedro");
		         
		  // ccPedro();      
			
		}else{
			System.out.println("Conta ou senha incorreta");	
		}
	 }
	
	
	
	
	 void cc() {
		 
		 exibirDados();
			
			System.out.println("Digite 1 para sacar, 2 para depositar, 3 para transferir ou 4 para fechar sua conta.");
			int opcao = ler.nextInt();
			
			switch (opcao) {
			case 1:
				System.out.println("Digite o valor que deseja ser sacado");
				double valorSaqueCC = ler.nextDouble();
				
				sacar(valorSaqueCC);
				
				System.out.println("Seu novo saldo é:"+ this.getSaldo());
				
				
				break;
			case 2:
				System.out.println("Digite o valor que deseja ser sacado");
				double valorDepositocc = ler.nextDouble();
				
				depositar(valorDepositocc);
				
				System.out.println("Seu novo saldo é:"+ this.getSaldo());
				break;
				
			case 3:
				System.out.println("Digite o valor que sera transferido");
				double valorTransf = ler.nextDouble();
				System.out.println("Digite a conta destino da transação");
				String contaDest = ler.nextLine();
				
				//transferir(valorTransf,contaDest);
				
				
				
				
				break;
				
			case 4:
				
			System.out.println("Deseja mesmo fechar sua conta? 1 para sim - 2 para não:");
			int escolha = ler.nextInt();
			
			if(escolha == 1) {
				fecharConta();
				System.out.println("Sua conta foi fechada com sucesso");
				
			}else {
				
				System.out.println("Sua conta continua ativa");
			}
			
				break;
				
			default:
				System.err.println("Valor inválido");
				break;
			}
			
			}
	
	
	void exibirDados() {
		System.out.println("Olá, você está na conta Poupança");
		System.out.println("Nome: " + this.getNomeDono());
		System.out.println("Agencia : " + this.getAgencia());
		System.out.println("Numero da Conta :" + this.getNumero());
		System.out.println("Saldo" +this.getSaldo());
	}


	

}

