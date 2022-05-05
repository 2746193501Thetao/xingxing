import java.util.Arrays;
import java.util.Scanner;

public class Findsame {
    public static void main(String[] args) {
        for (int i = 0; i <1000 ; i++) {
            if (i<11){
                continue;
            }
            int a=  i%10;  //得出个位
            int b = i/10%10;
            int c = i/100%10;

            if (a==b || b==c || a==c && c!=0){
                System.out.println(i);
            }
          /*  System.out.println("个位"+a);
            System.out.println("十位"+b);
            System.out.println("百位"+c);*/

        }




    }

}
