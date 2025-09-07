📝 Exercises on ArrayList in Java

Exercise 1: Basic Usage
Create an ArrayList<String> to store names.
Add 5 names.


Print them using a standard for loop, an enhanced for loop, and an Iterator.


Replace one name using set(index, value).


💡 Checkpoint: What happens if you try to access an invalid index?

Exercise 2: Dynamic Growth vs Arrays
Bruce compares ArrayList to arrays.
Create a fixed-size array of 3 integers.


Create an ArrayList<Integer> and add 10 integers.


Print both and explain the difference in flexibility.



Exercise 3: Removing Elements
Create an ArrayList<String> with ["red", "green", "blue", "yellow"].


Remove "blue" by value.


Remove the element at index 1.


Print after each operation.


💡 Checkpoint: What happens if you remove an element that doesn’t exist?

Exercise 4: Search & Containment
Create an ArrayList<Integer> with numbers 1–10.


Use contains(5) to check existence.


Use indexOf(7) and lastIndexOf(7) (try duplicates).



Exercise 5: Conversion between Array & ArrayList
Convert an array {"A", "B", "C"} into an ArrayList<String>.


Convert the ArrayList back into an array.


💡 Modern Twist: Use Arrays.asList() and list.toArray(new String[0]).

Exercise 6: Sorting
Create an ArrayList<Integer> with unsorted numbers.


Sort ascending using Collections.sort().


Sort descending using Collections.reverseOrder().


💡 Modern Twist: Use list.sort(Comparator.naturalOrder()).

Exercise 7: Custom Objects
Inspired by Bruce’s Holding Your Objects.
Create a class Student(name, rollNo).


Create an ArrayList<Student>.


Add 5 students and print them.


Override toString() in Student for pretty printing.


💡 Checkpoint: What happens if you print the list without toString() override?

Exercise 8: Iterators & Modification
Create an ArrayList<String> with colors.


Use an Iterator to remove "green".


Try removing "blue" using a for-each loop (what exception occurs?).


💡 Trick: This demonstrates ConcurrentModificationException.

Exercise 9: Nested ArrayLists (Matrix)
Create an ArrayList<ArrayList<Integer>> to represent a 2D matrix.


Add rows [1,2,3], [4,5,6], [7,8,9].


Print as a matrix.


💡 Challenge: Write a method to transpose this matrix.

Exercise 10: Performance Experiment
Bruce discusses performance in collections.
Create an ArrayList<Integer>.


Add 1,000,000 elements. Measure time.


Insert 10,000 elements at index 0. Measure time.


Compare with LinkedList.


💡 Learning: Understand performance differences.
