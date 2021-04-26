package com.owl.dp.behaviorpattern.state.state;

import com.owl.dp.behaviorpattern.state.context.Activity;

import java.util.Random;

/**
 * @author by 15515
 * @Classname CanRaffleState
 * @Description TODO 可以抽奖
 * @Date 2021/4/21 23:37
 **/
public class CanRaffleState extends State {
    @Override
    public void reduceMoney(Activity activity) {
        System.out.println("你已经扣除过积分，不能再扣除积分了~");
    }

    @Override
    public boolean raffle(Activity activity) {
        System.out.println("开始抽奖~");
        Random random = new Random();
        int num = random.nextInt(10);
        if (num == 0) {
            System.out.println("恭喜中奖~");
            activity.setState(activity.getDispenseState());
            return true;
        } else {
            System.out.println("未中奖~");
            activity.setState(activity.getNoRaffleState());
            return false;
        }
    }

    @Override
    public void dispensePrize(Activity activity) {
        System.out.println("还没有中奖，不能领取奖品~");
    }
}
