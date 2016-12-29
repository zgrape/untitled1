package huarongdao;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

/**
 * Created by lenovo on 2016/12/1.
 */
public class Main3 extends JButton implements FocusListener {
    int number;
    Color c=new Color(255,245,170);
    Font font=new Font("宋体",Font.BOLD,12);
    Main3(int number, String s) {
        super(s);
        setBackground(c);
        setFont(font);
        this.number=number;
        c=getBackground();
        addFocusListener(this);
    }
    public void focusGained(FocusEvent e) {
        setBackground(Color.red);
    }
    public void focusLost(FocusEvent e) {
        setBackground(c);
    }
}
