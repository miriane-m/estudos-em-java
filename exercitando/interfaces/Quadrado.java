package exercitando.interfaces;

public class Quadrado implements Comparable {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
}

public double area() {
    return lado*lado;
}
    
public int compareTo(Quadrado q) {
    double diferencaDeAreas = this.area() - q.area();
        
    if (diferencaDeAreas > 0)
        diferencaDeAreas = 1;
else if (diferencaDeAreas < 0)
    diferencaDeAreas = -1;
        return (int) diferencaDeAreas;
}
}
