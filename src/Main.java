public class Main {
    public static void main(String[] args)
    {
        double ItemCost = 3.55;
        double SalesTax = ItemCost * .05;
        double TotalCost = SalesTax + ItemCost;
        System.out.println("The Total cost is " + TotalCost + " and " + "The sales tax is " + SalesTax);
    }
}