package privatechat.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import privatechat.ui.PrivateChatUI;

public class PrivateChatExitListener implements ActionListener {

    private String title;

    public PrivateChatExitListener(String title) {
        this.title = title;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("éċşç§è");
        PrivateChatUI.removeChatUI(title);

    }

}
