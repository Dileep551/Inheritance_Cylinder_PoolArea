import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {

    @Test
    void getVolumeOfCylinder() {

        //Given
        Cylinder cylinder1 = new Cylinder(5.55, 7.25);
        Cylinder cylinder2 = new Cylinder(5, 7.25);
        Cylinder cylinder3 = new Cylinder(5, -1);

        //When
        double cylinderArea1 = cylinder1.getHeight() * cylinder1.getArea();
        double cylinderArea2 = cylinder2.getHeight() * cylinder2.getArea();
        double cylinderArea3 = cylinder3.getHeight() * cylinder3.getArea();

        //Then
        assertEquals(701.574580913447, cylinderArea1);
        assertEquals(569.41366846315, cylinderArea2);
        assertEquals(0, cylinderArea3);



    }
}