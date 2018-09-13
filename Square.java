class Square extends Figure {

    private double a;

    public Square(double a) {
        this.a=a;
        this.setFigure_name("Square");
        this.setP();
        this.setS();
    }

    @Override
    double calculate_P() {
        return a*4;
    }

    @Override
    double calculate_S() {
        return a*a;
    }
}
