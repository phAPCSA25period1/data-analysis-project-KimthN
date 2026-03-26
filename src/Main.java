//all_lines[] = one element = one whole line with all commas
//random number until 10 of each continent
// now have all 60 random numbers
// then create all 60 country objects
import java.io.*;
//import java.util.*;
//import java.net.URL;
import java.util.Scanner;
//import java.net.URI;


/**
 * Main application for the Data Analysis Mini‑Project.
 *
 * 
 *  - Update the path to your dataset file
 *  - Read the CSV file using Scanner
 *  - Parse each row and extract the correct columns
 *  - Construct Data objects from each row
 *  - Store them in an array
 *  - Write methods to analyze the dataset (min, max, average, filters, etc.)
 *  - Print insights and answer your guiding question
 *  - Add Javadoc comments for any methods you create
 */
public class Main {

    public static void main(String[] args) throws Exception {

        File file = new File("WorldIndicators2000.csv");
        String[] all_lines = new String[2705];
        //System.out.println("test");
        //public String[] readFile(){
            //File myFile = new File(file);
            Scanner scan = new Scanner(file);
            int i = 0;
            while (scan.hasNext()){
                //String[] all_lines;
                all_lines[i] = scan.nextLine();
                i++;
            }
            System.out.println("test");
            scan.close();
//each continent gets 10 random countries
        // getting 10 countries in Americas, int[] Americas has 10 america countries indexes
        int[] Americas = new int[10];
        int countA = 0;
        while (countA < 10){
            int randomm = (int)(Math.random()*(2704-0+1)+0);
            String data1[] = all_lines[randomm].split(",");
            String name = data1[24];
            if (name.equals("The Americas")){
                Americas[countA] = randomm;
                countA++;
            }
        }

        CountryStat[] Americans = new CountryStat[10];
        for (int j = 0; j <= 9; j++){
            int blah = Americas[j];
            String[] data = all_lines[blah].split(",");
            String a = data[0];
            String b = data[24];
            double c = safeParseDouble(data[17]);
            CountryStat s = new CountryStat(a, b, c);
            Americans[j] = s;
            System.out.println(Americans[j].toString());
        }

        double Americas_mobile_usage = 0.0;
            for (int j = 0; j <=9; j++){
                Americas_mobile_usage += Americans[j].getMobile_usage();
            }
            Americas_mobile_usage /= 10.0; //western hemisphere average mobile usage
            System.out.println("Western Hemisphere Average Mobile Usage: " + Americas_mobile_usage);



        int[] Oceania = new int[10];
        int countO = 0;
        while (countO < 10){
            int randomm = (int)(Math.random()*(2704-1+1)+1);
            String data1[] = all_lines[randomm].split(",");
            String name = data1[24];
            if (name.equals("Oceania")){
                Oceania[countO] = randomm;
                countO++;
            }
        }

        CountryStat[] Oceania_countries = new CountryStat[10];
        for (int j = 0; j <= 9; j++){
            int blah = Oceania[j];
            String[] data = all_lines[blah].split(",");
            String a = data[0];
            String b = data[24];
            double c = safeParseDouble(data[17]);
            CountryStat s = new CountryStat(a, b, c);
            Oceania_countries[j] = s;
            System.out.println(Oceania_countries[j].toString());
        }

        double Oceania_mobile_usage = 0.0;
        for (int j = 0; j <=9; j++){
            Oceania_mobile_usage += Oceania_countries[j].getMobile_usage();
        }
        Oceania_mobile_usage /= 10.0; //oceania average mobile usage
        System.out.println("Oceania Average Mobile Usage: " + Oceania_mobile_usage);

        int[] Middle_East = new int[10];
        int countME = 0;
        while (countME < 10){
            int randomm = (int)(Math.random()*(2704-1+1)+1);
            String data1[] = all_lines[randomm].split(",");
            String name = data1[24];
            if (name.equals("Middle East")){
                Middle_East[countME] = randomm;
                countME++;
            }
        }

        CountryStat[] MiddleEast_countries = new CountryStat[10];
        for (int j = 0; j <= 9; j++){
            int blah = Middle_East[j];
            String[] data = all_lines[blah].split(",");
            String a = data[0];
            String b = data[24];
            double c = safeParseDouble(data[17]);
            CountryStat s = new CountryStat(a, b, c);
            MiddleEast_countries[j] = s;
            System.out.println(MiddleEast_countries[j].toString());
        }

        double Middle_East_mobile_usage = 0.0;
        for (int j = 0; j <=9; j++){
            Middle_East_mobile_usage += MiddleEast_countries[j].getMobile_usage();
        }
        Middle_East_mobile_usage /= 10.0; //middle east average mobile usage
        System.out.println("Middle East Average Mobile Usage: " + Middle_East_mobile_usage);

        int[] Europe = new int[10];
        int countE = 0;
        while (countE < 10){
            int randomm = (int)(Math.random()*(2704-1+1)+1);
            String data1[] = all_lines[randomm].split(",");
            String name = data1[24];
            if (name.equals("Europe")){
                Europe[countE] = randomm;
                countE++;
            }
        }

        CountryStat[] Europe_countries = new CountryStat[10];
        for (int j = 0; j <= 9; j++){
            int blah = Europe[j];
            String[] data = all_lines[blah].split(",");
            String a = data[0];
            String b = data[24];
            double c = safeParseDouble(data[17]);
            CountryStat s = new CountryStat(a, b, c);
            Europe_countries[j] = s;
            System.out.println(Europe_countries[j].toString());
        }

        double Europe_mobile_usage = 0.0;
        for (int j = 0; j <=9; j++){
            Europe_mobile_usage += Europe_countries[j].getMobile_usage();
        }
        Europe_mobile_usage /= 10.0; //europe average mobile usage
        System.out.println("Europe Average Mobile Usage: " + Europe_mobile_usage);


        int[] Asia = new int[10];
        int countAS = 0;
        while (countAS < 10){
            int randomm = (int)(Math.random()*(2704-1+1)+1);
            String data1[] = all_lines[randomm].split(",");
            String name = data1[24];
            if (name.equals("Asia")){
                Asia[countAS] = randomm;
                countAS++;
            }
        }

        CountryStat[] Asia_countries = new CountryStat[10];
        for (int j = 0; j <= 9; j++){
            int blah = Asia[j];
            String[] data = all_lines[blah].split(",");
            String a = data[0];
            String b = data[24];
            double c = safeParseDouble(data[17]);
            CountryStat s = new CountryStat(a, b, c);
            Asia_countries[j] = s;
            System.out.println(Asia_countries[j].toString());
        }

        double Asia_mobile_usage = 0.0;
        for (int j = 0; j <=9; j++){
            Asia_mobile_usage += Asia_countries[j].getMobile_usage();
        }
        Asia_mobile_usage /= 10.0; //asia average mobile usage
        System.out.println("Asia Average Mobile Usage: " + Asia_mobile_usage);

        int[] Africa = new int[10];
        int countAF = 0;
        while (countAF < 10){
            int randomm = (int)(Math.random()*(2705-1+1)+1);
            String data1[] = all_lines[randomm].split(",");
            String name = data1[24];
            if (name.equals("Africa")){
                Africa[countAF] = randomm;
                countAF++;
            }
        }

        CountryStat[] Africa_countries = new CountryStat[10];
        for (int j = 0; j <= 9; j++){
            int blah = Africa[j];
            String[] data = all_lines[blah].split(",");
            String a = data[0];
            String b = data[24];
            double c = safeParseDouble(data[17]);
            CountryStat s = new CountryStat(a, b, c);
            Africa_countries[j] = s;
            System.out.println(Africa_countries[j].toString());
        } 

        double Africa_mobile_usage = 0.0;
        for (int j = 0; j <=9; j++){
            Africa_mobile_usage += Africa_countries[j].getMobile_usage();
        }
        Africa_mobile_usage /= 10.0; //africa average mobile usage
        System.out.println("Africa Average Mobile Usage: " + Africa_mobile_usage);  

        //making america country objects
        
            //now countries has 60 country objects with name, region, and mobile usage
            //need to find average mobile usage for each continent and then compare them to answer the questio  

            double eastern_hemisphere_mobile_usage = Oceania_mobile_usage + Middle_East_mobile_usage + Europe_mobile_usage + Asia_mobile_usage + Africa_mobile_usage;
            eastern_hemisphere_mobile_usage /= 5.0;
            double western_hemisphere_mobile_usage = Americas_mobile_usage;

            System.out.println("Eastern Hemisphere Average Mobile Usage: " + eastern_hemisphere_mobile_usage);
            System.out.println("Western Hemisphere Average Mobile Usage: " + western_hemisphere_mobile_usage);

            if (eastern_hemisphere_mobile_usage > western_hemisphere_mobile_usage){
                System.out.println("The Eastern Hemisphere has a higher average mobile usage than the Western Hemisphere.");
            } else if (western_hemisphere_mobile_usage > eastern_hemisphere_mobile_usage){
                System.out.println("The Western Hemisphere has a higher average mobile usage than the Eastern Hemisphere.");
            } else {
                System.out.println("The Eastern and Western Hemispheres have the same average mobile usage.");
            }

    }

    private static double safeParseDouble(String value) {
        if (value == null || value.isBlank()) {
            return 0.0;
        }
        try {
            return Double.parseDouble(value.trim());
        } catch (NumberFormatException e) {
            return 0.0;
        }
    }
}
