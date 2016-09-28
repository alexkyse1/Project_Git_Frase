package SVNProgram;
import java.util.Scanner;

public class git_frase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner lector = new Scanner (System.in);
		
		int numtest = 0;
		
		System.out.println("Escriu una frase: ");
		
		String [] frase = lector.nextLine().split("");
		
		String [] lletres = new String [frase.length];
		
		
		int index = 0;
		
		for(int i = 0; i<frase.length;i++){
			
			
			boolean check = false;
			
			for(int j = 0; j<frase.length;j++){
				
				if(frase[i].equals(lletres[j])){
					
					check = true;
				}
				
			}
			
			if(check == false && !frase[i].equals(" ")){
				
				
				lletres[index]=frase[i];
				index++;
			}
			
			

		}
		
		for(int i = 0; i<index;i++){
			
			int count = 0;
			
			for(int j = 0; j<frase.length;j++){
				
				
				
				if(lletres[i].equals(frase[j])){
					
					count++;
					
				}
				
				
			}
			
			System.out.println("Lletra "+lletres[i]+": "+count);
			
		}
		

		
		

	}

}
