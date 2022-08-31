package Figures.Triangles;

public class RightTriangle extends Triangles{


    private int cathetA;
    private int cathetB;


    RightTriangle(int cathetA, int cathetB) {
        this.cathetA = cathetA;
        this.cathetB = cathetB;
        setNumOfAngle(3);
    }

    @Override
    public double getArea() {
        return cathetA * cathetB / 2.0;
    }

    @Override
    protected double getHigh() {
        return cathetA;
    }
}
