package Figures.Quadrangles;

public class Rhomb extends Quadrangles {
    private int lengthOfDiagonalA;
    private int lengthOfDiagonalB;

    Rhomb (int lengthOfDiagonalA, int lengthOfDiagonalB) {
        this.lengthOfDiagonalA = lengthOfDiagonalA;
        this.lengthOfDiagonalB = lengthOfDiagonalB;
        setNumOfAngle(4);
    }

    @Override
    public double getArea() {
        return lengthOfDiagonalA * lengthOfDiagonalB / 2;
    }

    public int getLengthOfDiagonalA() {
        return lengthOfDiagonalA;
    }

    public int getLengthOfDiagonalB() {
        return lengthOfDiagonalB;
    }

    public void setLengthOfDiagonalA(int lengthOfDiagonalA) {
        this.lengthOfDiagonalA = lengthOfDiagonalA;
    }

    public void setLengthOfDiagonalB(int lengthOfDiagonalB) {
        this.lengthOfDiagonalB = lengthOfDiagonalB;
    }
}
