package com.owl.dp.behaviorpattern.state;

import com.owl.dp.behaviorpattern.state.context.Activity;
import com.owl.dp.behaviorpattern.state.state.NoRaffleState;

/**
 * @author by 15515
 * @Classname Client
 * @Description TODO
 * @Date 2021/4/22 0:47
 **/
public class Client {
    public static void main(String[] args) {
        //一个奖品
        Activity activity = new Activity(1);
        //抽100次
        for (int i = 0; i < 100; i++) {
            System.out.println("******第" + (i + 1) + "次抽奖******");
            activity.reduceMoney();
            activity.raffle();
        }
    }
}
