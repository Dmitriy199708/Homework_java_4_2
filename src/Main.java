public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int bmi = service.calculate(84, 1.80);
        System.out.println("Рассчет индекса массы тела : " + bmi);
    }
}
