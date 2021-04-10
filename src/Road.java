import java.util.ArrayList;
import java.util.Arrays;

public class Road {
    private String id;
    private int speedLimit;
    private int length;
    private Location startLocation;
    private Location endLocation;
    private ArrayList<Car> carsOnRoad = new ArrayList<>();
    private ArrayList<TrafficLight> lightsOnRoad = new ArrayList<>();
    private ArrayList<Road> connectedRoads = new ArrayList<>();
    private static final String ROAD_ID_PREFIX = "road_";

    public Road(String id, int speedLimit, int length, Location startLocation) {
        this.id = ROAD_ID_PREFIX + id;
        this.speedLimit = speedLimit;
        this.length = length;
        this.startLocation = startLocation;
        this.endLocation = new Location(this.length + this.startLocation.getX(), 0); //only works for horizontal roads;
    }

//    public void createCars(int carSpawns) {
//        for (int i = 0; i < carSpawns; i++)
//            carsOnRoad.add(new Car(Integer.toString(i), this));
//    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(int speedLimit) {
        this.speedLimit = speedLimit;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String printStartLocation() {
        return this.startLocation.toString();
    }

    public void setStartLocation(Location startLocation) {
        this.startLocation = startLocation;
        this.endLocation = new Location(this.length + this.startLocation.getX(), 0); //only works for horizontal roads;
    }

    public String printEndLocation() {
        return this.endLocation.toString();
    }

    public void printRoadInfo() {
//        System.out.printf("%s limit of:%dm/s is %dm long at location:%s to %s%n", this.getId(), this.getSpeedLimit(), this.getLength(), this.printStartLocation(), this.printEndLocation());
        System.out.print(this.toString());
    }

    public void setEndLocation(Location endLocation) {
        this.endLocation = endLocation;
    }

    public Location getStartLocation() {
        return startLocation;
    }

    public Location getEndLocation() {
        return endLocation;
    }

    public ArrayList<Car> getCarsOnRoad() {
        return carsOnRoad;
    }

    public void setCarsOnRoad(ArrayList<Car> carsOnRoad) {
        this.carsOnRoad = carsOnRoad;
    }

    public ArrayList<TrafficLight> getLightsOnRoad() {
        return lightsOnRoad;
    }

    public void setLightsOnRoad(ArrayList<TrafficLight> lightsOnRoad) {
        this.lightsOnRoad = lightsOnRoad;
    }

    public ArrayList<Road> getConnectedRoads() {
        return connectedRoads;
    }

    public void setConnectedRoads(ArrayList<Road> connectedRoads) {
        this.connectedRoads = connectedRoads;
    }

    @Override
    public String toString() {
        return String.format("%s limit of:%dm/s is %dm long at location:%s to %s%n",
                this.getId(), this.getSpeedLimit(), this.getLength(),
                this.printStartLocation(), this.printEndLocation());
    }
}
