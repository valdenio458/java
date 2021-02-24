import java.io.IOException;
import java.util.Scanner;

public class MinhaSegundaClasse {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int X[] = {1,2,3,4,-5,6,7,8,9,10};
        int N = X.length;  
        int menor = 0, posMenor = 0;
        for (int i = 0; i < N; i++) {
        	//X[i] = leitor.nextInt();
        	if (i == 0) {
        		menor = X[i];
        		posMenor = i;
        	} else if (X[i] < menor) {
        		menor = X[i];
        		posMenor = i;
        	}
        }
        System.out.println("Menor valor: " + menor ); //complete o codigo aqui de acordo com a variavel esperada
        System.out.println("Posicao: " + posMenor ); //complete o codigo aqui de acordo com a variavel esperada
    }
	
}
