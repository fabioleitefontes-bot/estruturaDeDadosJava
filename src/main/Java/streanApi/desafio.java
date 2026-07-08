package streanApi;
import java.util.*;


public class desafio {
  static void main() {

        List<Integer> numeros = Arrays.asList(1, 2, 1, 3, 4, 5, 6, 8, 4,7, 8, 9, 10,15,21);

        System.out.println("1 - Ignore os 3 primeiros elementos da Lista e imprima o restante:");
        // Ignore os 3 primeiros elementos da Lista e imprima o restante:
       List<Integer> numeros1 = numeros.stream()
              .skip(3)
              .toList();
       System.out.println(numeros1);

      System.out.println("\nRetirando os números repetidos da Lista, quantos números ficam?");
        // Retirando os números repetidos da Lista, quantos números ficam?
        long i = numeros.stream()
                .distinct()
                .count();
        System.out.println("quantidade após retirar os repitidos: " + i);

      System.out.println("\nRetirando os números com duplicidade da Lista?");
      //retirando elementos que tem duplicidade
      List<Integer> limpo = numeros.stream()
              .filter(n -> Collections.frequency(numeros, n) == 1)
              .toList();

      System.out.println("Resultado com Apenas os elementos que n teve repetições: " + limpo);

        System.out.println("\nMostre o menor valor da Lista:");
        // Mostre o menor valor da Lista:
      int menor = numeros.stream()
              .mapToInt(Integer::intValue)
              .min()    //max para maior
              .getAsInt();
      System.out.println("o menor elemento é: " + menor);



        System.out.println("\nMostre o maior valor da Lista:");
        // Mostre o maior valor da Lista:
      int maior = numeros.stream()
              .reduce(Integer.MIN_VALUE, Integer::max);
      System.out.println("o maior elemento é: " + maior);

        System.out.println("\nPegue apenas os números ímpares e some:");
        // Pegue apenas os números ímpares e some:
        int soma = numeros.stream()
                .filter(n -> n % 2 == 1)
                .reduce(0, Integer::sum);
            System.out.println("a soma dos elementos impares é :" +soma);

        System.out.println("\nMostre a Lista na ordem númerica:");
        // Mostre a Lista na ordem númerica:
        List<Integer> listaOrdenada = numeros.stream()
                        .sorted().toList();
        System.out.println(listaOrdenada);

        System.out.println("\nAgrupe os valores ímpares múltiplos de 3 e de 5:");
        // Agrupe os valores ímpares múltiplos de 3 e de 5:
      List<Integer> lista3e5 = numeros.stream()
              .filter(integer -> (integer % 2 != 0) && integer % 3 ==0 || (integer % 2 != 0) && integer % 5 == 0)
              .toList();
      System.out.println(lista3e5);

    }
}