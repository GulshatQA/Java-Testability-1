
public class Main {

    public static void main(String[] args) {

        BonusMilesService service = new BonusMilesService();
        int price = 676_480;
        int miles = service.calculate(price); // должно получиться 33 824
        System.out.println(miles);

    }
}