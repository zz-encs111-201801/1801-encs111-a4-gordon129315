package q01_setUtils;

import java.util.*;


public class SetUtils {

    public static Set<String> union(Set<String> s1, Set<String> s2) {
        Set<String> set = new HashSet<>();
        set.addAll(s1);
        set.addAll(s2);
        return set;
    }

    public static Set<String> intersect(Set<String> s1, Set<String> s2) {
        Set<String> set = new HashSet<>();
        for (String s : s1) {
            if (s2.contains(s)) {
                set.add(s);
            }
        }

        return set;
    }

    public static Set<String> subtract(Set<String> s1, Set<String> s2) {
        Set<String> set = new HashSet<>();
        set.addAll(s1);
        set.removeAll(intersect(s1, s2));
        return set;
    }

    public static String describe(Set<String> s) {
        List list = Arrays.asList(s.toArray());
        list.sort((o1, o2) -> {
            int i1 = Integer.parseInt((String) o1);
            int i2 = Integer.parseInt((String) o2);
            return i1 - i2;
        });
        return list.toString();
    }
}
