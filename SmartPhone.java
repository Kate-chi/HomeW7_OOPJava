public class SmartPhone extends MobilePhone implements SendEmail {

    public SmartPhone(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void sendingEmail() {
        System.out.println("Отправляет email");
    }
}