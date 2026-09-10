public class Main {
    public static void main(String[] args) {

        try {
            Student student =
                    new Student(1, "An", 15);

        } catch (InvalidGpaException e) {
            System.out.println(e.getMessage());
        }
    }
}
