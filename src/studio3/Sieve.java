import java.util.Scanner;
public class Sieve {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What number would you like to start the sieve at? ");
        int limit = scan.nextInt();
        int[] Array;
        Array = new int [limit];
        boolean[] Primes;
        Primes = new boolean [limit];

        for (int i=0; i < Primes.length; i++){
            Primes[i] = true;}

        for (int j = 2; j < Math.sqrt(limit); j++) {
            if (Primes[j] == true ){
                for (int k = j*j; k < limit; k++){
                    Primes[k] = false;
                }
            }
        }
        for (int l=0; l <= Primes.length; l++){
            if (Primes[l] == true ){
            System.out.println(l + 1);
            }
        }

            
        }
    }
