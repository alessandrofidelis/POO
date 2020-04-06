import java.util.Scanner;

public class LeiaNome {

	public static void main(String[] args) {
		System.out.println("Entre com um nome: ");

		try (Scanner input = new Scanner(System.in)) {
			String nome = input.next();
			
			System.out.println(nome +", Bom Carnaval!!");
		}
			

	}

}
