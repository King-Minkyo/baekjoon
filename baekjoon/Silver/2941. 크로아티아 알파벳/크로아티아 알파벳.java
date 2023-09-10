import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String input = in.next();
        int size = input.length();
        String[] alpha = new String[]{"c=","c-","dz=","d-","lj","nj","s=","z="};
        int count = 0;

        for(int i=0;i<size;i++){
            int set =0;
            for(int j=0;j<8;j++) {
                if(i<size-1){
                if (j!=2&&((input.charAt(i) == alpha[j].charAt(0)) && (input.charAt(i+1) == alpha[j].charAt(1)))) {
                    count++;
                    i+=1;
                    set=1;
                    break;
                }
                else if(j==2&&(i<size-2)) {
                    if ((input.charAt(i) == alpha[j].charAt(0)) && (input.charAt(i + 1) == alpha[j].charAt(1) && (input.charAt(i + 2) == alpha[j].charAt(2)))) {
                        count++;
                        i += 2;
                        set = 1;
                        break;
                    }
                }
                }

                }
            if(set==0) {
                count++;
            }
            }

        System.out.print(count);
        in.close();
    }
}