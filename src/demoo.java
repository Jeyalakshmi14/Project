import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class demoo {
    public static void main(String[] args){
        HashSet<Integer> hst= new HashSet<>();
        hst.add(5);
        hst .add(3);
        hst.add(7);
        hst.add(1);
        Iterator<Integer>itr =   hst.iterator();
        for (Integer i : hst){
            System.out.println(i);
        }

    }
}
