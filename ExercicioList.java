package list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;

public class ExercicioList {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");

        System.out.println(nomes);

        for (String cadaNome:nomes){
            System.out.println(cadaNome);
        }

        nomes.set(2,"Roberto");

        System.out.println(nomes);

        String nome = nomes.get(1);

        System.out.println(nome);

        nomes.remove(4);

        System.out.println(nomes);

        int tamanho = nomes.size();

        System.out.println(tamanho);

        boolean temJuliano = nomes.contains("Juliano");

        System.out.println(temJuliano);

        List<String> nomes2 = new ArrayList<>();
        nomes2.add("Ismael");
        nomes2.add("Rodrigo");

        System.out.println(nomes2);

        nomes.addAll(nomes2);

        System.out.println(nomes);

        Collections.sort(nomes);

        System.out.println(nomes);

        boolean listaVazia = nomes.isEmpty();

        System.out.println(listaVazia);
        



    }
}
