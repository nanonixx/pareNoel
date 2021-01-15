import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {  //sin regular expressions
    public static void main(String[] args) throws FileNotFoundException {
        File santako = new File("src/santako.txt");

        Scanner input = new Scanner(santako);

        while (input.hasNextLine()){
            String casa = input.nextLine();
            int ind = 0;
            String sub = casa;
            int len = casa.length();
            int nn = 0, nr = 0, nf = 0;


            while (ind!=-1){
                ind = sub.indexOf("*<]:-DOo");
                if (ind!=-1) {
                    sub = sub.substring(ind+1);
                    nn++;
                }
            }

            ind = 0;
            sub = casa;

            while (ind!=-1){
                ind = sub.indexOf(">:o)");
                if (ind!=-1) {
                    sub = sub.substring(ind + 1);
                    nr++;
                }
            }

            ind = 0;
            sub = casa;

            while (ind!=-1){
                ind = sub.indexOf("<]:-D");
                if (ind!=-1) {
                    sub = sub.substring(ind + 1);
                    nf++;
                }
            }

            System.out.print(nn>0? "Pare Noel (" + nn + ")   ":"");
            System.out.print(nr>0? "Ren (" + nr + ")   ":"");
            System.out.println(nf-nn>0? "Follet (" + (nf-nn) + ")   ":"");


        }
    }
}
