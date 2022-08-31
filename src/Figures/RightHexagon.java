package Figures;

public class RightHexagon extends Figures {

    private int lengthOfSide;

    RightHexagon (int lengthOfSide) {
        this.lengthOfSide = lengthOfSide;
        setNumOfAngle(6);
    }

    public int getLengthOfSide() {
        return lengthOfSide;
    }

    public void setLengthOfSide(int lengthOfSide) {
        this.lengthOfSide = lengthOfSide;
    }

    @Override
    public double getArea() {
        return lengthOfSide * lengthOfSide * 2.6;
    }
}
