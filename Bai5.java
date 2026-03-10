interface UserActions {
    default void logActivity(String activity) {
        System.out.println("User log: " + activity);
    }
}

interface AdminActions {
    default void logActivity(String activity) {
        System.out.println("Admin log: " + activity);
    }
}

class SuperAdmin implements UserActions, AdminActions {
    @Override
    public void logActivity(String activity) {
        System.out.println("SuperAdmin log: " + activity);
    }
}

public class Bai5 {
    public static void main(String[] args) {
        SuperAdmin superadmin = new SuperAdmin();

        superadmin.logActivity("Delete user");
    }
}