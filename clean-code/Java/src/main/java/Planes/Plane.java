package Planes;

import java.util.Objects;

abstract public class Plane {
    String model;
    private int maxSpeed;
    private int maxFlightDistance;
    private int maxLoadCapacity;

    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getMaxFlightDistance() {
        return maxFlightDistance;
    }

    public int getMaxLoadCapacity() {
        return  maxLoadCapacity;
    }

    public Plane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.maxFlightDistance = maxFlightDistance;
        this.maxLoadCapacity = maxLoadCapacity;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "model='" + model +
                "\', maxSpeed=" + maxSpeed +
                ", maxFlightDistance=" + maxFlightDistance +
                ", maxLoadCapacity=" + maxLoadCapacity +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Plane plane = (Plane) obj;
        return  maxSpeed == plane.maxSpeed &&
                maxFlightDistance == plane.maxFlightDistance &&
                maxLoadCapacity == plane.maxLoadCapacity &&
                (model == plane.getModel() || (model != null && Objects.equals(model, plane.model)));
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
    }
}
