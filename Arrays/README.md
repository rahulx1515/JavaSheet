Array Exercises – Inspired by Thinking in Java & Modern Java

Exercise 1: Array of Objects
Bruce Eckel emphasizes that arrays of objects store references, not objects themselves.
Task
Create a class Book with fields title and author.


Create an array of 3 Book references.


Initialize each element with a new Book object.


Print out the titles of all books.


💡 Edge Case: What happens if you try to print before initializing?

Exercise 2: Static vs Dynamic Initialization
Demonstrating array initialization styles.
Task
Create an integer array of size 5 using dynamic allocation and fill it with squares of indices.


Create another integer array using static initialization: {10, 20, 30, 40, 50}.


Print both arrays using Arrays.toString().


💡 Checkpoint: What’s the difference in memory allocation between the two approaches?

Exercise 3: Jagged Arrays
Bruce shows arrays of arrays where rows can have different lengths.
Task
Create a jagged array with 3 rows.


Row 1 → 2 elements


Row 2 → 4 elements


Row 3 → 3 elements


Fill it with sequential numbers.


Print it row by row.


💡 Challenge: Print in matrix form neatly formatted.

Exercise 4: Returning Arrays
Inspired by Bruce’s method-returning examples.
Task
Write a method generatePrimes(int n) that returns an array of the first n prime numbers.


Print the array in main().


💡 Modern Twist: Solve the same with IntStream (Java 8+).

Exercise 5: Copying Arrays
Illustrates that = copies references, not contents.
Task
Create an array {1, 2, 3}.


Assign it to another variable and modify the second array.


Print both arrays.


Use Arrays.copyOf() to make a real copy and show the difference.


💡 Checkpoint: Explain why shallow copy vs deep copy matters in object arrays.

Exercise 6: Sorting & Searching
Using java.util.Arrays.
Task
Create an array {7, 2, 9, 4, 1}.


Sort it using Arrays.sort().


Search for 4 using Arrays.binarySearch().


Print the sorted array and index of 4.


💡 Challenge: Try Arrays.parallelSort() and compare runtime on a large dataset.

Exercise 7: Multidimensional Array
Bruce explains how Java supports 2D arrays.
Task
Create a 3x3 2D array.


Fill it with multiplication table values (e.g., arr[i][j] = (i+1)*(j+1)).


Print the 2D array in matrix form.


💡 Challenge: Extend it to n x n matrix (user input).

Exercise 8: Array of Strings
Bruce often mixes primitives with objects.
Task
Create an array of String with 5 names.


Write a method findName(String[] arr, String name) that returns true if the name exists.


Test it with different names.


💡 Modern Twist: Use Arrays.stream(arr).anyMatch(name::equals)

Exercise 9: Reverse an Array
A classic array manipulation task.
Task
Create an array {1, 2, 3, 4, 5}.


Write a method to reverse it in-place.


Print original and reversed arrays.


💡 Challenge: Solve with recursion.

Exercise 10: Matrix Diagonal Sum
A slightly advanced exercise.
Task
Create a 3x3 matrix.


Fill it with numbers 1–9.


Find the sum of the primary diagonal.


Find the sum of the secondary diagonal.


💡 Checkpoint: What happens if matrix is not square?
