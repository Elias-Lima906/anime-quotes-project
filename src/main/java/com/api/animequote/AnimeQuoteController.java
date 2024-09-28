package com.api.animequote;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/animes")
public class AnimeQuoteController {

    private final AnimeQuoteService animeQuoteService;

    public AnimeQuoteController(AnimeQuoteService animeQuoteService) {
        this.animeQuoteService = animeQuoteService;
    }

    @GetMapping("/random")
    public AnimeQuote getRandomAnimeQuote() {
        return animeQuoteService.getRandomAnimeQuote();
    }

    @GetMapping("/random/title")
    public AnimeQuote getRandomQuoteByTitle(@RequestParam("title") String title) {
        return animeQuoteService.getRandomQuoteByTitle(title);
    }
}
