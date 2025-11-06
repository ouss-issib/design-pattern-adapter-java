package ouss.issib;

import ouss.issib.computer.Tv;
import ouss.issib.computer.UniteCentrale;
import ouss.issib.computer.VideoProjctor;

public class Main {
    public static void main(String[] args) {
        UniteCentrale uc = new UniteCentrale();
        uc.setVga(new Tv());
        uc.print("Hello From TV");

        uc.setVga(new VideoProjctor());
        uc.print("Hello From Video Projector");
    }
}