package JavaProgramsPractice;
import java.util.*;

public class CalculateRaisedToPower {

    public static void RaiseToPower (int x, int n){
        int result=1;
        for (int i=0; i<n;i++){
            result = result *x;
        }

        System.out.println(result);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        RaiseToPower(x,n);
    }
}
