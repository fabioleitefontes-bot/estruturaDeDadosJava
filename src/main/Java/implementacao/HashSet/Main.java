package implementacao.HashSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args){

        Set<Carro> hashSetCarros = new HashSet<>();

        hashSetCarros.add(new Carro("Fiat"));
        hashSetCarros.add(new Carro("Corvette"));
        hashSetCarros.add(new Carro("Chevrolet"));
        hashSetCarros.add(new Carro("Zip"));

        System.out.println(hashSetCarros);

        TreeSet<Carro> treeSetCarros = new TreeSet<>();

        treeSetCarros.add(new Carro("Fiat"));
        treeSetCarros.add(new Carro("Corvette"));
        treeSetCarros.add(new Carro("chevrolet"));
        treeSetCarros.add(new Carro("Zip"));

        System.out.println(treeSetCarros);
    }
}
