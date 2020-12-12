package controllers;

import Model.Articles;
import Repositories.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

public class AtriclesController {
    private ArticleRepository articleRepository;

    @Autowired
    public AtriclesController(ArticleRepository articleRepository){
        this.articleRepository = articleRepository;
    }


    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public String login(@RequestParam String username, @RequestParam String subject, @RequestParam String topic) {
        Optional<Articles> article = articleRepository.findArticlesByFIOAndSubjectAndTopic(username, subject, topic);
        if (article.isPresent()) return "";
        else
            return article.get().getText();
    }

}
