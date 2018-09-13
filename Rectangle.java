class Rectangle extends Figure {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a=a;
        this.b=b;
        this.setFigure_name("Rectangle");
        this.setP();
        this.setS();
    }

    @Override
     double calculate_P() {
        return (this.a+this.b)*2;
    }

    @Override
    public String toString() {
        return "P of Rectangle is equal too : " +calculate_P() + "\n" + "S of Rectangle is equal to : " + calculate_S();
    }

    @Override
    double calculate_S() {
        return this.a*this.b;
    }
}
