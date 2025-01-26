package singleinheritance.smarthomedevices;

public class SmartHomeDevicesMain {
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat("TH123", "Online", 22);
        thermostat.displayStatus();
    }
}
