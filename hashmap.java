import java.util.*;
// occurance count is imp
public class hashmap{
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    HashMap<Integer,Integer> mp= new HashMap<>();
   int n=sc.nextInt();
   for(int i=0;i<n;i++){
   int val=sc.nextInt();
    if(mp.containsKey(val)){
    mp.put(val,mp.get(val) + 1);
   }
else{
    mp.put(val , 1);
}
}
   for(Integer key : mp.keySet()){
    System.out.println(key + " " + mp.get(key));
      }
    }
  }