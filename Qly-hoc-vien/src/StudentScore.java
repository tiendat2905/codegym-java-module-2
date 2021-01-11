import java.util.ArrayList;

public class StudentScore {
    private float point;
    private int heso;
    private boolean isInput = false;

    public StudentScore() {
    }

    public StudentScore(float point, int heso) {
        this.point = point;
        this.heso = heso;
    }

    public float getPoint() {
        return point;
    }

    public void setPoint(float point) {
        this.point = point;
    }

    public int getHeso() {
        return heso;
    }

    public void setHeso(int heso) {
        this.heso = heso;
    }

    public boolean isInput() {
        return isInput;
    }

    public void setInput(boolean input) {
        isInput = input;
    }
}
