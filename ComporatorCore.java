import java.util.Comparator;

public class ComporatorCore implements Comparator<Notebook> {
    @Override
    public int compare(Notebook s1, Notebook s2) {
        return s1.core -s2.core;
    }
}
