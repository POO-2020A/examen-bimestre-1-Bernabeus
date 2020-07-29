
import java.util.Objects;

public class Seat {

    private Passenger pass;
    private int row;
    private String col;

    public Seat(int row, String col) {
        this.row = row;
        this.col = col;
    }

    public boolean isFree() {
        if (pass == null) {
            return true;
        } else {
            return false;
        }
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setCol(String col) {
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public String getCol() {
        return col;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Seat other = (Seat) obj;
        if (this.row != other.row) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        if (isFree()) {
            return "Asiento: " + row + col + ", ocupado. Pasajero: " + pass.toString();
        } else {
            return "Asiento: " + row + col + ", libre.";
        }
    }

}
