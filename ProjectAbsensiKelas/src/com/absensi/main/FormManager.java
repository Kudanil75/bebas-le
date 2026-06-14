package com.absensi.main;

import com.absensi.auth.FormLogin;
import javax.swing.JFrame;

public class FormManager {

    private static JFrame frame;
    private static FormLogin formLogin;

    public static void install(JFrame f) {
        frame = f;
        logout();
    }

    public static void logout() {
        frame.getContentPane().removeAll();
        FormLogin login = getLogin();
        login.formCheck();
        frame.getContentPane().add(login);
        frame.repaint();
        frame.revalidate();
    }

    public static JFrame getFrame() {
        return frame;
    }

    private static FormLogin getLogin() {
        if (formLogin == null) {
            formLogin = new FormLogin();
        }
        return formLogin;
    }
}