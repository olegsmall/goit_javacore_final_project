package src.Enams;

/**
 * Created by Vlad on 30.10.2016.
 */
public enum RoomType {
    Standart("Стандарт"), Econom("Эконом"), Lux("Люкс");

    private String translate;

    RoomType(String translate) {
        this.translate = translate;
    }
    public String getTranslate() {
        return translate;
        }
}
