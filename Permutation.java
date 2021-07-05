package algoprograms;

import java.util.Scanner;

public class Permutation {

     public static void main(String[] args) {    //main 
        System.out.println("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        permute(str, 0, str.length());
    }
    
    
    private static void permute(String str, int start, int last) {   //method for calculate permutation string
        if(start==last-1){
            System.out.println(str);
        }else {
            for (int i=start;i<last;i++){
                str = Stringswap(str,start,i);
                permute(str,start+1,last);
                str = Stringswap(str,start,i);
            }
        }
    }
    	
        public static String Stringswap(String string, int i, int j) {      //method for swap position 
        	char temp;
            char[] charArray = string.toCharArray();             // i and j for changing position
            temp = charArray[i] ;
            charArray[i] = charArray[j];
            charArray[j] = temp;
            return String.valueOf(charArray);
    }
}

