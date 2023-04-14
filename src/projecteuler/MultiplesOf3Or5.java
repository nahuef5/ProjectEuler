package projecteuler;

import java.util.*;

public class MultiplesOf3Or5 {
    private static List<Integer> multiplesOf3Or5(){
        List<Integer> allMultiples=new ArrayList<>();
        for(int i=0;i<=999;i++){
            if(i%3==0 || i%5==0){
                allMultiples.add(i);
            }    
        }
        return allMultiples;
    }
    private int tot(List<Integer>nums){
        int size=nums.size();
        int total=0;
        for(int i=0;i<size;i++){
            total+=nums.get(i);
        }
        return total;
        }
    private List<Integer> nums=multiplesOf3Or5();
    private int suma=tot(nums);
    public  int getSuma(){
        return this.suma;
    }
    
}
