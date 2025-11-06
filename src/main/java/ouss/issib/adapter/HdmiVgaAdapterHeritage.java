package ouss.issib.adapter;

import ouss.issib.computer.IHdmi;
import ouss.issib.computer.IVga;
import ouss.issib.computer.Monitor;
import ouss.issib.computer.Tv;

public class HdmiVgaAdapterHeritage  extends Monitor implements IVga {

    @Override
    public void print(String text) {
        System.out.println("========== ADAPTER Heritage ==========");
        super.view(text.getBytes());
        System.out.println("========== /ADAPTER Heritage ==========");
    }
}
