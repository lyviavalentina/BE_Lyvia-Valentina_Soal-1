package memorialokasi;
import java.io.*;
import java.util.*;

public class MemoriAlokasi {
    public static int hitungAlokasi(int n) {
        for (int i = 0; i <= n / 3; i++) {
            for (int j = 0; j <= n / 5; j++) {
                for (int k = 0; k <= n / 7; k++) {
                    if (i * 3 + j * 5 + k * 7 == n) {
                        return i + j + k;
                    }
                }
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();  
            int result = hitungAlokasi(n);
 
            if (result == -1) {
                System.out.println("TIDAK");
            } else {
                System.out.println(result); 
            }
        }

        sc.close();
    }
}