import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class lTMain {
    public static void main(String[] args) throws FileNotFoundException {
        File santako = new File("src/santako.txt");

        Scanner input = new Scanner(santako);

        while (input.hasNextLine()){
            String casa = input.nextLine();
            int ind = -2;
            String sub = casa;
            int len = casa.length();
            int nn = 0, nr = 0, nf = 0;


            while (ind!=-1){
                ind = sub.indexOf("*<]:-DOo");
                if (ind!=-1) {
                    sub = sub.substring(ind+1, len);
                    nn++;
                }
            }


            sub = casa;

            while (ind!=-1){
                ind = sub.indexOf(">:o)");
                if (ind!=-1) {
                    sub = sub.substring(ind + 1, len);
                    nr++;
                }
            }

            sub = casa;

            while (ind!=-1){
                ind = sub.indexOf("<]:-D");
                if (ind!=-1) {
                    sub = sub.substring(ind + 1, len);
                    nf++;
                }
            }

            System.out.println((nn) + "" + (nr) + "" + (nf));


        }
    }
}
