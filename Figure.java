public abstract class Figure {
    private double P;
    private double S;
    private double a;
    private double b;
    private String figure_name = "Quadrangle";

    abstract double calculate_P();
    abstract double calculate_S();

    public Figure() {

    }

   /* public double getP() {
        return P;
    }*/

    public void setP() {
        this.P=this.calculate_P();
    }

   /* public double getS() {
        return S;
    }*/

    public void setS() {
        this.S=this.calculate_S();
    }

    public String getFigure_name() {
        return figure_name;
    }

    public void setFigure_name(String figure_name) {
        this.figure_name = figure_name;
    }

    @Override
    public String toString() {
        return "Perimetr of " +figure_name + " = " +P + " Area of " + figure_name + " = " +S;

    }
}
