package com.crud.tasks.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
//Jest to klasa ktora mapuje Card jak wyslamy zapytanie o stworzenie zadania
public class TrelloCardDto {
    private String name;
    private String description;
    private String pos;
    private String listId;
    //private TrelloBadgesDto trelloBadgesDto;
}
