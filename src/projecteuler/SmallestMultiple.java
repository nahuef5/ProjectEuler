package projecteuler;
public class SmallestMultiple {
    private static boolean isDivisible(long number){
        for(int i=2;i<=20;i++){
            if(number%i != 0){
                return false;
            }
        }
        return true;
    }
    public static int smallestNumber(){
        int number=1;
        while(!isDivisible(number)){
            number++;
        }
        return number;
    }
}
