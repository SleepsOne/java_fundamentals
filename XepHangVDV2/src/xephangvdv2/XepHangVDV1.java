
package xephangvdv2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

class VanDV{
    private String ma, ten;
    private String dob, startTime, endTime;
    private long sTime_sc;
    private long eTime_sc;
    private int age;
    private static int dem = 1;
    private int bonusTime = 0;
    private long rankTime;
    private int rank;

    public VanDV(String ten, String dob, String startTime, String endTime) {
        ma = "VDV" + String.format("%02d", dem++);
        this.ten = ten;
        age = 2021 - Integer.parseInt(dob.split("/")[2]);
        if (age >= 32){
            bonusTime = 3;
        }
        else if (age >= 25){
            bonusTime = 2;
        }
        else if(age >= 18){
            bonusTime = 1;
        }       
        String[] s1 = startTime.split(":");
        String[] s2 = endTime.split(":");
        sTime_sc = Long.parseLong(s1[0]) * 3600
                + Long.parseLong(s1[1]) * 60
                + Long.parseLong(s1[2]);
        eTime_sc = Long.parseLong(s2[0]) * 3600
                + Long.parseLong(s2[1]) * 60
                + Long.parseLong(s2[2]);
        rankTime = eTime_sc - sTime_sc - (long)bonusTime;
    }
    public String convertTime(long time){
        long gio = time / 3600;
        long phut = (time - gio * 3600) / 60;
        long giay = time - gio * 3600 - phut*60;
        return String.format("%02d:%02d:%02d", gio, phut, giay);
    }

    public long getRankTime() {
        return rankTime;
    }

    public void setRankTime(long rankTime) {
        this.rankTime = rankTime;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
    
    
    
    @Override
    public String toString() {
        return ma + " " + ten + " " + convertTime(eTime_sc-sTime_sc) + " " + convertTime((long)bonusTime) 
                    + " " + convertTime(rankTime) + " " + rank;
    }
    
     
}


public class XepHangVDV1 {

    public static void main(String[] args) {
        System.out.println(Math.round(9.5));
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List <VanDV> list = new ArrayList<>();
        while (n --> 0){
            list.add(new VanDV(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        TreeSet <Long> set = new TreeSet<>();
        for (VanDV x : list){
            set.add(x.getRankTime());
        }
        int cnt = 1;
        
        for (Long x : set){
            int dem = 0;
            for (VanDV y : list){
                if (x.equals(y.getRankTime())){
                    dem++;
                    y.setRank(cnt);
                }
            }
            cnt+=dem;
        }
        Collections.sort(list, (o1, o2) -> o1.getRank() - o2.getRank());
        for (VanDV x : list){
            System.out.println(x);
        }
            
    }
    
}

