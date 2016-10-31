/**
 * Created by Vlad on 30.10.2016.
 */
public enum Currency {
    UAH(980, "грн"), USD(840, "дол");

    private int code;
    private String name;

    Currency(int code) {
        this.code = code;
    }

    Currency(int i, String name) {
        this.name = name;
    }

}



