import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int qtContas = 0;
		
		while(qtContas <= 0) {
			System.out.println("Quantas contas deseja criar?");
			qtContas = Integer.parseInt(s.nextLine());
		}
		
		ContaBancaria[] contasBancaria = new ContaBancaria[qtContas]; 
		
		for(int i=0; i<contasBancaria.length; i++){
			System.out.println("Digite 1 para Conta Corrente ou outro valor para Conta Poupança:");
			contasBancaria[i] = Integer.parseInt(s.nextLine()) == 1 ? new ContaCorrente("123456") : new ContaPoupanca("123456");
			//OU
			/*if(Integer.parseInt(s.nextLine()) == 1)
				contasBancarias[i] = new ContaCorrente("123456");
			else
				contasBancarias[i] = new ContaPoupanca("123456");*/
		}
		
		for(ContaBancaria cb: contasBancaria)
			cb.setNumero((int)(Math.random()*10000+1));
		
		for(ContaBancaria cb : contasBancaria) {
			if(cb instanceof ContaPoupanca) {
				((ContaPoupanca) cb).setTaxaRendimento(Math.random());
			}
		}
		
		for(ContaBancaria cb: contasBancaria){
			cb.deposita(Math.random()*500);
			cb.saca(Math.random()*100);
			cb.tiraExtrato();
		}
		
		for(ContaBancaria cb : contasBancaria) {
			if(cb instanceof ContaPoupanca) {
				System.out.println("Taxa de rendimento da poupança número " + cb.getNumero() + ": " + ((ContaPoupanca)cb).getTaxaRendimento());
			}else if (cb instanceof ContaCorrente){
				System.out.println("Quantidade de transações realizadas na conta corrente número " + cb.getNumero() + ": " + ((ContaCorrente)cb).getQuantidadeTransacoes());	
			}
		}
		
		Rentavel[] rentaveis = new Rentavel[(int)(Math.random()*10+1)];
		for(int i=0; i<rentaveis.length; i++)
			rentaveis[i] = Math.random() < 0.5 ? new ContaPoupanca("123456") : new TesouroDireto(1);
			//OU
			/*if(Math.random() < 0.5)
				rentaveis[i] = new ContaPoupanca("123456");
			else
				rentaveis[i] = new TesouroDireto(0);*/
			
		for(Rentavel r: rentaveis)
			System.out.println(r.calculaRendimento());
	}
}

