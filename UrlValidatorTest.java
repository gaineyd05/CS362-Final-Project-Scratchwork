

import junit.framework.TestCase;


public class UrlValidatorTest extends TestCase {


   public UrlValidatorTest(String testName) {
      super(testName);
   }

   
   /*
   public void testManualTest()
   {
//You can use this function to implement your manual testing	   
	   
	   
   }
   */
   public void testFirstPartition()
   {
	   System.out.print("ALLOW_2_SLASHES:\n");
	   for(int i = 0; i < 210; i++) {
		   String theURL = "www.google.com";
		   boolean expected = true;
		   
		   if(i % 2 == 0) {
			   theURL = "https://" + theURL;
		   }
			   
		   if(i % 3 == 0) {
			   theURL = theURL + ":555";
		   }
			   
		   if(i % 5 == 0) {
			   theURL = theURL + "/test/path";
		   }
			   
		   if(i % 7 == 0) {
			   theURL = theURL + "?query=true&anotherVar=yes";
		   }
		   
		   testFirstPartition(theURL, expected);
	   }
   }
   
   public void testSecondPartition()
   {
	   System.out.print("NO_FRAGMENTS:\n");
	   for(int i = 0; i < 210; i++) {
		   String theURL = "www.google.com";
		   boolean expected = true;
		   
		   if(i % 2 == 0) {
			   theURL = "https://" + theURL;
		   }
			   
		   if(i % 3 == 0) {
			   theURL = theURL + ":555";
		   }
			   
		   if(i % 5 == 0) {
			   theURL = theURL + "/test/path";
		   }
			   
		   if(i % 7 == 0) {
			   theURL = theURL + "?query=true&anotherVar=yes";
		   }
		   
		   testSecondPartition(theURL, expected);
	   }
   }
   
   public void testThirdPartition()
   {
	   System.out.print("ALLOW_LOCAL_URLS:\n");
	   for(int i = 0; i < 210; i++) {
		   String theURL = "www.google.com";
		   boolean expected = true;
		   
		   if(i % 2 == 0) {
			   theURL = "https://" + theURL;
		   }
			   
		   if(i % 3 == 0) {
			   theURL = theURL + ":555";
		   }
			   
		   if(i % 5 == 0) {
			   theURL = theURL + "/test/path";
		   }
			   
		   if(i % 7 == 0) {
			   theURL = theURL + "?query=true&anotherVar=yes";
		   }
		   
		   testThirdPartition(theURL, expected);
	   }
   }
   
   public void testFourthPartition()
   {
	   System.out.print("ALLOW_ALL_SCHEMES:\n");
	   for(int i = 0; i < 210; i++) {
		   String theURL = "www.google.com";
		   boolean expected = true;
		   
		   if(i % 2 == 0) {
			   theURL = "https://" + theURL;
		   }
			   
		   if(i % 3 == 0) {
			   theURL = theURL + ":555";
		   }
			   
		   if(i % 5 == 0) {
			   theURL = theURL + "/test/path";
		   }
			   
		   if(i % 7 == 0) {
			   theURL = theURL + "?query=true&anotherVar=yes";
		   }
		   
		   testFourthPartition(theURL, expected);
	   }
   }
   
   public void testFirstPartition(String theURL, boolean expected)
   {
	   try{
		   
           UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_2_SLASHES);
           boolean result = urlVal.isValid(theURL);

           if(result == expected) {
               System.out.print(theURL + ": Pass\n");
           } else {
               System.out.print(theURL + ": FAIL\n");
           }
       } catch (Error theEx) {
           System.out.print(theURL + ": Exception\n");
       }
   }
   
   public void testSecondPartition(String theURL, boolean expected){
	   try{
		   
           UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.NO_FRAGMENTS);
           boolean result = urlVal.isValid(theURL);

           if(result == expected) {
               System.out.print(theURL + ": Pass\n");
           } else {
               System.out.print(theURL + ": FAIL\n");
           }
       } catch (Error theEx) {
           System.out.print(theURL + ": Exception\n");
       }
   }
   
   public void testThirdPartition(String theURL, boolean expected){
	   try{
		   
           UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_LOCAL_URLS);
           boolean result = urlVal.isValid(theURL);

           if(result == expected) {
               System.out.print(theURL + ": Pass\n");
           } else {
               System.out.print(theURL + ": FAIL\n");
           }
       } catch (Error theEx) {
           System.out.print(theURL + ": Exception\n");
       }
 }
   
   public void testFourthPartition(String theURL, boolean expected){
	   try{
           UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
           boolean result = urlVal.isValid(theURL);

           if(result == expected) {
               System.out.print(theURL + ": Pass\n");
           } else {
               System.out.print(theURL + ": FAIL\n");
           }
       } catch (Error theEx) {
           System.out.print(theURL + ": Exception\n");
       }
 }

}
