package org.hy;

import javax.swing.JCheckBox;
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

public class HCheckBox extends JCheckBox {

    public HCheckBox() {
        super();
    }

    public HCheckBox bounds(int x, int y, int width, int height) {
        setBounds(x, y, width, height);
        return this;
    }

    public HCheckBox selected(boolean selected) {
        setSelected(selected);
        return this;
    }
    public HCheckBox title(String title) {
        if (getBorder() != null)
            setBorder(new TitledBorder(getBorder(), title));
        else
            setBorder(new TitledBorder(title));
        return this;
    }

    public HCheckBox border(Border border) {
        setBorder(border);
        return this;
    }

    public HCheckBox focusPainted(boolean focusPainted) {
        setFocusPainted(focusPainted);
        return this;
    }

    public HCheckBox opaque(boolean opaque) {
        setOpaque(opaque);
        return this;
    }

    public HCheckBox bg(Color color) {
        setBackground(color);
        return this;
    }

    public HCheckBox actionListener(ActionListener listener) {
        addActionListener(listener);
        return this;
    }

    public HCheckBox itemListener(ItemListener listener) {
        addItemListener(listener);
        return this;
    }

    public HCheckBox focusListener(FocusListener listener) {
        addFocusListener(listener);
        return this;
    }

    public HCheckBox mouseListener(MouseListener listener) {
        addMouseListener(listener);
        return this;
    }

    public HCheckBox changeListener(ChangeListener listener) {
        addChangeListener(listener);
        return this;
    }

    public HCheckBox ancestorListener(AncestorListener listener) {
        addAncestorListener(listener);
        return this;
    }

    public HCheckBox componentListener(ComponentListener listener) {
        addComponentListener(listener);
        return this;
    }

    public HCheckBox containerListener(ContainerListener listener) {
        addContainerListener(listener);
        return this;
    }

    public HCheckBox mouseWheelListener(MouseWheelListener listener) {
        addMouseWheelListener(listener);
        return this;
    }

    public HCheckBox rev() {
        this.revalidate();
        return this;
    }

    public HCheckBox paint() {
        this.repaint();
        return this;
    }

    public HCheckBox fg(Color color) {
        setForeground(color);
        return this;
    }

    public HCheckBox font(Font font) {
        setFont(font);
        return this;
    }

    public HCheckBox layout(LayoutManager layout) {
        this.setLayout(layout);
        return this;
    }

    public HCheckBox add(Component comp) {
        this.add(comp);
        return this;
    }
}
