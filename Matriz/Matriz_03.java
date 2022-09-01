package Matriz;
import java.util.Scanner;
public class Matriz_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	
	System.out.println("Informe o número de alunos: ");
	int iAl = input.nextInt();
	
	float fSoma = 0;
	float fMediaG = 0;
	float fmaior = 0;
	float fmenor = 0;
	float fMediaM = 0;
	float fMediam = 0;	
	
	String MNota = "";
	String mNota = "";
	String MMedia = "";
	String mMedia = "";
		
    String[]name = new String[iAl];
    
	float [][]vet = new float [3][iAl];
	float []soma = new float[iAl];
	float[]media = new float [iAl];
	
	for(int i = 0; i < iAl;i++) {
		System.out.println("Digite o seu nome: ");
		name[i] = input.next();
		for(int j = 0; j < 2 ;j++) {
			System.out.println("Informe a nota: "+(j+1)+": ");
			vet[i][j] = input.nextFloat();
			
			soma[i] += vet[i][j];
			fSoma += vet[i][j];
			media [i] = (soma[i]/2);
			//Maior e menor
			if(i == 0 && j == 0) {	
				fMediaM = media[i];						
				MMedia = name[i];
				fMediam = media[i];						
				mMedia = name[i];				
				fmaior = vet[i][j];
				MNota = name[i];
				fmenor = vet[i][j];
				mNota = name[i];
			}else if(vet[i][j] > fmaior){
				fmaior = vet[i][j];
				MNota = name[i];
				
			}else if (vet[i][j] < fmenor) {
				fmenor = vet[i][j];
				mNota = name[i];
			}
			if(media[i] > fMediaM) {
				fMediaM = media[i];
				MMedia = name[i];
			}else if(media[i] < fMediam) {
				fMediam = media[i];
				mMedia = name[i];
			}				
		}			
	}
	fMediaG = (fSoma / iAl);
	//nome e 2 notas de cada aluno
	for(int i = 0; i < iAl;i++) {
		System.out.println("Aluno: "+name[i]);
		for(int j = 0; j < 2 ;j++) {
			System.out.println("Nota "+(j+1)+": "+vet[i][j]);
		}
	}
	//media de cada aluno
	for(int i = 0; i < iAl;i++) {
		System.out.println("Aluno: "+name[i]);
		for(int j = 0; j < 2 ;j++) {
			System.out.println("Média : "+(soma[i]/2));
		}
	}
	System.out.println(MNota+" teve a maior nota: "+fmaior);
	System.out.println(mNota+" teve a menor nota: "+fmenor);
	System.out.println(MMedia+" teve a maior média: "+fMediaM);
	System.out.println(mMedia+" teve a menor média: "+fMediam);	
	System.out.println("Média geral da turma: "+(fMediaG/2));
	
	//alunos acima e abaixo da media(nomes)
	for(int i = 0;i<iAl;i++) {
		if(media[i] > fMediaG) {
			System.out.println("Alunos acima da média: "+name[i]);
		}else {
			System.out.println("Alunos abaixo da média: "+name[i]);
		}
	}	

	input.close();	
	}
}
