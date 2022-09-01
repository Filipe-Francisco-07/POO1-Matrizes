package Matriz;
import java.util.Scanner;
public class Matriz_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	
	System.out.print("Informe quantos atletas estão participando: ");
	int iAtl = input.nextInt();
	
	float fChamp = 0;
	float fLoser = 0;
	float fSoma = 0;
	boolean first = true;
	
	float [][] media = new float[iAtl][5];	
	float [][] vet = new float[iAtl][5];
	
	for(int i = 0;i < iAtl;i++) {
		fSoma = 0;
		for(int j = 0; j < 5; j++) {
			System.out.print("Atleta "+(i+1)+" informe seu "+(j+1)+" salto: ");
			vet[i][j] = input.nextFloat();
			fSoma += vet[i][j];
			if(j==4) {
				media[i][j] = (fSoma/5);
				if(first) {
					fChamp = media[i][j];
					fLoser = media[i][j];
					first = false;
				}
				System.out.println("A média do atleta "+(i+1)+" é: "+(fSoma/5));		   
			}
	    }	
	}
	
	for(int i = 0;i < iAtl;i++) {
		for(int j = 0; j < 5; j++) {
			System.out.println("Atleta "+(i+1)+" Salto "+(j+1)+": "+vet[i][j]);
			if(j==4) {
				
			if(media[i][j] < fLoser) {
				fLoser = media[i][j];
			}
			if (media[i][j] > fChamp) {
				fChamp = media[i][j];
			}		
			}
			if(j == 4) {
				System.out.println("Atleta "+(i+1)+" média: "+(media[i][j]));
			}
		}
	}	
	System.out.println("A média do campeão é: "+fChamp);
	System.out.println("A média do último colocado é: "+fLoser);	
	
	input.close();	
	}

}
