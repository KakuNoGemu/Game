package me.game.gui;

import oracle.jrockit.jfr.JFR;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by michtros17 on 10.07.2017.
 */
public class Main_Menu extends JFrame {

    private final JPanel mainPanel = new JPanel();

    private final StartGameButton startGameButton = new StartGameButton(this);

    public Main_Menu() {
        this.setVisible(true);
        this.setResizable(false);
        this.setBounds(50, 50, 1280, 720);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.initComponents();

        this.setContentPane(this.mainPanel);
    }

    private void initComponents() {
        this.mainPanel.setLayout(null);
        this.mainPanel.setBackground(Color.BLACK);

        this.startGameButton.setBounds(this.getWidth() / 2 - 100, 60, 200, 60);

        this.mainPanel.add(this.startGameButton);
    }

}
class StartGameButton extends CustomMainMenuButton{

    JFrame jFrame;

    public StartGameButton(JFrame jFrame) {
        super("Start");
        this.jFrame = jFrame;
    }

    public void onClick() {
        System.out.println("Starting Game!");
        Ingame_Gui ingame_gui = new Ingame_Gui();
        this.jFrame.setVisible(false);
    }
}

class CustomMainMenuButton extends JPanel {

    private Color def, hovored, pressed;

    private String title;

    private final JLabel titleLabel = new JLabel();

    public CustomMainMenuButton(Color def, Color hovored, Color pressed, String title) {
        this.def = def;
        this.hovored = hovored;
        this.pressed = pressed;
        this.title = title;

        this.titleLabel.setFont(new Font("Advanced Pixel-7", Font.BOLD, 50));

        this.titleLabel.setBounds(this.getBounds());
        this.titleLabel.setText(this.title);

        this.add(this.titleLabel);

        this.setBackground(this.def);
    }

    public CustomMainMenuButton(String title) {
        this(Color.LIGHT_GRAY, Color.GRAY, Color.DARK_GRAY, title);

        this.addMouseListener(new MouseAdapter() {

            private boolean isMouseOver = false;

            public void mousePressed(MouseEvent e) {
                setBackground(pressed);
            }

            public void mouseReleased(MouseEvent e) {
                setBackground(this.isMouseOver ? hovored : def);
                onClick();
            }

            public void mouseEntered(MouseEvent e) {
                this.isMouseOver = true;
                setBackground(hovored);
            }

            public void mouseExited(MouseEvent e) {
                this.isMouseOver = false;
                setBackground(def);
            }
        });
    }

    public void onClick(){}
}