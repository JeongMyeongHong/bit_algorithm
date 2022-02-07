package com.bitcamp.algorithm.service;

/**
 * packageName   :   com.bitcamp.algorithm.service
 * fileName      :   test
 * author        :   JeongMyeongHong
 * date          :   2022-02-07
 * desc          :
 * ============================================
 * DATE             AUTHOR              NOTE
 * ============================================
 * 2022-02-07      JeongMyoengHong     최초 생성
 */
public class test {
    public static void main(String[] args) {

        String[] arr = {"홍정명", "노홍주", "양정오", "전종현", "정경준",
                "DFS", "Sort", "BinSearch", "Hash", "BruteForce",
                "BFS", "Heap", "Graph", "Greedy", "DP",
                "Stack", "Queue"};
        /*팀원이 n명, 팀원+과제 수 = m,    m-n = x   x/n = y1, x%n = y2

        ex)_ 팀원이 5명, 팀원+과제수 = 17(배열의 길이), m-n = 12(과제수)
              x/n = 2(과제를 공평하게 나눈 갯수), x%n = 2(과제를 공평하게 나눈 후 나머지, 앞사람 2명이 +1씩 가져간다.)

            단점 : 단일 값의 저장이 안된다(저장하려면 결국 int배열 써서 저장해야함)
                 , 남은 과제는 무조건 앞사람 n명이 과제를 나눠야한다.
         */
        int n = 5;
        int m = arr.length;
        int x = m - n;
        int y1 = x / n;
        int y2 = x % n;
        String res = "";

        for (int i = 0; i < n; i++) {
            res += (arr[i] + " : ");
            res += (i < y2) ? String.format((y1 + 1) + "개\n") :
                    String.format(y1 + "개\n");
        }
        System.out.println(res);
    }
}
