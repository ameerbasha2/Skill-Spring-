public class Product
{
    private String  productid;
    private String productname;
    private int quntity;
    private double price;
     public Product(String productid,String productname,int quntity,double price)
     {
        this.productid=productid;
        this.productname=productname;
        this.quntity=quntity;
        this.price=price;
     }
     public String getproductid()
     {
      return productid;
     }
     public String getproductname()
     {
      return productname ;
     }
     public int getquntity()
     {
      return quntity;
     }
     public double getprice()
     {
      return price;
     }
     public void setquntity(int quntity)
     {
      this.quntity=quntity;
     }
     public void setprice(double price)
     {
      this.price=price;
     }
     


     


}