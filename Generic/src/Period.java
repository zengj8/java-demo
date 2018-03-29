import java.io.Serializable;
import java.util.Arrays;

public class Period<T extends Comparable<T> & Serializable> implements Comparable<Period> {
    private T begin;
    private T end;

    public Period(T one, T two) {
        if (one.compareTo(two) > 0) {
            begin = two;end = one;
        } else {
            begin = one;
            end = two;
        }
    }

    public static void main(String... args) {
        Period[] ps = new Period[2];
        Period<Integer> p1 = new Period<>(1, 2);
        Period<Integer> p2 = new Period<>(3, 4);
        ps[0] = p1;
        ps[1] = p2;
        System.out.println(ps[0]);
        Arrays.sort(ps);
        System.out.println(ps[0]);
    }

    @Override
    public int compareTo(Period o) {
        return -1;
    }

}