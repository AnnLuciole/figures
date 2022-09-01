package Figures.Quadrangles;

public class Rectangle extends Quadrangles {

    private int lengthOfSideA;
    private int lengthOfSideB;

    Rectangle (int lengthOfSideA, int lengthOfSideB) {
        this.lengthOfSideA = lengthOfSideA;
        this.lengthOfSideB = lengthOfSideB;
        setNumOfAngle(4);
    }

    @Override
    public double getArea() {
        return lengthOfSideA * lengthOfSideB;
    }

    public void setLengthOfSideB(int lengthOfSideB) {
        this.lengthOfSideB = lengthOfSideB;
    }

    public void setLengthOfSideA(int lengthOfSideA) {
        this.lengthOfSideA = lengthOfSideA;
    }

    public int getLengthOfSideB() {
        return lengthOfSideB;
    }

    public int getLengthOfSideA() {
        return lengthOfSideA;
    }
}
