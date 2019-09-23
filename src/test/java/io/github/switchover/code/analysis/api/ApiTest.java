package io.github.switchover.code.analysis.api;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ApiTest {
    private Api api;

    @Before
    public void setUp() throws Exception {
        api = new Api();
    }

    @Test
    public void hello() {
        // arrange
        // act
        String message = api.hello();

        // assert
        assertThat(message, is("Hello, world!"));
    }
}