package application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;
import java.text.SimpleDateFormat;
import java.text.ParseException;
public class program  {
    public static void main(String[] args)  throws ParseException
    {

SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of products: ");
        int n = sc.nextInt();
        List<Product> list = new ArrayList<>();
        for(int i = 1; i <= n; i++)
        {
            System.out.println("Product #" + i + " data:");
            System.out.println("Common, used or imported (c/u/i)? ");
            char ch = sc.next().charAt(0);
            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Price: ");
            double price = sc.nextDouble();
            if(ch == 'c')
            {
                list.add(new Product(name, price));
            }
            else if(ch == 'u')
            {
                System.out.println("Manufacture date (DD/MM/YYYY): ");
                Date manufactureDate = sdf.parse(sc.next());

                list.add(new UsedProduct(name, price, manufactureDate));
            }
            else
            {
                System.out.println("Customs fee: ");
                double customsFee = sc.nextDouble();
                list.add(new ImportedProduct(name, price, customsFee));
            }
        }
        System.out.println("PRICE TAGS:");
        for(Product p : list)
        {
            System.out.println(p.priceTag());
        }




    }
}
