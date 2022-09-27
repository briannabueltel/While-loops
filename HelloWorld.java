public class HelloWorld
{

    int a = 5;
    int b = 2;
    int c = 1;
    int d = -8;

    public void run() {
        int i = 0;
        while (i < 15) {
            System.out.println(i);
            i++;
        } 
        int k = 10;
        while (k > 5) {
            System.out.println(k);
            k--;
        }
        int a = 0;
        int b = 15;
        while (a < 10 && b <= 20) {
            System.out.println(a + " " + b);
            a++;
            b++;
        }
    }

    public static void main(String[] args)
    {        
        HelloWorld hw = new HelloWorld();
        hw.run();
    }
}

