package Exercise1TDD;

public class Square implements Figure {

    private double length;
    private double width;

    public Square(double length, double width) {
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
        return getLength() * getWidth();
    }

    @Override
    public double getCircumference() {
        return getLength() * 4;
    }
}

//getLength() * 4; // omkret

//getLength() * getWidth();