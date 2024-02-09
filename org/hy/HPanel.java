package org.hy;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.event.AncestorListener;

import java.awt.*;
import java.awt.event.*;

public class HPanel extends JPanel {

    public HPanel() {
        super();
    }
    public HPanel location(int x, int y) {
        setLocation(x, y);
        return this;
    }
    public static HPanel make() {
        return new HPanel();
    }

    public HPanel bounds(int x, int y, int width, int height) {
        setBounds(x, y, width, height);
        return this;
    }

    public HPanel rm(Component comp) {
        this.remove(comp);
        return this;
    }

    public HPanel focusListener(FocusListener listener) {
        addFocusListener(listener);
        return this;
    }

    public HPanel mouseListener(MouseListener listener) {
        addMouseListener(listener);
        return this;
    }

    public HPanel ancestorListener(AncestorListener listener) {
        addAncestorListener(listener);
        return this;
    }

    public HPanel componentListener(ComponentListener listener) {
        addComponentListener(listener);
        return this;
    }

    public HPanel containerListener(ContainerListener listener) {
        addContainerListener(listener);
        return this;
    }

    public HPanel mouseWheelListener(MouseWheelListener listener) {
        addMouseWheelListener(listener);
        return this;
    }

    public HPanel title(String title) {
        if (getBorder() != null)
            setBorder(new TitledBorder(getBorder(), title));
        else
            setBorder(new TitledBorder(title));
        return this;
    }

    public HPanel border(Border border) {
        setBorder(border);
        return this;
    }

    public HPanel bg(Color color) {
        setBackground(color);
        return this;
    }

    public HPanel layout(LayoutManager layout) {
        this.setLayout(layout);
        return this;
    }
    public HPanel vLayout() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        return this;
    }
    
    public HPanel hLayout() {
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        return this;
    }

    public HPanel add(Component comp) {
        super.add(comp);
        return this;
    }
}
