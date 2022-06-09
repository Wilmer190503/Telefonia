public class Fraccionario
{
    //----------
    // Atributos
    //----------

    private int numerador;
    private int denominador;

    //----------
    // Metodos
    //----------

    // Constructor por defecto
    public Fraccionario()
    {
        numerador = 1;
        denominador = 1;
    }
    // Constructor común o ordinario
    public Fraccionario(int num, int den)
    {
        this.numerador = num;
        this.denominador = den;
    }
    //constructor de copia
    public Fraccionario(Fraccionario f)
    {
        numerador = f.numerador;
        denominador = f.denominador;
    }
    // Metodos de acceso
    public int getNumerador()
    {
        return numerador;
    }
    public int gerDenominador()
    {
        return denominador;
    }
    public void setNumerador(int numerador)
    {
        this.numerador = numerador;
    }
    public void setDenominador(int denominador)
    {
        this.denominador = denominador;
    }
    public String toString()
    {
        return numerador + "/" + denominador;
    }
    // Metodo ejecutable
    public static void main(String[] args) 
    {
        Fraccionario f1 = new Fraccionario();
        System.out.println("Objeto 1: " + f1);
        Fraccionario f2 = new Fraccionario(3,2);
        System.out.println("Objeto 2: " + f2);
        Fraccionario f3 = new Fraccionario(f2);
        System.out.println("Objeto 2: " + f3);        
    }

}
