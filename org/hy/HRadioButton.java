package org.hy;

import javax.swing.JRadioButton;
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

public class HRadioButton extends JRadioButton {

    public HRadioButton() {
        super();
    }

    public HRadioButton(String text) {
        super(text);
    }
    public HRadioButton text(String text) {
        setText(text);
        return this;
    }
    
    public HRadioButton bounds(int x, int y, int width, int height) {
        setBounds(x, y, width, height);
        return this;
    }

    public HRadioButton selected(boolean selected) {
        setSelected(selected);
        return this;
    }
    public HRadioButton title(String title) {
        if (getBorder() != null)
            setBorder(new TitledBorder(getBorder(), title));
        else
            setBorder(new TitledBorder(title));
        return this;
    }

    public HRadioButton border(Border border) {
        setBorder(border);
        return this;
    }

    public HRadioButton focusPainted(boolean focusPainted) {
        setFocusPainted(focusPainted);
        return this;
    }

    public HRadioButton opaque(boolean opaque) {
        setOpaque(opaque);
        return this;
    }

    public HRadioButton bg(Color color) {
        setBackground(color);
        return this;
    }

    public HRadioButton actionListener(ActionListener listener) {
        addActionListener(listener);
        return this;
    }

    public HRadioButton itemListener(ItemListener listener) {
        addItemListener(listener);
        return this;
    }

    public HRadioButton focusListener(FocusListener listener) {
        addFocusListener(listener);
        return this;
    }

    public HRadioButton mouseListener(MouseListener listener) {
        addMouseListener(listener);
        return this;
    }

    public HRadioButton changeListener(ChangeListener listener) {
        addChangeListener(listener);
        return this;
    }

    public HRadioButton ancestorListener(AncestorListener listener) {
        addAncestorListener(listener);
        return this;
    }

    public HRadioButton componentListener(ComponentListener listener) {
        addComponentListener(listener);
        return this;
    }

    public HRadioButton containerListener(ContainerListener listener) {
        addContainerListener(listener);
        return this;
    }

    public HRadioButton mouseWheelListener(MouseWheelListener listener) {
        addMouseWheelListener(listener);
        return this;
    }

    public HRadioButton rev() {
        this.revalidate();
        return this;
    }

    public HRadioButton paint() {
        this.repaint();
        return this;
    }

    public HRadioButton fg(Color color) {
        setForeground(color);
        return this;
    }

    public HRadioButton font(Font font) {
        setFont(font);
        return this;
    }

    public HRadioButton layout(LayoutManager layout) {
        this.setLayout(layout);
        return this;
    }

    public HRadioButton add(Component comp) {
        this.add(comp);
        return this;
    }
}
