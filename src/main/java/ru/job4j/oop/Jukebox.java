package ru.job4j.oop;

public class Jukebox {

    private String songLetThemRunClumsily = "Пусть бегут неуклюже" + System.lineSeparator()
            + "Пешеходы по лужам," + System.lineSeparator()
            + "А вода — по асфальту рекой." + System.lineSeparator()
            + "И не ясно прохожим" + System.lineSeparator()
            + "В этот день непогожий," + System.lineSeparator()
            + "Почему я веселый такой.";
    private String songGoodNight = "Спят усталые игрушки, книжки спят," + System.lineSeparator()
            + "Одеяла и подушки ждут ребят;" + System.lineSeparator()
            + "Даже сказка спать ложится," + System.lineSeparator()
            + "Чтобы ночью нам присниться." + System.lineSeparator()
            + "Ты ей пожелай - баю-бай.";

    public void music(int position) {
        if (position == 1) {
            System.out.println(songLetThemRunClumsily);
        } else if (position == 2) {
            System.out.println(songGoodNight);
        } else {
            System.out.println("Песня не найдена");
        }
    }

    public static void main(String[] args) {
        Jukebox jukebox = new Jukebox();
        jukebox.music(1);
        jukebox.music(2);
        jukebox.music(3);
    }
}
