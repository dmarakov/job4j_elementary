package ru.job4j.ex;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactTest {
    @Test
    public void whenException() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> new Fact().calc(-1));
        assertThat(exception.getMessage()).isEqualTo("N could not be less then ");
    }

    @Test
    public void whenN3Rsl6() {
        int rsl = new Fact().calc(3);
        int expected = 6;
        assertThat(rsl).isEqualTo(expected);
    }
}