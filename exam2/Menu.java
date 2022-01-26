package exam2;

import java.util.List;

public class Menu {
    private List<MenuItem> items;

    public void MenuItem(List<MenuItem> items) {
        this.items = items;
    }

    public String choose(String name) {
        return name;
    }
}

class MenuItem {
    private String name;
    private int prise;

    public String getName() {
        return name;
    }

    public int getPrise() {
        return prise;
    }
}
