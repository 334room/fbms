CREATE TABLE `fbms`.`role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `role_name` varchar(50) NOT NULL COMMENT '角色名称',
  `describe` varchar(255) DEFAULT NULL COMMENT '角色描述',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `parent_id` bigint(20) NOT NULL DEFAULT 0 COMMENT '上一级目录id',
  `create_time` datetime(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3) COMMENT '创建时间',
  `last_update_time` datetime(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3) ON UPDATE CURRENT_TIMESTAMP(3) COMMENT '最后修改时间',
  PRIMARY KEY (`id`),
  UNIQUE INDEX idx_role_name(role_name)
) ENGINE=INNODB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COMMENT='角色表';