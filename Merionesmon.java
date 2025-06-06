import java.util.Scanner;

public class ElectricalCurrentCalculator {
    
    public static double calculateCurrent(double voltage, double resistance) {
        return voltage / resistance;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Electrical Current Calculator");
        System.out.println("-----------------------------------");
        
        try {
            System.out.print("Enter voltage (V): ");
            double voltage = scanner.nextDouble();
            
            System.out.print("Enter resistance (Ω): ");
            double resistance = scanner.nextDouble();
            
            if (resistance == 0) {
                System.out.println("Error: Resistance cannot be zero (division by zero).");
                return;
            }
            
            double current = calculateCurrent(voltage, resistance);
            
            System.out.println("\nResults:");
            System.out.printf("Voltage: %.3f V%n", voltage);
            System.out.printf("Resistance: %.3f Ω%n", resistance);
            System.out.printf("Current: %.3f A%n", current);
            
            // Calculate power using P = V * I
            double power = voltage * current;
            System.out.printf("Power: %.3f W%n", power);
            
        } catch (Exception e) {
            System.out.println("Error: Please enter valid numerical values.");
        } finally {
            scanner.close();
        }
    }
}