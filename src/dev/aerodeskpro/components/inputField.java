
package dev.aerodeskpro.components;

import com.formdev.flatlaf.FlatClientProperties;
import javax.swing.JTextField;


public class inputField extends JTextField {
    
    private final int arc = 10;

    public inputField() {
        init();
    }

    private void init() {
        setOpaque(false);
        putClientProperty(FlatClientProperties.STYLE, "arc: " + arc);
    }
    
}
