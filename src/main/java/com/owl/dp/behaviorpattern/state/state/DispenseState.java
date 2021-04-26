package com.owl.dp.behaviorpattern.state.state;

import com.owl.dp.behaviorpattern.state.context.Activity;

/**
 * @author by 15515
 * @Classname DispenseState
 * @Description TODO 发送奖品的状态
 * @Date 2021/4/22 0:23
 **/
public class DispenseState extends State {
    @Override
    public void reduceMoney(Activity activity) {
        System.out.println("你已经扣除过积分，不能再扣除积分了~");
    }

    @Override
    public boolean raffle(Activity activity) {
        System.out.println("你已经中奖,不能再抽奖了~");
        return false;
    }

    @Override
    public void dispensePrize(Activity activity) {
        if (activity.getPrizeNumber() <= 0) {
            System.out.println("很遗憾奖品发放完了~");
            System.out.println("活动结束");
            //activity.setState(activity.getDispenseOutState());
        } else {
            System.out.println("恭喜你中奖，领取奖品一份~");
            if (activity.getPrizeNumber() - 1 == 0) {
                System.out.println("奖品发放完了，活动结束");
                System.exit(0);
            } else {
                activity.setPrizeNumber(activity.getPrizeNumber() - 1);
                activity.setState(activity.getNoRaffleState());
            }
        }
    }
}
