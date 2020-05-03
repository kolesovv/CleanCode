package Planes;

import models.MilitaryType;
import java.util.Objects;

public class MilitaryPlane extends Plane{
    private MilitaryType type;

    public MilitaryPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, MilitaryType type) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.type = type;
    }

    public MilitaryType getType() {
        return type;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof MilitaryPlane)) return false;
        if (!super.equals(obj)) return false;
        MilitaryPlane that = (MilitaryPlane) obj;
        return type == that.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type);
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", militaryType=" + type +
                        '}');
    }
}
