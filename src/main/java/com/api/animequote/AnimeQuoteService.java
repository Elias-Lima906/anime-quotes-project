package com.api.animequote;

import org.springframework.stereotype.Service;

@Service
public class AnimeQuoteService {

    private final AnimeQuoteFeignClient animeQuoteFeignClient;

    public AnimeQuoteService(AnimeQuoteFeignClient animeQuoteFeignClient) {
        this.animeQuoteFeignClient = animeQuoteFeignClient;
    }

    public AnimeQuote getRandomAnimeQuote() {
        return animeQuoteFeignClient.getRandomQuote();
    }

    public AnimeQuote getRandomQuoteByTitle(String title) {
        return animeQuoteFeignClient.getRandomQuoteByTitle(title);
    }
}
