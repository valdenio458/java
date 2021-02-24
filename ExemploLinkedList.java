package queue;
import java.util.LinkedList;
import java.util.Queue;
public class ExemploLinkedList {
    public static void main(String[] args) {
        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Patrícia");
        filaBanco.add("Roberto");
        filaBanco.add("Flávio");
        filaBanco.add("Pâmela");
        filaBanco.add("Anderson");

        System.out.println(filaBanco);

        String clienteASerAtendido = filaBanco.poll();

        System.out.println("Cliente da vez a ser atendido: " + clienteASerAtendido);
        System.out.println("Nova fila: " + filaBanco);

        String primeiroCliente = filaBanco.peek();

        System.out.println("O primeiro cliente na fila é: " + primeiroCliente);
        System.out.println("Nova fila: " + filaBanco);

        for (String cliente: filaBanco){
            System.out.println(cliente);
        }

    } // fim do método main
} // fim da classe ExemploLinkedList
