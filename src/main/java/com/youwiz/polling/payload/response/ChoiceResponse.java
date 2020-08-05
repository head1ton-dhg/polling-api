package com.youwiz.polling.payload.response;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChoiceResponse {

    private Long id;
    private String text;
    private Long voteCount;
}
