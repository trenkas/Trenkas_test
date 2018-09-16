abstract class Quadrangle extends Figure {

    private String figureName = "Shape";

    abstract double getPerimetr();

    public void setFigureName(String figureName) {
        this.figureName = figureName;
    }

    @Override
    public String toString() {
        return "Area of " + figureName + " =: " +
                getArea() + " and Perimetr =:  " + getPerimetr();
    }
}
