package ouss.issib.adapter;

import ouss.issib.computer.IHdmi;
import ouss.issib.computer.IVga;

public class HdmiVgaAdapter implements IVga {

    private IHdmi hdmi;
    public void setHdmi(IHdmi hdmi){
        this.hdmi = hdmi;
    }
    @Override
    public void print(String text) {
        System.out.println("******** ADAPTER ********");
        hdmi.view(text.getBytes());
        System.out.println("******** /ADAPTER ********");
    }
}
