package mpp.labs.lab9.comparators2;

public class Pair<K,V> {
    private K key;
    private V value;

    public Pair(final K key, final V value){
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
