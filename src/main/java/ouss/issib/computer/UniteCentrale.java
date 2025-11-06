package ouss.issib.computer;

public class UniteCentrale {

    private IVga vga;
    public void setVga(IVga vga){
        this.vga = vga;
    }
    public void print(String text) {
        System.out.println("+++++++ Computer +++++++");
        vga.print(text.toUpperCase());
        System.out.println("+++++++ /Computer +++++++");
    }
}
