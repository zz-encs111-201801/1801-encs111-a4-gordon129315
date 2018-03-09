package q02_listMap;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


public class ListMap implements ListMapInterface {
    private Map<String, LinkedList<Integer>> map = new HashMap<>();

    @Override
    public void add(String key, Integer value) {
        LinkedList<Integer> list = map.containsKey(key) ? map.get(key) : new LinkedList<>();
        list.add(value);
        map.put(key, list);

    }

    @Override
    public List<Integer> get(String key) {
        return map.get(key);
    }

    @Override
    public void removeFirst(String key, Integer value) {
        map.get(key).removeFirstOccurrence(value);
    }

    @Override
    public void removeLast(String key, Integer value) {
        map.get(key).removeLastOccurrence(value);
    }

    @Override
    public void removeAll(String key, Integer value) {
        while (map.get(key).remove(value)){

        }
    }

    @Override
    public void remove(String key) {
        map.remove(key);
    }

    @Override
    public boolean containsKey(String key) {
        return map.containsKey(key);
    }

}
