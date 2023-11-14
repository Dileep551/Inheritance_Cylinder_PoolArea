import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CuboidTest {

    @Test
    void getVolumeOfCuboid() {

        //Given
        Cuboid cuboid1 = new Cuboid(5, 6, 7);
        Cuboid cuboid2 = new Cuboid(5, 6, 9);
        Cuboid cuboid3 = new Cuboid(5, 9, -1);

        //When
        double volumeOfCuboid1 = cuboid1.getVolume();
        double volumeOfCuboid2 = cuboid2.getVolume();
        double volumeOfCuboid3 = cuboid3.getVolume();

        //Then
        assertEquals(210, volumeOfCuboid1);
        assertEquals(270, volumeOfCuboid2);
        assertEquals(0, volumeOfCuboid3);

    }
}