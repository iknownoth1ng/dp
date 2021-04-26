package com.owl.dp.behaviorpattern.state.state;

import com.owl.dp.behaviorpattern.state.context.Activity;

/**
 * @author by 15515
 * @Classname DispenseOutState
 * @Description TODO 奖品发送完的状态
 * @Date 2021/4/22 0:24
 **/
public class DispenseOutState extends State {
    @Override
    public void reduceMoney(Activity activity) {
        System.out.println("奖品发送完了，不能再扣除积分了~");
    }

    @Override
    public boolean raffle(Activity activity) {
        System.out.println("奖品发送完了,不能再抽奖了~");
        return false;
    }

    @Override
    public void dispensePrize(Activity activity) {
        System.out.println("奖品发送完了,请下次参加~");
    }
}
