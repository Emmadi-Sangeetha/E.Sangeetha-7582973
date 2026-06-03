import java.util.List;

record Person(String name,int age){}

public class RecordExample {

    public static void main(String[] args) {

        List<Person> people =
                List.of(
                        new Person("Ram",21),
                        new Person("Sam",17),
                        new Person("John",25));

        people.stream()
                .filter(p -> p.age() >= 18)
                .forEach(System.out::println);
    }
}