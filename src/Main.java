import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("огонь");
        arrayList.add("небо");
        arrayList.add("море");
        arrayList.add("облака");
        arrayList.add("небо");
        arrayList.add("море");
        arrayList.add("облака");
        arrayList.add("дерево");
        arrayList.add("земля");
        arrayList.add("вечер");

        arrayInfo(arrayList);

        Map<String, List<String>> map = new HashMap<>();
        map.put("Ivanov", Arrays.asList("369459", "943349"));
        map.put("Petrov", Arrays.asList("463567", "5776463"));
        map.put("Sidorov", Arrays.asList("4567357", "456457"));

        System.out.println(map.get("Sidorov"));
        map.get("Ivanov").add("473457");

    }

    static void arrayInfo(ArrayList arrayList){
        ArrayList<String> a = new ArrayList<>(); //создаем копию, чтоб начальный массив остался неизменным
        a.addAll(0,arrayList);

        String s = "";
        for (int i = 0; i < a.size(); i++) {

            int count = Collections.frequency(a, a.get(i));
            System.out.println("Количество слов " + a.get(i) + " в массиве = " + count);
            if(count>=2){
                a.remove(a.get(i));
            } else{
                s += a.get(i)+" ";

            }

        }

        System.out.println("Уникальные слова в массиве: " + s);


    }
}