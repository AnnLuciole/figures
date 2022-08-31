package Figures.Triangles;

public class EquilateralTriangle extends Triangles {

    private int lengthOfSide;


    EquilateralTriangle(int lengthOfSide) {
        this.lengthOfSide = lengthOfSide;
        setNumOfAngle(3);
    }

    @Override
    public double getArea() {
        return lengthOfSide * getHigh() / 2.0;
    }

    @Override
    protected double getHigh() {
        return lengthOfSide * Math.sqrt(3) / 2;
    }
}
