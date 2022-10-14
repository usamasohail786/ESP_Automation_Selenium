package Utility;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Random;

import io.netty.util.internal.ThreadLocalRandom;

public class Random_Function {
	public static String getAlphaNumericString(int n)
	 {
	 
	  // chose a Character random from this String
	  String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
	         + "0123456789"
	         + "abcdefghijklmnopqrstuvxyz";
	 
	  // create StringBuffer size of AlphaNumericString
	  StringBuilder sb = new StringBuilder(n);
	 
	  for (int i = 0; i < n; i++) {
	 
	   // generate a random number between
	   // 0 to AlphaNumericString variable length
	   int index
	    = (int)(AlphaNumericString.length()
	      * Math.random());
	 
	   // add Character one by one in end of sb
	   sb.append(AlphaNumericString
	      .charAt(index));
	  }
	 
	  return sb.toString();
}
	public static String randomStringFromArr() {
        String[] arr = {"Manager", "Automation", "England", "Pakistan", "Dubai City", "Exceed","Indian","Motivational", "Islamic", "Speaking", "England", "Usama Sohail", "Oman Country","Qatar Country"};
        int randIdx = ThreadLocalRandom.current().nextInt(arr.length);
        String randomElem = arr[randIdx];
        return randomElem;
    }
	public static String randomLookDefinationFromArr() {
        String[] arr = {"NUM94842 - Forms Testing", "NUM94866 - Forms Testing", "NUM94842 - Forms Testing", "NUM94877 - Forms Testing", "NUM94878 - Forms Testing", "NUM95601 - Forms Testing","NUM95602 - Forms Testing","NUM95643 - Forms Testing", "NUM95645 - Forms Testing", "NUM95646 - Forms Testing", "NUM95730 - Forms Testing"};
        int randIdx = ThreadLocalRandom.current().nextInt(arr.length);
        String randomElem = arr[randIdx];
        return randomElem;
    }
	public static String randomStringFromArrminvalue() {
        String[] arr = {"Car", "Bike", "Bus", "Train", "Swing", "Men","Plane","PIA", "Mike", "Ali", "UK", "Usa", "Oman","UAE"};
        int randIdx = ThreadLocalRandom.current().nextInt(arr.length);
        String randomElem = arr[randIdx];
        return randomElem;
    }
	public static String randomStringFromTimevalue() {
        String[] arr = {", 11:22:00", ", 23:12:00", ", 23:45:00", ", 07:14:00", ", 22:30:00", ", 23:00:00",", 09:00:00",", 06:40:00", ", 03:10:00", ", 09:45:00", ", 07:00:00", ", 08:00:00", ", 01:00:00",", 20:00:00"};
        int randIdx = ThreadLocalRandom.current().nextInt(arr.length);
        String randomElem = arr[randIdx];
        return randomElem;
    }
	public static String randomemailFromArr() {
        String[] arr = {"usamasohail@gmail.com", "usamasohail@exceed.com", "AsadAli@exceed.com", "AhmadAli@exceed.com", "MuhammadAli@gmail.com", "MujjedAli@gmail.com","MuhammadSaif@gmail.com","osamasohail@gmail.com", "osamasohail@exceed.com", "sadAli@exceed.com", "Ali@exceed.com", "MuhammadFaiz@gmail.com", "AAli@gmail.com","MuhammadJaveed@gmail.com"};
        int randIdx = ThreadLocalRandom.current().nextInt(arr.length);
        String randomElem = arr[randIdx];
        return randomElem;
    }
	public static String randomfile() {
        String[] arr = {"C:\\\\Users\\\\usamasoh\\\\Documents\\\\sample.pdf", "C:\\Users\\usamasoh\\Documents\\Printable List for Grocery.pdf", "C:\\Users\\usamasoh\\Documents\\Beauty Price List.pdf", "C:\\Users\\usamasoh\\Documents\\Healthy Grocery List.pdf"};
        int randIdx = ThreadLocalRandom.current().nextInt(arr.length);
        String randomElem = arr[randIdx];
        return randomElem;
    }
	public static String randomeimages() {
        String[] arr = {"C:\\\\Users\\\\usamasoh\\\\Documents\\\\exceed-dubai-lounge.jpg", "C:\\Users\\usamasoh\\Documents\\images.jpg", "C:\\Users\\usamasoh\\Documents\\download.png", "C:\\Users\\usamasoh\\Documents\\images (4).jpg", "C:\\Users\\usamasoh\\Documents\\images (3).jpg"};
        int randIdx = ThreadLocalRandom.current().nextInt(arr.length);
        String randomElem = arr[randIdx];
        return randomElem;
    }
	public static String randomemailFromArrValidation() {
        String[] arr = {"usamasohailgmail", "usamasohailexceed", "AsadAliexceed", "AhmadAliexceed", "MuhammadAligmail", "MujjedAligmail","MuhammadSaifgmail","osamasohailgmail", "osamasohailexceed", "sadAliexceed", "Aliexceed", "MuhammadFaizgmail", "AAligmail","MuhammadJaveedgmail"};
        int randIdx = ThreadLocalRandom.current().nextInt(arr.length);
        String randomElem = arr[randIdx];
        return randomElem;
    }
	public static String randomURLFromArr() {
        String[] arr = {"ExceedGulf.com", "google.com", "planX.com", "Higher.com", "LinkedIn.com", "daraz.com","netflix.com","newsite.com", "myexceed.com", "teams.com", "newweb.com", "Espn.com", "Opera.com","Microsoft.com"};
        int randIdx = ThreadLocalRandom.current().nextInt(arr.length);
        String randomElem = arr[randIdx];
        return randomElem;
    }
	public static String randomURLFromvalidationArr() {
        String[] arr = {"ExceedGulf", "google", "planX", "Higher", "LinkedIn", "daraz","netflix","newsite", "myexceed", "teams", "newweb", "Espn", "Opera","Microsoft"};
        int randIdx = ThreadLocalRandom.current().nextInt(arr.length);
        String randomElem = arr[randIdx];
        return randomElem;
    }
	public static  int randomintgenerate() {
		 int randomNum = 0; 
        randomNum = ThreadLocalRandom.current().nextInt(1, 500);
		return randomNum;
    }
	public static  int randominvalidationtgenerate() {
		 int randomNum = 0; 
       randomNum = ThreadLocalRandom.current().nextInt(1, 50);
		return randomNum;
   }
	public static  int randomintgenerate_phone_number() {
		 int randomNum = 0;
         randomNum = ThreadLocalRandom.current().nextInt(0312132113, 912132113);
		return randomNum;
   }
	public static String random_date()
	{
		LocalDate from = LocalDate.of(2018, 1, 1);
		LocalDate to = LocalDate.of(2022, 1, 1);
		long days = from.until(to, ChronoUnit.DAYS);
		long randomDays = ThreadLocalRandom.current().nextLong(days + 1);
		LocalDate randomDate = from.plusDays(randomDays);
		System.out.println(randomDate.format(DateTimeFormatter.ofPattern("MM/dd/yyyy")));
		return randomDate.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));
	}
	public static Timestamp Time() {
		long offset = Timestamp.valueOf("2012-01-01 00:00:00").getTime();
		long end = Timestamp.valueOf("2013-01-01 00:00:00").getTime();
		long diff = end - offset + 1;
		Timestamp rand = new Timestamp(offset + (long)(Math.random() * diff));
		return rand;
	}
	public static int random_number()
	{
		Random rand = new Random();
		int rand_int1=0;
		for(int i=0; i<3;i++) {
		     rand_int1 = rand.nextInt(10);
		}
   return rand_int1;
	}

}

