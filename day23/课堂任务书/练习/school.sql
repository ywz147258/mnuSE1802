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

 Date: 30/09/2021 11:33:44
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
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = 'busbiao ' ROW_FORMAT = Compact;

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
INSERT INTO `course` VALUES (8, 1, '美术', 0, '2021-09-24 10:21:21', NULL);
INSERT INTO `course` VALUES (9, 1, '历史', 0, '2021-09-24 10:32:50', NULL);

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
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 59 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of grade
-- ----------------------------
INSERT INTO `grade` VALUES (1, 1, 1, 70, 0, '2021-09-16 08:42:50', NULL);
INSERT INTO `grade` VALUES (2, 1, 2, 40, 0, '2021-09-16 08:43:24', NULL);
INSERT INTO `grade` VALUES (3, 2, 1, 70, 0, '2021-09-16 08:43:49', NULL);
INSERT INTO `grade` VALUES (4, 2, 2, 50, 0, '2021-09-16 10:11:01', NULL);
INSERT INTO `grade` VALUES (5, 3, 1, 70, 0, '2021-09-16 10:14:29', NULL);
INSERT INTO `grade` VALUES (7, 4, 2, 100, 0, '2021-09-17 09:05:14', NULL);
INSERT INTO `grade` VALUES (10, 4, 4, 99, 0, '2021-09-17 15:59:57', NULL);
INSERT INTO `grade` VALUES (13, 1, 6, 63, 0, '2021-09-22 08:28:07', NULL);
INSERT INTO `grade` VALUES (17, 1, 3, 33, 0, '2021-09-22 09:17:23', NULL);
INSERT INTO `grade` VALUES (18, 1, 4, 44, 0, '2021-09-22 09:17:33', NULL);
INSERT INTO `grade` VALUES (19, 1, 5, 55, 0, '2021-09-22 09:17:40', NULL);
INSERT INTO `grade` VALUES (20, 6, 7, 77, 1, '2021-09-22 09:25:01', NULL);
INSERT INTO `grade` VALUES (53, 1, 9, 60, 0, '2021-09-24 10:32:50', NULL);
INSERT INTO `grade` VALUES (54, 2, 9, 60, 0, '2021-09-24 10:32:50', NULL);
INSERT INTO `grade` VALUES (55, 3, 9, 60, 0, '2021-09-24 10:32:50', NULL);
INSERT INTO `grade` VALUES (56, 5, 9, 60, 0, '2021-09-24 10:32:50', NULL);
INSERT INTO `grade` VALUES (57, 7, 9, 60, 0, '2021-09-24 10:32:50', NULL);
INSERT INTO `grade` VALUES (58, 7, 9, 60, 0, '2021-09-24 10:32:50', NULL);

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
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '学号',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '学生姓名',
  `del` tinyint(255) NOT NULL DEFAULT 0 COMMENT '0没删 1删除',
  `create_time` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `delete_time` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `name`(`name`(191)) USING BTREE,
  INDEX `del`(`del`) USING BTREE,
  INDEX `name-del`(`name`(191), `del`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES (1, '亚索', 0, '2021-09-16 08:40:55', NULL);
INSERT INTO `student` VALUES (2, '永恩1', 0, '2021-09-16 08:41:10', NULL);
INSERT INTO `student` VALUES (3, '菲兹', 0, '2021-09-16 08:41:20', NULL);
INSERT INTO `student` VALUES (4, '安妮', 1, '2021-09-17 09:25:20', '2021-09-17 09:25:35');
INSERT INTO `student` VALUES (5, '费欧娜', 0, '2021-09-17 15:33:59', NULL);
INSERT INTO `student` VALUES (9, '朱龙', 0, '2021-09-24 18:13:24', NULL);

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
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

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
INSERT INTO `teacher` VALUES (8, '     游    文    ', 0, '2021-09-23 09:16:46', NULL);
INSERT INTO `teacher` VALUES (9, '宫崎英高', 0, '2021-09-23 09:33:17', NULL);

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '账号',
  `pass_word` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '密码',
  `sex` int(255) NULL DEFAULT NULL COMMENT ' 性别 1男  0女',
  `email` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '邮箱',
  `education` int(255) NULL DEFAULT NULL COMMENT '学历 1专科 2本科 3研究生',
  `detail` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '自我介绍',
  `skill` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '技能',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES (1, '贾乃亮', '3243', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `users` VALUES (2, '李小璐', '123', 0, NULL, NULL, NULL, NULL);
INSERT INTO `users` VALUES (3, 'superman', '1234', 1, '10@qq.com', 1, '我非常帅', NULL);
INSERT INTO `users` VALUES (4, '吴奇隆', '1234', 0, '1094769835@qq.com', 1, 'sfsafasf', 'PYTHON,C#');

-- ----------------------------
-- View structure for student_score
-- ----------------------------
DROP VIEW IF EXISTS `student_score`;
CREATE ALGORITHM = UNDEFINED DEFINER = `root`@`localhost` SQL SECURITY DEFINER VIEW `student_score` AS SELECT
s.NAME as sname,
g.score,
c.NAME as cname,
count( 1 ) AS counts,
avg( g.score ) AS avgs,
sum( g.score ) AS sums 
FROM
	student s
	INNER JOIN grade g ON s.id = g.student_id
	INNER JOIN course c ON c.id = g.course_id 
GROUP BY
	s.id,
	c.id 
ORDER BY
	avg( g.score ) DESC ;

-- ----------------------------
-- Function structure for fconcat
-- ----------------------------
DROP FUNCTION IF EXISTS `fconcat`;
delimiter ;;
CREATE DEFINER=`root`@`localhost` FUNCTION `fconcat`(a varchar(255),b varchar(255)) RETURNS varchar(255) CHARSET utf8mb4
BEGIN
	return 'a'+'b';
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for printScore
-- ----------------------------
DROP PROCEDURE IF EXISTS `printScore`;
delimiter ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `printScore`(in iname varchar(255),out oscore int)
begin 
		select score into oscore from grade a,student s where 
			a.student_id=s.id and s.name =iname limit 1;
end
;;
delimiter ;

-- ----------------------------
-- Procedure structure for pscore
-- ----------------------------
DROP PROCEDURE IF EXISTS `pscore`;
delimiter ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `pscore`()
begin
	DECLARE cid int;
	DECLARE cscore int;
	declare sid int;
	-- 定义一个布尔值用来终止 遍历循环
	declare f BOOLEAN DEFAULT true;
	-- 定一个游标遍历 grade表
	DECLARE youbiao cursor for select course_id,score,student_id from grade limit 5;
	/*终止while循环*/
  DECLARE CONTINUE HANDLER for not found set f=false;  
	open youbiao;
	while f do
		fetch youbiao into cid,cscore,sid;
		if cscore >=60 then
			select sid,cid,'及格';
		else  
			select sid,cid,'不及格';
		end if;
	end while;
	close youbiao;
end
;;
delimiter ;

-- ----------------------------
-- Procedure structure for resetScore
-- ----------------------------
DROP PROCEDURE IF EXISTS `resetScore`;
delimiter ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `resetScore`()
begin
	declare pjf int;
	declare cid int;
		-- 定义一个布尔值用来终止 遍历循环
	declare f BOOLEAN DEFAULT true;
	-- 得到游文智老师教的课程的平均分
	declare youbiao cursor for select 
		avg(score),course_id
	from grade g,course c,teacher t 
	where g.course_id=c.id and c.teacher_id=t.id and t.name='游文智'
	group by course_id;
	/*终止while循环*/
  DECLARE CONTINUE HANDLER for not found set f=false;  
	open youbiao;
	while f do 
		fetch youbiao into pjf,cid;
		update grade set score =pjf where course_id =cid;
	end while;
end
;;
delimiter ;

-- ----------------------------
-- Procedure structure for shuchuScore1
-- ----------------------------
DROP PROCEDURE IF EXISTS `shuchuScore1`;
delimiter ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `shuchuScore1`(in iname varchar(255),out oscore int)
begin 
		select score into oscore from grade a,student s where 
			a.student_id=s.id and s.name =iname limit 1;
end
;;
delimiter ;

-- ----------------------------
-- Procedure structure for test
-- ----------------------------
DROP PROCEDURE IF EXISTS `test`;
delimiter ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `test`()
begin
	-- 声明变量 名字i 类型是int 默认值是1
	DECLARE i int DEFAULT 1;
	-- 在mysql里，对于变量的赋值 要加set
	select i;
	set i=10;
	-- 循环
	while i>1 do
		set i=i-1;
		select i;
	end while;
end
;;
delimiter ;

-- ----------------------------
-- Procedure structure for test2
-- ----------------------------
DROP PROCEDURE IF EXISTS `test2`;
delimiter ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `test2`()
begin 
	DECLARE i int DEFAULT 1;
	lo:loop
		set i=i+1;
		select i;
		if i>10 then
			leave lo;
		end if;
	end loop lo;
end
;;
delimiter ;

-- ----------------------------
-- Procedure structure for test3
-- ----------------------------
DROP PROCEDURE IF EXISTS `test3`;
delimiter ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `test3`()
begin 
	DECLARE i int DEFAULT 1;
	REPEAT
		set i=i+1;
		until i>10
	END REPEAT;
	select i;
end
;;
delimiter ;

-- ----------------------------
-- Procedure structure for test4
-- ----------------------------
DROP PROCEDURE IF EXISTS `test4`;
delimiter ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `test4`(in iname varchar(255),out oscore int)
begin 
		select score into oscore from grade a,student s where 
			a.student_id=s.id and s.name =iname limit 1;
end
;;
delimiter ;

-- ----------------------------
-- Procedure structure for test5
-- ----------------------------
DROP PROCEDURE IF EXISTS `test5`;
delimiter ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `test5`(in iname varchar(255),out oscore int)
begin 
		select score into oscore from grade a,student s where 
			a.student_id=s.id and s.name =iname limit 1;
end
;;
delimiter ;

-- ----------------------------
-- Function structure for test6
-- ----------------------------
DROP FUNCTION IF EXISTS `test6`;
delimiter ;;
CREATE DEFINER=`root`@`localhost` FUNCTION `test6`(a int,b int) RETURNS int(11)
BEGIN
	return a+b;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for testttt
-- ----------------------------
DROP PROCEDURE IF EXISTS `testttt`;
delimiter ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `testttt`(in iname varchar(255),out oscore int)
begin 
		select score into oscore from grade a,student s where 
			a.student_id=s.id and s.name =iname limit 1;
end
;;
delimiter ;

-- ----------------------------
-- Triggers structure for table course
-- ----------------------------
DROP TRIGGER IF EXISTS `course_insert_after`;
delimiter ;;
CREATE TRIGGER `course_insert_after` AFTER INSERT ON `course` FOR EACH ROW begin
	DECLARE sid int DEFAULT 0;
	declare f BOOLEAN DEFAULT true;
	DECLARE youbiao cursor for select id from student where del=0;
	DECLARE CONTINUE HANDLER for not found set f=false; 
	open  youbiao ;
	while f do
		fetch youbiao into sid;
		insert into grade(student_id,course_id,score) values(sid,new.id,60);
	end while;
	close youbiao;
end
;;
delimiter ;

SET FOREIGN_KEY_CHECKS = 1;
