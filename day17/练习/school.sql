/*
 Navicat Premium Data Transfer

 Source Server         : test
 Source Server Type    : MySQL
 Source Server Version : 50617
 Source Host           : localhost:3306
 Source Schema         : school

 Target Server Type    : MySQL
 Target Server Version : 50617
 File Encoding         : 65001

 Date: 22/09/2021 17:49:34
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for bus
-- ----------------------------
DROP TABLE IF EXISTS `bus`;
CREATE TABLE `bus`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '公交车名称',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of bus
-- ----------------------------
INSERT INTO `bus` VALUES (1, '95路');
INSERT INTO `bus` VALUES (2, 'K11路');
INSERT INTO `bus` VALUES (3, '28路');

-- ----------------------------
-- Table structure for bus_station_relation
-- ----------------------------
DROP TABLE IF EXISTS `bus_station_relation`;
CREATE TABLE `bus_station_relation`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `bus_id` int(11) NULL DEFAULT NULL,
  `station_id` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of bus_station_relation
-- ----------------------------
INSERT INTO `bus_station_relation` VALUES (1, 1, 1);
INSERT INTO `bus_station_relation` VALUES (2, 1, 2);
INSERT INTO `bus_station_relation` VALUES (3, 2, 2);
INSERT INTO `bus_station_relation` VALUES (4, 2, 3);
INSERT INTO `bus_station_relation` VALUES (5, 2, 4);

-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course`  (
  `id` int(11) NOT NULL COMMENT '科目表id',
  `teacher_id` int(11) NULL DEFAULT NULL COMMENT '教师ID  teacher表 id',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '科目名称',
  `del` tinyint(255) NOT NULL DEFAULT 0 COMMENT '0没删 1删除',
  `create_time` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `delete_time` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of course
-- ----------------------------
INSERT INTO `course` VALUES (1, 1, '英语', 0, '2021-09-16 08:44:19', NULL);
INSERT INTO `course` VALUES (2, 2, '补刀', 0, '2021-09-16 08:44:19', NULL);
INSERT INTO `course` VALUES (3, 3, '粤语', 0, '2021-09-17 11:28:26', NULL);
INSERT INTO `course` VALUES (4, 4, '数学', 0, '2021-09-18 10:22:51', NULL);
INSERT INTO `course` VALUES (5, 5, '物理', 0, '2021-09-18 10:23:24', NULL);
INSERT INTO `course` VALUES (6, 1, '语文', 0, '2021-09-22 08:26:40', NULL);
INSERT INTO `course` VALUES (7, 1, '体育', 0, '2021-09-22 08:31:19', NULL);

-- ----------------------------
-- Table structure for grade
-- ----------------------------
DROP TABLE IF EXISTS `grade`;
CREATE TABLE `grade`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `student_id` int(11) NULL DEFAULT NULL COMMENT '学号 student表id',
  `course_id` int(11) NULL DEFAULT NULL COMMENT '科目id course 表 id',
  `score` int(255) NULL DEFAULT NULL COMMENT '成绩',
  `del` tinyint(255) NOT NULL DEFAULT 0 COMMENT '0没删 1删除',
  `create_time` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `delete_time` datetime(0) NULL DEFAULT NULL COMMENT '删除时间',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `联和唯一`(`student_id`, `course_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 21 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of grade
-- ----------------------------
INSERT INTO `grade` VALUES (1, 1, 1, 60, 0, '2021-09-16 08:42:50', NULL);
INSERT INTO `grade` VALUES (2, 1, 2, 40, 0, '2021-09-16 08:43:24', NULL);
INSERT INTO `grade` VALUES (3, 2, 1, 50, 0, '2021-09-16 08:43:49', NULL);
INSERT INTO `grade` VALUES (4, 2, 2, 50, 0, '2021-09-16 10:11:01', NULL);
INSERT INTO `grade` VALUES (5, 3, 1, 90, 0, '2021-09-16 10:14:29', NULL);
INSERT INTO `grade` VALUES (7, 4, 2, 100, 0, '2021-09-17 09:05:14', NULL);
INSERT INTO `grade` VALUES (10, 4, 4, 99, 0, '2021-09-17 15:59:57', NULL);
INSERT INTO `grade` VALUES (11, 7, 3, 88, 0, '2021-09-18 09:13:19', NULL);
INSERT INTO `grade` VALUES (13, 1, 6, 63, 0, '2021-09-22 08:28:07', NULL);
INSERT INTO `grade` VALUES (14, 2, 6, 123, 0, '2021-09-22 08:28:22', NULL);
INSERT INTO `grade` VALUES (17, 1, 3, 33, 0, '2021-09-22 09:17:23', NULL);
INSERT INTO `grade` VALUES (18, 1, 4, 44, 0, '2021-09-22 09:17:33', NULL);
INSERT INTO `grade` VALUES (19, 1, 5, 55, 0, '2021-09-22 09:17:40', NULL);
INSERT INTO `grade` VALUES (20, 6, 7, 77, 0, '2021-09-22 09:25:01', NULL);

-- ----------------------------
-- Table structure for location
-- ----------------------------
DROP TABLE IF EXISTS `location`;
CREATE TABLE `location`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '名称',
  `parent_id` int(11) NULL DEFAULT NULL COMMENT '父ID',
  `level` int(255) NULL DEFAULT NULL COMMENT '等级',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of location
-- ----------------------------
INSERT INTO `location` VALUES (1, '中国', 0, 1);
INSERT INTO `location` VALUES (2, '福建省', 1, 2);
INSERT INTO `location` VALUES (3, '漳州市', 2, 3);
INSERT INTO `location` VALUES (4, '江苏省', 1, 1);
INSERT INTO `location` VALUES (5, '芗城区', 3, 4);

-- ----------------------------
-- Table structure for station
-- ----------------------------
DROP TABLE IF EXISTS `station`;
CREATE TABLE `station`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '公交站名称',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of station
-- ----------------------------
INSERT INTO `station` VALUES (1, '师大站');
INSERT INTO `station` VALUES (2, '芝山站');
INSERT INTO `station` VALUES (3, '市政府站');
INSERT INTO `station` VALUES (4, '八中站');

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`  (
  `id` int(11) NOT NULL COMMENT '学号',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '学生姓名',
  `del` tinyint(255) NOT NULL DEFAULT 0 COMMENT '0没删 1删除',
  `create_time` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `delete_time` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES (1, '亚索', 0, '2021-09-16 08:40:55', NULL);
INSERT INTO `student` VALUES (2, '永恩1', 0, '2021-09-16 08:41:10', NULL);
INSERT INTO `student` VALUES (3, '菲兹', 0, '2021-09-16 08:41:20', NULL);
INSERT INTO `student` VALUES (4, '安妮', 1, '2021-09-17 09:25:20', '2021-09-17 09:25:35');
INSERT INTO `student` VALUES (5, '费欧娜', 0, '2021-09-17 15:33:59', NULL);
INSERT INTO `student` VALUES (6, '提莫', 0, '2021-09-17 17:04:15', NULL);

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '教师id',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '教师姓名',
  `del` tinyint(255) NOT NULL DEFAULT 0 COMMENT '0没删 1删除',
  `create_time` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `delete_time` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES (1, '游文智', 0, '2021-09-16 08:44:27', NULL);
INSERT INTO `teacher` VALUES (2, '大司马', 0, '2021-09-16 08:44:27', NULL);
INSERT INTO `teacher` VALUES (3, '刘德华', 0, '2021-09-16 18:30:57', NULL);
INSERT INTO `teacher` VALUES (4, '欧阳恩泽', 0, '2021-09-18 10:29:20', NULL);
INSERT INTO `teacher` VALUES (5, '欧阳锋', 0, '2021-09-18 10:29:47', NULL);
INSERT INTO `teacher` VALUES (6, '虚竹', 0, '2021-09-18 10:29:55', NULL);
INSERT INTO `teacher` VALUES (7, '慕容复', 0, '2021-09-18 10:30:01', NULL);

SET FOREIGN_KEY_CHECKS = 1;
