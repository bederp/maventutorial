package beder;

import org.junit.Test;

import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.*;

public class HelloWorldTest {

    @Test
    public void shouldSayHelloCodersSchool() {
        HelloWorld helloWorld = new HelloWorld();

        assertThat(helloWorld.greet(), containsString("Coders"));
    }
}