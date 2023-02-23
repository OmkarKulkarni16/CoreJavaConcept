public class MetthodOverloading {
    public static void main(String[] args) {
        System.out.println(convertToCentimeters(68));
        System.out.println(convertToCentimeters(5,8));
    }
    public  static  double convertToCentimeters(int heightInInches){
           double toCentimeters = heightInInches * 2.54;
           return toCentimeters;
    }
    public  static  double convertToCentimeters(int heightInFeet , int remainingHeight){
            int inches = ((12 * heightInFeet) + remainingHeight);
            double cm = convertToCentimeters(inches);
            return cm;
    }
}
