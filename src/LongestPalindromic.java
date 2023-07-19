import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.Scanner;

public class LongestPalindromic {
    static String longestPalindrome(String str) {
        int n = str.length();
        int index =0;
        int p=1;
        for(int i=0;i<n;i++){
            int left =i-1,right=i;
            while(left >= 0 && right<n && str.charAt(left)==str.charAt(right)){
                if(right -left +1 > p){
                    index=left;
                    p= right-left+1;
                }
                left--;
                right++;
            }
            left =i-1;
            right=i+1;
            while(left >= 0 && right<n && str.charAt(left)==str.charAt(right)){
                if(right -left +1 > p){
                    index=left;
                    p= right-left+1;
                }
                left--;
                right++;
            }

        }
        String ans="";
        for(int i=index;i<index+p;i++){
            ans+=str.charAt(i);
        }
        return ans;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        System.out.println(longestPalindrome(str));
    }
}
