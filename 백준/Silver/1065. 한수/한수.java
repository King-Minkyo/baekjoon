import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int input = in.nextInt();
        int result = 0;
        int a, b, c, d =0;
        for(int i=1;i<=input;i++){
            a = i/1000;
            b = (i-a*1000)/100;
            c = (i -a*1000-b*100)/10;
            d = (i -a*1000-b*100-c*10);
         //  System.out.printf("%d-%d = %d, %d - %d = %d\n",d,c,d-c,c,b,c-b);
            if(i<100){
                result++;
            }
            else if(i==1000) {

            }
            else if((d-c)==(c-b)){
                result++;
            }
        }
        System.out.println(result);

        }}