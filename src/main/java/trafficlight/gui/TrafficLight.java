package trafficlight.gui;

import trafficlight.observer.IObserver;

import java.awt.*;
import java.util.Observable;
import java.util.Observer;

public class TrafficLight extends Light implements IObserver {

    TrafficLight(Color color) {
        super(color);
    }

    public void turnOn(boolean a) {
        isOn = a;
        repaint();

    }

    public boolean isOn() {
        return isOn;
    }

    //TODO implement a part of the pattern here

    @Override
    public void update(String color) {

        turnOn((Color.RED.getRGB() == super.on.getRGB() && color.equalsIgnoreCase("RED"))
                || (Color.YELLOW.getRGB() == super.on.getRGB() && color.equalsIgnoreCase("YELLOW"))
                || (Color.GREEN.getRGB() == super.on.getRGB() && color.equalsIgnoreCase("GREEN")));
    }

}