package interfacepackage;

public interface InterfaceOne {

    public void interfaceTest1();
    public int getNumber(int number);

    default void helloMethod(){

        System.out.println("Hello");
    }
}
