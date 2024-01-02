public class App {
    public static void main(String[] args) throws Exception {
        
     double amountkwd = 86;
       
     double amountusd = amountkwd*3.25;
    
     double amountusd1 = amountusd/3.25;
    
     double amounteur =amountkwd*4; 
    
    
    
     System.out.println( amountkwd + " KWD  = " + amountusd + " USD");
    
     System.out.println( amountusd + " USD = " + amountusd1 + " KWD");
    
     System.out.println( amounteur + " EUR = " +  amountkwd + " KWD");
    }
}
