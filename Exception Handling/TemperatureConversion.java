class InvalidTemperatureException extends Exception { public InvalidTemperatureException(String m){ super(m); } }

public class TemperatureConversion {
    public static double cToF(double c) throws InvalidTemperatureException {
        if(c < -273.15) throw new InvalidTemperatureException("Temperature below absolute zero!");
        return c*9/5 + 32;
    }

    public static double fToC(double f) throws InvalidTemperatureException {
        if(f < -459.67) throw new InvalidTemperatureException("Temperature below absolute zero!");
        return (f-32)*5/9;
    }

    public static void main(String[] args) {
        try { System.out.println("25C = "+cToF(25)+"F"); }
        catch(InvalidTemperatureException e) { System.out.println(e.getMessage()); }

        try { System.out.println("-500F = "+fToC(-500)+"C"); }
        catch(InvalidTemperatureException e) { System.out.println(e.getMessage()); }
    }
}
