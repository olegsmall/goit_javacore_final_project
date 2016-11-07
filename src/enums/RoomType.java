package enums;

public enum RoomType {
    Standard("Стандарт"), Econom("Эконом"), Lux("Люкс");

    private String translate;

    RoomType(String translate) {
        this.translate = translate;
    }

    public String getTranslate() {
        return translate;
    }
}
