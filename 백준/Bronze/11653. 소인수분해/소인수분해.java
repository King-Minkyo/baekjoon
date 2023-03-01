import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int number = in.nextInt();

        while(true){

            for(int i = 2; i<=number;i++){
                if(number%i==0){
                    System.out.println(i);
                    number/=i;

                    break;
                }

            }
        if(number==1)
            break;

        }


    }
}