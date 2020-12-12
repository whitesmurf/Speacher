package Repositories;

import Model.Articles;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ArticleRepository extends JpaRepository<Articles,Long> {
    Optional<Articles> findArticlesByFIOAndSubjectAndTopic(String FIO, String subject, String topic);
}
