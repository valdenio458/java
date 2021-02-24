package queue;
import java.util.LinkedList;
import java.util.Queue;

public class ExercicioQueue {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        fila.add("Juliana");
        fila.add("Pedro");
        fila.add("Carlos");
        fila.add("Larissa");
        fila.add("Joao");

        System.out.println(fila);

        for(String cliente: fila){
            System.out.println(cliente);

        } //fechamento do for

        String nome = fila.peek();
        System.out.println(nome);

        String removeNome = fila.poll();
        System.out.println(removeNome);
        System.out.println(fila);

        fila.add("Daniel");
        System.out.println(fila);

        int tamanho = fila.size();
        System.out.println(tamanho);

        boolean estaVazia = fila.isEmpty();
        System.out.println(estaVazia);

        boolean temCarlos =   fila.contains("Carlos");
        System.out.println(temCarlos);


    } // fechamneto do método main
} // fechamento da classe
