package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class PolicyTest {

    private final Policy demo = new Policy();
    @Test
    void should_return_true_when_isDoubleDigit_given_22() {
        boolean isChar = demo.isDoubleDigit("22");
        assertThat(isChar).isTrue();
    }
    @Test
    void should_() {
    }
}