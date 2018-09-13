class Rhombus extends Figure {

    private double a;
    private double h;

    public Rhombus(double a, double h) {
        this.a=a;
        this.h=h;
        this.setP();
        this.setS();
    }

    double calculate_P (){
        return this.a*4;
    }

    @Override
    double calculate_S() {
        return this.a*this.h;

    }

    @Override
    public String toString() {
        return "P of Rhombus is equal to : " +calculate_P() +"\n" + "S of Rhombus is equal to : " + calculate_S();
    }
}
