public class Motorbike extends Car {
    private static final String BIKE_ID_PREFIX = "bike_";

    public Motorbike(String id) {
        this.id = (BIKE_ID_PREFIX + id);
        length = super.getLength() * 0.5f;
    }

}
