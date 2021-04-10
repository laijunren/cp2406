import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RoadTest {
    Road road = new Road("0", 1, 5, new Location(0, 0));

    @Test
    void getId() {
        assertEquals("road_0", road.getId());
    }

    @Test
    void getSpeedLimit() {
        assertEquals(1, road.getSpeedLimit());
    }

    @Test
    void getLength() {
        assertEquals(5, road.getLength());
    }

    @Test
    void getStartLocation() {
        Location expected = new Location(0,0);
        assertEquals(expected.toString(), road.getStartLocation().toString());
    }

    @Test
    void getEndLocation() {
        Location expected = new Location(5,0);
        assertEquals(expected.toString(), road.getEndLocation().toString());
    }

    @Test
    void getCars() {
        ArrayList<Car> expected = new ArrayList<>();
        assertEquals(expected, road.getCarsOnRoad());
    }

    @Test
    void getLights() {
        ArrayList<TrafficLight> expected = new ArrayList<>();
        assertEquals(expected, road.getLightsOnRoad());
    }

    @Test
    void getConnectedRoads() {
        ArrayList<Road> expected = new ArrayList<>();
        assertEquals(expected, road.getConnectedRoads());
    }
}