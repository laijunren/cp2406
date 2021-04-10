public class Bus extends Car {
    private static final String BUS_ID_PREFIX = "bus_";

    public Bus(String id) {
        this.id = (BUS_ID_PREFIX + id);
        length = super.getLength() * 3;
    }

}
