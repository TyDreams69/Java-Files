

     public class InvoiceTest
     {
         public static void main(String[] args)
         {
             Invoice customer1 = new Invoice("INV223", "Water Melon", 50, 175);
             
             customer1.setQtyPurchased(26);
             customer1.setPricePerItem(174);            

             System.out.println(customer1.getInvoiceAmount());
         }
     }