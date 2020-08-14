package main;

import java.util.ArrayList;

public class DiscFactory {
//Creating a private  constructor to make one object. and it can't be accessed outside.
    private DiscFactory obj;
    private DiscFactory getInstance(){
        if(obj == null){
            obj  = new DiscFactory();
        }
        return obj;
    }
     DiscType e;
    ArrayList<DiscDollar> discDollar = new ArrayList<>();
    ArrayList<DiscPer> discPer = new ArrayList<>();
        public Discounts makingDiscounts(DiscType e){
        if( e == DiscType.DOLLAR){
            discDollar.add(new DiscDollar(0));
            return discDollar.get(0);
        }else if(e == DiscType.PERCENTAGE){
            discPer.add(new DiscPer());
            return discPer.get(0);
        }
        return null;
    }
}
