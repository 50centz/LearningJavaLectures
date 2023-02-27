package Lectures.Lecture6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Lecture6
 */
public class Lecture6 {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(12);
        set.add(123);
        set.add(1234);
        set.add(1234);
        System.out.println(set.contains(12));
        set.add(null);
        System.out.println(set.size());
        System.out.println(set);
        set.remove(12);
        for (var item : set) {
            System.out.println(item);
        }
        set.clear();
        System.out.println(set);

        var a = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        var b = new HashSet<>(Arrays.asList(2, 3, 5, 7, 11, 13, 17));
        var u = new HashSet<Integer>(a);
        u.addAll(b);
        var r = new HashSet<Integer>(a);
        r.retainAll(b);
        var s = new HashSet<Integer>(a);
        s.removeAll(b);
       System.out.println(s);
       boolean res = a.addAll(b);
       System.out.println(res);
    }
}