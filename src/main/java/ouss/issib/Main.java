package ouss.issib;

import ouss.issib.adapter.HdmiVgaAdapter;
import ouss.issib.adapter.HdmiVgaAdapterHeritage;
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
        uc.print("Hello From HDMI Using Composition");
        System.out.println();

        uc.setVga(new SuperVP());
        uc.print("Hello From Super VP");

        HdmiVgaAdapter hdmiVgaAdapter2 =  new HdmiVgaAdapter();
        hdmiVgaAdapter2.setHdmi(new SuperVP());
        uc.setVga(hdmiVgaAdapter2);
        uc.print("Hello From Super VP");

        HdmiVgaAdapterHeritage hdmiVgaAdapterHeritage =  new HdmiVgaAdapterHeritage();
        uc.setVga(hdmiVgaAdapterHeritage);
        uc.print("Hello From HDMI Using Heritage");
    }
}