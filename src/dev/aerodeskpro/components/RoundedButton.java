/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dev.aerodeskpro.components;

import com.formdev.flatlaf.FlatClientProperties;
import javax.swing.JButton;

/**
 *
 * @author Ramindu
 */
public class RoundedButton extends JButton {

    public RoundedButton() {
        init();
    }
    private void init() {
        putClientProperty(FlatClientProperties.STYLE, "arc:13");
    }
}
