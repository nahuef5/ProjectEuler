package projecteuler;

public class LargestPrimeFactor {
    private boolean isPrime(long number){
        for(int i=2; i<=Math.sqrt(number);i++){
            if(number%i==0){
                return false;
            }
        }return true;
    }
    private long majorPrime(long number){
        long largestNumber=1L;
        long i=1L;
        while(i*i<number){
            if(number%i==0&& i>largestNumber){
                if(isPrime(i)){
                    largestNumber=i;
                }
            }
            i++;
        }
        return largestNumber;
    }
    private final long num=600851475143L;
    private long major=majorPrime(num);
    public long getMajor(){
        return this.major;
    }
    
}
