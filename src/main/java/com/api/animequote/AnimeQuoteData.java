package com.api.animequote;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AnimeQuoteData {
    String content;
    Anime anime;
    Character character;
}