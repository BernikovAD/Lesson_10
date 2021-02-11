import java.util.*;


public class Main {
//    Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
//    Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
//    Посчитать, сколько раз встречается каждое слово.
    public static void main(String[] args) {
        String[] strArr = {
                "hello",
                "car",
                "developer",
                "junior",
                "java",
                "home",
                "android",
                "hello",
                "java",
                "developer",
                "java",
                "android",
                "java",
                "hello"
        };
        /*java=4;
        * hello= 3;
        * developer,android=2;
        * car,home,junior=1;*/
        ArrayList<String>  arrayList = new ArrayList<> ();
        Collections.addAll(arrayList,strArr);
        System.out.println (arrayList);
        Set<String> searchForOriginal = new HashSet<String>(arrayList);
        System.out.println (searchForOriginal);
        Collections.sort(arrayList);
        int count =1;
        for (int i = 0; i < arrayList.size (); i++) {
                if(arrayList.get(i).equals (arrayList.get(i+1))){
                    count ++;
                }
                else{
                    System.out.println (arrayList.get(i) + " = " + count );
                    count = 1;
                }
        }

    }




/* duplicate search*/
}
