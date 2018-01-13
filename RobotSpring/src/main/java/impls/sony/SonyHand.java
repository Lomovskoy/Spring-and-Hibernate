package impls.sony;

import interfaces.Hand;

public class SonyHand implements Hand {

    @Override
    public void catchSomething() {
        System.out.println("Catched from Sony!!");
    }

}
