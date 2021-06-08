package uaslp.objetos.figuras;

public class PoligonoRegular implements Figura{
    private double lado;
    private double area;
    private int numeroDeLados;

    public PoligonoRegular(int numeroDeLados, double lado){
        this.numeroDeLados=numeroDeLados;
        this.lado=lado;
    }

    public PoligonoRegular(int numeroDeLados){
        this.numeroDeLados=numeroDeLados;
    }

    public void setLado(double lado){
        this.lado=lado;
    }

    public double getLado() {
        return lado;
    }

    public double getArea(){
        double perimetro;
        double apotema;
        double angulo;
        perimetro=lado*numeroDeLados;
        angulo=360/(2*numeroDeLados);
        apotema=lado/(2*Math.tan(Math.toRadians(angulo)));
        area=perimetro*apotema/2;
        return area;
    }

    @Override
    public String getName() {
        return "Poligono Regular";
    }
}
