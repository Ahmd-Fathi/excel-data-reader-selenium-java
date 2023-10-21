package Files;

import Base.TestBase;
import ParaBankPages.Page;
import org.testng.annotations.Test;

public class FileTest extends TestBase {

Page Page;
String user = "john", password="demo" ;
   @Test
   public void checkTransaction()
   {

       Page=new Page(driver);
       Page.login(user,password);
       Page.clickFindtransactions();


   }



}
