import java.util.Scanner;

public class App 
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception 
    {
        Regras regra = new Regras();
        Campo campo = new Campo();
        Jogo jogo = new Jogo();
        Jogador jogador1 = new Jogador();
        Jogador jogador2 = new Jogador();

        int opção;

        regra.informarRegras();

        campo.campoExemplo();

        System.out.println("Escolha o modo de jogo:");
        System.out.println("1- Play vs Player");
        System.out.println("2- Player vs Bot");

        opção = sc.nextInt();

        switch(opção)
        {
            case 1:
            int retorno = 0;
        

            System.out.println("\nRegistrando Player 1:");
            jogador1.registrar();
            System.out.println("\nRegistrando Player 2:");
            jogador2.registrar();

            System.out.println("\n----------------------------------------");
            System.out.println("Os jogadores na partida são:");
            System.out.println("Jogador 1");
            jogador1.informarRegistro();
            System.out.println("Jogador 2");
            jogador2.informarRegistro();
            System.out.println("----------------------------------------\n");

            do
            {
                retorno = jogo.iniciarJogoPxP();
            }while(retorno == 3);
            break;
            case 2:System.out.println("Não implementado ainda.");break;
        }
    }
}
