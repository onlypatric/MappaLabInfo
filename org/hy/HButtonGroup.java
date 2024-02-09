package org.hy;

import javax.swing.ButtonGroup;
import javax.swing.AbstractButton;

/**
 * HButtonGroup
 */
public class HButtonGroup extends ButtonGroup {

    public HButtonGroup() {
        super();
    }
    
    public HButtonGroup(AbstractButton... buttons) {
        super();
        for (AbstractButton button : buttons) {
            super.add(button);
        }
    }

    public HButtonGroup addBtn(AbstractButton button) {
        super.add(button);
        return this;
    }

    public HButtonGroup rm(AbstractButton button) {
        super.remove(button);
        return this;
    }

    public HButtonGroup clear() {
        super.clearSelection();
        return this;
    }

    public HButtonGroup mouseListener(java.awt.event.MouseListener listener) {
        for (AbstractButton button : buttons) {
            button.addMouseListener(listener);
        }
        return this;
    }

    public HButtonGroup actionListener(java.awt.event.ActionListener listener) {
        for (AbstractButton button : buttons) {
            button.addActionListener(listener);
        }
        return this;
    }

    public HButtonGroup enable(boolean enable) {
        for (AbstractButton button : buttons) {
            button.setEnabled(enable);
        }
        return this;
    }

    public HButtonGroup visible(boolean visible) {
        for (AbstractButton button : buttons) {
            button.setVisible(visible);
        }
        return this;
    }
}
