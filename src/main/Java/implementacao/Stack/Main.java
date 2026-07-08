package implementacao.Stack;
import java.util.Stack;

public class Main {
    public static void main(String[] args){
    Stack<Carro> stackCarros = new Stack<>();
    stackCarros.push(new Carro("Ford"));
    stackCarros.push(new Carro("Chevrolet"));
    stackCarros.push(new Carro("Volkswagen"));

    System.out.println(stackCarros);
    System.out.println("Retirando O: " + stackCarros.pop());

    System.out.println(stackCarros);
}}
