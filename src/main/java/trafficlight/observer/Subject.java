package trafficlight.observer;

import trafficlight.gui.TrafficLight;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private final List<TrafficLight> allObservers;

    public Subject() {
        allObservers = new ArrayList<>();
    }


    public void addObserver(TrafficLight tl) {
        allObservers.add(tl);
    }

    public void removeObserver(TrafficLight tl) {
        allObservers.remove(tl);
    }

    public void notifyObservers(String color) {
        for(TrafficLight tls : allObservers) {
            tls.update(color);
        }
    }

}