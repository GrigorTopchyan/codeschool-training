package homework6.task4.abstractTransport;

public abstract class Boat extends Transport {
  private   boolean hasEngine;

    public Boat(String color, double maxSpeed,boolean hasEngine) {
        super(color, maxSpeed);
        this.hasEngine=hasEngine;
    }

    public boolean isHasEngine() {
        return hasEngine;
    }

    public void setHasEngine(boolean hasEngine) {
        this.hasEngine = hasEngine;
    }
}
