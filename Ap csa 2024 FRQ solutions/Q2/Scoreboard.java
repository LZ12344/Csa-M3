public class Scoreboard {

  private String team1 = "";
  private String team2 = "";
  private int currentT =1;
  private int t1Score =0;
  private int t2Score =0;
  
 Scoreboard(String t1, String t2){
  team1 = t1;
  team2 = t2;
}

public void recordPlay(int num){

  if (num == 0){
    currentT++;
  }
else if(num%2 != 0){
  t1Score +=num;
}else{
  t2Score +=num;
}
  
}

public String getScore (){
  String current ="";
  if(currentT %2 != 0){
    current = team1;
  }else{
    current = team2;
  }

  return t1Score + "-" + t2Score + "-" + current;
}


  
}
