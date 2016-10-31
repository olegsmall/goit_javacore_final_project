import com.sun.istack.internal.NotNull;

/**
 * Created by Sergiy on 10/30/16.
 */

public class User {


    private long id;
    private long phoneNumber;
    private String fullName;
    private String email;


    public User(long id, long phoneNumber, String fullName) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.fullName = fullName;
    }

    @NotNull
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @NotNull
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @NotNull
    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @NotNull
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

        if (id != user.id) return false;
        if (phoneNumber != user.phoneNumber) return false;
        return fullName.equals(user.fullName);

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (phoneNumber ^ (phoneNumber >>> 32));
        result = 31 * result + fullName.hashCode();
        return result;
    }

    public String getEmailWithName() {
        return fullName + " <" + email + ">";
    }

    @Override
    public String toString() {
        return "User(" + fullName + ")";
    }

}
