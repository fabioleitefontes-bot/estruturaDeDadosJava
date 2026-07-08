package implementacao.HashCode;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Carro> listaCarros = new ArrayList<>();
        listaCarros.add(new Carro("Ford"));
        listaCarros.add(new Carro("volkswagen"));
        listaCarros.add(new Carro("chevrolet"));

        System.out.println(listaCarros.contains(new Carro("Ford")));
        Carro carroTeste = new Carro("Ford");
        System.out.println(carroTeste.hashCode());
        System.out.println("-=======-");
        System.out.println(listaCarros.get(0).hashCode());
        System.out.println("-=======-");
        System.out.println();
    }
}
