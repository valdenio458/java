
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class MinhaPrimeiraClasse {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int a = Integer.parseInt(st.nextToken("3"));

    st = new StringTokenizer(br.readLine());
    int b = Integer.parseInt(st.nextToken("9"));
    int total = a*b; // Altere o valor da variável com o cálculo esperado

    
   
    System.out.println("PROD = " + total);
  }
}