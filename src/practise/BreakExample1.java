package practise;

public class BreakExample1 {
    public static void main(String args[]){
        for(int i=1;i<=5;i++){
            for(int j=1;j<i;j++){
                if(i==2)
                    System.out.println("break terminates loop immediately");
            }
        }
    }
}
