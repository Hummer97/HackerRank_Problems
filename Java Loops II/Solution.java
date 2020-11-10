import java.util.*;
import java.io.*;
import java.lang.*;
class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int s0=a;
            for(int j=0;j<n;j++)
            {
                s0 += Math.pow(2,j)*b;
                System.out.print(s0+" ");
            }
            System.out.println("");
        }
        in.close();
    }
}
