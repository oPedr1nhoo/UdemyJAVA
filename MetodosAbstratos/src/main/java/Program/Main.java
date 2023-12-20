package Program;

import java.util.Scanner;
import Model.entities.Circle;
import Model.entities.Rectangle;
import Model.entities.Shape;
import Model.enums.Color;
import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Shape> list = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
        System.out.println("Shape #"+ i + " data:");
        System.out.print("Rectangle or Circle(r/c)? : ");
        char ch = sc.next().charAt(0);
        System.out.print("Color (BLACK/BLUE/RED): ");
        Color color = Color.valueOf(sc.next());
        if(ch == 'r'){
            System.out.print("Width: ");
            double width = sc.nextDouble();
            System.out.print("Heigh: ");
            double heigh = sc.nextDouble();
            list.add(new Rectangle(width, heigh, color));

        }
        else{
            System.out.print("Radius: ");
            double radius = sc.nextDouble();
            list.add(new Circle(color , radius));

        }

        for(Shape shape : list){
            System.out.println("SHAPE AREAS: ");
            System.out.println(String.format("%.2f", shape.area()));
        }

    }

        sc.close();
}
}
