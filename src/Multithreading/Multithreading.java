package Multithreading;

public class Multithreading extends Thread{
    @Override
    public void run() {
        for(int i=1;i<=5;i++)
        {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void main(String[] args){
        for(int i=0;i<=3;i++){
            Multithreading t1=new Multithreading();
            t1.start();
        }

        //Multithreading t2=new Multithreading();

        //t2.start();
    }
}
