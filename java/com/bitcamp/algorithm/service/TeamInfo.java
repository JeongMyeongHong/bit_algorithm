package com.bitcamp.algorithm.service;

import com.bitcamp.algorithm.domain.TeamDTO;

/**
 * packageName   :   com.bitcamp.algorithm.service
 * fileName      :   TeamInfo
 * author        :   JeongMyeongHong
 * date          :   2022-02-03
 * desc          :
 * ============================================
 * DATE             AUTHOR              NOTE
 * ============================================
 * 2022-02-03      JeongMyoengHong     최초 생성
 */
public class TeamInfo {
    public void infoPrint(TeamDTO team) {
//        for (int i = 0; i < team.getFour()[0].length; i++) {
//            for (int j = 0; j < team.getFour().length; j++) {
//                if (team.getFour()[j][i] != null) {
//                    System.out.print(team.getFour()[j][i] + " ");
//                }
//            }
//            System.out.println("");
//        }


        String s = "";
        System.out.println("Q1. 팀별 과제를 출력하세요");
        for (int i = 0; i < team.getFour().length; i++) {
            if (team.getFour()[i] != null) {
                s += String.format("%s \t", team.getFour()[i]);
            }
            if (i % 5 == 4) {
                s += "\n";
            }
        }
        System.out.println(s);


        /*
        Q2. 팀장이 맡은 과제만 출력하세요
        홍정명, DFS, BFS, Stack, Queue
         */
        System.out.println("Q2. 팀장이 맡은 과제만 출력하세요");
        s = "";
        String leader = "전종현";
        for (int i = 0; i < team.getFour().length; i++) {
            if (team.getFour()[i].equals(leader)) {
                for (int j = i; j < team.getFour().length; j += 5) {
                    if (team.getFour()[j] != "") {
                        s += team.getFour()[j] + ",";
                    }
                }
            }
        }
        System.out.println(s + "\n");



        /*
        Q3. 큐를 담당한 사람을 출력하세요
        큐를 담당한 사람 : 홍정명
         */

        String subject = "Queue";
        System.out.printf("Q3. %s를 담당한 사람을 출력하세요\n", subject);
        for (int i = 0; i < team.getFour().length; i++) {
            if (team.getFour()[i].equals(subject)) {
                s = String.format("%s를 담당한 사람 : %s", subject, team.getFour()[i % 5]);
            }
        }
        System.out.println(s + "\n");



        /*
        Q4. 팀원별 과제 수를 출력하세요.
        홍정명(4개), 노홍주(2개), 양정오(2개), 전종현(2개), 정경준(2개),
         */
        System.out.println("Q4 팀원별 과제 수를 출력하세요");
        int[] cnt = new int[5];
        s = "";

        for (int i = 0; i < team.getFour().length; i++) {
            if (team.getFour()[i] != "") {
                switch (i % 5) {
                    case 0:
                        cnt[0]++;
                        break;
                    case 1:
                        cnt[1]++;
                        break;
                    case 2:
                        cnt[2]++;
                        break;
                    case 3:
                        cnt[3]++;
                        break;
                    case 4:
                        cnt[4]++;
                        break;
                    default:
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            s += String.format("%s(%s개) ", team.getFour()[i], cnt[i] - 1);
        }
        System.out.println(s);


    }
}
