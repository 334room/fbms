CREATE TABLE `fbms`.`user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `user_name` varchar(50) NOT NULL COMMENT '用户名',
  `sex` varchar(1) NOT NULL COMMENT '性别',
  `birthday` date NOT NULL  COMMENT '生日',
  `photo_url` varchar(255) DEFAULT NULL COMMENT '照片路由',
  `cell_phone_number` varchar(11) NOT NULL COMMENT '手机号',
  `email` varchar(50) NOT NULL COMMENT '邮箱',
  `account_id` bigint(20) NOT NULL COMMENT '账号id',
  `create_time` datetime(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3) COMMENT '创建时间',
  `last_update_time` datetime(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3) ON UPDATE CURRENT_TIMESTAMP(3) COMMENT '最后修改时间',
  PRIMARY KEY (`id`),
  UNIQUE INDEX idx_account_id(account_id),
  INDEX idx_cell_phone_number(cell_phone_number),
  INDEX idx_email(email)
) ENGINE=INNODB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COMMENT='用户表';