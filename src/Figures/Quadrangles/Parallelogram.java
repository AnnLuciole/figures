package Figures.Quadrangles;

public class Parallelogram extends Quadrangles {

    private int sideA;
    private int sideB;

    Parallelogram (int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
        setNumOfAngle(4);
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }
}
