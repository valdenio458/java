package streamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStreamAPI {
    public static void main(String[] args) {

        //Cria a coleção de estudantes
        List<String> estudantes = new ArrayList<>();

        //Adiciona 7 estudantes para a coleçao
        estudantes.add("Pedro");
        estudantes.add("Thayse");
        estudantes.add("Marcelo");
        estudantes.add("Carla");
        estudantes.add("Juliana");
        estudantes.add("Thiago");
        estudantes.add("Raphaela");

        //Retorna a contagem dos elementos do stream
        System.out.println("Contagem: " + estudantes.size());

        //Retorna o elemento com maior número de letras
        System.out.println("Maior número de letras: " + estudantes.stream().max(Comparator.comparingInt(String::length)));

        //Retorna o elemento com menor número de letras
        System.out.println("Menor número de letras: " + estudantes.stream().min(Comparator.comparingInt(String::length)));

        //Retorna os elementos que tem a letra R no nome
        System.out.println("Com a letra r no nome: " + estudantes.stream().filter((estudante)->estudante.toLowerCase().contains("r")).collect(Collectors.toList()));

        //Retorna uma nova coleção com os nomes concatenados com a qtd de letras de cada nome
        System.out.println("Retorna nova coleção com a qtd de letras: " + estudantes.stream().map(estudante->
        estudante.concat(" - ").concat(String.valueOf(estudante.length()))).collect(Collectors.toList()));

        //Retorna somente os 3 primeiros elementos da coleção
        System.out.println("Retorna os 3 primeiros elementos: " + estudantes.stream().limit(3).collect(Collectors.toList()));

        //Exibe cada elemento no console e depois retorna a mesma coleção
        System.out.println("Retorna os elementos: " + estudantes.stream().peek(System.out::println).collect(Collectors.toList()));

        //Exibe cada elemento no console sem retornar outra coleção
        System.out.println("Retorna os elementos novamente:");
        estudantes.stream().forEach(System.out::println);

        //Retorna true se todos os elementos possuírem a letra w no nome
        System.out.println("Todos os elementos tem w no nome?: " + estudantes.stream().allMatch((elemento) ->
                elemento.contains("w")));

        //Retorna true se algum dos elementos possuir  a letra a no nome
        System.out.println("Tem algum elemento com a no nome?: " + estudantes.stream().anyMatch((elemento) ->
                elemento.contains("a")));

        //Retorna true se nenhum dos elementos possuir  a letra a no nome
        System.out.println("Nenhum elemento possui a no nome: " + estudantes.stream().noneMatch((elemento) ->
                elemento.contains("a")));

        //Retorna o primeiro elemento da coleção, se exixtir exibe no console
        System.out.println("Retorna o primeiro elemento da coleção: ");
        estudantes.stream().findFirst().ifPresent(System.out::println);

        //Exemplo de operação encadeada
        System.out.println("Operação encadeada: ");
        System.out.println(estudantes.stream()
        .peek(System.out::println)
        .map(estudante -> estudante.concat(" - ").concat(String.valueOf(estudante.length())))
        .peek(System.out::println)
        .filter((estudante) -> estudante.toLowerCase().contains("r"))
        .collect(Collectors.toList()));
    }
}
