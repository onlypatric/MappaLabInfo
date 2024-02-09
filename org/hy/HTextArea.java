package org.hy;

import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseWheelListener;
import java.awt.event.FocusListener;
import javax.swing.event.AncestorListener;
import java.awt.event.ComponentListener;
import java.awt.event.ContainerListener;

public class HTextArea extends JTextArea {

    public HTextArea() {
        super();
    }

    public HTextArea title(String title) {
        if (getBorder() != null)
            setBorder(new TitledBorder(getBorder(), title));
        else
            setBorder(new TitledBorder(title));
        return this;
    }

    public HTextArea border(Border border) {
        setBorder(border);
        return this;
    }

    public HTextArea bg(Color color) {
        setBackground(color);
        return this;
    }

    public HTextArea focusListener(FocusListener listener) {
        addFocusListener(listener);
        return this;
    }

    public HTextArea mouseListener(MouseListener listener) {
        addMouseListener(listener);
        return this;
    }

    public HTextArea ancestorListener(AncestorListener listener) {
        addAncestorListener(listener);
        return this;
    }

    public HTextArea componentListener(ComponentListener listener) {
        addComponentListener(listener);
        return this;
    }

    public HTextArea containerListener(ContainerListener listener) {
        addContainerListener(listener);
        return this;
    }

    public HTextArea mouseWheelListener(MouseWheelListener listener) {
        addMouseWheelListener(listener);
        return this;
    }

    public HTextArea bounds(int x, int y, int width, int height) {
        setBounds(x, y, width, height);
        return this;
    }

    public HTextArea rev() {
        this.revalidate();
        return this;
    }

    public HTextArea text(String text) {
        setText(text);
        return this;
    }
    public HTextArea paint() {
        this.repaint();
        return this;
    }

    public HTextArea fg(Color color) {
        setForeground(color);
        return this;
    }

    public HTextArea font(Font font) {
        setFont(font);
        return this;
    }

    public HTextArea layout(LayoutManager layout) {
        this.setLayout(layout);
        return this;
    }

    public HTextArea add(Component comp) {
        this.add(comp);
        return this;
    }
}
