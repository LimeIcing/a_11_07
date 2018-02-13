import sun.awt.image.ImageWatched;

import java.util.HashSet;
import java.util.LinkedList;

public class Main07 {

    /*
    Write a method countCommon that accepts two lists of integers as parameters and returns the number of unique
    integers that occur in both lists. Use one or more sets as storage to help you solve this problem. For example, if
    one list contains the values [3, 7, 3, –1, 2, 3, 7, 2, 15, 15] and the other list contains the values
    [–5, 15, 2, –1, 7, 15, 36] , your method should return 4 because the elements –1, 2, 7, and 15 occur in both lists.
     */

    public static void main(String[] args) {
        LinkedList<Integer> a = new LinkedList<>();
        LinkedList<Integer> b = new LinkedList<>();
        a.add(1);
        a.add(1);
        a.add(4);
        a.add(7);
        b.add(4);
        b.add(5);
        System.out.println(countCommon(a, b));
    }

    public static int countCommon(LinkedList<Integer> l, LinkedList<Integer> m) {
        l.retainAll(m);
        return l.size();
    }
}
