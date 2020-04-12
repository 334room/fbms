CREATE TABLE `fbms`.`menu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `menu_name` varchar(50) NOT NULL COMMENT '菜单名称',
  `on_off` tinyint(1) NOT NULL DEFAULT 1 COMMENT '菜单开关',
  `menu_rank_code` varchar(6) NOT NULL DEFAULT 'level1' COMMENT '菜单等级',
  `describe` varchar(255) DEFAULT NULL COMMENT '菜单描述',
  `parent_id` bigint(20) NOT NULL DEFAULT 0 COMMENT '上一级目录id',
  `create_time` datetime(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3) COMMENT '创建时间',
  `last_update_time` datetime(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3) ON UPDATE CURRENT_TIMESTAMP(3) COMMENT '最后修改时间',
  PRIMARY KEY (`id`),
  UNIQUE INDEX idx_menu_name(menu_name)
) ENGINE=INNODB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COMMENT='菜单表';