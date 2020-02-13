package homework6.task4.iveicle;

/**
 * Create interface with name Vehicle. Vehicle should have following contract:
 *               stop, start, move(double distance)
 */
public interface IVehicle {
    void start();
    void move(double distance);
    void stop();
}
