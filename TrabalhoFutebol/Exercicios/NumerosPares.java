import java.util.Scanner;

public class NumerosPares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		
		int fim = input.nextInt();
	
		
		
		
		for(int i= 1; i<fim ;i++)
		{
			if(i % 2 ==0)
			{
				System.out.println(i);
				
			}
		}
		
			
		}

	}


