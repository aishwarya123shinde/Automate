/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package demo;
import java.net.MalformedURLException;


public class App {
    public void getGreeting() throws InterruptedException, MalformedURLException {
       // TestCases tests = new TestCases(); // Initialize your test class
      // Search_Amazon amazon = new Search_Amazon();
     // BookMyShow links = new BookMyShow();
       // PostOnLinkdIn linkdIn = new PostOnLinkdIn();
       //ImdbRatingAutomate ratingAutomate = new ImdbRatingAutomate();
       AuotmatNesttedFame nesttedFame = new AuotmatNesttedFame();

        //TODO: call your test case functions one after other here

        //tests.testCase01();
        // amazon.searchAmazon();
          // links.bookmyshow();
         // linkdIn.PostOnLinkdIn();
      //  ratingAutomate.rating();
        nesttedFame.nestedFrame();
        //END Tests

     //  amazon.endTest();
      // links.endTest();
      //linkdIn.endTest();
      //ratingAutomate.endTest();
      nesttedFame.endTest();
       // tests.endTest(); // End your test by clearning connections and closing browser
    }

    public static void main(String[] args) throws InterruptedException, MalformedURLException {
        new App().getGreeting();
    }
}
