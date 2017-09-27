package mpp.tinkering.generics;

public class Zack<K,V> implements MyInterface<K,V> {
    private K key;
    private V value;

    public Zack(K key, V value){
        this.key = key;
        this.value = value;
    }

    @Override
    public V getValue() {
        return null;
    }

    @Override
    public K getKey() {
        return null;
    }
}
