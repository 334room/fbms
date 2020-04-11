CREATE TABLE `fbms`.`menu_and_role` (
  `role_id` bigint(20) NOT NULL COMMENT '用户名',
  `menu_id` bigint(20) NOT NULL COMMENT '性别',
  UNIQUE INDEX idx_role_id_menu_id(role_id,menu_id)
) ENGINE=INNODB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COMMENT='用户表';