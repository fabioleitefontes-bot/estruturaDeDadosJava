package exercicios.ex2;

import java.util.*;

/*
 * EXERCÍCIO PROPOSTO - SET (DIGITAL INNOVATION ONE):
 * Crie um conjunto contendo as cores do arco-íris e:
 * A. Exiba todas as cores uma abaixo da outra
 * B. A quantidade de cores que o arco-íris tem
 * C. Exiba as cores em ordem alfabética
 * D. Exiba as cores na ordem inversa da que foi informada
 * E. Exiba todas as cores que começam com a letra "v"
 * F. Remova todas as cores que não começam com a letra "v"
 * G. Limpe o conjunto
 * H. Confira se o conjunto está vazio
 */
public class Main {
   static void main() {


        Set<String> coresArcoIris = new LinkedHashSet<>();

        // Adicionando as 7 cores do arco-íris
        coresArcoIris.add("Vermelho");
        coresArcoIris.add("Laranja");
        coresArcoIris.add("Amarelo");
        coresArcoIris.add("Verde");
        coresArcoIris.add("Azul");
        coresArcoIris.add("Anil");
        coresArcoIris.add("Violeta");


        // A. Exiba todas as cores uma abaixo da outra
        System.out.println("A. Cores uma abaixo da outra:");
        for (String cor : coresArcoIris) {
            System.out.println(cor);
        }

        // B. A quantidade de cores que o arco-íris tem
        System.out.printf("\nB. Quantidade de cores no conjunto: %d\n",coresArcoIris.size());

       //C. Exiba as cores em ordem alfabética
       System.out.println("\nC. exibindo todas as cores por ordèm alfabetica");

       Set<String> coresArcoIris2 = new TreeSet<>(coresArcoIris);
       System.out.println(coresArcoIris2);

       //D. Exiba as cores na ordem inversa da que foi informada
       List<String> listaCores = new ArrayList<>(coresArcoIris);
       System.out.println("\nd. exibindo as cores por ordèm inversa da informada");
       Collections.reverse(listaCores);
       System.out.println(listaCores);

       //E. Exiba todas as cores que começam com a letra "v"
       System.out.println("\nE. Cores que começam com 'V':");

       Iterator<String> iterator = coresArcoIris.iterator();
       while(iterator.hasNext()){
           String atual = iterator.next();
           if(atual.toUpperCase().startsWith("V"))
               System.out.println(atual);
       }

       //F. Remova todas as cores que não começam com a letra "v"
       System.out.println("\nF. Excluindo cores que não começam com 'V':");

       Iterator<String> iterator1 = listaCores.iterator();
       while(iterator1.hasNext()){
           String atual = iterator1.next();
           if(!atual.toUpperCase().startsWith("V")){
               iterator1.remove();
           }
       }
       System.out.println(listaCores);

       //G. Limpe o conjunto
       System.out.println("\nG. Limpando un conjunto");
       coresArcoIris.clear();

       //H. Confira se o conjunto está vazio
       System.out.println("\nH. Verificando se os conjuntos estão vazios");
       System.out.println("1:" + coresArcoIris.isEmpty());
       System.out.println("2:" + coresArcoIris2.isEmpty());
       System.out.println("3:" + listaCores.isEmpty());

}
}