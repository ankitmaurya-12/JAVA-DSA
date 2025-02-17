import java.util.*;

//public class main {
public class ankita {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
//        TreeMap<String, Integer> map = new HashMap<>();

        map.put("Ankit",99);
        map.put("Kunal", 85);
        map.put("King", 88);

//        System.out.println(map.get( "Ankit"));
//        System.out.println(map.getOrDefault("Mj",98));
        System.out.println(map.containsKey("Kunnal"));



        HashSet<Integer> set = new HashSet<Integer>();
        set.add(75);
        set.add(854);
        set.add(748);
        set.add(75);              //it will be overwrite
        set.add(73);
        set.add(75);
        set.add(70);

        System.out.println(set);
    }

}

