// Gerente � um funcionario, gerente herda da class funcionario, assia o contrato Autenticavel, eh um autenticavel
public class Gerente extends Funcionario implements Autenticavel{

	
	private AutenticacaoUtil util;
	
	public Gerente() {
		this.util = new AutenticacaoUtil();
	}

	@Override
	public void setSenha(int senha) {
		this.util.setSenha(senha); 

	}

	@Override
	public boolean autentica(int senha) {
		return this.util.autenticador(senha);
	}

	
	public double getBonificacao() {
		System.out.println("Chamado o m�todo de bonifica��o do gerente");
		return super.getSalario();
	}

}