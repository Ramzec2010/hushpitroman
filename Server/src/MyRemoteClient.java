public class MyRemoteClient {
    public static void main(String[] args) {
        new MyRemoteClient().go();
    }

    public void go() {
        try {
            MyRemote sevice = (MyRemote) Naming.lookup("rmi://127.0.0.1/Remote Hello");

            String s = sevice.sayHello();
            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
