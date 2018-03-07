package q01_setUtils;

import java.util.*;

/**
 * Author:  Haotao Lai (Eric)
 * Date:    2018-03-06
 * E-mail:  haotao.lai@gmail.com
 * Website: http://laihaotao.me
 */


public class SetUtils {

    public static Set<String> union(Set<String> s1, Set<String> s2) {
        return null;
    }

    public static Set<String> intersect(Set<String> s1, Set<String> s2) {
        return null;
    }

    public static Set<String> subtract(Set<String> s1, Set<String> s2) {
        return null;
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
