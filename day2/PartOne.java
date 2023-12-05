public class AOC_SECOND_DAY {
    public static void main(String[] args) {
      ArrayList<String> games = new ArrayList<String>() {{
            add("Game 1: 3 blue, 4 red; 1 red, 2 green, 6 blue; 2 green");
            add("Game 2: 1 blue, 2 green; 3 green, 4 blue, 1 red; 1 green, 1 blue");
            add("Game 3: 8 green, 6 blue, 20 red; 5 blue, 4 red, 13 green; 5 green, 1 red");
            add("Game 4: 1 green, 3 red, 6 blue; 3 green, 6 red; 3 green, 15 blue, 14 red");
            add("Game 5: 6 red, 1 blue, 3 green; 2 blue, 1 red, 2 green");      
      }};      
      System.out.println(getSumOfGameIds(games));
    }

    private static int getSumOfGameIds(ArrayList<String> games) {
        int sum = 0;
        for(int i = 0; i < games.size(); i++){
            String[] game = games.get(i).split(": ");
            int id = Integer.parseInt(game[0].split(" ")[1]);
            String[] gameSets = game[1].trim().split(";");
            boolean isGamePossible = true;
            for(int j = 0; j < gameSets.length; j++){
                String[] balls = gameSets[j].trim().split(",");
                for(int k = 0; k < balls.length; k++){
                    String[] ball = balls[k].trim().split(" ");
                    if(ball[1].equals("green") && Integer.parseInt(ball[0]) > 13){
                        isGamePossible = false;
                        break;
                    }
                    if(ball[1].equals("blue") && Integer.parseInt(ball[0]) > 14){
                        isGamePossible = false;
                        break;
                    }
                    if(ball[1].equals("red") && Integer.parseInt(ball[0]) > 12){
                        isGamePossible = false;
                        break;
                    }
                }

                if(!isGamePossible){
                    break;
                }
            }

            if(isGamePossible){
                sum += id;
            }
        }
        return sum;
    }
