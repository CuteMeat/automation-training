import Planes.ExperimentalPlane;
import models.MilitaryType;
import Planes.MilitaryPlane;
import Planes.PassengerPlane;
import Planes.Plane;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Airport {
    private List<? extends Plane> planes;

    public Airport(List<? extends Plane> planes) {
        this.planes = planes;
    }

    public List<? extends Plane> getPlanes() {
        return planes;
    }

    //region PassengerPlanes
    public List<PassengerPlane> getPassengerPlane() {
        List<PassengerPlane> passengerPlanes = new ArrayList<>();
        for (Plane plane : planes) {
            if (plane instanceof PassengerPlane) {
                passengerPlanes.add((PassengerPlane) plane);
            }
        }
        return passengerPlanes;
    }

    public PassengerPlane getPassengerPlaneWithMaxPassengersCapacity() {
        List<PassengerPlane> passengerPlanes = getPassengerPlane();
        PassengerPlane planeWithMaxCapacity = passengerPlanes.get(0);
        PassengerPlane plane;
        for (int i = 0; i < passengerPlanes.size(); i++) {
            plane = passengerPlanes.get(i);
            if (plane.getPassengersCapacity() > planeWithMaxCapacity.getPassengersCapacity()) {
                planeWithMaxCapacity = plane;
            }
        }
        return planeWithMaxCapacity;
    }
    //endregion PassengerPlanes

    //region MilitaryPlanes
    public List<MilitaryPlane> getMilitaryPlanes() {
        List<MilitaryPlane> militaryPlanes = new ArrayList<>();
        for (Plane plane : planes) {
            if (plane instanceof MilitaryPlane) {
                militaryPlanes.add((MilitaryPlane) plane);
            }
        }
        return militaryPlanes;
    }

    public List<MilitaryPlane> getTransportMilitaryPlanes() {
        List<MilitaryPlane> transportMilitaryPlanes = new ArrayList<>();
        List<MilitaryPlane> militaryPlanes = getMilitaryPlanes();
        MilitaryPlane plane;
        for (int i = 0; i < militaryPlanes.size(); i++) {
            plane = militaryPlanes.get(i);
            if (plane.getType() == MilitaryType.TRANSPORT) {
                transportMilitaryPlanes.add(plane);
            }
        }
        return transportMilitaryPlanes;
    }

    public List<MilitaryPlane> getBomberMilitaryPlanes() {
        List<MilitaryPlane> bomberMilitaryPlanes = new ArrayList<>();
        List<MilitaryPlane> militaryPlanes = getMilitaryPlanes();
        MilitaryPlane plane;
        for (int i = 0; i < militaryPlanes.size(); i++) {
            plane = militaryPlanes.get(i);
            if (plane.getType() == MilitaryType.BOMBER) {
                bomberMilitaryPlanes.add(plane);
            }
        }
        return bomberMilitaryPlanes;
    }
    //endregion MilitaryPlanes

    //region ExperimentalPlanes

    public List<ExperimentalPlane> getExperimentalPlanes() {
        List<ExperimentalPlane> experimentalPlanes = new ArrayList<>();
        for (Plane plane : planes) {
            if (plane instanceof ExperimentalPlane) {
                experimentalPlanes.add((ExperimentalPlane) plane);
            }
        }
        return experimentalPlanes;
    }

    //endregion ExperimentalPlanes

    //region Sort
    public Airport sortByMaxLoadCapacity() {
        Comparator<Plane> comparator = Comparator.comparing(obj ->obj.getMaxLoadCapacity());
        Collections.sort(planes, comparator);
        return this;
    }

    public Airport sortByMaxDistance() {
        Comparator<Plane> comparator = Comparator.comparing(obj ->obj.getMaxFlightDistance());
        Collections.sort(planes, comparator);
        return this;
    }

    public Airport sortByMaxSpeed() {
        Comparator<Plane> comparator = Comparator.comparing(obj ->obj.getMaxSpeed());
        Collections.sort(planes, comparator);
        return this;
    }
    //endregion Sort

    @Override
    public String toString() {
        return "Airport{" +
                "Planes=" + planes +
                '}';
    }
}
