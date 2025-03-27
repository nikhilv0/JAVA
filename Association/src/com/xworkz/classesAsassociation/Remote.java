package com.xworkz.classesAsassociation;

public class Remote {
    private int signalRange;
    private String accessControl ;

    public Remote(int signalRange,String accessControl)
    {
        this.signalRange=signalRange;
        this.accessControl=accessControl;

    }
    public void remotedisplay()
    {
        System.out.println("running Remote");
        System.out.println("Singal Range:"+this.signalRange);
        System.out.println("Acess Control:"+this.accessControl);
    }
}
