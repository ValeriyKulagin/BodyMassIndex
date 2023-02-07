public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 102; // вес в килограммах
        double height = 1.96; // рост в метрах

        double bmi = service.calculate(weight, height);
        System.out.println((int)bmi);


    }
}