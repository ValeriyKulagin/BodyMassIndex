public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double mass = 102; // вес в килограммах
        double height = 1.96; // рост в метрах

        double bmi = service.calculate(mass, height);
        System.out.println(bmi);


    }
}