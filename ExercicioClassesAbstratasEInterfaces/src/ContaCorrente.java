public class ContaCorrente extends ContaBancaria{

	private int quantidadeTransacoes;

	public ContaCorrente(String senha) {
		super(senha);
	}
	
	@Override
	public void saca(double valor) {
		setSaldo(getSaldo() - valor);
		quantidadeTransacoes++;
	}

	@Override
	public void deposita(double valor) {
		setSaldo(getSaldo() + valor);
		quantidadeTransacoes++;
	}

	@Override
	public void tiraExtrato() {
		System.out.println(this.toString());
		quantidadeTransacoes++;
	}

	public int getQuantidadeTransacoes() {
		return quantidadeTransacoes;
	}

	public void setQuantidadeTransacoes(int quantidadeTransacoes) {
		this.quantidadeTransacoes = quantidadeTransacoes;
	}

	@Override
	public String toString() {
		return "ContaCorrente [quantidadeTransacoes=" + quantidadeTransacoes + "]" + super.toString();
	}
		

}
