package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ValidateInputTest {

    @Test
    public void whenInvalidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"one", "1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(1);
    }

    @Test
    public void whenCorrectMultipleInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"0", "1", "2", "3"}
        );
        ValidateInput input = new ValidateInput(out, in);
        for (int i = 0; i < 4; i++) {
            int selected = input.askInt("Enter menu:");
            assertThat(selected).isEqualTo(i);
        }
    }

    @Test
    public void whenСorrectInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(1);
    }

    @Test
    public void whenInputIsNegativeNumber() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"-3"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(-3);
    }
}