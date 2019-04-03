package desafios;

public class TesteIR {

    public static void main(String[] args) {

        double salario = 3300.0;
        double IR;
        if((salario >= 1900.0)&&(salario <=2800.0)) {
        	IR=7.5;
        	System.out.println("O IR é de "+ IR + "% e "
        			+ "pode deduzir o valor de R$142");
        }else  
        	if((salario >= 2800.01)&&(salario <= 3751.0) ) {
        		IR = 15;
        		System.out.println("O IR é de "+ IR + "% e"
        		+ "pode deduzir o valor de R$350");
          }else
        	  if((salario >=3751.01)&&(salario <= 4664.00)) {
        		  IR = 22.5;
        		  System.out.println("O IR é de "+ IR + "% e"
        	        		+ "pode deduzir o valor de R$636");
        		  
        	  }
        
    }
}