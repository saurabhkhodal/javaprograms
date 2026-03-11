import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        
        //find total number of rows in a table
       int rows = driver.findElements(By.xpath("//table[@name = 'BookTable']//tr")).size(); //preferred when the multiple tables present on the web page
      //   int rows = driver.findElements(By.tagName("tr")).size();                              //preferred when single table is present
        System.out.println("The number of rows present in the tables are: "+rows);
        
          int columns = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
      //  int columns = driver.findElements(By.tagName("th")).size();
        System.out.println("The number of columns present in the tables are: "+columns);
        
        //Read data from the specific row and columns (Ex. row =5 and column =1)
        
    //   String BookName = driver.findElement(By.xpath("//table[@name ='BookTable']//tr[6]//td[1]")).getText();
    //   System.out.println(BookName);
       
/*       //Read data from all rows and columns ("+row/column+")
       
       for(int r =1; r<=rows; r++) {
    	   for(int c=1;c<=columns; c++) {
    		   if(r==1) {                                  //since the first row is of header so we need to print the header
    			   String value=driver.findElement(By.xpath("//table[@name ='BookTable']//tr["+r+"]//th["+c+"]")).getText();
        		   System.out.print(value +"\t");
    		   }
    		   else {
    		   String value=driver.findElement(By.xpath("//table[@name ='BookTable']//tr["+r+"]//td["+c+"]")).getText();
    		   System.out.print(value +"\t");
    	   }
       }
    	   System.out.println();
	}
 */      
  /*     //to find out the book name of specific author
       
       for(int r=2; r<=rows;r++) {
    	 String author =  driver.findElement(By.xpath("//table[@name ='BookTable']//tr["+r+"]//td[2]")).getText();
    	 
    	 if(author.equals("Amit")) {
    		 
    		 String BookName = driver.findElement(By.xpath("//table[@name ='BookTable']//tr["+r+"]//td[1]")).getText();
    		 System.out.println(BookName+ "\t" +"-->\t" +author);
    	 }
       }
 */   
       //find total price of all the books
        int total =0;
       for(int r=2; r<=rows;r++) {
    	   String price = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
    	   total = total + Integer.parseInt(price);
    	   
       }
       System.out.println("The total price of all the books is "+total);
       
	}
}
