CREATE DATABASE IF NOT EXISTS `college_book_system`;

USE `college_book_system`;

CREATE TABLE IF NOT EXISTS `comment` (
  `id`          INT         NOT NULL AUTO_INCREMENT,
  `book_id`     INT         NOT NULL,
  `thumb`       INT         NOT NULL DEFAULT 0
  COMMENT '点赞数',
  `content`     TEXT        NOT NULL,
  `creator`     VARCHAR(50) NOT NULL DEFAULT '',
  `create_time` TIMESTAMP   NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` TIMESTAMP   NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

CREATE TABLE IF NOT EXISTS `book` (
  `id`          INT          NOT NULL AUTO_INCREMENT,
  `cover`       VARCHAR(255) NOT NULL DEFAULT ''
  COMMENT '封面地址',
  `title`       VARCHAR(50)  NOT NULL DEFAULT '',
  `description` TEXT         NOT NULL,
  PRIMARY KEY (`id`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

CREATE TABLE IF NOT EXISTS `user` (
  `id`       INT          NOT NULL AUTO_INCREMENT,
  `name`     VARCHAR(255) NOT NULL DEFAULT '',
  `password` VARCHAR(255) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`)
)
  ENGINE = InnoDB,
  DEFAULT CHARSET = utf8;