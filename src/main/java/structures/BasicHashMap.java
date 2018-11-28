package structures;

import java.util.Map;

public class BasicHashMap<X, Y> {

    private int capacity;
    private HashEntry[] values;
    private int size;

    public BasicHashMap(int tableSize) {
        this.capacity = tableSize;
        this.values = new HashEntry[this.capacity];
    }

    public class HashEntry<X, Y> {

        private X key;
        private Y value;

        public X getKey() {
            return key;
        }

        public void setKey(X key) {
            this.key = key;
        }

        public Y getValue() {
            return value;
        }

        public void setValue(Y value) {
            this.value = value;
        }

        public HashEntry(X key, Y value) {
            this.key = key;
            this.value = value;
        }
    }


    public int calculateHash(X key) {
        int hash = Math.abs(key.hashCode() % this.capacity);
        while(values[hash] != null && !values[hash].getKey().equals(key)) {
            hash = (hash + 1) % this.capacity;
        }
        return hash;
    }

    public void put(X key, Y value) {
        int hash = calculateHash(key);
        values[hash] = new HashEntry(key, value);
        size++;
    }


    public Y get(X key) {

        return (Y) values[calculateHash(key)].getValue();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }


}
