//Md. Mahdi Hasan Tazelly, SID: 2212193042
public class MultiThreading {
    public static void main(String[] args){
        for(int i=0; i<5; i++){
            MultiThread thread1 = new MultiThread("----Multithreading");
            thread1.start();
            MultiThread thread2 = new MultiThread("----Multithreading");
            thread2.start();
        }


        MultiThread threadA = new MultiThread("normal method invoking");
        MultiThread threadB = new MultiThread("normal method invoking");
        for(int i=0; i<5; i++){
            threadA.run();
            threadB.run();
        }
    }
}


class MultiThread extends Thread{

    String message;

    MultiThread(String message){
        this.message = message;
    }
    public void run(){
        try{
            System.out.println(Thread.currentThread().getName()+"----"+message);
            Thread.sleep(500);
        }catch(Exception e){
            System.out.println("Error Occurred");
        }
    }
}
