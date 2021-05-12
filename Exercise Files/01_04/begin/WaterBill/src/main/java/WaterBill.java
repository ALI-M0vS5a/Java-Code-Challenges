import java.util.Scanner;

public class WaterBill {

    public static double calculateWaterBill(double gallonsUsage) {
		double minimumwaterBill = 18.84;
		double numberofgallonsinCCF = 748;
		double includedgallons = 2 * numberofgallonsinCCF;
		
		if(gallonsUsage <= minimumwaterBill) {
			return minimumwaterBill;
		}else {
			double extragallonsUsed = gallonsUsage - includedgallons;
			double extraamountowed = Math.ceil(extragallonsUsed/numberofgallonsinCCF)*3.90;
			return minimumwaterBill + extraamountowed;
		}
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many gallons of water " +
                "did you use this month?");
        double usage = scanner.nextDouble();
        System.out.println("Your water bill is " +
                calculateWaterBill(usage));
        scanner.close();
    }
}
