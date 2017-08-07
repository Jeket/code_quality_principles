package ru.job4j.principle_002;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Tests for dispatch pattern.
 *
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class DispatchPatternTest {
    /**
     * Sent to unknown.
     */
    @Test
    public void whenSentToUnknown() {
        assertThat(
                new DispatchPattern().init().sent(
                        () -> Message.Type.UNKNOWN
                ), is(false)
        );
    }

    /**
     * Sent to email.
     */
    @Test
    public void whenSentToEmail() {
        assertThat(
                new DispatchPattern().init().sent(
                        () -> Message.Type.EMAIL
                ), is(true)
        );
    }
}