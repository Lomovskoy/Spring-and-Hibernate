package start;

import impls.sony.SonyHand;
import impls.sony.SonyHead;
import impls.toshiba.ToshibaLeg;

public class RobotConstructor {

    public static void main(String[] args) {

        SonyHand sonyHand = new SonyHand();
        ToshibaLeg toshibaLeg = new ToshibaLeg();
        SonyHead sonyHead = new SonyHead();

        Robot robot = new Robot(sonyHand, toshibaLeg, sonyHead);

        robot.action();

    }

}
