public class VirtualPet {
    public static void main(String[] args) {
      String myCatName;
      int myCatEnergyLevel;
      int myCatHygiene;

      myCatName = "Bella";

     for (int time=0; time<24; time+=1) {
         if (time == 7) {
             System.out.println("Time is "+ time +"AM, Are you hungry?");
             System.out.println("Bella, meow meow!");
             System.out.println("Yes, you are hungry, go and eat!");
         } else if (time == 8) {
             System.out.println("Time is "+ time+ "AM, Bella, it is time to go to play");
         } else if (time == 12)
             System.out.println("Time is "+ time + "PM, Bella, it is time to sleep");
     }

     }



    }

