package com.thoughtworks.rectangle;



import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

public class QuadrilateralTest {

   

    @Test
    void shouldReturnAreaOfRectangleWhenLengthAndBreadthIsProvided(){
        Quadrilateral rectangle=Quadrilateral.createRectangle(10,12);
        double expectedArea=120.0;

        double actualArea=rectangle.area();

        assertThat(expectedArea,is(closeTo(actualArea,0.001)));

    }


    @Test
    void shouldReturnPerimeterOfRectangleWhenLengthAndBreadthIsProvided(){
        Quadrilateral rectangle=Quadrilateral.createRectangle(10,12);
        double expectedPerimeter=44.0;

        double actualPerimeter=rectangle.perimeter();

        assertThat(expectedPerimeter,is(closeTo(actualPerimeter,0.001)));
    }

    @Test
    void shouldReturnAreaOfSquareWhenSideIsProvided(){
        Quadrilateral square=Quadrilateral.createSquare(2.0);
        double expectedArea=4.0;

        double actualArea=square.area();

        assertThat(expectedArea,is(closeTo(actualArea,0.001)));

    }


    @Test
    void shouldReturnPerimeterOfSquareWhenSideIsProvided(){
        Quadrilateral square=Quadrilateral.createSquare(2.0);
        double expectedPerimeter=8.0;

        double actualPerimeter=square.perimeter();

        assertThat(expectedPerimeter,is(closeTo(actualPerimeter,0.001)));
    }


}
