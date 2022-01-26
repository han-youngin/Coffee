package exam2;

public class Coffee extends MenuItem {
    private String name;
    private int prise;

    public Coffee(String name) {
        this.name = name;
    }

    public String getName(String name) {
        return "아메리카노";

    }

    public int getPrise(int prise) {
        return 1500;
    }
}
