package suresh.com.whatsappclone.interfaces;

import suresh.com.whatsappclone.model.chat.Chats;

import java.util.List;

public interface OnReadChatCallBack {
    void onReadSuccess(List<Chats> list);
    void onReadFailed();
}
