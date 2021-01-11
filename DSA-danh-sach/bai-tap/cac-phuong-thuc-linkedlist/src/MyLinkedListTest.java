public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(0, 1);
        myLinkedList.add(1, 2);
        myLinkedList.add(2, 2);
        myLinkedList.add(3, 2);
        myLinkedList.addFirst(2);
        myLinkedList.addLast(3);
        myLinkedList.remove(3);
        myLinkedList.clear();
        myLinkedList.printList();


        System.out.println(myLinkedList.get(0));
    }
}
