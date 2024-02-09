package org.hy;

import javax.swing.JButton;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeListener;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseWheelListener;
import java.awt.event.FocusListener;
import javax.swing.event.AncestorListener;
import java.awt.event.ComponentListener;
import java.awt.event.ContainerListener;

public class HButton extends JButton {

    public HButton() {
        super();
    }
    
    public HButton(String text) {
        super(text);
    }

    public HButton title(String title) {
        if (getBorder() != null)
            setBorder(new TitledBorder(getBorder(), title));
        else
            setBorder(new TitledBorder(title));
        return this;
    }

    public HButton border(Border border) {
        setBorder(border);
        return this;
    }

    public HButton focusPainted(boolean focusPainted) {
        setFocusPainted(focusPainted);
        return this;
    }
    public HButton opaque(boolean opaque) {
        setOpaque(opaque);
        return this;
    }

    public HButton bg(Color color) {
        setBackground(color);
        return this;
    }
    public HButton bounds(int x, int y, int width, int height) {
        setBounds(x, y, width, height);
        return this;
    }
    

    public HButton text(String text) {
        setText(text);
        return this;
    }
    public HButton actionListener(ActionListener listener) {
        addActionListener(listener);
        return this;
    }
    public HButton itemListener(ItemListener listener) {
        addItemListener(listener);
        return this;
    }
    public HButton focusListener(FocusListener listener) {
        addFocusListener(listener);
        return this;
    }
    public HButton mouseListener(MouseListener listener) {
        addMouseListener(listener);
        return this;
    }
    public HButton changeListener(ChangeListener listener) {
        addChangeListener(listener);
        return this;
    }
    public HButton ancestorListener(AncestorListener listener) {
        addAncestorListener(listener);
        return this;
    }
    public HButton componentListener(ComponentListener listener) {
        addComponentListener(listener);
        return this;
    }
    public HButton containerListener(ContainerListener listener) {
        addContainerListener(listener);
        return this;
    }
    public HButton mouseWheelListener(MouseWheelListener listener) {
        addMouseWheelListener(listener);
        return this;
    }

    public HButton rev() {
        this.revalidate();
        return this;
    }

    public HButton paint() {
        this.repaint();
        return this;
    }

    public HButton fg(Color color) {
        setForeground(color);
        return this;
    }

    public HButton font(Font font) {
        setFont(font);
        return this;
    }
    public HButton layout(LayoutManager layout) {
        this.setLayout(layout);
        return this;
    }

    public HButton add(Component comp) {
        this.add(comp);
        return this;
    }
}
