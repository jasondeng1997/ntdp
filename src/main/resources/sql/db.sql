-- ----------------------------
-- Table structure for user
-- ----------------------------
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(50) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `real_name` varchar(50) COMMENT '姓名',
  `dept_id` int(11) COMMENT '部门id',
  `status` smallint NOT NULL DEFAULT 1 COMMENT '用户状态',
  `incorrect_password_num` smallint COMMENT '密码错误次数',
  `last_login_time` datetime COMMENT '最近一次登录时间',
  `gmt_create` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COMMENT='用户表';

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user`(id, username, password, real_name, dept_id, status, incorrect_password_num, last_login_time)
VALUES ('1', 'admin', '$2a$10$iYM/H7TrSaLs7XyIWQdGwe1xf4cdmt3nwMja6RT0wxG5YY1RjN0EK', '管理员', 1, 1, null, null);

-- ----------------------------
-- Table structure for sys_permission
-- ----------------------------
CREATE TABLE `sys_permission` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `parent_id` int(11) NOT NULL,
  `name` varchar(50) NOT NULL COMMENT '名称',
  `type` smallint NOT NULL COMMENT '类型1:菜单，2:按钮',
  `router_name` varchar(50) COMMENT '路由名称（类型为菜单时需要填写，和前端的路由一致，用于控制菜单访问）',
  `permission` varchar(50) DEFAULT NULL COMMENT '权限',
  `sort` int(11) NOT NULL COMMENT '排序',
  `gmt_create` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COMMENT='权限表';

-- ----------------------------
-- Records of sys_permission
-- ----------------------------
INSERT INTO `sys_permission`(id, parent_id, name, type, router_name, permission, sort) VALUES ('1', '0', '系统设置', '1', 'system', '', '10');
INSERT INTO `sys_permission`(id, parent_id, name, type, router_name, permission, sort) VALUES ('2', '1', '用户管理', '1', 'user', '', '11');
INSERT INTO `sys_permission`(id, parent_id, name, type, router_name, permission, sort) VALUES ('3', '2', '查询', '2', '', 'sys:user:query', '100');
INSERT INTO `sys_permission`(id, parent_id, name, type, router_name, permission, sort) VALUES ('4', '2', '新增', '2', '', 'sys:user:add', '100');
INSERT INTO `sys_permission`(id, parent_id, name, type, router_name, permission, sort) VALUES ('5', '2', '删除', '2', '', 'sys:user:del', '100');
INSERT INTO `sys_permission`(id, parent_id, name, type, router_name, permission, sort) VALUES ('6', '1', '部门管理', '1', 'sysDept', '', '12');
INSERT INTO `sys_permission`(id, parent_id, name, type, router_name, permission, sort) VALUES ('7', '6', '查询', '2', '', 'sys:dept:query', '100');
INSERT INTO `sys_permission`(id, parent_id, name, type, router_name, permission, sort) VALUES ('8', '6', '新增', '2', '', 'sys:dept:add', '100');
INSERT INTO `sys_permission`(id, parent_id, name, type, router_name, permission, sort) VALUES ('9', '6', '删除', '2', '', 'sys:dept:del', '100');
INSERT INTO `sys_permission`(id, parent_id, name, type, router_name, permission, sort) VALUES ('10', '1', '菜单管理', '1', 'sysPermission', '', '13');
INSERT INTO `sys_permission`(id, parent_id, name, type, router_name, permission, sort) VALUES ('11', '10', '查询', '2', '', 'sys:permission:query', '100');
INSERT INTO `sys_permission`(id, parent_id, name, type, router_name, permission, sort) VALUES ('12', '10', '新增', '2', '', 'sys:permission:add', '100');
INSERT INTO `sys_permission`(id, parent_id, name, type, router_name, permission, sort) VALUES ('13', '10', '删除', '2', '', 'sys:permission:del', '100');
INSERT INTO `sys_permission`(id, parent_id, name, type, router_name, permission, sort) VALUES ('14', '1', '角色管理', '1', 'sysRole', '', '14');
INSERT INTO `sys_permission`(id, parent_id, name, type, router_name, permission, sort) VALUES ('15', '14', '查询', '2', '', 'sys:role:query', '100');
INSERT INTO `sys_permission`(id, parent_id, name, type, router_name, permission, sort) VALUES ('16', '14', '新增', '2', '', 'sys:role:add', '100');
INSERT INTO `sys_permission`(id, parent_id, name, type, router_name, permission, sort) VALUES ('17', '14', '删除', '2', '', 'sys:role:del', '100');
INSERT INTO `sys_permission`(id, parent_id, name, type, router_name, permission, sort) VALUES ('18', '1', '字典管理', '1', 'sysDict', '', '15');
INSERT INTO `sys_permission`(id, parent_id, name, type, router_name, permission, sort) VALUES ('19', '18', '查询', '2', '', 'sys:dict:query', '100');
INSERT INTO `sys_permission`(id, parent_id, name, type, router_name, permission, sort) VALUES ('20', '18', '新增', '2', '', 'sys:dict:add', '100');
INSERT INTO `sys_permission`(id, parent_id, name, type, router_name, permission, sort) VALUES ('21', '18', '删除', '2', '', 'sys:dict:del', '100');

INSERT INTO `sys_permission`(id, parent_id, name, type, router_name, permission, sort) VALUES ('31', '0', '基础信息', '1', 'basic', '', '31');
INSERT INTO `sys_permission`(id, parent_id, name, type, router_name, permission, sort) VALUES ('32', '31', '企业管理', '1', 'factory', '', '32');
INSERT INTO `sys_permission`(id, parent_id, name, type, router_name, permission, sort) VALUES ('33', '32', '查询', '2', '', 'factory:query', '100');
INSERT INTO `sys_permission`(id, parent_id, name, type, router_name, permission, sort) VALUES ('34', '32', '新增', '2', '', 'factory:add', '100');
INSERT INTO `sys_permission`(id, parent_id, name, type, router_name, permission, sort) VALUES ('35', '32', '删除', '2', '', 'factory:del', '100');
INSERT INTO `sys_permission`(id, parent_id, name, type, router_name, permission, sort) VALUES ('36', '31', '车辆管理', '1', 'car', '', '32');
INSERT INTO `sys_permission`(id, parent_id, name, type, router_name, permission, sort) VALUES ('37', '36', '查询', '2', '', 'car:query', '100');
INSERT INTO `sys_permission`(id, parent_id, name, type, router_name, permission, sort) VALUES ('38', '36', '新增', '2', '', 'car:add', '100');
INSERT INTO `sys_permission`(id, parent_id, name, type, router_name, permission, sort) VALUES ('39', '36', '删除', '2', '', 'car:del', '100');
INSERT INTO `sys_permission`(id, parent_id, name, type, router_name, permission, sort) VALUES ('40', '31', '人脸设备', '1', 'faceDevice', '', '40');
INSERT INTO `sys_permission`(id, parent_id, name, type, router_name, permission, sort) VALUES ('41', '40', '查询', '2', '', 'face:device:query', '100');
INSERT INTO `sys_permission`(id, parent_id, name, type, router_name, permission, sort) VALUES ('42', '40', '新增', '2', '', 'face:device:add', '100');
INSERT INTO `sys_permission`(id, parent_id, name, type, router_name, permission, sort) VALUES ('43', '40', '删除', '2', '', 'face:device:del', '100');
INSERT INTO `sys_permission`(id, parent_id, name, type, router_name, permission, sort) VALUES ('44', '31', '会员等级', '1', 'customerLevel', '', '44');
INSERT INTO `sys_permission`(id, parent_id, name, type, router_name, permission, sort) VALUES ('45', '44', '查询', '2', '', 'customer:level:query', '100');
INSERT INTO `sys_permission`(id, parent_id, name, type, router_name, permission, sort) VALUES ('46', '44', '新增', '2', '', 'customer:level:add', '100');
INSERT INTO `sys_permission`(id, parent_id, name, type, router_name, permission, sort) VALUES ('47', '44', '删除', '2', '', 'customer:level:del', '100');
INSERT INTO `sys_permission`(id, parent_id, name, type, router_name, permission, sort) VALUES ('48', '31', '会员管理', '1', 'customer', '', '44');
INSERT INTO `sys_permission`(id, parent_id, name, type, router_name, permission, sort) VALUES ('49', '48', '查询', '2', '', 'customer:query', '100');
INSERT INTO `sys_permission`(id, parent_id, name, type, router_name, permission, sort) VALUES ('50', '48', '新增', '2', '', 'customer:add', '100');
INSERT INTO `sys_permission`(id, parent_id, name, type, router_name, permission, sort) VALUES ('51', '48', '删除', '2', '', 'customer:del', '100');

INSERT INTO `sys_permission`(id, parent_id, name, type, router_name, permission, sort) VALUES ('61', '0', '乘车信息', '1', 'carFaceInfo', '', '51');
INSERT INTO `sys_permission`(id, parent_id, name, type, router_name, permission, sort) VALUES ('62', '61', '信息查询', '1', 'infoQuery', '', '62');
INSERT INTO `sys_permission`(id, parent_id, name, type, router_name, permission, sort) VALUES ('63', '61', '结算报表', '1', 'infoReport', '', '63');

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
CREATE TABLE `sys_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(50) NOT NULL COMMENT '角色名称',
  `role_description` varchar(100) DEFAULT NULL comment '角色描述',
  `gmt_create` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `role_name` (`role_name`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COMMENT'角色表';

-- ----------------------------
-- Records of sys_role
-- ----------------------------
INSERT INTO `sys_role`(id, role_name, role_description) VALUES ('1', 'admin', '管理员');
INSERT INTO `sys_role`(id, role_name, role_description) VALUES ('2', 'external', '普通用户');

-- ----------------------------
-- Table structure for sys_role_permission
-- ----------------------------
CREATE TABLE `sys_role_permission` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_id` int(11) NOT NULL COMMENT '角色id',
  `permission_id` int(11) NOT NULL COMMENT '权限id',
  `gmt_create` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT '角色权限表';

-- ----------------------------
-- Records of sys_role_permission
-- ----------------------------
INSERT INTO `sys_role_permission`(role_id, permission_id) VALUES ('1', '1');
INSERT INTO `sys_role_permission`(role_id, permission_id) VALUES ('1', '2');
INSERT INTO `sys_role_permission`(role_id, permission_id) VALUES ('1', '3');
INSERT INTO `sys_role_permission`(role_id, permission_id) VALUES ('1', '4');
INSERT INTO `sys_role_permission`(role_id, permission_id) VALUES ('1', '5');
INSERT INTO `sys_role_permission`(role_id, permission_id) VALUES ('1', '6');
INSERT INTO `sys_role_permission`(role_id, permission_id) VALUES ('1', '7');
INSERT INTO `sys_role_permission`(role_id, permission_id) VALUES ('1', '8');
INSERT INTO `sys_role_permission`(role_id, permission_id) VALUES ('1', '9');
INSERT INTO `sys_role_permission`(role_id, permission_id) VALUES ('1', '10');
INSERT INTO `sys_role_permission`(role_id, permission_id) VALUES ('1', '11');
INSERT INTO `sys_role_permission`(role_id, permission_id) VALUES ('1', '12');
INSERT INTO `sys_role_permission`(role_id, permission_id) VALUES ('1', '13');
INSERT INTO `sys_role_permission`(role_id, permission_id) VALUES ('1', '14');
INSERT INTO `sys_role_permission`(role_id, permission_id) VALUES ('1', '15');
INSERT INTO `sys_role_permission`(role_id, permission_id) VALUES ('1', '16');
INSERT INTO `sys_role_permission`(role_id, permission_id) VALUES ('1', '17');
INSERT INTO `sys_role_permission`(role_id, permission_id) VALUES ('1', '18');
INSERT INTO `sys_role_permission`(role_id, permission_id) VALUES ('1', '19');
INSERT INTO `sys_role_permission`(role_id, permission_id) VALUES ('1', '20');
INSERT INTO `sys_role_permission`(role_id, permission_id) VALUES ('1', '21');

INSERT INTO `sys_role_permission`(role_id, permission_id) VALUES ('1', '31');
INSERT INTO `sys_role_permission`(role_id, permission_id) VALUES ('1', '32');
INSERT INTO `sys_role_permission`(role_id, permission_id) VALUES ('1', '33');
INSERT INTO `sys_role_permission`(role_id, permission_id) VALUES ('1', '34');
INSERT INTO `sys_role_permission`(role_id, permission_id) VALUES ('1', '35');
INSERT INTO `sys_role_permission`(role_id, permission_id) VALUES ('1', '36');
INSERT INTO `sys_role_permission`(role_id, permission_id) VALUES ('1', '37');
INSERT INTO `sys_role_permission`(role_id, permission_id) VALUES ('1', '38');
INSERT INTO `sys_role_permission`(role_id, permission_id) VALUES ('1', '39');
INSERT INTO `sys_role_permission`(role_id, permission_id) VALUES ('1', '40');
INSERT INTO `sys_role_permission`(role_id, permission_id) VALUES ('1', '41');
INSERT INTO `sys_role_permission`(role_id, permission_id) VALUES ('1', '42');
INSERT INTO `sys_role_permission`(role_id, permission_id) VALUES ('1', '43');
INSERT INTO `sys_role_permission`(role_id, permission_id) VALUES ('1', '44');
INSERT INTO `sys_role_permission`(role_id, permission_id) VALUES ('1', '45');
INSERT INTO `sys_role_permission`(role_id, permission_id) VALUES ('1', '46');
INSERT INTO `sys_role_permission`(role_id, permission_id) VALUES ('1', '47');
INSERT INTO `sys_role_permission`(role_id, permission_id) VALUES ('1', '48');
INSERT INTO `sys_role_permission`(role_id, permission_id) VALUES ('1', '49');
INSERT INTO `sys_role_permission`(role_id, permission_id) VALUES ('1', '50');
INSERT INTO `sys_role_permission`(role_id, permission_id) VALUES ('1', '51');

INSERT INTO `sys_role_permission`(role_id, permission_id) VALUES ('1', '61');
INSERT INTO `sys_role_permission`(role_id, permission_id) VALUES ('1', '62');
INSERT INTO `sys_role_permission`(role_id, permission_id) VALUES ('1', '63');

-- ----------------------------
-- Table structure for sys_role_user
-- ----------------------------
CREATE TABLE `sys_role_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `role_id` int(11) NOT NULL,
  `customer_no` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT '用户角色表';

-- ----------------------------
-- Records of sys_role_user
-- ----------------------------
INSERT INTO `sys_role_user`(user_id, role_id) VALUES ('1', '1');

-- ----------------------------
-- Table structure for token_info
-- ----------------------------
CREATE TABLE `token_info` (
  `id` varchar(36) NOT NULL COMMENT 'token',
  `val` text NOT NULL COMMENT 'LoginUser的json串',
  `expire_time` datetime NOT NULL COMMENT '失效时间',
  `gmt_create` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'token信息表';

-- ----------------------------
-- Table structure for sys_logs
-- ----------------------------
CREATE TABLE `sys_logs` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `module` varchar(50) DEFAULT NULL COMMENT '模块名',
  `flag` smallint NOT NULL DEFAULT '1' COMMENT '成功失败',
  `remark` text COMMENT '备注',
  `gmt_create` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`),
  KEY `user_id` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT '系统日志表';

-- ----------------------------
-- Table structure for sys_dept
-- ----------------------------
CREATE TABLE `sys_dept` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '部门id',
  `parent_id` int(11) COMMENT '上级部门id',
  `dept_name` varchar(50) NOT NULL COMMENT '部门名称',
  `use_flag` char(1) NOT NULL COMMENT '使用标识(0/1)',
  `gmt_create` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COMMENT '部门表';

-- ----------------------------
-- Records of sys_dept
-- ----------------------------
INSERT INTO `sys_dept`(id, parent_id, dept_name, use_flag) VALUES (1, 0, '总公司', 'Y');

-- ----------------------------
-- Table structure for sys_dict
-- ----------------------------
CREATE TABLE `sys_dict` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type` varchar(20) NOT NULL COMMENT '字典类型',
  `type_name` varchar(100) NOT NULL COMMENT '类型描述',
  `k` varchar(16) NOT NULL COMMENT '编码',
  `val` varchar(64) NOT NULL COMMENT '名称',
  `gmt_create` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `type` (`type`,`k`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COMMENT '字典表';

-- ----------------------------
-- Records of sys_dict
-- ----------------------------
INSERT INTO `sys_dict`(id, type, type_name, k, val) VALUES ('1', 'sex', '性别', 'F', '女');
INSERT INTO `sys_dict`(id, type, type_name, k, val) VALUES ('2', 'sex', '性别', 'M', '男');
INSERT INTO `sys_dict`(id, type, type_name, k, val) VALUES ('3', 'userStatus', '用户状态', '1', '正常');
INSERT INTO `sys_dict`(id, type, type_name, k, val) VALUES ('4', 'userStatus', '用户状态', '2', '无效');
INSERT INTO `sys_dict`(id, type, type_name, k, val) VALUES ('5', 'userStatus', '用户状态', '3', '锁定');
INSERT INTO `sys_dict`(id, type, type_name, k, val) VALUES ('8', 'deviceStatus', '设备状态', '1', '未启用');
INSERT INTO `sys_dict`(id, type, type_name, k, val) VALUES ('9', 'deviceStatus', '设备状态', '2', '正常');
INSERT INTO `sys_dict`(id, type, type_name, k, val) VALUES ('10', 'deviceStatus', '设备状态', '3', '故障');
INSERT INTO `sys_dict`(id, type, type_name, k, val) VALUES ('11', 'deviceStatus', '设备状态', '4', '报废');
INSERT INTO `sys_dict`(id, type, type_name, k, val) VALUES ('15', 'factoryLevel', '工厂等级', '1', '普通');
INSERT INTO `sys_dict`(id, type, type_name, k, val) VALUES ('16', 'factoryLevel', '工厂等级', '2', 'VIP');
INSERT INTO `sys_dict`(id, type, type_name, k, val) VALUES ('17', 'idType', '证件类型', '1', '身份证');
INSERT INTO `sys_dict`(id, type, type_name, k, val) VALUES ('18', 'idType', '证件类型', '2', '护照');

-- ----------------------------
-- Table structure for car
-- ----------------------------
CREATE TABLE `car` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `car_no` varchar(20) NOT NULL COMMENT '车牌号码',
  `car_brand` varchar(100) COMMENT '车辆品牌',
  `car_type` varchar(100) COMMENT '车辆型号',
  `sit_num` int(11) COMMENT '载客人数',
  `price` decimal (8,2) NOT NULL DEFAULT 0 comment '票价',
  `delete_flag` smallint NOT NULL DEFAULT 2 COMMENT '删除标识',
  `gmt_create` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `car_no` (`car_no`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COMMENT '车辆信息表';

-- ----------------------------
-- Table structure for face_device
-- ----------------------------
CREATE TABLE `face_device` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `device_no` varchar(30) NOT NULL COMMENT '设备编号',
  `car_no` varchar(30) COMMENT '关联车牌号码',
  `device_brand` varchar(100) COMMENT '品牌',
  `device_type` varchar(100) COMMENT '型号',
  `device_seq` varchar(50) COMMENT '设备序列号',
  `device_status` smallint NOT NULL DEFAULT 1 COMMENT '设备状态',
  `delete_flag` smallint NOT NULL DEFAULT 2 COMMENT '删除标识',
  `gmt_create` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `device_no` (`device_no`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COMMENT '人脸设备信息表';

-- ----------------------------
-- Table structure for factory
-- ----------------------------
CREATE TABLE `factory` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `factory_name` varchar(100) NOT NULL COMMENT '名称',
  `address` varchar(100) COMMENT '地址',
  `level` smallint COMMENT '等级',
  `link_name` varchar(100) COMMENT '联系人姓名',
  `link_email` varchar(100) COMMENT '联系人邮箱',
  `link_tel` varchar(50) COMMENT '联系方式',
  `delete_flag` smallint NOT NULL DEFAULT 2 COMMENT '删除标识',
  `gmt_create` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `factory_name` (`factory_name`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COMMENT '工厂信息表';

-- ----------------------------
-- Table structure for customer_level
-- ----------------------------
CREATE TABLE `customer_level` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `level_name` varchar(100) NOT NULL COMMENT '等级名称',
  `discount_rate` decimal (3,2) NOT NULL DEFAULT 1 comment '票价折扣比例',
  `gmt_create` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COMMENT '会员等级表';

-- ----------------------------
-- Table structure for customer
-- ----------------------------
CREATE TABLE `customer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `customer_name` varchar(100) NOT NULL COMMENT '姓名',
  `id_type` smallint(100) NOT NULL DEFAULT 1 COMMENT '证件类型',
  `id_no` varchar(100) COMMENT '证件号码',
  `factory_id` int(11) NOT NULL COMMENT '所属工厂',
  `level_id` int(11) COMMENT '客户等级',
  `image_name` varchar(100) COMMENT '图像名',
  `delete_flag` smallint NOT NULL DEFAULT 2 COMMENT '删除标识',
  `gmt_create` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_type_no` (`id_type`, `id_no`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COMMENT '会员表';

-- ----------------------------
-- Table structure for car_face_info
-- ----------------------------
CREATE TABLE `car_face_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `customer_id` int(11) COMMENT '会员ID',
  `customer_name` varchar(100) COMMENT '会员姓名',
  `face_time`  datetime NOT NULL COMMENT '识别时间',
  `device_id` int(11) COMMENT '设备ID',
  `car_no` varchar(30) COMMENT '车牌号码',
  `factory_id` int(11) COMMENT '工厂ID',
  `price` decimal (8,2) NOT NULL DEFAULT 0 comment '票价',
  `discount_rate` decimal (3,2) NOT NULL DEFAULT 1 comment '票价折扣比例',
  `level_id` int(11) COMMENT '客户等级',
  `discount_price` decimal (8,2) NOT NULL DEFAULT 0 comment '折扣后票价',
  `gmt_create` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COMMENT '车辆人脸识别信息表';

ALTER TABLE car_face_info ADD INDEX index_customer_device_time (customer_id, device_id, face_time);
ALTER TABLE car_face_info ADD INDEX index_factory_id (factory_id);
ALTER TABLE car_face_info ADD INDEX index_factory_time (face_time);

-- 2021-03-11
alter table car add column line_name varchar(50) comment '线路名称';
alter table car_face_info add column line_name varchar(50) comment '线路名称';

-- 2021-03-29
INSERT INTO `sys_dict`(id, type, type_name, k, val) VALUES ('19', 'calcAttribute', '结算属性', '1', '后付费');
INSERT INTO `sys_dict`(id, type, type_name, k, val) VALUES ('20', 'calcAttribute', '结算属性', '2', '预充值');
alter table factory add column `calc_attribute` smallint DEFAULT 1 COMMENT '结算属性';

