package com.bitcamp.algorithm.controller;

import com.bitcamp.algorithm.domain.TeamDTO;
import com.bitcamp.algorithm.service.QuizService;
import com.bitcamp.algorithm.service.QuizServiceImpl;

import java.util.Scanner;

/**
 * packageName   :   com.bitcamp.algorithm.controller
 * fileName      :   QuizController
 * author        :   JeongMyeongHong
 * date          :   2022-02-07
 * desc          :
 * ============================================
 * DATE             AUTHOR              NOTE
 * ============================================
 * 2022-02-07      JeongMyoengHong     최초 생성
 */
public class QuizController {
    public static void main(String[] args) {
        QuizService quizService = new QuizServiceImpl();
        TeamDTO team = new TeamDTO();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1~6번 입력. 0.시스템종료");
            switch (scanner.next()) {
                case "0":
                    return;
                case "1":
                    quizService.quiz1(team);
                    break;
                case "2":
                    quizService.quiz2(team);
                    break;
                case "3":
                    quizService.quiz3(team);
                    break;
                case "4":
                    quizService.quiz4(team);
                    break;
                case "5":
                    quizService.quiz5(team);
                    break;
                case"6":
                    quizService.quiz6(team);
                    break;
                default:
                    System.out.println("잘못된 번호 입력");
            }
        }
    }

}
