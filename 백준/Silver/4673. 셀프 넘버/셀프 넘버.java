import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        for(int i=1;i<10000;i++){
            int self= 0;
            for(int j=1;j<i;j++) {
                int a = j/1000;
                int b = (j-a*1000)/100;
                int c = (j-a*1000-b*100)/10;
                int d = j-a*1000-b*100-c*10;
                if (i==(j+a+b+c+d)) {
                    self = 1;
                    break;
                }
            }
            if(self==0) {
                System.out.println(i);
            }



        }


        }}