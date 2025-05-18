import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeMap<ArrayList<Integer>, Integer> map = new TreeMap<>();
        for (int  i = 0; i < n ; i++){
            ArrayList<Integer> list = new ArrayList<>();
            list.add(sc.nextInt());
            list.add(sc.nextInt());
            if (map.containsKey(list)){
                map.put(list, map.get(list)+1);
            }
            else
                map.put(list,1);
        }
        for (Map.Entry<ArrayList<Integer>,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey().get(0)+ " " + entry.getKey().get(1) + " " + entry.getValue());
        }

    }
}
