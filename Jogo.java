public class Jogo extends Campo
{
    public int iniciarJogoPxP() 
    {
        int aux;
        System.out.println("O campo se encontra da seguinte maneira:");
        System.out.println("----------");
        imprimirCampo();
        System.out.println("----------");
        aux = inserirNoCampo();

        return aux;
    }
}