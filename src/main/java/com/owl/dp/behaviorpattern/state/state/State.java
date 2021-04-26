package com.owl.dp.behaviorpattern.state.state;

import com.owl.dp.behaviorpattern.state.context.Activity;

/**
 * @author by 15515
 * @Classname State
 * @Description TODO 状态抽象类
 * @Date 2021/4/21 23:37
 **/
public abstract class State {
    //扣除积分
    public abstract void reduceMoney(Activity activity);
    //是否得奖
    public abstract boolean raffle(Activity activity);
    //发放奖品
    public abstract void dispensePrize(Activity activity);
}
