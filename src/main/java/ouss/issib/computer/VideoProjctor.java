package ouss.issib.computer;

public class VideoProjctor implements IVga{
    @Override
    public void print(String text) {
        System.out.println("-------- VP --------");
        System.out.println(text);
        System.out.println("-------- VP --------");
    }
}
