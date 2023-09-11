package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ItemSorterTest {

    @Test
    public void whenItemAscByName() {
        Item item1 = new Item("1");
        Item item2 = new Item("3");
        Item item3 = new Item("2");
        Item item4 = new Item("5");
        Item item5 = new Item("6");
        Item item6 = new Item("6");
        List<Item> items = Arrays.asList(item1, item2, item3, item4, item5, item6);
        items.sort(new ItemAscByName());
        List<Item> expected = Arrays.asList(item1, item3, item2, item4, item5, item6);
        assertThat(items).isEqualTo(expected);
    }

    @Test
    public void whenItemDescByName() {
        Item item1 = new Item("1");
        Item item2 = new Item("3");
        Item item3 = new Item("2");
        Item item4 = new Item("5");
        Item item5 = new Item("6");
        Item item6 = new Item("6");
        List<Item> items = Arrays.asList(item1, item2, item3, item4, item5, item6);
        Collections.sort(items, new ItemDescByName());
        items.sort(new ItemDescByName());
        List<Item> expected = Arrays.asList(item5, item6, item4, item2, item3, item1);
        assertThat(items).isEqualTo(expected);
    }
}

