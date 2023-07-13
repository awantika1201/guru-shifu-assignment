package com.thoughtworks.rectangle;



import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

public class rectangleTest {

   

    @Test
    void shouldReturnAreaOfRectangle(){
        Rectangle rectangle=new Rectangle(10,12);
        int area=rectangle.calculateArea();
        assertThat(area,is(equalTo(120)));

    }

    
}
