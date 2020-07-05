/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50024
Source Host           : localhost:3306
Source Database       : scw

Target Server Type    : MYSQL
Target Server Version : 50024
File Encoding         : 65001

Date: 2020-07-05 12:54:20
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for scw_account
-- ----------------------------
DROP TABLE IF EXISTS `scw_account`;
CREATE TABLE `scw_account` (
  `id` int(11) NOT NULL auto_increment,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `email` varchar(255) default '',
  `phone` varchar(255) default '',
  `role_id` int(11) default '2',
  `admin` int(11) default '0' COMMENT '1为管理员0位普通用户',
  `state` int(2) NOT NULL COMMENT '0为企业，1为个人',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of scw_account
-- ----------------------------
INSERT INTO `scw_account` VALUES ('1', 'admin', 'admin', '1104888697@qq.com', '1763136416516', '1', '1', '1');
INSERT INTO `scw_account` VALUES ('2', 'aaa', 'aaa', '1104888697@qq.com', '1763136416516', '2', '0', '0');
INSERT INTO `scw_account` VALUES ('3', 'bbb', 'bbb', 'bbbb', 'bbbb', '2', '0', '1');
INSERT INTO `scw_account` VALUES ('4', 'ddd', 'ddd', '84956226@qq.com', '17613738131', '2', '0', '0');

-- ----------------------------
-- Table structure for scw_category
-- ----------------------------
DROP TABLE IF EXISTS `scw_category`;
CREATE TABLE `scw_category` (
  `id` int(11) NOT NULL auto_increment,
  `name` varchar(255) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of scw_category
-- ----------------------------
INSERT INTO `scw_category` VALUES ('1', '科技');
INSERT INTO `scw_category` VALUES ('2', '设计');
INSERT INTO `scw_category` VALUES ('3', '公益');
INSERT INTO `scw_category` VALUES ('4', '农业');

-- ----------------------------
-- Table structure for scw_privilege
-- ----------------------------
DROP TABLE IF EXISTS `scw_privilege`;
CREATE TABLE `scw_privilege` (
  `id` int(11) NOT NULL auto_increment,
  `name` varchar(255) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of scw_privilege
-- ----------------------------
INSERT INTO `scw_privilege` VALUES ('1', '权限管理');
INSERT INTO `scw_privilege` VALUES ('2', '业务审核');
INSERT INTO `scw_privilege` VALUES ('3', '业务管理');
INSERT INTO `scw_privilege` VALUES ('4', '参数管理');

-- ----------------------------
-- Table structure for scw_project
-- ----------------------------
DROP TABLE IF EXISTS `scw_project`;
CREATE TABLE `scw_project` (
  `id` int(11) NOT NULL auto_increment,
  `name` varchar(255) default NULL,
  `context` varchar(255) default NULL,
  `total_price` decimal(10,2) default NULL,
  `total_days` varchar(255) default NULL,
  `head_photo` varchar(255) default NULL,
  `account_id` int(11) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of scw_project
-- ----------------------------

-- ----------------------------
-- Table structure for scw_role
-- ----------------------------
DROP TABLE IF EXISTS `scw_role`;
CREATE TABLE `scw_role` (
  `id` int(11) NOT NULL auto_increment,
  `name` varchar(255) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of scw_role
-- ----------------------------
INSERT INTO `scw_role` VALUES ('1', '管理员');
INSERT INTO `scw_role` VALUES ('2', '普通用户');

-- ----------------------------
-- Table structure for scw_role_privilege
-- ----------------------------
DROP TABLE IF EXISTS `scw_role_privilege`;
CREATE TABLE `scw_role_privilege` (
  `r_id` int(11) NOT NULL,
  `p_id` int(11) NOT NULL,
  PRIMARY KEY  (`r_id`,`p_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of scw_role_privilege
-- ----------------------------
INSERT INTO `scw_role_privilege` VALUES ('1', '1');
INSERT INTO `scw_role_privilege` VALUES ('1', '2');
INSERT INTO `scw_role_privilege` VALUES ('1', '3');
INSERT INTO `scw_role_privilege` VALUES ('1', '4');

-- ----------------------------
-- Table structure for scw_tags
-- ----------------------------
DROP TABLE IF EXISTS `scw_tags`;
CREATE TABLE `scw_tags` (
  `id` int(11) NOT NULL auto_increment,
  `name` varchar(255) default NULL,
  `parrent_id` int(11) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of scw_tags
-- ----------------------------
INSERT INTO `scw_tags` VALUES ('1', '手机', null);
INSERT INTO `scw_tags` VALUES ('2', '数码', null);
INSERT INTO `scw_tags` VALUES ('3', '电脑', null);
INSERT INTO `scw_tags` VALUES ('4', '手机', '1');
INSERT INTO `scw_tags` VALUES ('5', '快充', '1');
INSERT INTO `scw_tags` VALUES ('6', '相机', '2');
INSERT INTO `scw_tags` VALUES ('7', '电动剃须刀', '2');
INSERT INTO `scw_tags` VALUES ('8', '笔记本', '3');
INSERT INTO `scw_tags` VALUES ('9', '台式', '3');
