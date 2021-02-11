import java.util.HashMap;
import java.util.Iterator;

public class PhoneBook {
    /*     Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.

           В этот телефонный справочник с помощью метода add() можно добавлять записи,
           а с помощью метода get() искать номер телефона по фамилии.

           Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
           тогда при запросе такой фамилии должны выводиться все телефоны.

           Желательно не добавлять лишний функционал (дополнительные поля (имя, отчество, адрес),
           взаимодействие с пользователем через консоль и т.д).

           Консоль использовать только для вывода результатов проверки телефонного справочника.*/
    static HashMap<String, String> phoneBook = new HashMap<> ();

    public static void main(String[] args) {
        phoneBook.put ("89091234567", "Petrov");
        add ("89991234567", "Ivanov");
        add ("89871234567", "Ivanov");
        add ("89871233567", "Petrov");
        get ("Petrov");

    }

    static void add(String phoneNumber, String name) {
        phoneBook.put (phoneNumber, name);
    }

        public static void get(String name) {
            Iterator it = phoneBook.entrySet().iterator();
            while (it.hasNext()) {
                HashMap.Entry pair = (HashMap.Entry)it.next();
                if(pair.getValue().equals (name)){
                    System.out.println("Found: " + pair.getKey() + " = " + pair.getValue());
                }
                it.remove();
            }
    }
}
