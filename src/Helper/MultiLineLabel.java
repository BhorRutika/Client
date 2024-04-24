package Helper;

import java.awt.Rectangle;

import javax.swing.JLabel;
public class MultiLineLabel  extends JLabel {
	 /** Default serial version UID. */
    private static final long serialVersionUID = 1L;

    /** Horizontal text alignment. */
    private int halign = LEFT;

    /** Vertical text alignment. */
    private int valign = CENTER;

    /** Cache to save heap allocations. */
    private Rectangle bounds;

    /**
     * Creates a new empty label.
     */
    public MultiLineLabel() {
        super();
        setUI(MultiLineLabelUI.labelUI);
    }

    /**
     * Creates a new label with <code>text</code> value.
     * 
     * @param text
     *            the value of the label
     */
    public MultiLineLabel(String text) {
        this();
        setText(text);
    }

    /** {@inheritDoc} */
    public Rectangle getBounds() {
        if (bounds == null) {
            bounds = new Rectangle();
        }
        return super.getBounds(bounds);
    }

    /**
     * Set the vertical text alignment.
     * 
     * @param alignment
     *            vertical alignment
     */
    public void setVerticalTextAlignment(int alignment) {
        firePropertyChange("verticalTextAlignment", valign, alignment);
        valign = alignment;
    }

    /**
     * Set the horizontal text alignment.
     * 
     * @param alignment
     *            horizontal alignment
     */
    public void setHorizontalTextAlignment(int alignment) {
        firePropertyChange("horizontalTextAlignment", halign, alignment);
        halign = alignment;
    }

    /**
     * Get the vertical text alignment.
     * 
     * @return vertical text alignment
     */
    public int getVerticalTextAlignment() {
        return valign;
    }

    /**
     * Get the horizontal text alignment.
     * 
     * @return horizontal text alignment
     */
    public int getHorizontalTextAlignment() {
        return halign;
    }
}
