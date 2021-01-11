public class GenericStackClient {
    public static void stackOfStrings(){
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("five");
        stack.push("four");
        stack.push("three");
        stack.push("two");
        stack.push("one");
        System.out.println("1.1 kich thuoc cua ngan xep sau khi push: " + stack.size());
        System.out.println("1.2 pop phan tu tu stack: ");
        while (!stack.isEmpty()){
            System.out.printf(" %s", stack.pop());
        }
        System.out.println("\n1.3 kich thuoc cua ngan xep sau pop: " + stack.size());
    }

    public static void stackOfIntegers(){
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("2.1 kich thuoc cua ngan xep sau khi push: " + stack.size());
        System.out.println("2.2 pop phan tu tu stack: ");
        while (!stack.isEmpty()){
            System.out.printf(" %s", stack.pop());
        }
        System.out.println("\n2.3 kich thuoc cua ngan xep sau pop: " + stack.size());
    }

    public static void main(String[] args) {
        System.out.println("1. Stack of integers");
        stackOfIntegers();
        System.out.println("\n2. Stack of Strings");
        stackOfStrings();
    }
}
