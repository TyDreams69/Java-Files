

    public class Invoice
    {
        private String invNumber;
        private String description;
        private int qtyPurchased;
        private double pricePerItem;
       
 
        public Invoice(String invNumber, String description, int qtyPurchased, double pricePerItem)
        {
            this.invNumber = invNumber;
            this.description = description;

            if (qtyPurchased > 0)
               this.qtyPurchased = qtyPurchased;

            if (pricePerItem > 0.0)
               this.pricePerItem = pricePerItem;
        }
       
        public void setQtyPurchased(int qtyPurchased)
        {
            if (qtyPurchased > 0)
               this.qtyPurchased = qtyPurchased;
        }
        
        public void setPricePerItem(int pricePerItem)
        {
            if (pricePerItem > 0)
               this.pricePerItem = pricePerItem;
        }
        public String getInvNumber()
        { 
            return invNumber;
        }
        
        public String getDescription()
        { 
            return description;
        }

        public int getQtyPurchased()
        { 
             return qtyPurchased;
        }

        public double getPricePerItem()
        { 
             return  pricePerItem;
        }
        
        public double getInvoiceAmount()
        {
            double invAmount = qtyPurchased * pricePerItem;

            return invAmount;
        }


    }


           