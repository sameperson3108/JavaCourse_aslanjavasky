package mod9_algorithms.lesson3_collection_framework.L3_1_Collection;


public class Main {
    static void main() {
        Collection ourCollection = new Collection();
        ourCollection.add(10);
        ourCollection.add(4);
        ourCollection.add(15);
        ourCollection.add(45);
        ourCollection.add(145);
        System.out.println(ourCollection.size());
        System.out.println(ourCollection.isEmpty());
        System.out.println(ourCollection);

        ourCollection.remove(15);
        System.out.println(ourCollection.size());
        System.out.println(ourCollection);

        System.out.println(ourCollection.contains(4));
        System.out.println(ourCollection.contains(545));

        ourCollection.removeIf(e -> (Integer) e % 2 != 0);
        System.out.println(ourCollection);
    }
}
