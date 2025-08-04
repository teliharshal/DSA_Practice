import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        l1.add(12);
        l1.add(23);
        l1.add(34);
        l1.add(45);

        int start = 0;
        int end = l1.size()-1;

        while (start < end) {
            //swap Logic
            int temp = l1.get(start);
            l1.set(start, l1.get(end));
            l1.set(end, temp);

            start ++;
            end --;
        }

        System.out.println(l1);
    }
}
