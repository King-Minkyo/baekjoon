import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int prize = 0;
    if((a==b)&&(b==c)){
        prize = 10000+a*1000;
    }
    else if((a==b)||(a==c)){
        prize = 1000+a*100;
    }
    else if(b==c){
        prize = 1000+b*100;
    }
    else{
        int max=b;
        if(a>b) {
            max = a;
        }
        if(max<c){
            max=c;
        }
        prize = 100*max;
    }
        System.out.println(prize);

    }}