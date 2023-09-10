import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner in = new Scanner(System.in);

        int start = in.nextInt();
        int num=start;
//        if(num<10){
//            num*=10;
//        }
        int x=0;
        int y=0;
        int result=0;
        int count = 1;

        for(;;) {


            x = num / 10;
            y = num % 10;
            result = x + y;
           // System.out.printf("num = %d, x = %d, y = %d, result : %d\n",num, x, y, result);
            num = (result % 10) + y*10;
          //  System.out.println(num);

            if (start == num) {
                break;
            }
            count++;
        }

        System.out.println(count);


    }
}
