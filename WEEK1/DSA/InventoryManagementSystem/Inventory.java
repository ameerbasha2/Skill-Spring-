import java.util.*;
public class Inventory{
    private Map<String,Product>productmap;
    public Inventory()
    {
        this.productmap=new HashMap<>();

    }
    //Adding the product to the hash map
    public void addproduct(Product product)
    {
        if(productmap.containskey(product.productid()))
        {
            System.out.println("the id is " + product.getproductid()+"present in the data base");

        }
        else{
        productmap.put(product.getproductid(),product);
        System.out.println("we had add the product in to the data base "+product.getproductname());
        }
    }
    //updating the price and the quntity of the productid
    public void updatingproduct(String productid,int quntity,double price)
    {
        Product product=productmap.get(productid);    
        if(product!=null)
        {
               product.setquntity(newquntity);
               product.setprice(newprice);
        }
        else
        {
            System.out.println("the requested id is not present in the data base ");
        }
    }
    
    //deleting the product
    public void deletingproductid(String productid)
    {
        if(productmap.cantainskey(productid))
        {
            Product remove=productmap.remove(productid);
            System.out.println("the name of the remove id"+remove.productname);
        }
        else
        {
            System.out.println("the requested is is not found in the data base");
        }
    }
    //displaying all the products present in the map
    public void displayinventory()
    {
        if(productmap.empty())
        {
            System.out.println("the data base id empty");
        }
        else
        {
            for(Product p:productmap.values())
            {
                System.out.println(p);
            }
        }
    }
    
}