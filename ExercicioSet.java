package set;

import com.sun.source.doctree.SeeTree;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExercicioSet {
    public static void main(String[] args) {
        Set<Integer> numeros = new HashSet<>();
        numeros.add(3);
        numeros.add(88);
        numeros.add(20);
        numeros.add(44);
        numeros.add(3);

        // Navega no Set exibindo cada número no console
        Iterator<Integer> iterator = numeros.iterator();
        for(Integer iter: numeros){
            System.out.println(iter);
        }

        // Adiciona um novo número no Set
        numeros.add(23);

        System.out.println(numeros);

        // Verifica o tamanho do Set
        System.out.println(numeros.size());

        // Verifica se o Set está vazio
        System.out.println(numeros.isEmpty());

    } // fim do método main
} //fim da classe ExericiosSet

