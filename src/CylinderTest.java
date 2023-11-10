import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {

    @Test
    void getVolumeOfCylinder() {

        //Given
        Cylinder cylinder1 = new Cylinder(5.55, 7.25);
        Cylinder cylinder2 = new Cylinder(5, 7.25);

        //When
        double cylindeArea1 = cylinder1.getHeight() * cylinder1.getArea();
        double cylindeArea2 = cylinder2.getHeight() * cylinder2.getArea();

        //Then
        assertEquals(701.574580913447, cylindeArea1);
        assertEquals(569.41366846315, cylindeArea2);



    }
}