package com.thoughtworks.rectangle;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;

public class SquareTest {

    @Test
    void shouldReturnAreaWhenSideIsProvided() {
        Square square=new Square(2.0);
        double expectedArea=4.0;

        double actualArea=square.area();

        assertThat(expectedArea,closeTo(actualArea,0.001));
    }

    @Test
    void shouldReturnPerimeterWhenSideIsProvided() {
        Square square=new Square(2);
        double expectedPerimeter=8;

        double actualPerimeter=square.perimeter();

        assertThat(expectedPerimeter,closeTo(actualPerimeter,0.001));
    }
}
