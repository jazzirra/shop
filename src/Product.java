import java.time.LocalDate;
import java.util.Random;

public abstract class Product {
    private String name;

    private int  productExpirationDate;

    private  int i ;

    private String srogSalt = "не меняется" ;





    public String productPlace(Product product){
        Random ran = new Random();
        int i = ran.nextInt(1,2);
        String II = null;

        if (i==1) {
            II="IceBox";
        }else {
            II="Showcase";
        }
        return II ;

    }


    public Product(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public Product() {
    }

    public Product(String name, int productExpirationDate) {
        this.name = name;
        this.productExpirationDate = productExpirationDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int  getProductExpirationDate() {
        return productExpirationDate;
    }

    public void setProductExpirationDate(int productExpirationDate) {
        this.productExpirationDate = productExpirationDate;
    }

    public Product(String name) {
        this.name = name;
    }

    public String getSrogSalt() {
        return srogSalt;
    }

    public void setSrogSalt(String srogSalt) {
        this.srogSalt = srogSalt;
    }

    public LocalDate producedOn(){
        Random random = new Random();
        int ok = random.nextInt(1,200);
        LocalDate productOn = LocalDate.now().minusDays(ok);
        return productOn;
    }


    public boolean isFresh() {
        return i >= productExpirationDate?false:true;

    }


}
