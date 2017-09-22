package day2.webscraper;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
 /*
  extending with Thread makes the run method runnable
  */
public class TagCounter extends Thread {
  String url;
  String title;
  int h1Count,h2Count, divCount, bodyCount;
  TagCounter(String url){
    this.url = url;
  }
  
  /*
  Connect to the URL and count the number of h1, h2, div and body Tags
  */
  @Override
  public void  run(){
    Document doc;
    try {
      doc = Jsoup.connect(url).get();
      // get page title
      this.title = doc.title();
      Elements h1s = doc.select("h1");
      this.h1Count = h1s.size();
      Elements h2s = doc.select("h2");
      this.h2Count = h2s.size();
      Elements divs = doc.select("div");
      this.divCount = divs.size();
      Elements bodys = doc.select("body");
      this.bodyCount = bodys.size();
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }

  public String getTitle() {
    return title;
  }

  public int getH1Count() {
    return h1Count;
  }

  public int getH2Count() {
    return h2Count;
  }

  public int getDivCount() {
    return divCount;
  }

  public int getBodyCount() {
    return bodyCount;
  }
  
}
