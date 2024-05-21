public class Main {
  public static void main(String[] args) {

      Feeder n1 = new Feeder((int)(Math.random()*5000) +1);
   int temp = n1.simulateManyDays(10, 10);
    
System.out.println(temp);


    
}


}
