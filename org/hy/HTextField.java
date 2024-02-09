package org.hy;

import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseWheelListener;
import java.awt.event.FocusListener;
import javax.swing.event.AncestorListener;
import java.awt.event.ComponentListener;
import java.awt.event.ContainerListener;

public class HTextField extends JTextField {

    public HTextField() {
        super();
    }

    public HTextField bounds(int x, int y, int width, int height) {
        setBounds(x, y, width, height);
        return this;
    }

    public HTextField text(String text) {
        setText(text);
        return this;
    }
    public HTextField title(String title) {
        if (getBorder() != null)
            setBorder(new TitledBorder(getBorder(), title));
        else
            setBorder(new TitledBorder(title));
        return this;
    }

    public HTextField border(Border border) {
        setBorder(border);
        return this;
    }

    public HTextField bg(Color color) {
        setBackground(color);
        return this;
    }

    public HTextField focusListener(FocusListener listener) {
        addFocusListener(listener);
        return this;
    }

    public HTextField mouseListener(MouseListener listener) {
        addMouseListener(listener);
        return this;
    }

    public HTextField ancestorListener(AncestorListener listener) {
        addAncestorListener(listener);
        return this;
    }

    public HTextField componentListener(ComponentListener listener) {
        addComponentListener(listener);
        return this;
    }

    public HTextField containerListener(ContainerListener listener) {
        addContainerListener(listener);
        return this;
    }

    public HTextField mouseWheelListener(MouseWheelListener listener) {
        addMouseWheelListener(listener);
        return this;
    }

    public HTextField rev() {
        this.revalidate();
        return this;
    }

    public HTextField paint() {
        this.repaint();
        return this;
    }

    public HTextField fg(Color color) {
        setForeground(color);
        return this;
    }

    public HTextField font(Font font) {
        setFont(font);
        return this;
    }

    public HTextField layout(LayoutManager layout) {
        this.setLayout(layout);
        return this;
    }

    public HTextField add(Component comp) {
        this.add(comp);
        return this;
    }
}
