package Figures;

public class Ellipse extends Figures {

    private int lengthOfBigSemiaxis;
    private int lengthOfSmallSemiaxis;

    Ellipse (int lengthOfBigSemiaxis, int lengthOfSmallSemiaxis) {
        this.lengthOfBigSemiaxis = lengthOfBigSemiaxis;
        this.lengthOfSmallSemiaxis = lengthOfSmallSemiaxis;
        setNumOfAngle(0);
    }

    public int getLengthOfBigSemiaxis() {
        return lengthOfBigSemiaxis;
    }

    public int getLengthOfSmallSemiaxis() {
        return lengthOfSmallSemiaxis;
    }

    public void setLengthOfBigSemiaxis(int lengthOfBigSemiaxis) {
        this.lengthOfBigSemiaxis = lengthOfBigSemiaxis;
    }

    public void setLengthOfSmallSemiaxis(int lengthOfSmallSemiaxis) {
        this.lengthOfSmallSemiaxis = lengthOfSmallSemiaxis;
    }

    @Override
    public double getArea() {
        return lengthOfBigSemiaxis * lengthOfSmallSemiaxis * Math.PI;
    }
}
