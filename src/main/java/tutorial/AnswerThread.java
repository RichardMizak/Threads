package tutorial;

public class AnswerThread implements Runnable{
    private Chat chat;
    private Thread thread;
    private String[] strings={"Hello","I'm good.","I'm playing video games.","Bye"};

    public AnswerThread(Chat chat) {
        this.chat = chat;
        thread=new Thread(this,"Answer");
        thread.start();
    }

    @Override
    public void run() {
        for(String i:strings){
            chat.Answer(i);
        }
    }
}
