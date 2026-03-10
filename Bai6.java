@FunctionalInterface
interface UserProcessor {
    String process(User3 u);
}

class User3 {
    private String username;

    public User3(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}

class UserUtils {
    public static String convertToUpperCase(User3 u) {
        return u.getUsername().toUpperCase();
    }

}

public class Bai6 {
    public static void main(String[] args) {
        UserProcessor processor = UserUtils::convertToUpperCase;

        User3 user = new User3("vinh");

        String result = processor.process(user);

        System.out.println(result);
    }
}