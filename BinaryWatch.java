import java.util.*;

public class BinaryWatch {
    public static List<String> readBinaryWatch(int turnedOn) {
        List<String> ans=new ArrayList<>();
        for(int hour=0;hour<12;hour++){
            for(int minute=0;minute<60;minute++){
                int count=Integer.bitCount(hour)+Integer.bitCount(minute);
                if(count==turnedOn){
                    ans.add(hour + ":" + String.format("%02d", minute));
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int turnedOn=1;
        List<String> result=readBinaryWatch(turnedOn);
        System.out.println(result);
    }
}