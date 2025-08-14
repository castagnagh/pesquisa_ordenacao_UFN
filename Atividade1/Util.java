import java.util.ArrayList;
import java.util.Random;


public class Util {

    
    public static void popularListaNumerosAleatorio(ArrayList<Integer> lista, int quantidade, int inicio, int fim){
        Random gerador = new Random();
        int numero;
        for(; quantidade> 0; quantidade--){
            numero = gerador.nextInt(inicio, fim);
            lista.add(numero);
        }
    }

    public static void exibirListaNumeros(ArrayList<Integer> lista){
        for(Integer item : lista){
            System.out.println(item);
        }
    }

    public static void popularListaPalavrasAleatorio(ArrayList<String> lista, int quantidade, int tamanho){
        Random gerador = new Random();
        String palavraGerada;
        char letraSorteada;
        int posicao;
        String letras = "abcdefghijklmnopqrstuvwxyz ";

        for(; quantidade > 0; quantidade--){
            palavraGerada = "";
            for(int i = 0; i < tamanho; i++){
                posicao = gerador.nextInt(letras.length());
                letraSorteada = letras.charAt(posicao);
                palavraGerada +=letraSorteada;
            }
            lista.add(palavraGerada);
        }
    }

    public static void exibirListaPalavras(ArrayList<String> lista){
        for( String item : lista){
            System.out.println(item);
        }
    }
}
