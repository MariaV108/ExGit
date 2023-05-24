public class Program {

    public static void fire(Object sender) {
        System.out.println("Fire");
    }

    public static void main(String[] args) {
        Switcher sw = new Switcher();
        Lamps lamp = new Lamps();
        Radio radio = new Radio();

        // event subscribe подписка на событие
        sw.addElectricityListener(lamp);
        sw.addElectricityListener(radio);

        final String message = "fire";

        sw.addElectricityListener(new ElectricityConsumer() {
            @Override
            public void electricityOn(Object sender) {
                System.out.println(message);
                System.out.println("!");
            }
        });

//        sw.addElectricityListener(s -> Program.fire(s) );
        sw.addElectricityListener(sender -> System.out.println(message));
        sw.addElectricityListener(Program::fire);
        sw.switchOn();

    }
}
