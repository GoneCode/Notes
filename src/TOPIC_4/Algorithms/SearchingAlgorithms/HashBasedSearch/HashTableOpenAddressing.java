package TOPIC_4.Algorithms.SearchingAlgorithms.HashBasedSearch;

class HashTableOpenAddressing {
    private int[] keys;
    private String[] values;
    private int size;

    public HashTableOpenAddressing(int size) {
        this.size = size;
        keys = new int[size];
        values = new String[size];
    }

    private int hashFunction(int key) {
        return key % size;
    }

    public void insert(int key, String value) {
        int index = hashFunction(key);
        while (keys[index] != 0) { // Find the next empty slot
            index = (index + 1) % size;
        }
        keys[index] = key;
        values[index] = value;
    }

    public String search(int key) {
        int index = hashFunction(key);
        while (keys[index] != 0) {
            if (keys[index] == key) {
                return values[index];
            }
            index = (index + 1) % size;
        }
        return null; // Key not found
    }

    public static void main(String[] args) {
        HashTableOpenAddressing hashTable = new HashTableOpenAddressing(10);

        // Insert key-value pairs
        hashTable.insert(101, "Alice");
        hashTable.insert(111, "Bob"); // Collision with key 101 resolved by probing

        // Search keys
        System.out.println("Key 101: " + hashTable.search(101)); // Alice
        System.out.println("Key 111: " + hashTable.search(111)); // Bob
    }
}



