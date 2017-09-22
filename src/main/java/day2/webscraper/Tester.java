package day2.webscraper;

public class Tester {

  public static void main(String[] args) {
      
    TagCounter tc1 = new TagCounter("http://www.fck.dk");
//    tc1.start();
    TagCounter tc2= new TagCounter("http://www.google.com");
//    tc2.start();
    TagCounter tc3= new TagCounter("http://politiken.dk/");
       
        Thread t1 = new Thread(tc1);
        Thread t2 = new Thread(tc2);
        Thread t3 = new Thread(tc3);
        
        t1.start();
        t2.start();
        t3.start();
        
    
    System.out.println("Title: "+tc1.getTitle());
    System.out.println("Div's: "+tc1.getDivCount());
    System.out.println("Body's: "+tc1.getBodyCount());         
    
    
    System.out.println("Title: "+tc2.getTitle());
    System.out.println("Div's: "+tc2.getDivCount());
    System.out.println("Body's: "+tc2.getBodyCount());   
    
    System.out.println("Title: "+tc3.getTitle());
    System.out.println("Div's: "+tc3.getDivCount());
    System.out.println("Body's: "+tc3.getBodyCount());         
  }
}
