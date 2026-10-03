import java.util.Scanner;
public class SolarEnergyGenerated{
    public static double calculateTotalEnergy(double morningEnergy, double eveningEnergy) {
        return morningEnergy + eveningEnergy;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter morning energy generation: ");
        double morning = sc.nextDouble();
        System.out.print("Enter evening energy generation: ");
        double evening = sc.nextDouble();
        double totalEnergy = calculateTotalEnergy(morning, evening);
        System.out.println("Total Energy Generated: " + totalEnergy + " kWh");

        sc.close();
    }
}