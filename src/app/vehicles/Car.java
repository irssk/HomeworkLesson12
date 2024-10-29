package app.vehicles;

public class Car {

    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
        System.out.println("Машину запущено.");
    }

    private void startElectricity() {
        System.out.println("Система електроживлення запущена.");
    }

    private void startCommand() {
        System.out.println("Командну систему запущено.");
    }

    private void startFuelSystem() {
        System.out.println("Паливну систему запущено.");
    }
}