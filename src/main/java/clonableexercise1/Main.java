package clonableexercise1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Item item1 = new Item(20,10.0,'S',new ItemClone(5));
        Item item2 = new Item(30,15.0,'L',new ItemClone(10));
        Item item3 = new Item(40,20.0,'X',new ItemClone(15));

        List<Item> originalList = new ArrayList<>();

        originalList.add(item1);
        originalList.add(item2);
        originalList.add(item3);

        showOriginal(originalList, "First original");

        List<Item> listWithCopies = new ArrayList<>();

        for (Item anOriginalList : originalList) {
          listWithCopies.add(new Item(anOriginalList));
        }

        item1.setHeight(100);
        item1.setPrice(2000.0);

        String test="";
    }


    private static void showOriginal(List<Item> originalList, String s) {
        System.out.println(s);
        originalList.forEach(System.out::println);
    }


}
