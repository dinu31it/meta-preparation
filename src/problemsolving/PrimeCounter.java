package metapreparation.lightArrayIssues;

/**
 * Count number of primes in an array
 */
public class PrimeCounter {

    public static int countPrimesInArray(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (isPrime(num)) {
                count++;
            }
        }
        return count;
    }
    // Check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 5, 6, 7, 10, 11, 13, 15, 17};
        System.out.println("Number of primes: " + countPrimesInArray(nums));  // Output: 7
    }
}
