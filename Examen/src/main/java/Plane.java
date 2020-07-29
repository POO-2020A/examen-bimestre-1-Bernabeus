
import java.util.ArrayList;

public class Plane {

    private Seat seats;
    private int rows;
    private int cols;

    public Plane(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;

    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public void setCols(int cols) {
        this.cols = cols;
    }

    @Override
    public String toString() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("E");
        list.add("F");
        list.add("G");
        String p1 = "";
        for (int i = 1; i <= this.cols; i++) {
            p1 = i + " ";
            for (int j = 0; j < rows; j++) {
                p1 = p1 + list.get(j);
            }
            p1 = p1 + "\n";
        }
        return p1;
    }

}
