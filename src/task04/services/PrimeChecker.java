package task04.services;

public class PrimeChecker {
    public static boolean isPrime(int num){
        for(int i = 2; i <= Math.round(Math.sqrt(num)); i++){
            if (num % i == 0){
                return false;
            }
        }
        return num != 1;
    }
}
