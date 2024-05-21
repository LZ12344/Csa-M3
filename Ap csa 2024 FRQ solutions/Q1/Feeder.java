public class Feeder {

  private int currentFood;

  Feeder(int food){
    currentFood = food;
  }

public void simulateOneDay(int numBirds) {
int percent = (int) Math.random() * 100;
int birdEat = (int) (Math.random() * 41) + 10;
  if(percent > 95){
    currentFood = 0;
  }

  currentFood -= numBirds * birdEat;
}

public int simulateManyDays(int numBirds, int numDays) {
  int day = 0;
  if(currentFood <= 0){
    return 0;
  }
  for(int i = 0; i < numDays; i++){
    simulateOneDay(numBirds);
    day++;
    if(currentFood <= 0){
      return day;
    }
  }

return currentFood;
}

  
}
