package com.bitcamp.algorithm.controller;

import com.bitcamp.algorithm.domain.*;
import com.bitcamp.algorithm.service.TeamInfo;

import java.util.Scanner;

/**
 * packageName   :   com.bitcamp.algorithm.controller
 * fileName      :   algorithmController
 * author        :   JeongMyeongHong
 * date          :   2022-01-31
 * desc          :
 * ============================================
 * DATE             AUTHOR              NOTE
 * ============================================
 * 2022-01-31      JeongMyoengHong     최초 생성
 */
public class algorithmController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dfs dfs = new Dfs();
        Bfs bfs = new Bfs();
        Stack stack = new Stack();
        Queue queue = new Queue();
        Sort sort = new Sort();
        Heap heap = new Heap();
        BinSearch binSearch = new BinSearch();
        Graph graph = new Graph();
        Hash hash = new Hash();
        Greedy greedy = new Greedy();
        BruteForce bruteForce = new BruteForce();
        Dp dp = new Dp();
        TeamInfo teamInfo = new TeamInfo();
        TeamDTO team = new TeamDTO();

        teamInfo.infoPrint(team);

        /*while (true) {
            System.out.println("[MENU] 0.EXIT\n" +
                    "[홍정명] 1. dfs \t" +
                    "2. bfs \t" +
                    "3. stack \t" +
                    "4. queue \n" +
                    "[노홍주] 5. sort \t" +
                    "6. heap \n" +
                    "[양정오] 7. bin search \t" +
                    "8. graph \n" +
                    "[전종현] 9. hash \t" +
                    "10. greedy \n" +
                    "[정경준] 11. brute force \t" +
                    "12. dp");
            switch (scanner.next()) {
                case "0":
                    System.out.println("프로그램 종료");
                    return;
                case "1":
                    dfs.ex();
                    break;
                case "2":
                    bfs.ex();
                    break;
                case "3":
                    stack.ex();
                    break;
                case "4":
                    queue.ex();
                    break;
                case "5":
                    sort.ex();
                    break;
                case "6":
                    heap.ex();
                    break;
                case "7":
                    binSearch.ex();
                    break;
                case "8":
                    graph.ex();
                    break;
                case "9":
                    hash.ex();
                    break;
                case "10":
                    greedy.ex();
                    break;
                case "11":
                    bruteForce.ex();
                    break;
                case "12":
                    dp.ex();
                    break;
                default:
                    System.out.println("Wrong Number");
            }
        }*/
    }
}
