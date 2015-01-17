
/**
 * Write a description of class FileReverse here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.*;
import java.util.*;
public class FileReverse
{
    public static void main(String args[]) throws IOException {
        Scanner sf = new Scanner(new File("F://Tyler.Jackson-FileTester//CelebrityData.txt"));
        
        int maxIndx = -1;
        String text[] = new String[1000];
        
        while(sf.hasNext()){
            maxIndx++;
            text[maxIndx] = sf.nextLine();
           
        }
        
        sf.close();
        
        String fixedName[] = new String[maxIndx +1];
        for (int j=0; j <= maxIndx; j++){
            Scanner sc = new Scanner( text[j]);
            
            String firstName = sc.next();
            String middleName = sc.next();
            String lastName = sc.next();
            String birthdate = sc.next();
            
            fixedName[j] = lastName + ", " + firstName + " " + middleName + " " + "-- " + birthdate;
        }
        
        Arrays.sort(fixedName);
        for (int j=0; j <= maxIndx; j++){
            System.out.println(fixedName[j]);
        }
    
    }
}
