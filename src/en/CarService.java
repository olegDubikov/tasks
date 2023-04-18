package en;

import java.io.PrintStream;

public class CarService {

    public static void main(String[] args) {
        Status toyota = Status.FINISHED;
        Status volvo = Status.WAITING;
        System.out.println("Статус тойота: " + toyota);
        System.out.println("Статус вольво: " + volvo);
        Order order = new Order(1, "Mercedes-Benz GLS", Status.IN_WORK);
        PrintStream var10000 = System.out;
        int var10001 = order.getId();
        var10000.println("" + var10001 + " " + order.getModel() + " " + order.getStatus().getInfo());
        Status[] statuses = Status.values();
        Status[] var5 = statuses;
        int var6 = statuses.length;

        for(int var7 = 0; var7 < var6; ++var7) {
            Status s = var5[var7];
            var10000 = System.out;
            String var9 = s.name();
            var10000.println("Название статуса: " + var9 + ", Порядковый номер статуса: " + s.ordinal());
        }
    }
}