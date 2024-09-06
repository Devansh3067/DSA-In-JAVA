package MathsInDSA;

public class AllPrimesTillN {
    public static void primeTillN(int n, boolean[] primes) {
        for (int i = 2; i * i <= n; i++) {
            if (!primes[i]) {//if primes[i] == false, ie primes[i] is prime
                for (int j = i * 2; j <= n; j = j + i) {
                    primes[j] = true; //setting all multiples as true, because multiples can't be prime.
                }
            }
        }
    }

    public static void main(String[] args) {
        int num = 40;
        boolean[] Primes = new boolean[num + 1];//Initially all are false...
        primeTillN(num, Primes);
        // * Basically if Primes[x] = false, then it is prime else it is not prime.
        for (int i = 2; i <= num; i++) {
            if (!Primes[i]) System.out.print(i + "\t");
        }
    }
}
