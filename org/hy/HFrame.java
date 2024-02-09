package org.hy;

import javax.swing.BoxLayout;
import javax.swing.JFrame;

import java.awt.*;
import java.awt.event.*;

public class HFrame extends JFrame {

    public HFrame() {
        super();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public HFrame resizable(boolean resizable) {
        setResizable(resizable);
        return this;
    }
    public static HFrame make(String title){
        HFrame frame = new HFrame();
        frame.setTitle(title);
        return frame;
    }

    public static HFrame make() {
        HFrame frame = new HFrame();
        return frame;
    }

    public HFrame bounds(int x, int y, int width, int height) {
        setBounds(x, y, width, height);
        return this;
    }

    public HFrame size(int width, int height) {
        setSize(width, height);
        return this;
    }

    public HFrame location(int x, int y) {
        setLocation(x, y);
        return this;
    }

    public HFrame closeOperation(int operation) {
        setDefaultCloseOperation(operation);
        return this;
    }
    
    public HFrame focusListener(FocusListener listener) {
        addFocusListener(listener);
        return this;
    }

    public HFrame mouseListener(MouseListener listener) {
        addMouseListener(listener);
        return this;
    }

    public HFrame componentListener(ComponentListener listener) {
        addComponentListener(listener);
        return this;
    }

    public HFrame containerListener(ContainerListener listener) {
        addContainerListener(listener);
        return this;
    }

    public HFrame mouseWheelListener(MouseWheelListener listener) {
        addMouseWheelListener(listener);
        return this;
    }

    public HFrame rm(Component comp) {
        this.remove(comp);
        return this;
    }

    public HFrame title(String title) {
        setTitle(title);
        return this;
    }

    public HFrame bg(Color color) {
        setBackground(color);
        revalidate();
        repaint();
        return this;
    }

    public HFrame layout(LayoutManager layout) {
        this.getContentPane().setLayout(layout);
        return this;
    }
    
    public HFrame vLayout() {
        this.getContentPane().setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        return this;
    }
    
    public HFrame hLayout() {
        this.getContentPane().setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        return this;
    }

    public HFrame add(Component comp) {
        this.getContentPane().add(comp);
        return this;
    }
    public HFrame start(boolean pack){
        if (pack) {
            pack();
        }
        setVisible(true);
        return this;
    }
}