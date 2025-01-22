import java.util.Scanner;
/**
 * Assignment 1
 * Question 2
 * Anmoldeep Singh
 * 3149800
 */
public class RocketReturn
{
    public static void main(String[]args){
        Scanner kb= new Scanner(System.in);
        int hh1,mm1,ss1,sec1,sec2;
        int ss2,mm2,hh2;
        
        System.out.println("*****************************");
        System.out.println("Rocket return calculator");
        System.out.println("*****************************");
        System.out.println("\n");
        
        System.out.println("Enter the blast-off time in the format hh mm ss.");
        hh1=kb.nextInt();
        mm1=kb.nextInt();
        ss1=kb.nextInt();
        
        System.out.println("Now enter the flight time in seconds.");
        sec1=kb.nextInt();
        System.out.println("\n");
        
        System.out.println("-------- Blast Off Time --------");
        System.out.println("Blast Off time: "+hh1+":"+mm1+":"+ss1);
        System.out.println("Flight time: "+sec1);
        
        sec2=((hh1*3600)+(mm1*60)+ss1)+sec1;
        hh2=((sec2/3600)%24);;
        mm2=((sec2/60)%60);
        ss2=sec2%60;
        System.out.println("\n");
        
        System.out.println("-------- Return Time ---------");
        System.out.println("Return Time: "+hh2+":"+mm2+":"+ss2);
        System.out.println("\n");
        
        System.out.println("end of processing");
    }
}
