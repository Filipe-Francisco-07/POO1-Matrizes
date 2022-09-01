package Matriz;
import java.util.Scanner;
public class Matriz_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	
	final int TAM = 5;

	float fMB = 0;
	float fMC = 0;
	int iMB = 0;
	int iMC = 0;

	
	float[] fSoma = new float [TAM];
	float [][]vet = new float [TAM][TAM];
	
	for(int i = 0; i < TAM;i++) {
		for(int j = 0; j < TAM;j++) {
			System.out.println("Mercado "+(i+1)+": insira o "+(j+1)+"° preço: ");
			vet[i][j] = input.nextFloat();
			fSoma[i] += vet[i][j];
			
		}	
	}		
	for(int i = 0; i < TAM;i++) {
		if(i==0) {
			fMC = fSoma[i];
			fMB = fSoma[i];
			iMC = (i+1);
			iMB = (i+1);
		}else if(fSoma[i] > fMC) {
			fMC = fSoma[i];
		    iMC = (i+1);
		}	
		if(fSoma[i] < fMB) {
			fMB = fSoma[i];
			iMB = (i+1);
		}	
	}
	for(int i = 0; i < TAM;i++) {
		for(int j = 0; j < TAM;j++) {
			System.out.println("Mercado "+(i+1)+": produto: "+(j+1)+" preço: "+vet[i][j]+" R$.");		
		}
	}
	for(int i = 0; i < TAM;i++) {
			System.out.println("Média de preço por produto. Produto "+(i+1)+": "+(fSoma[i]/5)+" R$.");		

	}
	for(int i = 0; i < TAM;i++) {
			System.out.println("Soma dos preços do mercado "+(i+1)+" "+fSoma[i]+" R$.");		
	}
	
	System.out.println("Valor total mercado "+iMC+" (mais caro): "+fMC+" R$.");
	System.out.println("Valor total mercado "+iMB+" (mais barato): "+fMB+" R$.");
	
	input.close();	
	}

}
