package projecteuler;

import java.util.*;

public class Fibonacci {
    private List<Integer> fibonacci(int maxNum){
        List<Integer>succession=new ArrayList<>();
        int ant=0;
        int suc=1;
        int tot=0;
        while(tot<=maxNum){
            if(tot==0){
                succession.add(tot);
            }else{
                succession.add(ant);
            }
            tot=ant+suc;
            suc=ant;
            ant=tot;
        }
        return succession;
    }
    private int evenValued(List<Integer>fibonacci){
        int size=fibonacci.size();
        int sum=0;
        for(int i=0;i<size;i++){
            if(fibonacci.get(i)%2==0){
                sum+=fibonacci.get(i);
            }
        }
        return sum;
    }
    private List<Integer> fibonacci= fibonacci(4000000);
    private int sum=evenValued(fibonacci);
    public int getSum(){
        return this.sum;
    }
    
}
