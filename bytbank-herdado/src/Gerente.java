// Gerente é um funcionario, gerente herda da class funcionario, assia o contrato Autenticavel, eh um autenticavel
public class Gerente extends Funcionario implements Autenticavel{

	
	private AutenticacaoUtil autenticador;
	
	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha); 

	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}

	
	public double getBonificacao() {
		System.out.println("Chamado o método de bonificação do gerente");
		return super.getSalario();
	}

}