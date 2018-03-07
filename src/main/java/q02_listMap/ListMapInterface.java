package q02_listMap;

import java.util.List;

/**
 * Author:  Haotao Lai (Eric)
 * Date:    2018-03-06
 * E-mail:  haotao.lai@gmail.com
 * Website: http://laihaotao.me
 */


public interface ListMapInterface {

    void add(String key, Integer val);

    List<Integer> get(String key);

    void removeFirst(String key, Integer val);

    void removeLast(String key, Integer val);

    void removeAll(String key, Integer val);

    void remove(String key);

    boolean containsKey(String key);

}
