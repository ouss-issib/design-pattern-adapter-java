package ouss.issib;

import ouss.issib.adapter.HdmiVgaAdapter;
import ouss.issib.computer.*;

public class Main {
    public static void main(String[] args) {
        UniteCentrale uc = new UniteCentrale();
        uc.setVga(new Tv());
        uc.print("Hello From TV");

        uc.setVga(new VideoProjctor());
        uc.print("Hello From Video Projector");
        System.out.println();
        HdmiVgaAdapter hdmiVgaAdapter =  new HdmiVgaAdapter();
        hdmiVgaAdapter.setHdmi(new Monitor());
        uc.setVga(hdmiVgaAdapter);
        uc.print("Hello From HDMI");

    }
}