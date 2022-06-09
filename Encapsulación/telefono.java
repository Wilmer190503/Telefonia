public class telefono
{
    //--------------
    //Atributos
    //--------------
    private double numeroCelular;
    private String operador;
    private int cantidadMinutos;
    private int costoMinutos;

    //--------------
    //Metodos
    //--------------

    //Constructor por defecto
    public telefono()
    {
        numeroCelular= 1;
        cantidadMinutos= 1;
        costoMinutos=1;
        operador= "";
    }

    //Contructor Común u Ordinario 
    public telefono( int num, int min, int costo, String ope)
    {
        this.numeroCelular = num;
        this.cantidadMinutos = min;
        this.costoMinutos= costo;
        this.operador= ope;
    }

    //Constructor de copia
    public telefono(telefono f)
    {
        numeroCelular = f.numeroCelular;
        cantidadMinutos = f.cantidadMinutos;
        costoMinutos = f.costoMinutos;
        operador = f.operador;
    }

    // Metodos de acceso
    public double getNumeroCelular()
    {
        return numeroCelular;
    }
    public void setNumeroCelular(int numeroCelular)
    {
        this.numeroCelular= numeroCelular;
    }
    public int getCantidadMinutos()
    {
        return cantidadMinutos;
    }
    public void setCantidadMinutos(int cantidadMinutos)
    {
        this.cantidadMinutos= cantidadMinutos;
    }
    public int getCostoMinutos()
    {
        return costoMinutos;
    }
    public void setCostoMinuto(int costoMinutos)
    {
        this.costoMinutos= costoMinutos;
    }
    public String getOperador()
    {
        return operador;
    }
    public void setOperador(String operador)
    {
        this.operador= operador;
    }
    public String toString()
    {
        return numeroCelular +"/" +  calcularPlan(); 
    }

    //saber el costo del plan
    public Double calcularPlan()
    {
        
        double x= costoMinutos*cantidadMinutos;
        if (operador.equals("movilujo"))
        {
          x = x - x*0.5;
        }
        return x;

    }

    // metodo ejecutable 

    public static void main (String[] args)
    {
        telefono f1 = new telefono(312473635, 0, 100, "claro");
        System.out.println("telefono 1: " + f1);
        telefono f2 = new telefono(312473635, 300, 100, "movilujo");
        System.out.println("telefono 2: " + f2);
    }

}


    

