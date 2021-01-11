import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
	File santako = new File("src/santako.txt");

	Scanner input = new Scanner(santako);

	Pattern noel = Pattern.compile("\\*<]:-DOo");
	Pattern ren = Pattern.compile(">:o\\)");
	Pattern follet = Pattern.compile("<]:-D");

	while (input.hasNextLine()){
        String casa = input.nextLine();

        Matcher mn = noel.matcher(casa);
        Matcher mr = ren.matcher(casa);
        Matcher mf = follet.matcher(casa);

        int nn = 0, nr = 0, nf = 0;

        while (mn.find()){ nn++; }
        while (mr.find()){ nr++; }
        while (mf.find()){ nf++; }

        System.out.print(nn>0? "Pare Noel (" + nn + ")   ":"");
        System.out.print(nr>0? "Ren (" + nr + ")   ":"");
        System.out.println(nf-nn>0? "Follet (" + (nf-nn) + ")   ":"");
    }

    }
}
