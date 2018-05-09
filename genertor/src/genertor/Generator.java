
package genertor;
// the function of these program is to 

public class Generator {
    //methods can excess these member variable 
    public int TotalPower=100;
    public int powerUsed=0;
    public String name;
    
     public void getpowerUsed(){
         TotalPower=TotalPower-powerUsed;
        
    
}// CLOSE METHOD
     public int getPowerUsed(){
         return TotalPower;
     }// CLOSE METHOD
      public void powerTracker(){
          if (powerUsed>TotalPower){
            System.out.println(" the generator is burning down ");  
          }else
          
      System.out.println(" the genretor is till running");

      }// close methode 
      
              
          }// close class

    
    

