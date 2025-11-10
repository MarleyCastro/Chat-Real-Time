package com.chat.app.controller;

import com.chat.app.model.ChatMenssage; // Importe a classe do modelo

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatController {

    @MessageMapping("/sendMessage")
    @SendTo("/topic/messages")
    public ChatMenssage sendMenssage(ChatMenssage menssage){
        return menssage;
    }

    @GetMapping("chat")
    public String Chat(){
        return "chat";
    }
}