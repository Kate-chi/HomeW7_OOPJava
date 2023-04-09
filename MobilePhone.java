public class MobilePhone extends Phone implements SendSMS{
    
    public MobilePhone(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void sendingSMS() {
        System.out.println("Отправляет смс");
    }
}
