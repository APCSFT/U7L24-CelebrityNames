import java.util.*; 
import java.io.*; 
public class FileTester
{  
    public static void main(String args[]) throws IOException
    {
        Scanner sf = new Scanner(new File("F:\\Tyler.Jackson-FileTester\\MyData.in"));
        
        int maxIndx = -1; //-1 so when we increment below, first index is 0
        String text[] = new String[1000]; //to be safe, declare more than we need to
        
        while(sf.hasNext()){
            maxIndx++;
            text[maxIndx] = sf.nextLine();
        }
        //max index is now the highest index of  text[], -1 if no text lines
        sf.close( ); //We opened a file above so close it when finished. 
        
        for (int j=0; j<=maxIndx; j++){
            System.out.println(text[j]);
        }
    }
}
