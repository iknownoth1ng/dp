package com.owl.dp.behaviorpattern.state.state;

import com.owl.dp.behaviorpattern.state.context.Activity;

/**
 * @author by 15515
 * @Classname NoRaffleState
 * @Description TODO 不能抽奖的状态
 * @Date 2021/4/21 23:37
 **/
public class NoRaffleState extends State {

    //当前状态是可以扣除积分的，扣除后将当前状态设置为可以抽奖状态
    @Override
    public void reduceMoney(Activity activity) {
        System.out.println("你已经被扣除了50积分~");
        activity.setState(activity.getCanRaffleState());
    }

    //当前状态是不能抽奖的
    @Override
    public boolean raffle(Activity activity) {
        System.out.println("当前状态不能抽奖，需要先扣除积分哦~");
        return false;
    }

    @Override
    public void dispensePrize(Activity activity) {
        System.out.println("当前状态不能发放奖品，需要先扣除积分哦~");
    }
}
