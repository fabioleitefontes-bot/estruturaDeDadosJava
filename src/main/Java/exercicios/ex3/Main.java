package exercicios.ex3;

import java.util.*;

/*
 * =================================================================================
 * EXERCÍCIO PROPOSTO - INTERFACE MAP (DIGITAL INNOVATION ONE)
 * =================================================================================
 * * ENUNCIADO:
 * Dada a população estimada de alguns estados do NE brasileiro, faça:
 * - Estado = PE - População = 9.616.621
 * - Estado = AL - População = 3.351.543
 * - Estado = CE - População = 9.187.103
 * - Estado = RN - População = 3.534.265
 * * PASSOS REQUERIDOS:
 * 1. Crie um dicionário e relacione os estados e suas populações;
 * 2. Substitua a população do estado do RN por 3.534.165;
 * 3. Confira se o estado PB está no dicionário, caso não adicione: PB - 4.039.277;
 * 4. Exiba a população PE;
 * 5. Exiba todos os estados e suas populações na ordem que foi informado;
 * 6. Exiba os estados e suas populações em ordem alfabética;
 * 7. Exiba o estado com o menor população e sua quantidade;
 * 8. Exiba o estado com a maior população e sua quantidade;
 * 9. Exiba a soma da população desses estados;
 * 10. Exiba a média da população deste dicionário de estados;
 * 11. Remova os estados com a população menor que 4.000.000;
 * 12. Apague o dicionário de estados;
 * 13. Confira se o dicionário está vazio.
 * =================================================================================
 */
public class Main{
    static void main() {

        System.out.println("    -------------");
        System.out.println("1 - Criando um Map de estado e população");
        Map<String, Integer> mapEstados = new LinkedHashMap<>();
        mapEstados.put("PE", 9616621);
        mapEstados.put("AL", 3351543);
        mapEstados.put("CE", 9187103);
        mapEstados.put("RN", 3534265);

        System.out.println(mapEstados);

        System.out.println("\n    -------------");
        System.out.println("2 - Substituindo a população do RN");

        mapEstados.put("RN", 3534165);
        System.out.println("RN = " + mapEstados.get("RN"));

        System.out.println("\n    -------------");
        System.out.println("3 - Confirindo se o estado PB está no dicionário, caso não esteja adicionar: PB - 4.039.277;");

        System.out.println(mapEstados.containsKey("PB"));

        mapEstados.put("PB", 4039277);
        System.out.println(mapEstados);

        System.out.println("\n    -------------");
        System.out.println("4 - Exibindo a população de Pernanbuco");
        System.out.println("Pernanbunco - Populalçao : " + mapEstados.get("PE"));

        System.out.println("\n    -------------");
        System.out.println("5 -  Exibindo todos os estados e suas populações na ordem que foi informado");
        System.out.println(mapEstados);

        System.out.println("\n    -------------");
        System.out.println("6 -  Exibindo todos os estados e suas populações por ordem alfabetixa");
        Map<String, Integer> mapEstados2 = new TreeMap<>(mapEstados);
        System.out.println(mapEstados2);

        System.out.println("\n    -------------");
        System.out.println("7 -  Exibindo o estado com a menor população e sua quantidade;");
        Integer min = Collections.min(mapEstados.values());

        for(Map.Entry<String,Integer> entry: mapEstados.entrySet()){
            if (entry.getValue().equals(min))
                System.out.println("Menor população: " + entry.getKey() + "-" + entry.getValue());
        }

        System.out.println("\n    -------------");
        System.out.println("8 -  Exibindo o estado com a maior população e sua quantidade;");
        Integer max = Collections.max(mapEstados.values());

        for(Map.Entry<String,Integer> entry: mapEstados.entrySet()){
            if (entry.getValue().equals(max))
                System.out.println("Maior população: " + entry.getKey() + "-" + entry.getValue());
        }

        System.out.println("\n    -------------");
        System.out.println("9 -  Exibindo a soma das popuçaões");
        Double soma = 0d;
        Iterator<Map.Entry<String, Integer>> iterator = mapEstados.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<String, Integer> entry = iterator.next();
            soma += entry.getValue();

        }
        System.out.printf("a soma da população é : %.2f",soma);

        System.out.println("\n    -------------");
        System.out.println("10 -  Exibindo a média das populações");
        Double media = soma /mapEstados.size();
        System.out.printf("a média das populações é : %.2f",media);

        System.out.println("\n    -------------");
        System.out.println("11 -  Removendo os estados com a população menor que 4BI");
        Iterator<Map.Entry<String, Integer>> iterator2 = mapEstados.entrySet().iterator();
        while (iterator2.hasNext()){
            Map.Entry<String, Integer> entry = iterator2.next();
            if (entry.getValue() < 4000000){
                System.out.println("estado a ser removido: " + entry.getKey());
                iterator2.remove();
            }
        }
        System.out.println(mapEstados);

        System.out.println("\n    -------------");
        System.out.println("12 -  Apagando os dicionários");
        mapEstados.clear();

        System.out.println("\n    -------------");
        System.out.println("13 -  Conferindo se apagou os dicionarios");
        System.out.println(mapEstados.isEmpty());
        System.out.println(mapEstados2.isEmpty());

    }
}
