import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable {
    private int x;
    private int y;
    private List<Movable> herd;
    public Herd() {
        this.herd = new ArrayList<>();
    }
    @Override
    public void move(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }
    public String toString() {
        String whatever = "";
        for(Movable organism: herd) {
        whatever += organism.toString() +"\n";
            
        }
        return whatever.toString();
    }
    public void addToHerd(Movable movable) {
    this.herd.add(movable);    
    }
}
