import java.util.Comparator;

public class Comporator implements Comparator<Notebook>{
    @Override
    public int compare(Notebook s1, Notebook s2) {
        return s1.ram -s2.ram;
    }
}
