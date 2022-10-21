import java.util.Scanner;

public class Jogador extends Registro
{
    static Scanner sc = new Scanner(System.in);

    public void registrar()
    {
        String aux;
        char aux2;

        System.out.println("\nInforme o seu nome:");
        aux = sc.nextLine();

        System.out.println("\nInforme o simbolo o qual você deseja jogar:");
        aux2 = sc.nextLine().charAt(0);

        setNome(aux);
        setSimbolo(aux2);
    }
}