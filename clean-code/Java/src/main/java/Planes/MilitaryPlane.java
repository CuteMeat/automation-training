package Planes;

import models.MilitaryType;

import java.util.Objects;

public class MilitaryPlane extends Plane{

    private MilitaryType type;

    public MilitaryType getType() {
        return type;
    }

    public MilitaryPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, MilitaryType type) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", type=" + type +
                        '}');
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass() || !super.equals(obj)) {
            return false;
        }

        MilitaryPlane plane = (MilitaryPlane) obj;
        return type == plane.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type);
    }
}
