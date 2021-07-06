public class alphabetfight{
    public static String alphabetWar(String fight){
        char[] l = {'s','b','p','w'};
        char[] r = {'z','d','q','m'};
        char[] c = fight.toCharArray();
        int left = 0;
        int right = 0;
      
       for (int i = 0; i < c.length; i++) {
        for(int j = 0; j < 4; j++) {
          if (c[i] == l[j]) {
            left += j + 1;
          }
          if (c[i] == r[j]) {
            right += j + 1;
          }
        }
       }
      
      if (left > right) {
        return "Left side wins!";
      } else if (right > left) {
        return "Right side wins!";
      } else {
        return "Let's fight again!";
      }
    }
}