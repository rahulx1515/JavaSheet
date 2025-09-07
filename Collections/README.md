📘 Complete Tutorial on Collections in Java

1. Introduction
In Java, Collections are high-level data structures that store and manipulate groups of objects.
Arrays are fixed in size.


Collections are dynamic, flexible, and powerful, with rich APIs.


👉 Collections are part of java.util package.
 👉 The Collections Framework includes interfaces, implementations, and algorithms.

2. The Collections Framework Hierarchy
At the top:
Iterable<E>


Collection<E>


List<E> → ArrayList, LinkedList, Vector, Stack


Set<E> → HashSet, LinkedHashSet, TreeSet


Queue<E> → PriorityQueue, ArrayDeque


Other:
Map<K,V> (not a subtype of Collection) → HashMap, TreeMap, LinkedHashMap, Hashtable



3. Key Interfaces
3.1 Collection Interface
Root interface. Defines methods:
add(E e)


remove(Object o)


size(), isEmpty()


iterator()


contains(Object o)


3.2 List
Ordered collection, allows duplicates.


Access via index.


Implementations:


ArrayList → resizable array


LinkedList → doubly linked list


Vector → synchronized (legacy)


Stack → LIFO stack


3.3 Set
No duplicates, at most one null.


Implementations:


HashSet → unordered, fastest (uses hash table)


LinkedHashSet → insertion order maintained


TreeSet → sorted order (uses Red-Black tree)


3.4 Queue
Typically FIFO (First-In-First-Out).


Implementations:


PriorityQueue → elements sorted by priority


ArrayDeque → double-ended queue


3.5 Map
Key-value pairs, keys are unique.


Implementations:


HashMap → fast, allows one null key, multiple null values


LinkedHashMap → insertion-order


TreeMap → sorted by natural/comparator order


Hashtable → synchronized (legacy)



4. Utility Classes
4.1 Collections Class
Helper methods:
Collections.sort(list)


Collections.reverse(list)


Collections.shuffle(list)


Collections.frequency(list, obj)


Collections.max(list), Collections.min(list)


4.2 Arrays Class (bridge between arrays and collections)
Arrays.asList(arr) → List view


Arrays.sort(arr)


Arrays.binarySearch(arr, key)



5. Iterating Collections
For-each loop
for(String s : list) {
    System.out.println(s);
}

Iterator
Iterator<String> it = list.iterator();
while(it.hasNext()) {
    System.out.println(it.next());
}

ListIterator (for Lists only)
Allows bi-directional traversal.



6. Generics in Collections
List<String> list = new ArrayList<>();
list.add("Hello");
// list.add(10); ❌ Compile-time error

Generics provide type safety and avoid ClassCastException.

7. Comparisons
ArrayList vs LinkedList


Random access → ArrayList is O(1), LinkedList is O(n).


Insertion/removal in middle → LinkedList is faster.


HashSet vs TreeSet


HashSet → O(1) for add/search.


TreeSet → O(log n), but maintains sorted order.


HashMap vs Hashtable


HashMap → Not synchronized, allows null key.


Hashtable → Synchronized, legacy, no null key.



8. Modern Java Enhancements (Java 8+)
Streams API


list.stream()
    .filter(s -> s.startsWith("A"))
    .forEach(System.out::println);

forEach() method


list.forEach(System.out::println);

removeIf() method


list.removeIf(s -> s.length() < 3);

Map enhancements


map.forEach((k, v) -> System.out.println(k + " -> " + v));
map.putIfAbsent("X", 100);
map.computeIfAbsent("Y", k -> 200);


9. Common Pitfalls
ConcurrentModificationException → modifying a collection while iterating with for-each. Use Iterator.remove().


NullPointerException in TreeSet/TreeMap if comparator doesn’t handle nulls.


Choosing wrong collection → performance issues.



10. Interview Questions
Difference between ArrayList and Vector?


Why are HashMap keys unique?


Difference between HashSet and TreeSet?


What happens if two objects have same hashCode() in a HashSet?


How to make a collection thread-safe?
