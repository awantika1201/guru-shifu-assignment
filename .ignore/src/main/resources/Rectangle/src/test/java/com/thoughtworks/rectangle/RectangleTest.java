package com.thoughtworks.rectangle;



import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

public class RectangleTest {

   

    @Test
    void shouldReturnAreaWhenLengthAndBreadthIsProvided(){
        Rectangle rectangle=new Rectangle(10.0,12.0);
        double area=rectangle.area();
        assertThat(area,is(closeTo(120.0,0.001)));

    }

    
}
