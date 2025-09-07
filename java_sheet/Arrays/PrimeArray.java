import java.util.*;
import java.util.stream.IntStream;

public class PrimeArray {
    public static void main(String[] args) {
        int[] primes = generatePrimes(10);
        System.out.println("Primes: " + Arrays.toString(primes));

        // Modern Twist: Using IntStream
        int[] primesStream = IntStream.iterate(2, i -> i + 1)
                .filter(PrimeArray::isPrime)
                .limit(10)
                .toArray();
        System.out.println("Primes (IntStream): " + Arrays.toString(primesStream));
    }

    static int[] generatePrimes(int n) {
        int[] result = new int[n];
        int count = 0, num = 2;
        while (count < n) {
            if (isPrime(num)) {
                result[count++] = num;
            }
            num++;
        }
        return result;
    }

    static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
