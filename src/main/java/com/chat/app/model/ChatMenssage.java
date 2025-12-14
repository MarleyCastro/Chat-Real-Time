package com.chat.app.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ChatMenssage {
    private Long id;
    private String sender;
    private String content;
}
