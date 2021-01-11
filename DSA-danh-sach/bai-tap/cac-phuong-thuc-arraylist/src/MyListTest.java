public class MyListTest {
    public static void main(String[] args) {
        MyList<String> myList = new MyList<>();
        myList.add("Tu");
        myList.add("dat");
        myList.add("thinh");
        myList.add("Thang beo");

        System.out.println(myList);
        System.out.println(myList.get(3));

        myList.remove(1);
        System.out.println(myList);

        System.out.println(myList.clone());

        System.out.println(myList.contains("dat"));
        System.out.println(myList.contains("Tu"));

        myList.clear();
        System.out.println(myList);

    }
}
