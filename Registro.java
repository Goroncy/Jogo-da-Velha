public abstract class Registro 
{
    private String nome;
    private char simbolo;

    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public char getSimbolo() 
    {
        return simbolo;
    }

    public void setSimbolo(char simbolo) 
    {
        do
        {
            this.simbolo = simbolo;

            if(simbolo != 'X' && simbolo != 'O')
            {
                System.out.println("Simbolo invalido informe novamente, sendo possível apenas 'X' ou 'O'");
            }
        }while(simbolo != 'X' && simbolo != 'O');
    }

    public void informarRegistro()
    {
        System.out.println("Nome: " + getNome());
        System.out.println("Simbolo: "+ getSimbolo());
    }

}