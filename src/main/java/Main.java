import java.awt.EventQueue;

public class Main {

    public static void main(String [] args) {

        EventQueue.invokeLater(new Runnable() {

            public void run() {
                FrameWelcome welcomeWindow = new FrameWelcome(new PanelWelcome());

            }


        });


    }
}