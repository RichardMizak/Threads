package tutorial;

public class QuestionThread implements Runnable{
    private Chat chat;
    private Thread thread;
    private String[] strings={"Hello","How are you ?","What are you doing ?","Bye"};

    public QuestionThread(Chat chat) {
        this.chat = chat;
        thread=new Thread(this,"Question");
        thread.start();
    }

    @Override
    public void run() {
        for(String i:strings){
            chat.Question(i);
        }
    }
}
