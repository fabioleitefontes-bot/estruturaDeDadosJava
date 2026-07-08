package implementacao.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args){

        Map<String, String> aluno = new HashMap<>();

        aluno.put("Nome", "João");
        aluno.put("idade", "17");
        aluno.put("nota", "8.9");
        aluno.put("turma", "4ADS");

        System.out.println(aluno);

        System.out.println(aluno.keySet());
        System.out.println(aluno.values());

        List<Map<String, String>> listaAlunos = new ArrayList<>();

        listaAlunos.add(aluno);

        Map<String, String> aluno2 = new HashMap<>();

        aluno2.put("Nome", "Maria");
        aluno2.put("idade", "19");
        aluno2.put("nota", "9.1");
        aluno2.put("turma", "4ADS");

        listaAlunos.add(aluno2);

        System.out.println("\n----imprimindo os alunos----\n");

        System.out.println(listaAlunos);


    }
}
