package modelo;

public class Figura
{
    protected double area;
    protected double perimetro;


    public Figura()
    {
        this.area = 0;
        this.perimetro = 0;
    }

    public double mostrarResultadoP()
    {
        return this.perimetro;
    }

    public double mostrarResultadoA()
    {
        return this.area;
    }
}