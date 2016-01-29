
package e003;

public class E003 {

    public static void main(String[] args) {
     for (int i=1;i<=7;i++){
         for (int x=1;x<=i;x++)
             System.out.print(x);
          
         for (int z=1;z<=7-i;z++)
          System.out.print("*");
         
          System.out.println("");
         
             }
    
}
}