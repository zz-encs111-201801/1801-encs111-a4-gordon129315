package q02_listMap;

import java.util.List;


public interface ListMapInterface {

    void add(String key, Integer value);

    List<Integer> get(String key);

    void removeFirst(String key, Integer value);

    void removeLast(String key, Integer value);

    void removeAll(String key, Integer value);

    void remove(String key);

    boolean containsKey(String key);

}
