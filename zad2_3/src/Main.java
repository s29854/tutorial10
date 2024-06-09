import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Item> container = new ArrayList<>();
        Item item1 = new Item("#1", "item1");
        Item item2 = new Item("#2", "item2");
        Item item3 = new Item("#3", "item3");
        Item item4 = new Item("#4", "item4");
        Item item5 = new Item("#5", "item5");

        container.add(item1);
        container.add(item2);
        container.add(item3);
        container.add(item4);
        container.add(item5);

        for(int i = 0; i<container.size(); i++){
            container.get(i).show();
        }
        HashMap<String, String> containerMap = new HashMap<>();
        for(Item item : container){
            containerMap.put(item.getId(), item.getName());
        }
        for(Map.Entry<String, String> itemEntry : containerMap.entrySet()){
            System.out.println("ID: " + itemEntry.getKey() + " Name: "+ itemEntry.getValue());
        }
        Item item6 = new Item("#6", "item6"); Item item7 = new Item("#7", "item7"); Item item8 = new Item("#8", "item8");
        Item item9 = new Item("#9", "item9"); Item item10 = new Item("#10", "item10");
        Item item11 = new Item("#11", "item11"); Item item12 = new Item("#12", "item12");
        Item item13 = new Item("#13", "item13"); Item item14 = new Item("#14", "item14");
        Item item15 = new Item("#15", "item15");
        container.add(item6); container.add(item7); container.add(item8); container.add(item9); container.add(item10);
        container.add(item11); container.add(item12); container.add(item13); container.add(item14); container.add(item15);

        List<Item> firstFiveItems = container.subList(0, 5);
        HashSet<Item> itemHashSet = new HashSet<>(firstFiveItems);

        for(Item item : itemHashSet){
            item.show();
        }
    }
}