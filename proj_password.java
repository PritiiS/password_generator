package mymodules.codes;
import java.util.Scanner;
import java.security.SecureRandom;
public class proj_password {
    public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
        System.out.println("how many number of password to be generated:");
        int no_pass=sc.nextInt();
        System.out.println("how much the length of each password should be:");
        int pass_len=sc.nextInt();
        String[] password= new String[no_pass];

        for (int i=0;i<no_pass;i++){
            String abc=" ";
            for(int j=0;j<pass_len;j++){
                abc+=pass_generator();
            }
            password[i]=abc;
            System.out.println(password[i]);
        }
    }
    public static char pass_generator(){
        // special characters=>33-47 in ascii
        //0-9=>48-57 in ascii
        //a-z=>97-122 in ascii
        //A-Z=>65-90 in ascii
        // total=77 possible characters
        SecureRandom random = new SecureRandom();
        int value= random.nextInt(96);
        /* 0-14==>special characters
           15-24==>numbers
           25-51==>uppercase
           52-77==>lowercase

         */
        if(value<=14){
            value+=33;  //47-14= 33
            return (char)(value);
        }
        else if(value<=24){
            value+=33;    //48-15=33
            return (char)(value);
        } else if (value<=51) {
            value+=40 ;         //65-25=40
            return (char)(value);
        }
        else if(value<=77){
            value+= 45;         //97-52=45
            return (char)(value);
        }
     return 0;
    }
}
