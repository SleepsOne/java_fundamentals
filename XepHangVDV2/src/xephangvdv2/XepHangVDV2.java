import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Athlete implements Comparable<Athlete>{
    public static int count = 1;
    private String athleteID;
    private String athleteName;
    private String athleteDob;
    private String startTime;
    private String endTime;
    private Long age, time, rank, finalTime;

    public Athlete(String athleteName, String athleteDob, String startTime, String endTime) throws ParseException {
        this.athleteID = "VDV" + String.format("%02d", count++);
        this.athleteName = athleteName;
        this.age = 2021 - Long.parseLong(athleteDob.split("/")[2]);
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        this.startTime = startTime;
        this.endTime = endTime;
        this.time = (dateFormat.parse(endTime).getTime() - dateFormat.parse(startTime).getTime()) / 1000;
        this.finalTime = time - priorityTime(age);
    }
    public Long priorityTime(Long age){
        if(age < 18)return 0L;
        if(age < 25)return 1L;
        if(age < 32)return 2L;
        return 3L;
    }
    public String formatTime(Long time){
        Long hour = time / 3600;
        Long minute = (time - hour * 3600) / 60;
        Long second = time - hour * 3600 - minute * 60;
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public void setRank(Long rank) {
        this.rank = rank;
    }

    public Long getFinalTime() {
        return finalTime;
    }

    @Override
    public String toString() {
        return athleteID + " " + athleteName + " " + formatTime(time) + " " + formatTime(priorityTime(age)) + " " + formatTime(finalTime) + " " + rank;
    }

    @Override
    public int compareTo(Athlete o) {
        return (int) (finalTime - o.finalTime);
    }
}


public class XepHangVDV2 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        ArrayList<Athlete> list = new ArrayList<>(), temp = new ArrayList<>();
        while(test-- != 0){
            Athlete x = new Athlete(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            list.add(x);
            temp.add(x);
        }
        Collections.sort(temp);
        long curTime = temp.get(0).getFinalTime();
        long tempRank = 1, dis = 0;
        for(Athlete x : temp){
            if(x.getFinalTime() != curTime){
                curTime = Math.max(curTime, x.getFinalTime());
                tempRank += dis;
                dis = 1;
            }else{
                dis++;
            }
            //System.out.println(x.getFinalTime() + " " + curTime);
            x.setRank(tempRank);
        }
        for(Athlete x : list){
            System.out.println(x);
        }
    }
}

/*
4
Nguyen Van Thanh
20/03/1990
07:00:00
07:10:01
Nguyen Hoa Binh
01/10/1993
07:02:00
07:11:20
Le Thanh Van
15/03/1998
07:05:00
07:15:30
Nguyen Van Cuong
20/03/1990
07:00:00
07:10:01
 */