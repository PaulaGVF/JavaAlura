
public class AutenticacaoUtil {
	private int senha;

	
	public void setSenha(int senha) {
		this.senha = senha;

	}

	
	public boolean autenticador(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
}
