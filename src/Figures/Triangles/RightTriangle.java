package Figures.Triangles;

public class RightTriangle extends Triangles{


    private int lengthOfCathetA;
    private int lengthOfCathetB;


    RightTriangle(int lengthOfCathetA, int lengthOfCathetB) {
        this.lengthOfCathetA = lengthOfCathetA;
        this.lengthOfCathetB = lengthOfCathetB;
        setNumOfAngle(3);
    }

    @Override
    public double getArea() {
        return lengthOfCathetA * lengthOfCathetB / 2.0;
    }

    @Override
    protected double getHigh() {
        return lengthOfCathetA;
    }
}
