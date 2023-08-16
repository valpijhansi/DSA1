import java.util.*;

class fraction{
    public static void main(String[] args) {
        fraction f = new fraction();
        f.addFractions(12, 5, 40, 6);
        f.subFractions(12, 3, 6, 3);
        f.multiplyFractions(12, 4, 12, 4);
        f.dividedFractions(1, 0, 2, 0);
       
        
    }
    
    public void addFractions(int firstnum,int firstdenm,int secondnum,int secondDenm){
         int resultNum = (firstnum * secondDenm) + (secondnum * firstdenm);
        int resultDen = firstdenm * secondDenm;
         System.out.println("The sum of the fractions is: " + resultNum + "/" + resultDen);
    

    }
    public void subFractions(int firstnum,int firstdenm,int secondnum,int secondDenm){
         int resultNum = (firstnum * secondDenm) - (secondnum * firstdenm);
        int resultDen = firstdenm * secondDenm;
         System.out.println("The sub of the fractions is: " + resultNum + "/" + resultDen);
    

    }
      public void multiplyFractions(int firstnum,int firstdenm,int secondnum,int secondDenm){
         int resultNum = (firstnum * secondDenm) * (secondnum * firstdenm);
        int resultDen = firstdenm * secondDenm;
         System.out.println("The multiply of the fractions is: " + resultNum + "/" + resultDen);
    

    }
      public void dividedFractions(int firstnum,int firstdenm,int secondnum,int secondDenm){
         int resultNum = (firstnum * secondDenm) + (secondnum * firstdenm);
        int resultDen = firstdenm * secondDenm;
        if(resultNum==0)
        System.out.println("The Division of two fractions is:"+0);
        else if(resultDen==0)
        System.out.println("The Division of two fractions is:"+ "infinity");
        else
         System.out.println("The division of two fractions is: " + resultNum + "/" + resultDen);
    

    }
}