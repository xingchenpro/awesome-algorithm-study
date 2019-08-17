package com.hly.OS;

import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;

/**
 * @author :hly
 * @date :2018/5/20
 */
public class LRU {
    public static List<Integer> list = new LinkedList<>();
    public static Integer[] visit = {7, 0, 1, 2, 0, 3, 0, 4, 2, 3, 0, 3, 2, 1, 2, 0, 1, 7, 0, 1};
    public static void LRU() {

            for (int i = 0; i < visit.length; i++) {
                boolean repect = false;
                if (list.size() <= 3) {
                for (int j = 0; j < list.size(); j++) {
                    if (list.get(j) == visit[i]) {
                        list.remove(j);
                        list.add(visit[i]);
                        repect = true;
                        break;
                    }

                }
                if (!repect) {
                    if (list.size() < 3) {
                        list.add(visit[i]);
                    } else {
                        list.remove(0);
                        list.add(visit[i]);
                    }
                }
                System.out.print("第" + ((i + 1) >= 10 ? (i + 1) : "0" + (i + 1)) + "轮的数为：");
                for (Integer k : list)
                    System.out.print(k + " ");
                System.out.println();
            }
        }
    }
    public static void main(String[] hly) {
        new LRU().LRU();
    }
}
