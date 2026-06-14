package com.absensi.auth;

import com.absensi.main.Form;
import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class FormLogin extends Form {

    private JLabel imageLogo;
    private JPanel mainPanel;
    private JPanel panelForm;

    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JButton btnLogin;

    public FormLogin() {
        init();
    }

    private void init() {
        txtUsername = new JTextField();
        txtPassword = new JPasswordField();
        btnLogin = new JButton("Login");

        mainPanel = new JPanel();
        mainPanel.putClientProperty(FlatClientProperties.STYLE, ""
                + "arc:20;"
                + "[light]background:rgb(255,255,255);"
                + "[dark]background:darken($Panel.background, 5%)");

        JPanel panelLogo = new JPanel();
        panelLogo.putClientProperty(FlatClientProperties.STYLE, ""
                + "[light]background:rgb(255,255,255);"
                + "[dark]background:darken($Panel.background, 5%)");

        imageLogo = new JLabel();
        imageLogo.setIcon(new FlatSVGIcon("com/absensi/icon/logo_qrcode.svg", 100, 100));

        JLabel lbTitleLogo = new JLabel("MyAbsensi");
        lbTitleLogo.putClientProperty(FlatClientProperties.STYLE, ""
                + "[light]foreground:rgb(0,0,0);"
                + "font:bold italic +14");

        JLabel lbDetail = new JLabel("Attendance Management System");
        lbDetail.putClientProperty(FlatClientProperties.STYLE, ""
                + "[light]foreground:rgb(0,0,0);"
                + "font:bold 14");

        JLabel lbCreated = new JLabel("Created by Developer Pemula");
        lbCreated.putClientProperty(FlatClientProperties.STYLE, ""
                + "[light]foreground:rgb(0,0,0);"
                + "font:12");

        panelLogo.add(imageLogo);
        panelLogo.add(lbTitleLogo);
        panelLogo.add(lbDetail);
        panelLogo.add(lbCreated);
        
        
    }
}