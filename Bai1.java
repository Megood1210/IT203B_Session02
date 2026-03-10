import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Consumer;
import java.util.function.Supplier;

class User {
    String username;
    String role;

    public User(String username, String role) {
        this.username = username;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public String getRole() {
        return role;
    }
}

public class Bai1 {
    public static void main(String[] args) {
        User user = new User("vinh", "ADMIN");

        Predicate<User> isAdmin = u -> u.getRole().equals("ADMIN");
        System.out.println("Is Admin: " + isAdmin.test(user));

        Function<User, String> getUsername = u -> u.getUsername();
        System.out.println("Username: " + getUsername.apply(user));

        Consumer<User> printUser = u -> System.out.println("User: " + u.getUsername() + " - Role: " + u.getRole());
        printUser.accept(user);

        Supplier<User> defaultUser = () -> new User("guest", "USER");
        User newUser = defaultUser.get();
        System.out.println("New User: " + newUser.getUsername() + " - Role: " + newUser.getRole());
    }
}