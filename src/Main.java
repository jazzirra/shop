import java.time.LocalDate;
import java.util.Arrays;
import java.util.Locale;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Product milk1 = new Milk("MILK",60 );
        Product milk2 = new Milk("MILK",60);
        Product milk3 = new Milk("MILK",60);
        Product milk4 = new Milk("MILK",60);
        Product milk5 = new Milk("MILK",60);

        Product fish1 = new Fish("FISH",120);
        Product fish2 = new Fish("FISH",120);
        Product fish3 = new Fish("FISH",120);
        Product fish4 = new Fish("FISH",120);
        Product fish5 = new Fish("FISH",120);

        Product stew1 = new Stew("STEW",180);
        Product stew2 = new Stew("STEW",180);
        Product stew3 = new Stew("STEW",180);
        Product stew4 = new Stew("STEW",180);
        Product stew5 = new Stew("STEW",180);

        Product corn1 = new Corn("CORN",150);
        Product corn2 = new Corn("CORN",150);
        Product corn3 = new Corn("CORN",150);
        Product corn4 = new Corn("CORN",150);
        Product corn5 = new Corn("CORN",150);

        Product solt1 = new Solt("SOLT");
        Product solt2 = new Solt("SOLT");
        Product solt3 = new Solt("SOLT");
        Product solt4 = new Solt("SOLT");
        Product solt5 = new Solt("SOLT");





        Product [] products = {solt1,solt2,solt3,solt4,solt5,stew1,stew2,stew3,stew4,stew5 ,fish1,fish2,fish3 , fish4,fish5,
        corn1,corn2,corn3,corn4,corn5 , milk1,milk2,milk3,milk4,milk5};


        System.out.println("         Inspection Result ");
        System.out.println("  Product  |  Producet On  |  Storeage place  |  S. life days |  Fresh  ");
        System.out.println("-----------+---------------+------------------+-------------------------");

        for (int i = 0; i < products.length; i++) {
            if (products[i].getClass()==Solt.class){
                System.out.printf("  %s     |  %s   |  %s         |  %s    |  %s  |\n",products[i].getName() , products[i].producedOn(),products[i].productPlace(products[i]),
                        products[i].getSrogSalt(), products[i].isFresh());
            }else {

                System.out.printf("  %s     |  %s   |  %s         |  %s            |  %s  |\n",products[i].getName() , products[i].producedOn(),products[i].productPlace(products[i]),
                        products[i].getProductExpirationDate() , products[i].isFresh());
            }




        }


















    }
}