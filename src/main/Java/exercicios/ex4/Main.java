package exercicios.ex4;

/**
 * Exercício: Validação e formatação de telefones e celulares.
 *
 * O que o código faz:
 * - Limpa a entrada do usuário removendo parênteses, traços, espaços e letras.
 * - Identifica o tipo: Telefone Fixo (8 ou 10 dígitos com DDD) ou Celular (9 ou 11 dígitos com DDD).
 * - Aceita entradas com ou sem máscara/formatação incorreta.
 * - Avisa se o número for inválido (tamanho diferente de 8, 9, 10 ou 11 dígitos).
 */

import java.util.Scanner;

public class Main {
    void main(){
        var scanner = new Scanner(System.in);
        TipoTelefone contato = null;

        boolean c = true;
        do {
            System.out.println("Digite o número de contato nos seguintes formatos: (xx)xxxx-xxxx ou xxxx-xxxx");
            var numeroInicial = scanner.next();

            String DDD = null;
            String numeroFinal = numeroInicial.replaceAll("\\D", "");
            int tamanho = numeroFinal.length();
            String numero ;
            if(tamanho == 11 || tamanho == 10){
                DDD = numeroFinal.substring(0, 2);
                numero = numeroFinal.substring(2);
            } else {
                numero = numeroFinal;
            }


            switch (tamanho){
                case 11:  contato = TipoTelefone.celularDDD;
                    contato.setDDD(DDD);
                    contato.setNumero(numero);
                    contato.setQuantidadeDigitos(tamanho);
                    c = false;
                    break;

                case 10:
                    contato = TipoTelefone.tefone;
                    contato.setDDD(DDD);
                    contato.setNumero(numero);
                    c=false;
                    break;

                case 9:
                    contato = TipoTelefone.celular;
                    contato.setNumero(numero);
                    c=false;
                    break;

                case 8:
                    contato = TipoTelefone.tefone;
                    contato.setNumero(numero);
                    c=false;
                    break;

                default:
                    System.err.println("Erro ao criar tipo de telefone - tamanho ou número invalido");
            }

        }while (c);
        System.out.println(contato);
    }

}
