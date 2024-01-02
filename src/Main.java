import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        Random random = new Random();
        int num = random.nextInt(1000);
        int tentativas = 0;
        String fim;
        Abertura();
        System.out.println();
        System.out.println("Preparado?? (Dica: Digite Sim ou Não)");
        String confirmar = dado.nextLine();
        if(confirmar.equals("Sim")){
            for(int i = 0; i < 5; i++){
                System.out.println("Digite um possível número: ");
                System.out.println("Tentativas = "+tentativas);
                int valor = dado.nextInt();
                if(valor == num){
                    fim = """
                                 PARABÉNS!!     
                            Você conseguiu adivinhar o valor!
                            Valor:  """;
                    System.out.print(fim + num);
                    break;
                }
                else{
                    if(valor > num){
                        System.out.println("Valor menor do que o digitado!");
                    }
                    else if(valor < num){
                        System.out.println("Valor maior do que o digitado!");
                    }
                    tentativas++;
                }
                if(tentativas == 5){
                    System.out.println("Infelizmente acabaram as suas tentativas!!");
                    System.out.println("Tente jogar novamente!");
                    System.out.println("Valor: " + num);
                    break;
                }
            }
        }
        else if (confirmar.equals("Não")){
            System.out.println("Fim!");
        }
        else{
            System.out.println("Erro de digitação!");
        }
    }
    static Void Abertura(){
        System.out.println("     Bem vindo ao Jogo de Adivinhação!     ");
        String regras;
        regras = """
                    Regras:
                           1- Você terá 5 tentativas para acertar o valor!
                           2- O valor sempre será aleatório;
                           3 - A cada tentativa haverá uma dica, se o valor digitado é maior ou menor que o valor!""";
        System.out.println(regras);
        return null;
    }
}
