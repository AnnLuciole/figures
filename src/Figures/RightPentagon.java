package Figures;

public class RightPentagon extends Figures {

    private int lengthOfSide;

    RightPentagon (int lengthOfSide) {
        this.lengthOfSide = lengthOfSide;
        setNumOfAngle(5);
    }

    public int getLengthOfSide() {
        return lengthOfSide;
    }

    public void setLengthOfSide(int lengthOfSide) {
        this.lengthOfSide = lengthOfSide;
    }

    @Override
    public double getArea() {
        return lengthOfSide * lengthOfSide * 1.72;
    }
}
