import java.util.*;
public class hashset {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Integer a[]={1,2,3,4,5};
        Integer b[]={4,5,6,7,8};
        HashSet<Integer> s1= new HashSet<>(Arrays.asList(a));
         HashSet<Integer> s2= new HashSet<>(Arrays.asList(b));
        HashSet<Integer> s3 = (HashSet)s1.clone();
        HashSet<Integer> s4 = (HashSet)s2.clone();
         s1.addAll(s2); //s1-union
         s3.retainAll(s4);// s3-intersection
         s1.removeAll(s3);//Union-intersection
          System.out.println(" s1 =" + s1);
          System.out.println(" s3 =" + s3);
    }
}