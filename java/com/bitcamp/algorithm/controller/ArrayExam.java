package com.bitcamp.algorithm.controller;

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
public class ArrayExam {
    public static void main(String[] args) {
        TeamDTO team = new TeamDTO();
        Scanner scanner = new Scanner(System.in);
        String res = "";

        System.out.println("Q1. 팀별 과제를 출력하세요 ");
        for (int i = 0; i < team.getFour().length; i++) {
            res += team.getFour()[i] + "\t\t";
            if (i % 5 == 4) {
                res += "\n";
            }
        }
        System.out.println(res);
        res = "";


        System.out.println("Q2. 팀장이 맡은 과제만 출력하세요. 예) 김진영, 힙, 그래프 ");
        System.out.print("팀장의 이름 입력 : ");
        String leader = scanner.next();
        for (int i = 0; i < team.getFour().length; i++) {
            if (team.getFour()[i].equals(leader)) {
                for (int j = 0; j < team.getFour().length / 5; j++) {
                    res += team.getFour()[i + j * 5]+"\t";
                }
            }
        }
        System.out.println(res+"\n");
        res = "";


        System.out.println("Q3. 큐를 담당한 사람을 출력하세요. 예) 큐를 담당한 사람: 권혜민 ");
        System.out.print("검색할 과목을 입력하세요 : ");
        String subject = scanner.next();
        for (int i = 0; i < team.getFour().length; i++) {
            if (team.getFour()[i].equals(subject)) {
                res = team.getFour()[i%5];
            }
        }
        System.out.println(subject+"를 담당한사람 : "+res);

    }

}
