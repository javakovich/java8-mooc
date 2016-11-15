import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by slazakovich on 11/9/2016.
 */
public class Test {

    public static void main(String[] args) {
        List<String> listA = new ArrayList<String>();
        listA.add("aaa");
        listA.add("bbb");
        listA.add("ccc");
        List<String> listB = new ArrayList<String>();
        listB.add("xxx");
        listB.add("yyy");
        listB.add("zzz");

        for (String a : listA) {
            for (String b : listB) {
                System.out.println(a + b);
            }
        }

    }
}
