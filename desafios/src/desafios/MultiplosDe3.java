package desafios;

public class MultiplosDe3 {
	public static void main(String[] args) {
		int contador = 1;
		while (contador <= 100) {
			if (contador % 3 == 0)
				System.out.println(contador);
			contador++;
		}
	}
}
