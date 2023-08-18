package ru.job4j.oop;

public class Jukebox {

    private final static String SONG_LET_THEM_RUN_CLUMSILY = "Пусть бегут неуклюже" + System.lineSeparator()
            + "Пешеходы по лужам," + System.lineSeparator()
            + "А вода — по асфальту рекой." + System.lineSeparator()
            + "И не ясно прохожим" + System.lineSeparator()
            + "В этот день непогожий," + System.lineSeparator()
            + "Почему я веселый такой.";
    private final static String SONG_GOOD_NIGHT = "Спят усталые игрушки, книжки спят," + System.lineSeparator()
            + "Одеяла и подушки ждут ребят;" + System.lineSeparator()
            + "Даже сказка спать ложится," + System.lineSeparator()
            + "Чтобы ночью нам присниться." + System.lineSeparator()
            + "Ты ей пожелай - баю-бай.";

    private final static String NOT_FOUND = "Песня не найдена";

    public void music(int position) {
        String result = switch (position) {
            case 1 -> SONG_LET_THEM_RUN_CLUMSILY;
            case 2 -> SONG_GOOD_NIGHT;
            default -> NOT_FOUND;
        };
        System.out.println(result);
    }

    public static void main(String[] args) {
        Jukebox jukebox = new Jukebox();
        jukebox.music(1);
        jukebox.music(2);
        jukebox.music(3);
    }
}
