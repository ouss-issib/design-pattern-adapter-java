package ouss.issib.computer;

public class Tv implements IVga{
    @Override
    public void print(String text) {
        System.out.println("******** TV ********");
        System.out.println(text.toUpperCase());
        System.out.println("******** TV ********");
    }
}
