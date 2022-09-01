package Figures.Quadrangles;

public class Square extends Quadrangles {

    private int lengthOfSide;

    Square(int lengthOfSide) {
        this.lengthOfSide = lengthOfSide;
        setNumOfAngle(4);
    }

    public void setLengthOfSide(int lengthOfSide) {
        this.lengthOfSide = lengthOfSide;
    }

    public int getLengthOfSide() {
        return lengthOfSide;
    }

    @Override
    public double getArea() {
        return lengthOfSide * lengthOfSide;
    }
}
