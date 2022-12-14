package Figures.Quadrangles;

public class Parallelogram extends Quadrangles {

    private int lengthOfSideA;
    private int lengthOfSideB;
    private int lengthOfHighA;

    Parallelogram (int lengthOfSideA, int lengthOfSideB, int lengthOfHighA) {
        this.lengthOfSideA = lengthOfSideA;
        this.lengthOfSideB = lengthOfSideB;
        this.lengthOfHighA = lengthOfHighA;
        setNumOfAngle(4);
    }

    public int getLengthOfHighA() {
        return lengthOfHighA;
    }

    public int getLengthOfSideA() {
        return lengthOfSideA;
    }

    public int getLengthOfSideB() {
        return lengthOfSideB;
    }

    public void setLengthOfHighA(int lengthOfHighA) {
        this.lengthOfHighA = lengthOfHighA;
    }

    public void setLengthOfSideA(int lengthOfSideA) {
        this.lengthOfSideA = lengthOfSideA;
    }

    public void setLengthOfSideB(int lengthOfSideB) {
        this.lengthOfSideB = lengthOfSideB;
    }

    @Override
    public double getArea() {
        return lengthOfSideA * lengthOfHighA;
    }
}
