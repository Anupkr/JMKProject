
import com.lowagie.text.pdf.PdfName;

/**
 *
 * @author mulayam
 */
class Example {

    static {
        System.out.println("static block executing in thread:" + Thread.currentThread().getName());

    }

    public static void m1() {

        System.out.println("m1 executing in thread:" + Thread.currentThread().getName());
    }

}

class MyThread extends Thread {

    @Override
    public void run() {

        Thread th = new Thread();
        System.out.println("current thead in MyThread :" + this.getName());
        Example.m1();
    }

}

public class Test {

    public static void main(String[] args) {

        new MyThread().start();
        Example.m1();

    }

}
