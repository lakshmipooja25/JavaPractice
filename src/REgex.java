import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class REgex {
public static void main(String args[])
{
/*Pattern p = Pattern.compile("..m");
Matcher m=p.matcher("aml");
Boolean b= m.matches();
System.out.println(b);*/

Boolean b1= Pattern.compile("[L][a-bA-B]{6}").matcher("Lakshmi").matches();
//Boolean b1=Pattern.compile("[^alm]{2}[^yht]{1}").matcher("pko").matches();
//Boolean b1=Pattern.compile("[a-pq-y]{7}").matcher("pz").matches();
//Boolean b1=Pattern.compile("[A-Za-z]*[0-9]{2}[\\W]{1}[a-z]*[.]{1}[a-z]{3,6}").matcher("lakshmipooja25@gmail.comslk").matches();

System.out.println(Pattern.matches(".9.", "m9t"));//false (has more than 2 char)  
System.out.println(Pattern.matches("[amn]{4}", "amma"));//false (not a or m or n)  
//System.out.println(Pattern.matches(".m", "am"));

int a[] = new int[5];
int [] b = new int[5];	
}

}
