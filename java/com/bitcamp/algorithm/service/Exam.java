package com.bitcamp.algorithm.service;

import com.bitcamp.algorithm.domain.TeamDTO;

import java.util.Scanner;

/**
 * packageName   :   com.bitcamp.algorithm.controller
 * fileName      :   ArrayExam
 * author        :   JeongMyeongHong
 * date          :   2022-02-04
 * desc          :
 * ============================================
 * DATE             AUTHOR              NOTE
 * ============================================
 * 2022-02-04      JeongMyoengHong     최초 생성
 */
public class Exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TeamDTO team = new TeamDTO();

        while (true) {
            System.out.println("문제 번호 1~3 입력, 0.시스템 종료");
            switch (scanner.next()) {
                case "0":
                    return;
                case "1":
                    quiz1(team);
                    break;
                case "2":
                    quiz2(team);
                    break;
                case "3":
                    quiz3(team);
                    break;
                default:
                    System.out.println("잘못된 번호입니다.");
            }
        }
    }

    private static void quiz3(TeamDTO team) {
        String res = "";
        System.out.println("Q3. 큐를 담당한 사람을 출력하세요. 예) 큐를 담당한 사람: 홍정명 ");
        String subject = "Queue";
        for (int i = 0; i < team.getArr().length; i++) {
            if (team.getArr()[i].equals(subject)) {
                res = team.getArr()[i % 5];
            }
        }
        System.out.println(subject + "를 담당한사람 : " + res);
    }

    private static void quiz2(TeamDTO team) {
        String res = "";
        System.out.println("Q2. 팀장이 맡은 과제만 출력하세요. 예) 김진영, 힙, 그래프 ");
        String leader = "홍정명";
        for (int i = 0; i < team.getArr().length; i++) {
            if (team.getArr()[i].equals(leader)) {
                for (int j = 0; j < team.getArr().length / 5; j++) {
                    res += team.getArr()[i + j * 5] + "\t";
                }
            }
        }
        System.out.println(res + "\n");
    }

    private static void quiz1(TeamDTO team) {
        String res = "";
        System.out.println("Q1. 팀별 과제를 출력하세요 ");
        for (int i = 0; i < team.getArr().length; i++) {
            res += team.getArr()[i] + "\t\t";
            if (i % 5 == 4) {
                res += "\n";
            }
        }
        System.out.println(res);
    }

}
