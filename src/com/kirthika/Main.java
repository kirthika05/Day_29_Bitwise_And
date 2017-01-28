package com.kirthika;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for (int i = 1; i <= N; i++) {
            int andMax =0;
            int n=in.nextInt();
            int max=in.nextInt();

            for(int j=1;j<=n;j++){
                for(int k=j+1;k<=n;k++){
                    int t = j&k;
                    if(t<max){
                        andMax = (andMax>t)?andMax:t;
                    }
                }
            }
            System.out.println(andMax);
        }
    }
}
