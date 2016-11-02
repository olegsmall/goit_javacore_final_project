import com.sun.istack.internal.NotNull;

import java.util.Random;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Sergiy on 10/30/16.
 */

public class User {

    private String id = UUID.randomUUID().toString();
    private long phoneNumber;
    private String fullName;
    private String email;


    public User(long phoneNumber, String fullName, String email) {
        this.phoneNumber = phoneNumber;
        this.fullName = fullName;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

        if (phoneNumber != user.phoneNumber) return false;
        if (!id.equals(user.id)) return false;
        if (!fullName.equals(user.fullName)) return false;
        return email.equals(user.email);

    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + (int) (phoneNumber ^ (phoneNumber >>> 32));
        result = 31 * result + fullName.hashCode();
        result = 31 * result + email.hashCode();
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
