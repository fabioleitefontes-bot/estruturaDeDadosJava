package exercicios.ex1;



import java.util.ArrayList;
import java.util.List;

/*
 * EXERCÍCIO PROPOSTO (DIGITAL INNOVATION ONE):
 * * Faça um programa que receba a temperatura média dos 6 primeiros
 * meses do ano e armazene-as em uma lista.
 * * Após isto, calcule a média semestral das temperaturas e mostre
 * todas as temperaturas acima desta média, e em que mês elas
 * ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
 */

public class Main {
     static void main(){

        List<temperatura> listaTemperatures = new ArrayList<>();
            //adicionando elementos
        listaTemperatures.add(new temperatura("1-janeiro", 28.5));
        listaTemperatures.add(new temperatura("2-fevereiro", 30d));
        listaTemperatures.add(new temperatura("3-março", 27d));
        listaTemperatures.add(new temperatura("4-abril", 31.5));
        listaTemperatures.add(new temperatura("5-maio", 27d));
        listaTemperatures.add(new temperatura("6-junho", 27d));

        System.out.println(listaTemperatures);
        double media = 0;

            //calculando a média
        for(temperatura temp : listaTemperatures){
           media  += temp.getTemp();
        }
        media = media/6;

        System.out.printf("---A média é: %.1f---\n", media);

        System.out.println("\nMeses que ficaram acima da média\n");

        for(temperatura temp : listaTemperatures){
          if (temp.getTemp()> media)
              System.out.println(temp.getMes() + "-" + temp.getTemp());
        }


    }
}
