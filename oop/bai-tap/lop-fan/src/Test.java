public class Test {
    public static void main(String[] args) {

        Fan fan1=new Fan(Fan.FAST,true,10.0,"Yellow");
        System.out.println(fan1);

        Fan fan2 = new Fan(Fan.MEDIUM, false, 5.0, "Blue");
        System.out.println(fan2);
    }
}
