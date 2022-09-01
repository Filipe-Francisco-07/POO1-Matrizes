package Matriz;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Matriz_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	
	int iNum = 0;
	float fSoma = 0;
	float fSomaPrin = 0;
	float fSomaSec = 0;
	float fMedia = 0;
	int par = 0;
	int impar = 0;
	int maior = 0;
	int menor = 0;
	boolean deu = false;
	
	
	while(!deu) {
		System.out.println("Insira um inteiro ímpar entre 3 e 11: ");
		iNum = input.nextInt();
		if(iNum % 2 != 0 && iNum >= 3 || iNum >= 11 ) {
			deu = true;
		}
		
	}
	int [][]vet = new int [iNum][iNum];
	
	for(int i = 0; i < iNum;i++) {
		for(int j = 0; j < iNum;j++) {
			System.out.println("Insira o valor da matriz "+i+","+j+": ");
			vet[i][j] = input.nextInt();
			fSoma = (fSoma + vet[i][j]);
			
			//Maior e menor
			if(i == 0 && j == 0) {
				maior = vet[i][j];
				menor = vet[i][j];
			}else if(vet[i][j] > maior){
				maior = vet[i][j];
				
			}else if (vet[i][j] < menor) {
				menor = vet[i][j];
			}
			
			//Par e ímpar
			if(vet[i][j] % 2 == 0) {
				par++;
			}else {
				impar++;
			}
			
			//Diagonal principal e secundaria
			if(i == j) {
				fSomaPrin += vet[i][j];
			}
			if((i+1) + (j+1) == (iNum+1)) {
				fSomaSec += vet[i][j];
			}		
		}		
	}
	DecimalFormat cortas = new DecimalFormat("##.##");
			
	fMedia = (fSoma/(iNum*iNum));
	System.out.println("A soma dos elementos é : "+fSoma);
	System.out.println("A média dos elementos é : " +cortas.format(fMedia));
	System.out.println("O maior valor é : "+maior);
	System.out.println("O menor valor é : "+menor);
	System.out.println("O número de pares : "+par);
	System.out.println("O número de ímpares : "+impar);
	System.out.println("Soma da diagonal principal: "+fSomaPrin);
	System.out.println("Soma da diagonal secundária: "+fSomaSec);
	
	//Impressão formatada
	for(int i = 0; i < iNum;i++) {
		for(int j = 0; j < iNum;j++) {
			System.out.print(vet[i][j]+ "   ");
		}
		System.out.println("");
	}
	input.close();	
	}

}
