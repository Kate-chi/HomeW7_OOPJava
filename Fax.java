public class Fax extends Phone implements SendFax {
    public Fax(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void sendingFax() {
        System.out.println("Отправляет факс");
    }
}
