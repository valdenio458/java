package set;

import java.util.TreeSet;

public class ExemploTreeSet {
    public static void main(String[] args) {
        TreeSet<String> treeCapitais = new TreeSet<>();

        // Monta a árvore com as capitais
        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Florianópolis");
        treeCapitais.add("Curitiba");
        treeCapitais.add("São Paulo");
        treeCapitais.add("Rio de Janeiro");
        treeCapitais.add("Belo Horizonte");


        System.out.println(treeCapitais);

        //Retorna a primeira capital no topo da árvore
        System.out.println(treeCapitais.first());

        //Retorna a última capital no topo da árvore
        System.out.println(treeCapitais.last());

        //Retorna a primeira capital abaixo na árvore da capital parametrizada
        System.out.println(treeCapitais.lower("Florianópolis"));

        //Retorna a primeira capital acima na árvore da capital parametrizada
        System.out.println(treeCapitais.higher("Florianópolis"));
    }
}
