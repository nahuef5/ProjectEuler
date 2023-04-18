package projecteuler;

public class ProjectEuler {

    public static void main(String[] args) {
       MultiplesOf3Or5 mul=new MultiplesOf3Or5();
       System.out.println("First problem: "+mul.getSuma());
       Fibonacci fibo=new Fibonacci();
       System.out.println("Second problem: "+fibo.getSum());
       LargestPrimeFactor large= new LargestPrimeFactor();
       System.out.println("Third problem: "+large.getMajor());
       
       System.out.println("Fourth problem: "+ LargestPalindrome.largesPalindrome());
    }
}
