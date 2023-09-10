import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int number = in.nextInt();
//        if(number>100)
//            in.close();

        String[] word = new String[number];

        for(int i=0;i<number;i++){
            word[i] = in.next();
        }
        int result = 0;
        for(int i=0;i<number;i++){
            int yes=0;
            for(int j=0;j<word[i].length();j++) {
                for (int z = j+1; z < word[i].length(); z++) {
                    if(z==j+1){
                        if(word[i].charAt(j) == word[i].charAt(z)){
                            break;
                        }
                    }
                    else if(word[i].charAt(j) == word[i].charAt(z)){
                        yes=1;
                        break;
                    }


                }
            }
            if(yes==0)
                result++;
            }
        System.out.println(result);
        }
    }