//Faça uma função que retorne o reverso de um número inteiro informado. Por exemplo: 127 -> 721.
import java.util.Scanner;

public class atv9 {
	

	static void inverteNumero(String n){
		String n2="";
		for (int i = n.length()-1; i >= 0; i--){
			 n2 = n2 + n.charAt(i);}
			System.out.println(n2);	}
	
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira o  número:");
        String n = entrada.next();
		entrada.close();
		
		inverteNumero(n);
		
	}
	 }
