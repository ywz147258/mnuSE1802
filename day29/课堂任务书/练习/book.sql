/*
 Navicat Premium Data Transfer

 Source Server         : 闽师软工18
 Source Server Type    : MySQL
 Source Server Version : 50617
 Source Host           : localhost:3306
 Source Schema         : book

 Target Server Type    : MySQL
 Target Server Version : 50617
 File Encoding         : 65001

 Date: 11/10/2021 10:52:03
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for book
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '书名',
  `detail` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '简介',
  `characters` int(11) NULL DEFAULT NULL COMMENT '字数',
  `author` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '作者',
  `type` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '类型',
  `upper_time` datetime(0) NULL DEFAULT NULL COMMENT '上架时间',
  `score` tinyint(4) NULL DEFAULT NULL COMMENT '评分',
  `finished` int(11) NULL DEFAULT 0 COMMENT '是否完结，0否 1是',
  `coverImg` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '封面地址',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  `del` int(11) NULL DEFAULT NULL COMMENT '是否删除 0否，1是',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `delete_time` datetime(0) NULL DEFAULT NULL COMMENT '删除时间',
  `href` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '链接',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 31 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '书名表 ' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of book
-- ----------------------------
INSERT INTO `book` VALUES (1, '封神之我没想和女娲谈恋爱', NULL, NULL, NULL, NULL, NULL, NULL, 0, NULL, NULL, NULL, NULL, NULL, 'https://www.xbiquge.la/76/76984/');
INSERT INTO `book` VALUES (2, '挖坟人', NULL, NULL, NULL, NULL, NULL, NULL, 0, NULL, NULL, NULL, NULL, NULL, 'https://www.xbiquge.la/77/77446/');
INSERT INTO `book` VALUES (3, '我靠美食征服了反派大佬', NULL, NULL, NULL, NULL, NULL, NULL, 0, NULL, NULL, NULL, NULL, NULL, 'https://www.xbiquge.la/81/81337/');
INSERT INTO `book` VALUES (4, '重生六零团宠小福宝', NULL, NULL, NULL, NULL, NULL, NULL, 0, NULL, NULL, NULL, NULL, NULL, 'https://www.xbiquge.la/81/81239/');
INSERT INTO `book` VALUES (5, '满级神棍大佬重回新手村', NULL, NULL, NULL, NULL, NULL, NULL, 0, NULL, NULL, NULL, NULL, NULL, 'https://www.xbiquge.la/86/86522/');
INSERT INTO `book` VALUES (6, '重生成黑心莲，我撩了前男友的叔叔', NULL, NULL, NULL, NULL, NULL, NULL, 0, NULL, NULL, NULL, NULL, NULL, 'https://www.xbiquge.la/87/87883/');
INSERT INTO `book` VALUES (7, '开局奖励一亿条命', NULL, NULL, NULL, NULL, NULL, NULL, 0, NULL, NULL, NULL, NULL, NULL, 'https://www.xbiquge.la/66/66059/');
INSERT INTO `book` VALUES (8, '兼职高手', NULL, NULL, NULL, NULL, NULL, NULL, 0, NULL, NULL, NULL, NULL, NULL, 'https://www.xbiquge.la/87/87571/');
INSERT INTO `book` VALUES (9, '小师叔沉迷网络中', NULL, NULL, NULL, NULL, NULL, NULL, 0, NULL, NULL, NULL, NULL, NULL, 'https://www.xbiquge.la/76/76906/');
INSERT INTO `book` VALUES (10, '人境', NULL, NULL, NULL, NULL, NULL, NULL, 0, NULL, NULL, NULL, NULL, NULL, 'https://www.xbiquge.la/86/86415/');
INSERT INTO `book` VALUES (11, '阴阳摆渡，我怎么就无敌了', NULL, NULL, NULL, NULL, NULL, NULL, 0, NULL, NULL, NULL, NULL, NULL, 'https://www.xbiquge.la/79/79812/');
INSERT INTO `book` VALUES (12, '矿坑里的大帝', NULL, NULL, NULL, NULL, NULL, NULL, 0, NULL, NULL, NULL, NULL, NULL, 'https://www.xbiquge.la/87/87038/');
INSERT INTO `book` VALUES (13, '最后的兽族', NULL, NULL, NULL, NULL, NULL, NULL, 0, NULL, NULL, NULL, NULL, NULL, 'https://www.xbiquge.la/88/88286/');
INSERT INTO `book` VALUES (14, '斗破：开局定亲夭月', NULL, NULL, NULL, NULL, NULL, NULL, 0, NULL, NULL, NULL, NULL, NULL, 'https://www.xbiquge.la/85/85146/');
INSERT INTO `book` VALUES (15, '这个皇子真无敌', NULL, NULL, NULL, NULL, NULL, NULL, 0, NULL, NULL, NULL, NULL, NULL, 'https://www.xbiquge.la/65/65635/');
INSERT INTO `book` VALUES (16, '派出所里的小捕快', NULL, NULL, NULL, NULL, NULL, NULL, 0, NULL, NULL, NULL, NULL, NULL, 'https://www.xbiquge.la/82/82322/');
INSERT INTO `book` VALUES (17, '斗将行', NULL, NULL, NULL, NULL, NULL, NULL, 0, NULL, NULL, NULL, NULL, NULL, 'https://www.xbiquge.la/86/86521/');
INSERT INTO `book` VALUES (18, '法学院的新生', NULL, NULL, NULL, NULL, NULL, NULL, 0, NULL, NULL, NULL, NULL, NULL, 'https://www.xbiquge.la/75/75301/');
INSERT INTO `book` VALUES (19, '战神小心！医妃是朵黑心莲', NULL, NULL, NULL, NULL, NULL, NULL, 0, NULL, NULL, NULL, NULL, NULL, 'https://www.xbiquge.la/88/88202/');
INSERT INTO `book` VALUES (20, '风云假城主开局', NULL, NULL, NULL, NULL, NULL, NULL, 0, NULL, NULL, NULL, NULL, NULL, 'https://www.xbiquge.la/81/81811/');
INSERT INTO `book` VALUES (21, '绑定国运：知道副本剧情的我无敌了', NULL, NULL, NULL, NULL, NULL, NULL, 0, NULL, NULL, NULL, NULL, NULL, 'https://www.xbiquge.la/86/86586/');
INSERT INTO `book` VALUES (22, '末世不灭战神', NULL, NULL, NULL, NULL, NULL, NULL, 0, NULL, NULL, NULL, NULL, NULL, 'https://www.xbiquge.la/84/84199/');
INSERT INTO `book` VALUES (23, '宗门团宠不好惹', NULL, NULL, NULL, NULL, NULL, NULL, 0, NULL, NULL, NULL, NULL, NULL, 'https://www.xbiquge.la/87/87758/');
INSERT INTO `book` VALUES (24, '仙帝', NULL, NULL, NULL, NULL, NULL, NULL, 0, NULL, NULL, NULL, NULL, NULL, 'https://www.xbiquge.la/76/76226/');
INSERT INTO `book` VALUES (25, '我在玄幻世界冒充天机神算', NULL, NULL, NULL, NULL, NULL, NULL, 0, NULL, NULL, NULL, NULL, NULL, 'https://www.xbiquge.la/66/66683/');
INSERT INTO `book` VALUES (26, '我夺了诸天气运', NULL, NULL, NULL, NULL, NULL, NULL, 0, NULL, NULL, NULL, NULL, NULL, 'https://www.xbiquge.la/87/87558/');
INSERT INTO `book` VALUES (27, '我的魔兽不对劲', NULL, NULL, NULL, NULL, NULL, NULL, 0, NULL, NULL, NULL, NULL, NULL, 'https://www.xbiquge.la/85/85866/');
INSERT INTO `book` VALUES (28, '星空流浪汉', NULL, NULL, NULL, NULL, NULL, NULL, 0, NULL, NULL, NULL, NULL, NULL, 'https://www.xbiquge.la/71/71353/');
INSERT INTO `book` VALUES (29, '魔尊重生后只想咸鱼', NULL, NULL, NULL, NULL, NULL, NULL, 0, NULL, NULL, NULL, NULL, NULL, 'https://www.xbiquge.la/69/69561/');
INSERT INTO `book` VALUES (30, '真玄传说', NULL, NULL, NULL, NULL, NULL, NULL, 0, NULL, NULL, NULL, NULL, NULL, 'https://www.xbiquge.la/64/64110/');

-- ----------------------------
-- Table structure for indexs
-- ----------------------------
DROP TABLE IF EXISTS `indexs`;
CREATE TABLE `indexs`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `book_id` int(11) NOT NULL COMMENT '书本ID',
  `title` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '章节标题',
  `number` int(11) NULL DEFAULT NULL COMMENT '序号',
  `contentPath` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '内容文本存放路径',
  `del` int(11) NULL DEFAULT NULL COMMENT '是否删除 0否，1是',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `delete_time` datetime(0) NULL DEFAULT NULL COMMENT '删除时间',
  `href` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '链接',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 551 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '目录' ROW_FORMAT = Compact;

SET FOREIGN_KEY_CHECKS = 1;
