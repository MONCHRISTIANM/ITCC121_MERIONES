def calculate_current(voltage, resistance):

    return voltage / resistance

def main():
    print("Electrical Current Calculator")
    print("-----------------------------------")
    
    try:
        voltage = float(input("Enter voltage (V): "))
        resistance = float(input("Enter resistance (Ω): "))
        
        if resistance == 0:
            print("Error: Resistance cannot be zero (division by zero).")
            return
        
        current = calculate_current(voltage, resistance)
        
        print(f"\n Results:")
        print(f"Voltage: {voltage} V")
        print(f"Resistance: {resistance} Ω")
        print(f"Current: {current:.3f} A")
        
        
        power = voltage * current
        print(f"Power: {power:.3f} W")
        
    except ValueError:
        print("Error: Please enter valid numerical values.")

if __name__ == "__main__":
    main()
    