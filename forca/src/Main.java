import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            String texto = "avenida";
            texto.length();
            String palavra = "_______";
            int tentativa = 0;
            String palavraAux = "";
            while(tentativa<=7){
                System.out.println(palavra);
                palavraAux = "";
                System.out.println("forca, faça seu chute: tentativas max 7, atual: "+tentativa);
                char guess = in.next().charAt(0);
                for(int i = 0;i<texto.length();i++){
                    if(guess==(texto.charAt(i))){
                        palavraAux += guess;
                    } else if (palavra.charAt(i) == texto.charAt(i)){
                        palavraAux+= palavra.charAt(i);
                    } else{
                        palavraAux +="_";
                    }
                }
                palavra = palavraAux;
                tentativa++;
                if(palavra.equals(texto)){
                    System.out.println("Parabens acertou");
                    break;
                }
            }
            System.out.println("Não foi dessa vez");
        }
    }
}

