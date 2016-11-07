package entities;

public class CurrentUser {

    private static User currentUser;

    public static void setCurrentUser(User user) {
        try {
            if (user == null) {
                throw new NullPointerException();
            }
            currentUser = user;
        } catch (NullPointerException e) {
            System.out.println("System can't register user, User is null");
        }
    }

    public static User getCurrentUser() {
        return currentUser;
    }
}
