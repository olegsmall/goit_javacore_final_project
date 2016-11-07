package entities;

import java.util.Random;

public class User {

    private long id;
    private String phoneNumber;
    private String fullName;
    private String email;

    public User(String fullName, String phoneNumber, String email) {
        this.id = new Random().nextLong();
        this.phoneNumber = phoneNumber;
        this.fullName = fullName;
        this.email = email;
    }

    public String getEmailWithName() {
        return fullName + " <" + email + ">";
    }

    public long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (phoneNumber != null ? !phoneNumber.equals(user.phoneNumber) : user.phoneNumber != null) return false;
        if (fullName != null ? !fullName.equals(user.fullName) : user.fullName != null) return false;
        return email != null ? email.equals(user.email) : user.email == null;

    }

    @Override
    public int hashCode() {
        int result = phoneNumber != null ? phoneNumber.hashCode() : 0;
        result = 31 * result + (fullName != null ? fullName.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "User " + fullName + "(" + email + ")";
    }
}
