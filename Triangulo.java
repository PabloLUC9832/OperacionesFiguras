public class Triangulo implements IFigura{

    private double l;
    private double area,perimetro;

    public TRiangulo(double l){
        this.l = l;
    }

    @Override
    public double calcularArea() {
        area = l+l+l;
        return area;
    }

    @Override
    public double calcularPerimetro() {
        perimetro = l+l+l;
        return perimetro;
    }
    
}