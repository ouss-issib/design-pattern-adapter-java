package ouss.issib.computer;

public class Monitor implements IHdmi{
    @Override
    public void view(byte[] data) {
        String str = new String(data);
        System.out.println("++++++++ MONITOR ++++++++");
        System.out.println(str);
        System.out.println("++++++++ MONITOR ++++++++");
    }
}
