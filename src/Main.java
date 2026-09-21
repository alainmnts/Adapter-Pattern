public class Main {
    public static void main(String[] args) {
        PowerOutlet[] devicesToPlugIn = {
            new LaptopAdapter(new Laptop()),
            new RefrigeratorAdapter(new Refrigerator()),
            new SmartphoneAdapter(new SmartphoneCharger())
        };

        System.out.println("Plugging devices into standard power outlets:\n");

        for (PowerOutlet device : devicesToPlugIn) {
            device.plugIn();
        }
    }
}