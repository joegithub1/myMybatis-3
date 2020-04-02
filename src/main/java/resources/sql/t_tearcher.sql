/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50716
 Source Host           : 127.0.0.1:3306
 Source Schema         : imooc

 Target Server Type    : MySQL
 Target Server Version : 50716
 File Encoding         : 65001

 Date: 02/04/2020 15:03:18
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_tearcher
-- ----------------------------
DROP TABLE IF EXISTS `t_tearcher`;
CREATE TABLE `t_tearcher`  (
  `t_id` int(11) NOT NULL AUTO_INCREMENT,
  `t_age` int(11) NOT NULL,
  `t_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`t_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_tearcher
-- ----------------------------
INSERT INTO `t_tearcher` VALUES (1, 18, 'zhangsan');
INSERT INTO `t_tearcher` VALUES (2, 28, 'lisi');

SET FOREIGN_KEY_CHECKS = 1;
