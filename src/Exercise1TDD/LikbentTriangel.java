package Exercise1TDD;

public class LikbentTriangel implements Figure{
    private double length;
    private double width;

    public LikbentTriangel(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double getArea() {
        return (getLength() * getWidth()) / 2;
    }

    @Override
    public double getCircumference() {
        double numOne = getWidth() / 2;
        double pythoOne = Math.pow(numOne,2);
        double pythoTwo = Math.pow(getLength(),2);
        double sideB = Math.sqrt(pythoTwo + pythoOne);

        return sideB * 2 + getWidth();
    }
}
