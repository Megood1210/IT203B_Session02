interface Authenticatable {
    String getPassword();

    default boolean isAuthenticated() {
        return getPassword() != null && !getPassword().isEmpty();
    }

    static String encrypt(String rawPassword) {
        return "ENC_" + rawPassword;
    }
}

class User1 implements Authenticatable {
    private String password;

    public User1(String password) {
        this.password = password;
    }

    @Override
    public String getPassword() {
        return password;
    }
}

public class Bai3 {
    public static void main(String[] args) {
        User1 u = new User1("123456");

        System.out.println("Authenticated: " + u.isAuthenticated());

        String encrypted = Authenticatable.encrypt("123456");
        System.out.println("Encrypted password: " + encrypted);
    }
}