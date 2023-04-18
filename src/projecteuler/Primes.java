package projecteuler;

import java.util.*;

public class Primes {
    private boolean isPrime(int number){
        for(int i=2;i<=Math.sqrt(number);i++){
            if(number % i== 0){
                return false;
            }
        }
        return true;
    }
    public int[]primes10001(){
        int[]primes=new int[10001];
        int number=2;
        for(int i=0;i<primes.length;i++){
            while(!isPrime(number)){
                number++;
            }
            primes[i]=number;
            number++;
        }
        return primes;
    }
    public int getValue(int[]array){
        int value=array[array.length-1];
        return value;
    }
}
