package projecteuler;

public class LargestPalindrome {
    private static boolean isPalindrome(String number){
        for(int i=0,j=number.length()-1; i<=j; i++,j--){
            if(number.charAt(i) != number.charAt(j)){
                return false;
            }
        }
        return true;
    }
    private static String convertNumber(Integer number){
        return number.toString();
    }
    public static int largesPalindrome(){
        int number=0;
        String compareNumbers="";
        int largestNumber=0;
        for(int i=100;i<=999;i++){
            for(int j=100;j<=999;j++){
                number=i*j;
                compareNumbers=LargestPalindrome.convertNumber(number);
                if(LargestPalindrome.isPalindrome(compareNumbers)){
                    if(number>largestNumber){
                        largestNumber=number;
                    }
                }
            }
        }
        return largestNumber;
    }    
}
