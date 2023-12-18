package Program;


import entities.enums.OrderStatus;
import entities.process;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        process order = new process(1080, "Alex", OrderStatus.Pending_Payment);

System.out.println(order);

        }
    }
