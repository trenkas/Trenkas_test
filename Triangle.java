 class Triangle extends Figure {
    private double a;
    private double b;
    private double c;
    private double h;

     public Triangle(double a, double b, double c, double h) {
         this.a=a;
         this.b=b;
         this.c=c;
         this.h=h;
         this.setFigure_name("Triangle");
         this.setP();
         this.setS();
     }

     @Override
     double calculate_P() {
         return this.a*this.b*this.c;
     }

     @Override
     double calculate_S() {
         return 0.5*this.a*this.h;
     }
 }
