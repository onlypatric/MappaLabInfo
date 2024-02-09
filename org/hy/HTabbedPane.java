package org.hy;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.*;

import javax.swing.Icon;
import javax.swing.JTabbedPane;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.event.AncestorListener;

/**
 * HTabbedPane
 */
public class HTabbedPane extends JTabbedPane {

    public HTabbedPane tab(String title, Component component) {
        super.addTab(title, component);
        return this;
    }
    public HTabbedPane focusListener(FocusListener listener) {
        addFocusListener(listener);
        return this;
    }
    
    public HTabbedPane bounds(int x, int y, int width, int height) {
        setBounds(x, y, width, height);
        return this;
    }

    public HTabbedPane mouseListener(MouseListener listener) {
        addMouseListener(listener);
        return this;
    }
    public HTabbedPane ancestorListener(AncestorListener listener) {
        addAncestorListener(listener);
        return this;
    }
    public HTabbedPane componentListener(ComponentListener listener) {
        addComponentListener(listener);
        return this;
    }
    public HTabbedPane containerListener(ContainerListener listener) {
        addContainerListener(listener);
        return this;
    }
    public HTabbedPane mouseWheelListener(MouseWheelListener listener) {
        addMouseWheelListener(listener);
        return this;
    }
    public HTabbedPane rm(Component comp) {
        this.remove(comp);
        return this;
    }
    public HTabbedPane tab(String title, Icon icon, Component component) {
        super.addTab(title, icon, component);
        return this;
    }
    public HTabbedPane tab(String title, Icon icon, Component component, String tip) {
        super.addTab(title, icon, component, tip);
        return this;
    }
    public HTabbedPane title(String title) {
        if(getBorder()!=null)
            setBorder(new TitledBorder(getBorder(),title));
        else
            setBorder(new TitledBorder(title));
        return this;
    }

    public HTabbedPane border(Border border){
        setBorder(border);
        return this;
    }

    public HTabbedPane bg(Color color) {
        setBackground(color);
        revalidate();
        repaint();
        return this;
    }
}