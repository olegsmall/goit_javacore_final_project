package enums;

public enum Currency {
    UAH(980, "грн"), USD(840, "дол");

    private int code;
    private String name;

    Currency(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }


}



