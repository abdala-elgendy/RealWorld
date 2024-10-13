package com.abdala.demo.service.mapper;

import com.abdala.demo.entity.Article;
import com.abdala.demo.service.dto.ArticleDTO;
import com.abdala.demo.service.dto.CreateArticleDTO;
import org.springframework.stereotype.Component;

@Component
public class ArticleMapper {

    public ArticleDTO toDTO(Article article) {
        ArticleDTO dto = new ArticleDTO();
        dto.setId(article.getId());
        dto.setTitle(article.getTitle());
        dto.setDescription(article.getDescription());
        dto.setContent(article.getContent());
        //dto.setSlug(article.getSlug());
        dto.setCreatedAt(article.getCreatedAt());
        //dto.setUpdatedAt(article.getUpdatedAt());
        return dto;
    }

    public Article toEntity(CreateArticleDTO createArticleDTO) {
        Article article = new Article();
        article.setTitle(createArticleDTO.getTitle());
        article.setDescription(createArticleDTO.getDescription());
        article.setContent(createArticleDTO.getContent());
        //article.setSlug(createArticleDTO.getSlug());
        return article;
    }
}