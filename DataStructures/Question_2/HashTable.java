package hash;

import java.util.TreeMap;

public class HashTable {
    private TreeMap<Integer, String>[] table;
    private int size;

    @SuppressWarnings("unchecked")
	public HashTable(int size) {
        this.size = size;
        table = new TreeMap[size];
        for (int i = 0; i < size; i++) {
            table[i] = new TreeMap<>();
        }
    }

    private int hash(int key) {
        return key % size;
    }

    public void put(int key, String value) {
        int index = hash(key);
        table[index].put(key, value);
    }

    public String get(int key) {
        int index = hash(key);
        return table[index].get(key);
    }

    public void remove(int key) {
        int index = hash(key);
        table[index].remove(key);
    }
}