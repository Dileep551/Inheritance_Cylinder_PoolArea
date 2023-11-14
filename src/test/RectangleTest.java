import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void getAreaOfRectangle() {

        //Given
        Rectangle rectangle1 = new Rectangle(5, 6);
        Rectangle rectangle2 = new Rectangle(6, 7);
        Rectangle rectangle3 = new Rectangle(0, 0);

        //When
        double rectangleArea1 = rectangle1.getArea();
        double rectangleArea2 = rectangle2.getArea();
        double rectangleArea3 = rectangle3.getArea();

        //Then
        assertEquals(30, rectangleArea1);
        assertEquals(42, rectangleArea2);
        assertEquals(0, rectangleArea3);

    }
}