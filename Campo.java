import java.util.Scanner;

public class Campo
{
    static Scanner scCampo = new Scanner(System.in);

    int turno = 1;
    char posição[] = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',' '};

    public void campoExemplo()
    {
        System.out.println("\nExemplo de campo onde 'X' ganha:");
        System.out.println("----------");
        System.out.println("X | O | X");
        System.out.println("O | X | O");
        System.out.println("O | O | X");
        System.out.println("----------");

        System.out.println("\nNumeracao do campo");
        System.out.println("----------");
        System.out.println("1 | 2 | 3");
        System.out.println("4 | 5 | 6");
        System.out.println("7 | 8 | 9");
        System.out.println("----------");
    }    

    public void imprimirCampo()
    {
        System.out.printf("%c | %c | %c\n",posição[1], posição[2], posição[3]);
        System.out.printf("%c | %c | %c\n",posição[4], posição[5], posição[6]);
        System.out.printf("%c | %c | %c\n",posição[7], posição[8], posição[9]);
    }


    public int verificarCampo()
    {
                if(posição[1] == 'X' && posição[2] == 'X' && posição[3] == 'X')
                {
                    return 1;
                }
    
                if(posição[1] == 'O' && posição[2] == 'O' && posição[3] == 'O')
                {
                    return 2;
                }

                if(posição[1] == 'X' && posição[4] == 'X' && posição[7] == 'X')
                {
                    return 1;
                }
    
                if(posição[1] == 'O' && posição[4] == 'O' && posição[7] == 'O')
                {
                    return 2;
                }

                if(posição[2] == 'X' && posição[5] == 'X' && posição[8] == 'X')
                {
                    return 1;
                }
    
                if(posição[2] == 'O' && posição[5] == 'O' && posição[8] == 'O')
                {
                    return 2;
                }
         
                if(posição[3] == 'X' && posição[6] == 'X' && posição[9] == 'X')
                {
                    return 1;
                }
    
                if(posição[3] == 'O' && posição[6] == 'O' && posição[9] == 'O')
                {
                    return 2;
                }
        
                if(posição[4] == 'X' && posição[5] == 'X' && posição[6] == 'X')
                {
                    return 1;
                }
    
                if(posição[4] == 'O' && posição[5] == 'O' && posição[6] == 'O')
                {
                    return 2;
                }
            
                if(posição[7] == 'X' && posição[8] == 'X' && posição[9] == 'X')
                {
                    return 1;
                }
    
                if(posição[7] == 'O' && posição[8] == 'O' && posição[9] == 'O')
                {
                    return 2;
                }
            
                if(posição[1] == 'X' && posição[5] == 'X' && posição[9] == 'X')
                {
                    return 1;
                }
    
                if(posição[1] == 'O' && posição[5] == 'O' && posição[9] == 'O')
                {
                    return 2;
                }
            
                if(posição[3] == 'X' && posição[5] == 'X' && posição[7] == 'X')
                {
                    return 1;
                }
    
                if(posição[3] == 'O' && posição[2] == 'O' && posição[3] == 'O')
                {
                    return 2;
                }
            
            else
            {
                return 3;
            }
}

    public int inserirNoCampo()
    {
        int aux;
        int aux3;
        char aux2;

        if(verificarCampo() != 1 && verificarCampo() != 2)
        {
            if(turno % 2 != 0)
            {
                System.out.println("Turno do jogador 1.\n");
            }
            else
            {
                System.out.println("Turno do jogador 2\n");
            }
            //Inserir o local do campo
            do
            {
                System.out.println("Informe o local do campo o qual deseja inserir o simbolo");
                aux = scCampo.nextInt();
    
                //Validação se o número está entre 1 e 9
                if(aux < 1 || aux > 9)
                {
                    System.out.println("Local escolhido invalido tente novamente, deve ser inserido um valor entre 1 e 9");
                }
            }while(aux < 1 || aux > 9);
    
            //Inserir o simbolo
            do
            {
                System.out.println("Informe o seu simbolo");
                aux2 = scCampo.next().charAt(0);
                
                //Validação de se o simbolo é valido
                if(aux2 != 'X' && aux2 != 'O')
                {
                    System.out.println("Simbolo invalido tente novamente, apenas sendo possivel 'X' ou 'O'");
                }
            }while(aux2 != 'X' && aux2 != 'O');

            posição[aux] = aux2;

            turno++; 
            
            if(verificarCampo() == 1 || verificarCampo() == 2)
            {
                System.out.println("\nO jogo foi definido com o Campo estando da seguinte maneira:");
                System.out.println("----------");
                imprimirCampo();
                System.out.println("----------");
                
                if(verificarCampo() == 1)
                {
                    System.out.println("O 'X' ganhou a partida!!");
                }

                if(verificarCampo() == 2)
                {
                    System.out.println("O 'O' ganhou a partida!!");
                }
            } 
        }
        aux3 = verificarCampo();
        return aux3;
    }
}
