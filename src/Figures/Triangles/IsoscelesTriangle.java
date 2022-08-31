package Figures.Triangles;

public class IsoscelesTriangle extends Triangles {

    private int lengthOfSide;
    private int lengthOfBase;


    IsoscelesTriangle(int lengthOfSide, int lengthOfBase) {
        this.lengthOfBase = lengthOfBase;
        this.lengthOfSide = lengthOfSide;
        setNumOfAngle(3);
    }

    @Override
    public double getArea() {
        return lengthOfBase * getHigh() / 2.0;
    }

    @Override
    protected double getHigh() {
        return Math.sqrt(lengthOfSide * lengthOfSide - lengthOfBase * lengthOfBase / 4.0);
    }
}
