package com.owl.dp.behaviorpattern.state.context;

import com.owl.dp.behaviorpattern.state.state.*;
import lombok.Data;

/**
 * @author by 15515
 * @Classname Activity
 * @Description TODO
 * @Date 2021/4/21 23:36
 **/
@Data
public class Activity {
    /**
     * 0.不能抽奖
     * 1.可以抽奖
     * 2.发放奖品
     * 3.奖品领完
     **/
    private State state;

    private NoRaffleState noRaffleState = new NoRaffleState();

    private CanRaffleState canRaffleState = new CanRaffleState();

    private DispenseState dispenseState = new DispenseState();

    private DispenseOutState dispenseOutState = new DispenseOutState();

    //奖品数量
    private int prizeNumber;

    public Activity(int prizeNumber) {
        this.state = noRaffleState;
        this.prizeNumber = prizeNumber;
    }


    public void reduceMoney() {
        state.reduceMoney(this);
    }

    public void raffle() {
        if (state.raffle(this)) {
            state.dispensePrize(this);
        }
    }

}
