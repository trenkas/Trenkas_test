import static java.lang.Math.PI;

public class Circle {
    private double d;
    private double C;
    private double S;
    private double P;

    public Circle(double d) {
        this.d=d;
    }
    double calculate_C(){
        return this.d* PI;
    }

    double calculate_S(){
         double r;
         r=this.d/2;
        return r*r * PI;
    }

    @Override
    public String toString() {
        return "Circle length is equal to : " +calculate_C() +"\n" + "Circle area is equal to : " +calculate_S();
    }
}
