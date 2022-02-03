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
        for (int i = 0; i < team.getFour().length / 5; i++) {
            System.out.println(team.getFour()[i] + " : " +
                    team.getFour()[i + 5] + ", " +
                    team.getFour()[i + 10] + ", " +
                    team.getFour()[i + 15] + ", " +
                    team.getFour()[i + 20]);
        }
    }
}
