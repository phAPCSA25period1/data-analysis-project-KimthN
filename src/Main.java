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
        System.out.println("test");
        //public String[] readFile(){
            //File myFile = new File(file);
            Scanner scan = new Scanner(file);
            int i = 0;
            while (scan.hasNext()){
                //String[] all_lines;
                all_lines[i] = scan.nextLine();
                i++;
            }
            scan.close();
//each continent gets 10 random countries
        // getting 10 countries in Americas, int[] Americas has 10 america countries indexes
        int[] Americas = new int[10];
        int countA = 0;
        while (countA < 10){
            int randomm = (int)(Math.random()*(2704-1+1)+1);
            String data1[] = all_lines[randomm].split(",");
            String name = data1[24];
            if (name.equals("Americas")){
                Americas[countA] = randomm;
                countA++;
            }
        }

        int[] Oceania = new int[10];
        int countO = 0;
        while (countO < 10){
            int randomm = (int)(Math.random()*(2705-1+1)+1);
            String data1[] = all_lines[randomm].split(",");
            String name = data1[24];
            if (name.equals("Oceania")){
                Oceania[countO] = randomm;
                countO++;
            }
        }

        int[] Middle_East = new int[10];
        int countME = 0;
        while (countME < 10){
            int randomm = (int)(Math.random()*(2705-1+1)+1);
            String data1[] = all_lines[randomm].split(",");
            String name = data1[24];
            if (name.equals("Middle East")){
                Middle_East[countME] = randomm;
                countME++;
            }
        }


        int[] Europe = new int[10];
        int countE = 0;
        while (countE < 10){
            int randomm = (int)(Math.random()*(2705-1+1)+1);
            String data1[] = all_lines[randomm].split(",");
            String name = data1[24];
            if (name.equals("Europe")){
                Europe[countE] = randomm;
                countE++;
            }
        }

        int[] Asia = new int[10];
        int countAS = 0;
        while (countAS < 10){
            int randomm = (int)(Math.random()*(2705-1+1)+1);
            String data1[] = all_lines[randomm].split(",");
            String name = data1[24];
            if (name.equals("Asia")){
                Asia[countO] = randomm;
                countAS++;
            }
        }

        int[] Africa = new int[10];
        int countAF = 0;
        while (countAF < 10){
            int randomm = (int)(Math.random()*(2705-1+1)+1);
            String data1[] = all_lines[randomm].split(",");
            String name = data1[24];
            if (name.equals("Africa")){
                Africa[countO] = randomm;
                countAF++;
            }
        }

        //making america country objects
        CountryStat[] Countries = new CountryStat[60];
        for (int k = 0; k < 60; k++){
            //String a = all_lines[Americas[k]];
            if (k >= 0 && k <= 9){
                for (int blah:Americas){
                    String[] data = all_lines[blah].split(",");
                    String a = data[0];
                    String b = data[24];
                    double c = Integer.parseInt(data[17]);
                    CountryStat s = new CountryStat(a, b, c);
                    Countries[k] = s;
                }
            }
            if (k >= 10 && k <= 19){
                for (int blah:Oceania){
                    String[] data = all_lines[blah].split(",");
                    String a = data[0];
                    String b = data[24];
                    double c = Integer.parseInt(data[17]);
                    CountryStat s = new CountryStat(a, b, c);
                    Countries[k] = s;
                }
            }
            if (k >= 20 && k <= 29){
                for (int blah:Middle_East){
                    String[] data = all_lines[blah].split(",");
                    String a = data[0];
                    String b = data[24];
                    double c = Integer.parseInt(data[17]);
                    CountryStat s = new CountryStat(a, b, c);
                    Countries[k] = s;
                }
            }
            if (k >= 30 && k <= 39){
                for (int blah:Europe){
                    String[] data = all_lines[blah].split(",");
                    String a = data[0];
                    String b = data[24];
                    double c = Integer.parseInt(data[17]);
                    CountryStat s = new CountryStat(a, b, c);
                    Countries[k] = s;
                }
            }

            if (k >= 40 && k <= 49){
                for (int blah:Asia){
                    String[] data = all_lines[blah].split(",");
                    String a = data[0];
                    String b = data[24];
                    double c = Integer.parseInt(data[17]);
                    CountryStat s = new CountryStat(a, b, c);
                    Countries[k] = s;
                }
            }

            if (k >= 50 && k <= 59){
                for (int blah:Africa){
                    String[] data = all_lines[blah].split(",");
                    String a = data[0];
                    String b = data[24];
                    double c = Integer.parseInt(data[17]);
                    CountryStat s = new CountryStat(a, b, c);
                    Countries[k] = s;
                }
            }
        }
            //now countries has 60 country objects with name, region, and mobile usage
            //need to find average mobile usage for each continent and then compare them to answer the question
            int Americas_mobile_usage = 0;
            for (int j = 0; j <=9; j++){
                Americas_mobile_usage += Countries[j].getMobile_usage();
            }
            Americas_mobile_usage /= 10; //western hemisphere average mobile usage

            int Oceania_mobile_usage = 0;
            for (int j = 10; j <=19; j++){
                Oceania_mobile_usage += Countries[j].getMobile_usage();
            }
            Oceania_mobile_usage /= 10; //Oceania average mobile usage 

            int Middle_East_mobile_usage = 0;
            for (int j = 20; j <=29; j++){
                Middle_East_mobile_usage += Countries[j].getMobile_usage();
            }
            Middle_East_mobile_usage /= 10; //Middle East average mobile usage

            int Europe_mobile_usage = 0;
            for (int j = 30; j <=39; j++){
                Europe_mobile_usage += Countries[j].getMobile_usage();
            }
            Europe_mobile_usage /= 10; //Europe average mobile usage    

            int Asia_mobile_usage = 0;
            for (int j = 40; j <=49; j++){
                Asia_mobile_usage += Countries[j].getMobile_usage();
            }
            Asia_mobile_usage /= 10; //Asia average mobile usage

            int Africa_mobile_usage = 0;
            for (int j = 50; j <=59; j++){
                Africa_mobile_usage += Countries[j].getMobile_usage();
            }
            Africa_mobile_usage /= 10; //Africa average mobile usage    

            int eastern_hemisphere_mobile_usage = Oceania_mobile_usage + Middle_East_mobile_usage + Europe_mobile_usage + Asia_mobile_usage + Africa_mobile_usage;
            eastern_hemisphere_mobile_usage /= 5;
            int western_hemisphere_mobile_usage = Americas_mobile_usage;

            System.out.println("Eastern Hemisphere Average Mobile Usage: " + eastern_hemisphere_mobile_usage);
            System.out.println("Western Hemisphere Average Mobile Usage: " + western_hemisphere_mobile_usage);

            for (int m = 0; m < 60; m++){
                System.out.println(Countries[m].toString());
            }
    }
}
