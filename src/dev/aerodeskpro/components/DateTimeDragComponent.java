/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dev.aerodeskpro.components;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeDragComponent extends JPanel implements MouseListener, MouseMotionListener {
    private Point initialClick;
    private Timer timer;
    private String dateTimeString = "";

    public DateTimeDragComponent() {
        setPreferredSize(new Dimension(200, 50));
        setBackground(new Color(30, 30, 30));
        setForeground(Color.GREEN);
        setFont(new Font("Monospaced", Font.BOLD, 16));
        addMouseListener(this);
        addMouseMotionListener(this);

        // Timer to update time every second
        timer = new Timer(1000, e -> {
            updateDateTime();
            repaint();
        });
        timer.start();
        updateDateTime();
    }

    private void updateDateTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        dateTimeString = sdf.format(new Date());
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(getForeground());
        FontMetrics fm = g.getFontMetrics();
        int x = (getWidth() - fm.stringWidth(dateTimeString)) / 2;
        int y = (getHeight() + fm.getAscent()) / 2 - 4;
        g.drawString(dateTimeString, x, y);
    }

    // ---- Mouse Events for dragging ----
    public void mousePressed(MouseEvent e) {
        initialClick = e.getPoint();
        getComponentAt(initialClick);
    }

    public void mouseDragged(MouseEvent e) {
        JComponent parent = (JComponent) getParent();
        if (parent != null) {
            int thisX = getLocation().x;
            int thisY = getLocation().y;

            int xMoved = e.getX() - initialClick.x;
            int yMoved = e.getY() - initialClick.y;

            int X = thisX + xMoved;
            int Y = thisY + yMoved;
            setLocation(X, Y);
        }
    }

    // Unused Mouse Events
    public void mouseClicked(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mouseMoved(MouseEvent e) {}

    // Optional: Stop timer when closing
    public void stopTimer() {
        if (timer != null) timer.stop();
    }
}
