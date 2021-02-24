package list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;

public class ExemploList {
    public static void main(String[] args) {
       List<String> nomes = new ArrayList<>();
       nomes.add("Carlos");
       nomes.add("Pedro");
       nomes.add("Anita");
       nomes.add("Juliana");
       nomes.add("Maria");
       nomes.add("João");

       System.out.println(nomes);

       nomes.set(2,"Larissa");

       System.out.println(nomes);

       Collections.sort(nomes);

       int posicao = nomes.indexOf("Maria");

       System.out.println(posicao);

       System.out.println(nomes);

       nomes.remove(2);

       System.out.println(nomes);

       String nome = nomes.get(1);

       System.out.println(nome);

       int tamanho = nomes.size();

       System.out.println(tamanho);

        boolean temPaulo = nomes.contains("Paulo");

       System.out.println(temPaulo);

       // nomes.clear();

       boolean listaEstaVazia = nomes.isEmpty();

       System.out.println(listaEstaVazia);

       for (String cadaNome:nomes){
          System.out.println(cadaNome);
       }

       Iterator<String> iterator = nomes.iterator();
       while(iterator.hasNext()){
          System.out.println("->" + iterator.next());
       }

    }
}
