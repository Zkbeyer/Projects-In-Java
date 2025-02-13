public class Temperature {
    //initialize variables
    double fTemp;

    //constructor
    public Temperature(double f) {
        fTemp = f;
    }

    //Function to set the Fahrenheit Temp
    public void setFahrenheit(double f){
        fTemp = f;
    }

    //Function to get the temp Fahrenheit var
    public double getFahrenheit(){
        return fTemp;
    }

    //Function to get the temp in Celsius
    public double getCelsius(){
        return ((fTemp -32) * (5.0/9));
    }

    //Function to get temp in Kelvin
    public double getKelvin(){
        return ((fTemp -32)* (5.0/9)) + 273;
    }
}
