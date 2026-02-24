import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
public class codeforces {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      While(t-->0){
        Map<Integer,Integer>mp =new HashMap<>();
        int n=sc.nextInt();
                long pairs = 0;
                for(int i=0;i<n;i++){
                    int val=sc.nextInt();
                    int key =(val - i);
                    mp.put(key , mp.getOrDefault(key,0) + 1);
                    pairs +=(mp.get(key) - 1);
                }
                System.out.println(pairs);
      }
}
}
