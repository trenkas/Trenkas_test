class Square extends Quadrangle {

    private double a;

    public Square(double a) {
        this.a = a;
        this.setFigureName("Square");

    }

    @Override
    double getPerimetr() {

        return a * 4;
    }

    @Override
    double getArea() {
        return a * a;
    }


}
