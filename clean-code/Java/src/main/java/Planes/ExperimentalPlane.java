package Planes;

import models.ClassificationLevel;
import models.ExperimentalTypes;

import java.util.Objects;

public class ExperimentalPlane extends Plane{

    private ExperimentalTypes type;
    private ClassificationLevel classificationLevel;

    public ExperimentalTypes getType() {
        return type;
    }

    public ExperimentalPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, ExperimentalTypes type, ClassificationLevel classificationLevel) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.type = type;
        this.classificationLevel = classificationLevel;
    }

    public ClassificationLevel getClassificationLevel(){
        return classificationLevel;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass() || !super.equals(obj)) {
            return false;
        }

        ExperimentalPlane plane = (ExperimentalPlane) obj;
        return type == plane.getType() &&
                classificationLevel == plane.getClassificationLevel();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type, classificationLevel);
    }
}
