import java.util.*;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap< Integer, Integer> map = new TreeMap<>();
        int n = sc.nextInt();
        for (int i = 0 ; i < n; i++){
            int x = sc.nextInt();
            if (map.containsKey(x)){
                map.put(x , map.get(x) + 1);
            }
            else
                map.put(x,1);
        }
        ArrayList<Map.Entry<Integer,Integer>> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if (entry.getValue() % 2 == 0){
                System.out.println(entry.getKey() + " " + entry.getValue());
            }


        }
    }
}
