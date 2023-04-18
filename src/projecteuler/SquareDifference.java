package projecteuler;

public class SquareDifference {
    private int bySquareOfElement(){
        int number=0;
        for(int i=1;i<=100;i++){
            number+=Math.pow(i, 2);
        }
        return number;
    }
    private int byTotalSquareSumElement(){
        int total=0;
        int squareTotal;
        for(int i=1;i<=100;i++){
            total+=i;
        }
        squareTotal=(int) Math.pow(total, 2);
        return squareTotal;
    }
    private int difference=byTotalSquareSumElement()-bySquareOfElement();
    public  int getDifference(){
        return difference;
    }
}
