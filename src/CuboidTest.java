import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CuboidTest {

    @Test
    void getVolumeOfCuboid() {

        //Given
        Cuboid cuboid1 = new Cuboid(5,6,7);
        Cuboid cuboid2 = new Cuboid(5,6,9);

        //When
        double volumeOfCuboid1 = cuboid1.getHeight() * cuboid1.getArea();
        double volumeOfCuboid2 = cuboid2.getHeight() * cuboid2.getArea();

        //Then
        assertEquals(210, volumeOfCuboid1);
        assertEquals(270, volumeOfCuboid2);

    }
}