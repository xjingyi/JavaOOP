/**
 * Created by jxu on 11/8/2016.
 */
public class Animal {
    private int size = -1;
    private String breed;
    private String name;

    public void bark() {
    }

    public int getSize() {
        return size;
    }

    public void setSize(int a) {
        size = a;
    }

    public boolean isBigger(Animal ani) {
        if (this.getSize() > ani.getSize()) {
            return true;
        } else {
            return false;
        }
    }
    public void makeNoise() {
    }
}
