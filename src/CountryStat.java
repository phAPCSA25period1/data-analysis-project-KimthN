/**
 * Represents one row from your dataset.
 *
 
 *  - Rename the class to match your dataset (e.g., Pokemon, StateData, CountryStat)
 *  - Add at least 3 private attributes based on your CSV columns
 *  - Write a constructor that initializes all attributes
 *  - Add getter methods for the attributes you need in your analysis
 *  - Override toString() to display the object's data
 *  - Add Javadoc comments for the class and all methods
 */
public class CountryStat {

    // Example:
    // private String name;
    // private int population;
    // private double value;
    private String name;
    private String region;
    private double mobile_usage;

    public CountryStat(String name, String region, double mobile_usage){
        this.name = name;
        this.region = region;
        this.mobile_usage = mobile_usage;
    }

    public String getName(){
        return name;
    }

    public String getRegion(){
        return region;
    }

    public double getMobile_usage(){
        return mobile_usage;
    }

    @Override
    public String toString(){
        return "The country's name is " + name + ". The country is in " + region + ". " + name + " has a mobile phone usage of " + mobile_usage + ".";
    }



    //public CountryStat(){
    //}


}