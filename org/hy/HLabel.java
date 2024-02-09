package org.hy;

import javax.swing.JLabel;
import javax.swing.border.TitledBorder;
import javax.swing.event.AncestorListener;

import java.awt.*;
import java.awt.event.*;

public class HLabel extends JLabel {

    public HLabel(String text) {
        super(text);
    }

    public HLabel text(String text) {
        setText(text);
        return this;
    }
    
    public HLabel bounds(int x, int y, int width, int height) {
        setBounds(x, y, width, height);
        return this;
    }

    public HLabel focusListener(FocusListener listener) {
        addFocusListener(listener);
        return this;
    }
    public HLabel mouseListener(MouseListener listener) {
        addMouseListener(listener);
        return this;
    }
    public HLabel ancestorListener(AncestorListener listener) {
        addAncestorListener(listener);
        return this;
    }
    public HLabel componentListener(ComponentListener listener) {
        addComponentListener(listener);
        return this;
    }
    public HLabel containerListener(ContainerListener listener) {
        addContainerListener(listener);
        return this;
    }
    public HLabel mouseWheelListener(MouseWheelListener listener) {
        addMouseWheelListener(listener);
        return this;
    }
    public HLabel title(String title) {
        if (getBorder() != null)
            setBorder(new TitledBorder(getBorder(), title));
        else
            setBorder(new TitledBorder(title));
        return this;
    }
    public HLabel rev(){
        this.revalidate();
        return this;
    }
    public HLabel paint(){
        this.repaint();
        return this;
    }
    public HLabel bg(Color color) {
        setBackground(color);
        return this;
    }
    public HLabel font(Color color){
        setForeground(color);
        return this;
    }
    public HLabel fg(Color color){
        setForeground(color);
        return this;
    }
    public HLabel font(Font font){
        setFont(font);
        return this;
    }
}