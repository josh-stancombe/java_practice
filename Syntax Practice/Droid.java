// Build a droid - Java practice.


public class Droid {

  public static void main(String[] args){
    Droid codey = new Droid("Codey");
    System.out.println(codey);
    
    // Perform some tasks
    codey.performTask("Dancing...");
    codey.performTask("Writing some scripts...");
    codey.performTask("Finding a solution to World peace...");

    // Output battery level:
    System.out.println("Current battery level: " + codey.batteryLevel);
  }

  // Define batteryLevel and Name variables
  int batteryLevel;
  String name;

  // Create Droid Instance
  public Droid(String droidName){
    name = droidName;
    batteryLevel = 100;
  }

  // String description
  public String toString(){
    return "Hello, my name is " + name + "! I am a Java developed droid...";
  }

  // Perform Task method.
  public void performTask(String task){
    System.out.println(name + " is performing task: " + task);
    batteryLevel -= 20;
  }
}