package com.sixtymeters.springcloudfunction;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class SpringCloudFunctionApplicationTests {

    private final SpringCloudFunctionApplication app = new SpringCloudFunctionApplication();

    @Test
    void text_reverseString_textIsReversed() {
        String output = app.reverseString().apply("hello world");
        assertThat(output).isEqualTo("dlrow olleh");
    }
}
