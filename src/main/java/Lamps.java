public class Lamps implements ElectricityConsumer{
    public void lightOn() {
        System.out.println("Зажглись лампы");
    }

    @Override
    public void electricityOn(Object sender) {
        lightOn();
    }
}
