package exam2;

public abstract class Barista {
    abstract Coffee makeCoffee();

}

class 공유 extends Barista {
    private String name = "공유";

    @Override
    Coffee makeCoffee() {
        Coffee coffee = new Coffee("아메리카노");
        return coffee;
    }

}
