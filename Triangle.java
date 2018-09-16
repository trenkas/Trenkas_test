class Triangle extends Figure {
    private double a;
    private double b;
    private double c;
    private double h;

    public Triangle(double a, double b, double c, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }


    double getPerimetr() {
        return this.a * this.b * this.c;
    }

    @Override
    double getArea() {
        return 0.5 * this.a * this.h;
    }


    public String toString() {
        return "P of Triangle is equal to : " + getPerimetr() + "\n" + "S of Triangle is equal to : " + getArea();
    }
}
