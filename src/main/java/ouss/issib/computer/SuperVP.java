package ouss.issib.computer;

public class SuperVP implements IVga,IHdmi{
    @Override
    public void view(byte[] data) {
        System.out.println("!!!!!!!! Super VP HDMI !!!!!!!!");
        System.out.println(new String(data));
        System.out.println("!!!!!!!! Super VP HDMI !!!!!!!!");
    }

    @Override
    public void print(String text) {
        System.out.println("???????? Super VP VGA ????????");
        System.out.println(text);
        System.out.println("???????? Super VP VGA ????????");
    }
}
