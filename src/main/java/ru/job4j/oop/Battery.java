package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public String about() {
        return "My charge: " + load + "%";
    }

    public void exchange(Battery another) {
    int sum = another.load + this.load;
    another.load =  sum >= 100 ? 100 : sum;
    this.load = sum - another.load;
    }

    public static void main(String[] args) {
        Battery first = new Battery(80);
        Battery second = new Battery(40);
        System.out.println("First." + first.about());
        System.out.println("Second." + second.about());
        first.exchange(second);
    }
}