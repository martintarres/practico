import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	

		private static ArrayList<Integer> operandos;
		private static ArrayList<Character> operadores;
		private static int c;
		private static int resultado;
		private static int total;
		private static Character z;
		//private static Character a;
		private static Scanner sc;
		
		public static void main(String[] args) {
			
			operandos = new ArrayList<Integer>();
			operadores = new ArrayList<Character>();
			
			
			System.out.println("ingrese los valores: \n");
			cargarValores();
			
			total=operacion(operandos,operadores);
			
			System.out.print("el total es "+total);
			
			
		}
			public static void cargarValores(){	
			
				sc = new Scanner(System.in);
				
			c=sc.nextInt();
			z=sc.next().charAt(0);		
			
			while(z!='=')
			{	
				operandos.add(c);
				operadores.add(z);
				
				c=sc.nextInt();
				z=sc.next().charAt(0);
				if(z=='='){
				operandos.add(c);
				}
			}
		}
			public static int operacion(ArrayList<Integer> operandos, ArrayList<Character> operadores)
			{
			
			resultado=operandos.get(0);
			//int j=0;
		
			//for(int i=0; i<operadores.size();i++){
			 int i=1;
				for(char operador : operadores){
				
				//a=operadores.get(i);
				
			switch(operador)
			{
			case '+':
				resultado=resultado+operandos.get(i);
				i++;
				//return resultado;
				break;
			
			case '-':
				resultado=resultado-operandos.get(i);
				i++;
				//return resultado;
				break;
			
			default:
				System.out.println("error");
				//return 0;
				break;
			}
}
				
				return resultado;	
		}
	}

