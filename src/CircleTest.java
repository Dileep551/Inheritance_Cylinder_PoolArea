import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getAreaOfCircle() {
        //Given
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(3.75);

        //When
        double circleArea1 = circle1.getArea();
        double circleArea2 = circle2.getArea();

        //Then
        assertEquals(78.53981633974483, circleArea1);
        assertEquals(44.178646691106465, circleArea2);


    }
}