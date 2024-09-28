package com.api.animequote;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AnimeQuote {
    String status;
    AnimeQuoteData data;
}

