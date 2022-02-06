public class Main {

    public static void main(String[] args) {

        BmiService service = new BmiService();
        double resault = service.calculate(88, 1.87);

        System.out.println("Индекс массы тела равен : " + resault);


    }
}
