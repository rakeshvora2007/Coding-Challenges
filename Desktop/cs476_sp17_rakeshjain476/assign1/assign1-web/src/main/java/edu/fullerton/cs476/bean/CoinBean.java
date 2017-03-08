package edu.fullerton.cs476.bean;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import java.util.Random;

/**
 * Created by Rakesh J on 3/2/2017.
 */

@ManagedBean(name = "coinBean")
@ApplicationScoped
public class CoinBean {

    Random randomNum = new Random();
    int flip;
    String coin;

    public int getFlip() {
        return flip;
    }

    public void setFlip(int flip) {
        this.flip = flip;
    }

    public String getCoin() {
        return coin;
    }

    public void setCoin(String coin) {
        this.coin = coin;
    }

    public void coinFlippingLogic(){

        StringBuilder str= new StringBuilder();

        for (int i =0; i<flip; i++) {
            int result = randomNum.nextInt(2);
            if (result == 0) {
                str.append("H ");

            } else {
                str.append("T ");

            }
        }
        setCoin(str.toString());


    }
}
