package OOP_Home_Work_3;

import java.util.LinkedList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Notebook notebook1 = new Notebook("Toshiba", "16Gb",
                "2000Mb", "Linux", "Black");
        Notebook notebook2 = new Notebook("Dell", "32Gb",
                "500Mb", "Windows", "Black");
        Notebook notebook3 = new Notebook("Samsung", "16Gb",
                "2000Mb", "Linux", "Black");
        Integer number = 98;
        String cat = "Котофей Иванович";
        String unknownObject = "Какой то объект";

        ListElements<Object> someList = new ListElements<>();
        someList.addElement(number);
        someList.addElement(cat);
        someList.addElement(unknownObject);
        someList.addElement(notebook1);
        someList.addElement(notebook2);
        someList.addElement(notebook3);


        System.out.println("Связный список из различных объектов:");
        for (Object obj : someList) {
            System.out.println(obj);
        }
        System.out.println();
        System.out.printf("Количество объектов в списке: %d\n", someList.size());
    }
}

