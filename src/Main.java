//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Dog Buldog = new Dog("Hatiko");
//        Cat Shotlandskiy = new Cat("Garfild");

        Student[] students = {new Student("Rinat", 18, 44), new Student("Marsel", 33, 400) };
        Course PDD = new Course("Meta", "Ainazik", students);
        System.out.println(PDD.toString());
    }
}