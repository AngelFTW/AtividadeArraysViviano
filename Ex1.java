
import java.util.Scanner;

public class Ex1{
	

		public static void main(String[] args) {
			
			System.out.println("Digite um numero");
			Scanner teclado = new Scanner(System.in);
			int n1 = teclado.nextInt();
			int fact=1;
			System.out.println("\nFatorial de "+n1);
			for(int i=1; i<=n1;i++) {
				System.out.println(i);
				fact=fact*i;
			}
			
			System.out.println("\nO Resultado é: "+fact);
			teclado.close();

	}

}