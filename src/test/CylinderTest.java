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
        double cylinderVolume1 = cylinder1.getVolume();
        double cylinderVolume2 = cylinder2.getVolume();
        double cylinderVolume3 = cylinder3.getVolume();

        //Then
        assertEquals(701.574580913447, cylinderVolume1);
        assertEquals(569.41366846315, cylinderVolume2);
        assertEquals(0, cylinderVolume3);


    }
}