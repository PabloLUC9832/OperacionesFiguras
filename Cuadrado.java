public class Cuadrado implements IFigura{

    private double l;
    private double area,perimetro;

    public Cuadrado(double l){
        this.l=l;
    }

    @Override
    public double calcularArea() {
        area = l*l;
        return area;
    }

    @Override
    public double calcularPerimetro() {
        perimetro = l*4;
        return perimetro;
    }
    
}
