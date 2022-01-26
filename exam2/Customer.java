package exam2;

public abstract class Customer {
    abstract void order(Barista barista, Menu menu);

    {

    }
}

class 홍길동 extends Customer {
    private String name = "홍길동";

    public 홍길동(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void order(Barista barista, Menu menu) {
        String chooseMenu = menu.choose("아메리카노");
        Coffee coffee = barista.makeCoffee();
        System.out.println(getName() + "이" + coffee.getPrise(1500) + "원" + menu.choose("아메리카노" + "를 받았습니다."));
    }

}
