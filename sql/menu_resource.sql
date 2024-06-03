create table if not exists menu_resource
(
    "resourceId"   integer                                      not null,
    resource_name  varchar(128)                                 not null,
    resource_type  varchar(64),
    order_index    integer                                      not null,
    menu_path      varchar(128)                                 not null,
    menu_name      varchar(128)                                 not null,
    menu_icon      varchar(128),
    parent_index   integer                                      not null,
    operation_rule varchar(256)                                 not null,
    create_time    timestamp   default now()                    not null,
    creator        varchar(64) default 'SYS'::character varying not null,
    update_time    timestamp   default now()                    not null,
    updater        varchar(64) default 'SYS'::character varying not null,
    deleted        integer     default 0                        not null,
    hide_in_menu   integer     default 0                        not null
);

comment on table menu_resource is '菜单资源表';

comment on column menu_resource."resourceId" is '唯一标识符';

comment on column menu_resource.resource_name is '资源名称';

comment on column menu_resource.resource_type is '资源类型';

comment on column menu_resource.order_index is '序列索引';

comment on column menu_resource.menu_path is '菜单路径';

comment on column menu_resource.menu_name is '菜单名称';

comment on column menu_resource.menu_icon is '菜单图标';

comment on column menu_resource.parent_index is '父资源序列';

comment on column menu_resource.operation_rule is '操作规则';

comment on column menu_resource.create_time is '创建时间';

comment on column menu_resource.creator is '创建者';

comment on column menu_resource.update_time is '更新时间';

comment on column menu_resource.updater is '更新者';

comment on column menu_resource.deleted is '删除标识符';

comment on column menu_resource.hide_in_menu is '隐藏菜单';

alter table menu_resource
    owner to novel_manage_system;

