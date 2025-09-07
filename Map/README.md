📘 Complete Tutorial on Maps and Sets in Java

1. Introduction
Bruce Eckel introduces Sets and Maps as specialized collections:
Set → A collection that does not allow duplicates.


Map → A collection of key-value pairs, where keys are unique.


👉 Both are part of the Java Collections Framework (java.util).
 👉 They rely heavily on the equals() and hashCode() contracts.

2. Sets in Java
2.1 Key Properties of a Set
No duplicates allowed.


At most one null element.


Useful for uniqueness checks.


2.2 Set Implementations
Implementation
Ordering
Backed by
Performance
HashSet
Unordered
Hash table
O(1) add/search
LinkedHashSet
Insertion-order
Hash table + Linked list
O(1), maintains order
TreeSet
Sorted (natural order / Comparator)
Red-Black Tree
O(log n)


2.3 Basic Example (Bruce-style)
import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("A"); // duplicate, ignored

        System.out.println(set);  // [A, B]
    }
}


2.4 Internal Working of HashSet
HashSet uses a HashMap internally.


Elements are stored as keys in HashMap, with a dummy constant value.


Performance depends on a good hashCode() implementation.


👉 In Java 8+: If too many collisions occur in a bucket, the linked list is converted into a red-black tree for O(log n) performance.

3. Maps in Java
3.1 Key Properties of a Map
Stores key-value pairs.


Keys must be unique.


Values can be duplicate.


At most one null key, multiple null values (except Hashtable).


3.2 Map Implementations
Implementation
Ordering
Backed by
Nulls Allowed
Performance
HashMap
Unordered
Hash table
1 null key, many null values
O(1) average
LinkedHashMap
Insertion-order
Hash table + Linked list
Same as HashMap
O(1)
TreeMap
Sorted by key
Red-Black Tree
No null key
O(log n)
Hashtable
Legacy, synchronized
Hash table
No nulls
O(1)


3.3 Basic Example (Bruce-style)
import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Alice");
        map.put(2, "Bob");
        map.put(1, "Charlie"); // replaces value at key 1

        System.out.println(map); // {1=Charlie, 2=Bob}
    }
}


3.4 Internal Working of HashMap
Each key’s hashCode() is used to find a bucket index.


If bucket is empty → store entry.


If collision occurs → compare keys using equals().


If equal → replace value.


If not equal → store as linked list (later tree).


Resize occurs when load factor (0.75 by default) is exceeded.


👉 Complexity:
put/get/remove → O(1) average, O(n) worst-case (before Java 8).


Since Java 8, worst-case improved to O(log n).



4. Iterating Sets & Maps
4.1 Iterating a Set
for(String s : set) {
    System.out.println(s);
}

4.2 Iterating a Map
for(Map.Entry<Integer, String> e : map.entrySet()) {
    System.out.println(e.getKey() + " -> " + e.getValue());
}

Modern Java (8+):
map.forEach((k,v) -> System.out.println(k + " : " + v));


5. Common Pitfalls
Hash collisions can degrade performance → always override equals() and hashCode() properly.


Nulls in TreeMap/TreeSet cause NullPointerException.


ConcurrentModificationException when modifying during iteration.


Wrong collection choice can cause performance issues (e.g., TreeSet vs HashSet).



6. Modern Enhancements (Java 8+)
6.1 Streams with Set
set.stream().filter(s -> s.startsWith("A"))
    .forEach(System.out::println);

6.2 Map Methods
map.putIfAbsent(3, "David");
map.computeIfAbsent(4, k -> "Generated_" + k);
map.merge(2, "X", (oldVal, newVal) -> oldVal + newVal);


7. Eckel-Style Exercises
Exercise 1: Unique Words (Set)
Take a sentence and use a HashSet<String> to print all unique words.
Exercise 2: Word Frequency (Map)
Take a paragraph and use HashMap<String,Integer> to count frequency of each word.
Exercise 3: Sorted Set
Store student names in a TreeSet and print them in alphabetical order.
Exercise 4: Insertion Order
Demonstrate the difference between HashSet, LinkedHashSet, and TreeSet using the same input.
Exercise 5: LRU Cache (LinkedHashMap)
Use LinkedHashMap with access-order = true to simulate an LRU cache.

8. Interview Questions
Difference between HashSet, LinkedHashSet, and TreeSet?


How does HashMap handle collisions internally?


Why must you override both equals() and hashCode()?


Difference between HashMap and Hashtable?


Why is TreeMap slower than HashMap?


Can a Map have duplicate values? Duplicate keys?


What happens if two keys have the same hashCode but are not equal?



✅ Summary
Set ensures uniqueness, backed by HashMap or TreeMap.


Map manages key-value pairs, keys must be unique.


HashSet and HashMap rely on hashing (fast, but unordered).


TreeSet and TreeMap rely on Red-Black Trees (sorted, slower).


LinkedHashSet and LinkedHashMap maintain insertion order.


Java 8+ added Streams, computeIfAbsent, merge, forEach, and improved HashMap collision handling with trees.
