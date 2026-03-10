import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

class User2 {
    private String username;

    public User2() {
        this.username = "guest";
    }

    public String getUsername() {
        return username;
    }
}

public class Bai4 {
    public static void main(String[] args) {
        List<User2> users = Arrays.asList(new User2(), new User2());

        users.stream().map(User2::getUsername).forEach(System.out::println);

        Consumer<String> printer = System.out::println;
        printer.accept("Hello");

        Supplier<User2> createUser = User2::new;
        User2 u = createUser.get();
    }
}