public class Main {
    public static void main(String[] args) {

        Box<Integer> numberBox = new Box<>(10);
        Box<String> stringBox = new Box<>("Java");

        System.out.println(numberBox.getValue());
        System.out.println(stringBox.getValue());
    }
}
