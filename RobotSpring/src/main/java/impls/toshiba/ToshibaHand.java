package impls.toshiba;

import interfaces.Hand;

public class ToshibaHand implements Hand {

    @Override
    public void catchSomething() {
        System.out.println("Catched from Toshiba!");
    }

}
