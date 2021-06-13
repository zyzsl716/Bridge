package Bridge;

public class Test {
    public static void main(String[] args) {
        //苹果笔记本
        Computer computer=new Laptop(new Apple());
        computer.info();

        //联想台式机
        Computer computer1=new Desktop(new lenovo());
        computer1.info();
    }
}
