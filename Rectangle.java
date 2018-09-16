class Rectangle extends Quadrangle {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
        this.setFigureName("Rectangle");

    }

    @Override
    double getPerimetr() {
        return (this.a + this.b) * 2;
    }

    @Override
    double getArea() {
        return this.a * this.b;
    }
}
