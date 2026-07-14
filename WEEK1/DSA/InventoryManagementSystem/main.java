public class main()
{
    public static void main(String[] args)
    {
        Inventory warehouse = new Inventory();
        
        warehouse.addproduct(new Product("P101", "Laptop", 50, 999.99));
        warehouse.addproduct(new Product("P102", "Mouse", 150, 25.00));
        warehouse.displayinventory();
    }
}