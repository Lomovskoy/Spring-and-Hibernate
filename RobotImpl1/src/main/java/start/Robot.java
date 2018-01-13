package start;

import interfaces.Hand;
import interfaces.Head;
import interfaces.Leg;

public class Robot {

    private final Hand hand;
    private final Leg leg;
    private final Head head;

    public Robot(Hand hand, Leg leg, Head head) {
        super();
        this.hand = hand;
        this.leg = leg;
        this.head = head;
    }

    public void action() {
        head.calc();
        hand.catchSomething();
        leg.go();
    }

}
