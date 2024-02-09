import java.awt.Color;
import java.awt.event.ActionListener;

import org.hy.*;
/**
 * MainApp
 */
public class MainApp {

    private static ActionListener actionListener = e -> {
        HButton btn = (HButton) (e.getSource());
        if(btn.getForeground().equals(Color.RED)){
            btn.setForeground(Color.GREEN.darker());
            btn.setText("Libero");
        } else {
            btn.setForeground(Color.RED);
            btn.setText("Occupato");
        }
    };
    public static void main(String[] args) {
        HFrame frame = new HFrame()
            .title("Mappa aula 226")
            .size(600, 750)
            .resizable(false)
            .layout(null)
            .add(
                new Chair()
                    .bounds(50,20,20,20)
            )
            .add(
                new Chair()
                    .bounds(100, 20, 20, 20)
            )
            .add(
                new HButton()
                .actionListener(actionListener)
                .bounds(10,40,150,50)
                .text("Cattedra-1")
            )
            .add(
                new Chair()
                    .bounds(290, 20, 20, 20)
            )
            .add(
                new HButton()
                .bounds(250,40,100,50)
                .text("Cattedra-2")
                .actionListener(actionListener)
            )
            .add(
                new HButton()
                .bounds(525,0,75,50)
                .actionListener(actionListener)
            )
            .add(
                new HButton()
                .bounds(475,0,50,50)
                .actionListener(actionListener)
            );
        for (int i = 1; i <=5; i++) 
            frame
                .add(makeDesk("1-Mac "+i).bounds(0, i*100, 100, 100))
                .add(makeDesk("2-Mac "+i).bounds(500, i*100, 100, 100))
                .add(makeDesk("1-Banco "+i).bounds(150, i*100, 100, 100))
                .add(makeDesk("2-Banco "+i).bounds(250, i*100, 100, 100))
                .add(makeDesk("3-Banco "+i).bounds(350, i*100, 100, 100));
        frame
            .add(makeVLeftToRightDesk("1-Mac " + 6).bounds(100, 600, 100, 100))
            .add(makeVRightToLeftDesk("2-Mac " + 6).bounds(200, 600, 100, 100))
            .add(makeVLeftToRightDesk("1-Mac " + 6).bounds(300, 600, 100, 100))
            .add(makeVRightToLeftDesk("2-Mac " + 6).bounds(400, 600, 100, 100));

        frame.start(false);
    }
    public static HPanel makeDesk(String text){
        return new HPanel()
                    .layout(null)
                    .add(
                        new Chair()
                            .bounds(28, 60, 20, 20))
                    .add(
                        new Chair()
                            .bounds(55, 60, 20, 20))
                    .add(
                        new HButton()
                            .bounds(0, 0, 100, 60)
                            .text(text).actionListener(actionListener));
    }
    
    public static HPanel makeVLeftToRightDesk(String text) {
        return new HPanel()
                .layout(null)
                .add(
                        new Chair()
                                .bounds(10, 40, 20, 20))
                .add(
                        new Chair()
                                .bounds(10, 70, 20, 20))
                .add(
                        new HButton()
                                .bounds(40, 0, 60, 100)
                                .text(text).actionListener(actionListener));
    }
    
    public static HPanel makeVRightToLeftDesk(String text) {
        return new HPanel()
                .layout(null)
                .add(
                        new Chair()
                                .bounds(70, 40, 20, 20))
                .add(
                        new Chair()
                                .bounds(70, 70, 20, 20))
                .add(
                        new HButton()
                                .bounds(0, 0, 60, 100)
                                .text(text).actionListener(actionListener));
    }
    
    public static HPanel makeDesk() {
        return new HPanel()
                .layout(null)
                .add(
                        new Chair()
                                .bounds(28, 60, 20, 20))
                .add(
                        new Chair()
                                .bounds(55, 60, 20, 20))
                .add(
                        new HButton()
                                .bounds(0, 0, 100, 60)
                                .actionListener(actionListener));
    }
}