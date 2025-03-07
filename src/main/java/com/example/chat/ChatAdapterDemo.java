package com.example.chat;

public class ChatAdapterDemo {
    public static void main(String[] args) {
        LegacyChatService legacyService = new LegacyChatService();
        ChatService chatAdapter = new ChatServiceAdapter(legacyService);

        chatAdapter.sendMessage("Hello world!");
    }
}
