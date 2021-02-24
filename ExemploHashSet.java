package set;
import java.util.Iterator;
import java.util.HashSet;
import java.util.Set;

public class ExemploHashSet {
    public static void main(String[] args) {
        Set<Double> notaAlunos = new HashSet<>();

        // Adiciona as notas no set
        notaAlunos.add(5.8);
        notaAlunos.add(9.3);
        notaAlunos.add(6.5);
        notaAlunos.add(10.0);
        notaAlunos.add(5.4);
        notaAlunos.add(7.3);
        notaAlunos.add(3.8);
        notaAlunos.add(4.0);

        System.out.println(notaAlunos);

        // Remove uma nota do set
        notaAlunos.remove(3.8);

        System.out.println(notaAlunos);

        // Retorna a quantidade de itens do set
        System.out.println(notaAlunos.size());

        // Navega em todos os itens do iterador
        Iterator<Double> iterator = notaAlunos.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        for(Double nota: notaAlunos){
            System.out.println("->" + nota);
        }

    }
}
