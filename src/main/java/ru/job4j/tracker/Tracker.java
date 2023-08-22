package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public Item[] findByName(String key) {
        int lengthArray = 0;
        for (int i = 0; i < ids; i++) {
            if (items[i] != null && key.equals(items[i].getName())) {
                lengthArray++;
            }
        }
        Item[] result = new Item[lengthArray];
        int k = lengthArray;
        for (int i = 0; i < ids; i++) {
            if (items[i] != null && key.equals(items[i].getName())) {
                result[lengthArray - k] = items[i];
                k--;
            }
        }
        return result;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, ids);
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        int number = indexOf(id);
        if (number == -1) {
            return false;
        }
        items[number] = item;
        items[number].setId(id);
        return true;
    }
}