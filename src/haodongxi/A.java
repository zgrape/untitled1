package haodongxi;

/**
 * Created by lenovo on 2016/12/1.
 */
public class A {
    public static void main(String[] args) {
        Listener listener = new B();
        listener.sayHello();

        Read read = new B();
        read.read();

        Write write = new B();
        write.write();

        B b = new B();
        b.sayHello();
        b.sayBy();
        b.read();
        b.write();
        b.sayC();

        function(new B());
    }

    static void function(Listener listener){
        listener.sayHello();
    }

}

interface Listener{
    void sayHello();
}

interface Read{
    void read();
}

interface Write{
    void write();
}

class B extends C implements Listener, Read, Write{

    @Override
    public void sayHello() {
        System.out.println("Hello");
    }

    public void sayBy(){

        System.out.println("By");
    }

    @Override
    public void read() {
        System.out.println("read");
    }

    @Override
    public void write() {
        System.out.println("write");
    }
    public void sayC(){
        super.sayC();
        System.out.println("CB");
    }
}

class C{
    public void sayC(){
        System.out.println("C");
    }
}


class D implements Listener{
    @Override
    public void sayHello() {
        System.out.println("Hello 个毛");
    }
}