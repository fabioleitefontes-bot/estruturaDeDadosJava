package implementacao.queue;

import java.util.LinkedList;
import java.util.Queue;


public class Main {

    public static void main(String[] args){

        Queue<Carro> queueCarros = new LinkedList<>();

        queueCarros.add(new Carro("Ford"));
        queueCarros.add(new Carro("Fiat"));
        queueCarros.add(new Carro("Chevet"));

        System.out.println(queueCarros.add(new Carro("Peugeot")));

        System.out.println(queueCarros);

        System.out.println(queueCarros.peek());
        System.out.println(queueCarros);

        System.out.println(queueCarros.poll());
        System.out.println(queueCarros);



    }
}
