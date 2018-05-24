package testing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Maps {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1930, "乌拉奎");
        map.put(1934, "意大利");
        map.put(1938, "意大利");
        map.put(1950, "乌拉奎");
        map.put(1954, "德国");
        map.put(1958, "巴西");
        map.put(1962, "巴西");
        map.put(1966, "英格兰");
        map.put(1970, "巴西");
        map.put(1974, "德国");
        map.put(1978, "阿根廷");
        map.put(1982, "意大利");
        map.put(1986, "阿根廷");
        map.put(1990, "德国");
        map.put(1994, "巴西");
        map.put(1998, "法国");
        map.put(2002, "巴西");
        map.put(2006, "意大利");

        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个年份：");
        int year = sc.nextInt();

        if (year >= 1 & year <= 2018) {
            if (map.containsKey(year)) {
                System.out.println("该年获胜的球队是：" + map.get(year) + "队！");
            } else {
                System.out.println("该年没有举办世界杯或暂无数据");
            }
        } else {
            System.out.println("请输入有效年份");
        }

    }
}
