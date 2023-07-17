package com.thoughtworks.rectangle;



import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

public class RectangleTest {

   

    @Test
    void shouldReturnAreaWhenLengthAndBreadthIsProvided(){
        Rectangle rectangle=new Rectangle(10.0,12.0);
        double expectedArea=120.0;

        double actualArea=rectangle.area();

        assertThat(expectedArea,is(closeTo(actualArea,0.001)));

    }


    @Test
    void shouldReturnPerimeterWhenLengthAndBreadthIsProvided(){
        Rectangle rectangle=new Rectangle(10.0,12.0);
        double expectedPerimeter=44.0;

        double actualPerimeter=rectangle.perimeter();

        assertThat(expectedPerimeter,is(closeTo(actualPerimeter,0.001)));
    }

    
}
