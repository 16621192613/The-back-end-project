/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2018/8/14 12:52:39                           */
/*==============================================================*/


drop table if exists ag_Job_menu_gx;

drop table if exists ag_agent_info;

drop table if exists ag_business_user;

drop table if exists ag_collection_doctor;

drop table if exists ag_collection_hospital;

drop table if exists ag_deal_info;

drop table if exists ag_department_info;

drop table if exists ag_doctor_department_gx;

drop table if exists ag_doctor_info;

drop table if exists ag_evaluate_info;

drop table if exists ag_feedback_info;

drop table if exists ag_goods_info;

drop table if exists ag_hospital_info;

drop table if exists ag_hospital_job;

drop table if exists ag_hospital_menu;

drop table if exists ag_hospital_role;

drop table if exists ag_information_info;

drop table if exists ag_inside_info;

drop table if exists ag_integral_info;

drop table if exists ag_integral_order;

drop table if exists ag_maid_info;

drop table if exists ag_money_count;

drop table if exists ag_news_info;

drop table if exists ag_order_info;

drop table if exists ag_patient_info;

drop table if exists ag_wechat_info;

drop table if exists ag_withdraw_info;

drop table if exists ag_withdraw_maid_gx;

drop table if exists ag_work_info;

drop table if exists ag_work_model;

drop table if exists ag_work_model_gx;

drop table if exists ag_work_time;

drop table if exists sys_channel_info;

drop table if exists sys_role_channel_gx;

/*==============================================================*/
/* Table: ag_Job_menu_gx                                        */
/*==============================================================*/
create table ag_Job_menu_gx
(
   ajmg_id              int not null auto_increment comment '岗位菜单关系ID',
   menu_Id              int comment '医院菜单ID',
   job_id               int comment '岗位ID',
   primary key (ajmg_id)
);

alter table ag_Job_menu_gx comment '医院岗位菜单信息';

/*==============================================================*/
/* Table: ag_agent_info                                         */
/*==============================================================*/
create table ag_agent_info
(
   aai_id               int not null auto_increment comment '代理商ID',
   reserved_relate_to   varchar(32) comment '代理商类型:0代理商，1医院',
   reserved_relate_to_organization_id int comment '上级组织ID',
   name                 varchar(100) comment '代理商名称',
   mobile               varchar(100) comment '手机号',
   reserved_prov_id     varchar(20) comment '省',
   reserved_city_id     varchar(20) default NULL comment '市',
   reserved_share_percent decimal(16,2) comment '分佣比例',
   reserved_bank_name   varchar(100) default NULL comment '银行名称',
   reserved_account_name varchar(100) default NULL comment '银行账户名称',
   reserved_account_number varchar(100) default NULL comment '银行账号',
   reserved_relate_to_team_name varchar(100) comment '所属团队',
   status               varchar(32) comment '状态:1正常，2禁用',
   create_ren           varchar(512) comment '创建人',
   create_date          datetime comment '创建时间',
   edit_date            datetime comment '修改时间',
   edit_ren             varchar(512) comment '修改人',
   primary key (aai_id)
);

alter table ag_agent_info comment '代理商信息';

/*==============================================================*/
/* Table: ag_business_user                                      */
/*==============================================================*/
create table ag_business_user
(
   agent_id             int not null auto_increment comment '业务员ID',
   aai_id               int comment '代理商ID',
   parent_agent_id      int comment '上级代理人ID',
   mobile               varchar(100) comment '手机号',
   agent_type           varchar(32) comment '代理人类型:1医院内部员工；2一级代理商员工；3二级员工',
   name                 varchar(100) comment '业务员姓名',
   reserved_share_percent decimal(16,2) comment '分佣比例',
   reserved_prov_id     varchar(20) comment '省',
   reserved_city_id     varchar(20) default NULL comment '市',
   reserved_bank_name   varchar(100) default NULL comment '银行名称',
   reserved_account_name varchar(100) default NULL comment '银行账户名称',
   reserved_account_number varchar(100) default NULL comment '银行账号',
   remark               varchar(512) comment '备注',
   avatar               varchar(100) comment '头像',
   qr_code              varchar(100) comment '二维码',
   status               varchar(32) comment '状态:1正常，2禁用',
   create_ren           varchar(512) comment '创建人',
   create_date          datetime comment '创建时间',
   edit_date            datetime comment '修改时间',
   edit_ren             varchar(512) comment '修改人',
   primary key (agent_id)
);

alter table ag_business_user comment '业务员管理';

/*==============================================================*/
/* Table: ag_collection_doctor                                  */
/*==============================================================*/
create table ag_collection_doctor
(
   mcd_id               int not null auto_increment comment '医生收藏ID',
   doctor_id            int comment '医生ID',
   sui_id               int comment '用户账号ID',
   primary key (mcd_id)
);

alter table ag_collection_doctor comment '医生收藏信息';

/*==============================================================*/
/* Table: ag_collection_hospital                                */
/*==============================================================*/
create table ag_collection_hospital
(
   mch_id               int not null auto_increment comment '医院收藏ID',
   organization_id      int comment '医院ID',
   sui_id               int comment '用户账号ID',
   primary key (mch_id)
);

alter table ag_collection_hospital comment '医院收藏信息';

/*==============================================================*/
/* Table: ag_deal_info                                          */
/*==============================================================*/
create table ag_deal_info
(
   adi_id               int not null auto_increment comment '诊疗ID',
   aoi_id               int comment '预约ID',
   organization_id      int comment '医院ID',
   abu_id               int comment '业务员ID',
   doctor_id            int comment '医生ID',
   department_id        int comment '科室ID',
   patient_id           int comment '患者ID',
   treatment_fee        decimal(16,2) comment '诊疗费',
   drug_fee             decimal(16,2) comment '医药费',
   comment              varchar(100) comment '备注',
   status               varchar(32) comment '状态:1正常，2禁用',
   create_ren           varchar(512) comment '创建人',
   create_date          datetime comment '创建时间',
   edit_ren             varchar(512) comment '修改人',
   edit_date            datetime comment '修改时间',
   primary key (adi_id)
);

alter table ag_deal_info comment '诊疗信息';

/*==============================================================*/
/* Table: ag_department_info                                    */
/*==============================================================*/
create table ag_department_info
(
   department_id        int not null auto_increment comment '科室ID',
   organization_id      int comment '医院ID',
   name                 varchar(100) comment '科室名称',
   visible              varchar(32) comment '是否对外显示，1显示，0不显示',
   reg_to_department    varchar(32) comment '是否排班到科室',
   status               varchar(32) comment '状态:1正常，2禁用',
   create_ren           varchar(512) comment '创建人',
   create_date          datetime comment '创建时间',
   edit_ren             varchar(512) comment '修改人',
   edit_date            datetime comment '修改时间',
   primary key (department_id)
);

alter table ag_department_info comment '科室信息';

/*==============================================================*/
/* Table: ag_doctor_department_gx                               */
/*==============================================================*/
create table ag_doctor_department_gx
(
   addg_id              int not null auto_increment comment '医生科室关系ID',
   doctor_id            int comment '医生ID',
   department_id        int comment '科室ID',
   primary key (addg_id)
);

alter table ag_doctor_department_gx comment '医生科室关系表';

/*==============================================================*/
/* Table: ag_doctor_info                                        */
/*==============================================================*/
create table ag_doctor_info
(
   doctor_id            int not null auto_increment comment '医生ID',
   organization_id      int comment '医院ID',
   role_id              int comment '角色id',
   job_title_id         int comment '岗位ID',
   name                 varchar(100) comment '医生名称',
   gender               varchar(32) comment '性别',
   birthday             varchar(32) comment '生日',
   mobile               varchar(100) comment '手机号',
   expert               varchar(32) comment '是否专家:0是1否',
   introduction         varchar(512) comment '简介',
   major                varchar(512) comment '专业特长',
   visible              varchar(32) comment '是否可见:0可见1不可见',
   avatar               varchar(50) comment '头像',
   images               varchar(255) comment '证书',
   status               varchar(32) comment '是否在职,0是，1不是',
   create_ren           varchar(512) comment '创建人',
   create_date          datetime comment '创建时间',
   edit_ren             varchar(512) comment '修改人',
   edit_date            datetime comment '修改时间',
   primary key (doctor_id)
);

alter table ag_doctor_info comment '医生信息';

/*==============================================================*/
/* Table: ag_evaluate_info                                      */
/*==============================================================*/
create table ag_evaluate_info
(
   aei_id               int not null auto_increment comment '评价ID',
   serial_number        varchar(100) comment '评价编号',
   patient_id           int comment '患者ID',
   medical_record_id    int comment '预约ID',
   organization_id      int comment '医院ID',
   doctor_id            int comment '医生ID',
   organization_score   varchar(32) comment '医院评分',
   doctor_score         varchar(32) comment '医生评分',
   evaluation_labels    varchar(200) comment '标签',
   evaluation_content   varchar(512) comment '评价内容',
   replied              varchar(32) comment '是否回复',
   rep_user_id          int comment '回复人ID',
   is_hos_rep           varchar(32) comment '是否医院回复',
   replied_content      varchar(512) comment '回复内容',
   replied_date         datetime comment '回复时间',
   images               varchar(256) comment '图片',
   status               varchar(32) comment '状态:1正常，2禁用',
   create_ren           varchar(512) comment '创建人',
   create_date          datetime comment '创建时间',
   edit_ren             varchar(512) comment '修改人',
   edit_date            datetime comment '修改时间',
   primary key (aei_id)
);

alter table ag_evaluate_info comment '患者评价信息';

/*==============================================================*/
/* Table: ag_feedback_info                                      */
/*==============================================================*/
create table ag_feedback_info
(
   afbi_id              int not null auto_increment comment '意见反馈ID',
   serial_number        varchar(100) comment '编号',
   user_id              int comment '反馈人ID',
   feedback_type        varchar(32) comment '反馈类型:1患者；2业务员',
   medical_record_id    int comment '预约ID',
   feedback_labels      varchar(200) comment '标签',
   feedback_content     varchar(512) comment '反馈内容',
   replied              varchar(32) comment '是否回复',
   rep_user_id          int comment '回复人ID',
   replied_content      varchar(512) comment '回复内容',
   replied_date         datetime comment '回复时间',
   images               varchar(256) comment '图片',
   status               varchar(32) comment '状态:1正常，2禁用',
   create_ren           varchar(512) comment '创建人',
   create_date          datetime comment '创建时间',
   edit_ren             varchar(512) comment '修改人',
   edit_date            datetime comment '修改时间',
   primary key (afbi_id)
);

alter table ag_feedback_info comment '意见反馈';

/*==============================================================*/
/* Table: ag_goods_info                                         */
/*==============================================================*/
create table ag_goods_info
(
   goods_id             int not null auto_increment comment '积分商品ID',
   name                 varchar(100) comment '商品名称',
   accumulate_point_value int comment '积分单价',
   actual_value         decimal(16,2) comment '实际价格',
   icon                 varchar(100) comment '商品图片',
   supplier_name        varchar(100),
   supplier_mobile      varchar(100) comment '供应商联系方式',
   type                 varchar(32) comment '商品类型：0:实物类;1:电子类',
   status               varchar(32) comment '状态:1正常，2禁用',
   creatorName          varchar(100) comment '创建人',
   create_date          datetime comment '创建时间',
   creatorId            int comment '创建人ID',
   primary key (goods_id)
);

alter table ag_goods_info comment '积分商品管理';

/*==============================================================*/
/* Table: ag_hospital_info                                      */
/*==============================================================*/
create table ag_hospital_info
(
   organization_id      int not null auto_increment comment '医院ID',
   internal_business_people_id int comment '内部业务员ID',
   name                 varchar(100) comment '医院名称',
   domain_name          varchar(200) comment '登录域名',
   medicalInsurance     int comment '是否医保：0是1否',
   organization_type    varchar(32) not null comment '医院类型',
   prov_id              varchar(20) default NULL comment '省',
   city_id              varchar(20) default NULL comment '市',
   district_id          varchar(20) default NULL comment '分布区',
   address              varchar(255) default NULL comment '详细地址',
   traffic_route        varchar(255) comment '交通线路',
   longitude            varchar(255) default NULL comment '经度',
   latitude             varchar(255) default NULL comment '维度',
   manager_name         varchar(255) default NULL comment '医院His管理人员名称',
   manager_mobile       varchar(255) default NULL comment '管理员手机号',
   manager_email        varchar(255) default NULL comment '管理员邮箱',
   contact_mobile       varchar(20) default NULL comment '联系电话',
   introduction         varchar(255) default NULL comment '医院简介',
   icon                 varchar(255) default NULL comment '图标',
   images               varchar(255) comment '图片列表',
   monthly_message_plan_count int(11) not null comment '每月计划群发次数',
   monthly_message_actual_count int(11) not null comment '每月实际群发总数',
   registration_contact_name varchar(100) default NULL comment '医院联系人姓名',
   registration_contact_mobile varchar(50) default NULL comment '医院联系人电话',
   registration_contact_email varchar(100) default NULL comment '医院联系人邮箱',
   drug_fee_percent     decimal(16,2) not null comment '药费佣金比例',
   treatment_fee_percent decimal(16,2) not null comment '诊疗费佣金比例',
   reception_fee        decimal(16,2) not null comment '接洽费',
   patient_share_percent decimal(16,2) not null comment '患者补贴比例',
   primary_salesman_share_percent decimal(16,2) not null comment '一级业务员奖金比例',
   secondary_salesman_share_percent decimal(16,2) not null comment '二级业务员奖金比例',
   organization_share_percent decimal(16,2) not null comment '医院共享用户分佣比例',
   platform_share_percent decimal(16,2) not null comment '平台佣金比例',
   bank_name            varchar(100) default NULL comment '银行名称',
   bank_account_name    varchar(100) default NULL comment '银行账户名称',
   bank_account_number  varchar(100) default NULL comment '银行账号',
   status               varchar(32) comment '状态:0禁用1启用',
   create_ren           varchar(512) comment '创建人',
   create_date          datetime comment '创建时间',
   edit_ren             varchar(512) comment '修改人',
   edit_date            datetime comment '修改时间',
   primary key (organization_id)
);

alter table ag_hospital_info comment '医院信息表';

/*==============================================================*/
/* Table: ag_hospital_job                                       */
/*==============================================================*/
create table ag_hospital_job
(
   job_id               int not null auto_increment comment '岗位ID',
   role_id              int comment '角色id',
   name                 varchar(100) comment '岗位名称',
   locked               varchar(32) comment '是否可编辑：0是1否',
   status               varchar(10) comment '状态',
   create_ren           varchar(512) comment '创建人',
   create_date          datetime comment '创建时间',
   edit_ren             varchar(512) comment '修改人',
   edit_date            datetime comment '修改时间',
   primary key (job_id)
);

alter table ag_hospital_job comment '医院岗位信息';

/*==============================================================*/
/* Table: ag_hospital_menu                                      */
/*==============================================================*/
create table ag_hospital_menu
(
   menu_Id              int not null auto_increment comment '医院菜单ID',
   parent_id            int comment '上级菜单ID',
   name                 varchar(100) comment '菜单名称',
   parent_name          varchar(100) comment '上级菜单名称',
   order_num            int comment '序号',
   primary key (menu_Id)
);

alter table ag_hospital_menu comment '医院菜单信息';

/*==============================================================*/
/* Table: ag_hospital_role                                      */
/*==============================================================*/
create table ag_hospital_role
(
   role_id              int not null auto_increment comment '角色id',
   organization_id      int comment '医院ID',
   name                 varchar(64) comment '角色名称',
   locked               varchar(32) comment '是否可编辑：0是1否',
   status               varchar(10) comment '状态',
   create_ren           varchar(512) comment '创建人',
   create_date          datetime comment '创建时间',
   edit_ren             varchar(512) comment '修改人',
   edit_date            datetime comment '修改时间',
   primary key (role_id)
);

alter table ag_hospital_role comment '医院角色信息';

/*==============================================================*/
/* Table: ag_information_info                                   */
/*==============================================================*/
create table ag_information_info
(
   aii_id               int not null auto_increment comment '咨询ID',
   type                 varchar(32) not null comment '类型',
   prov_id              varchar(20) default NULL comment '省',
   city_id              varchar(20) default NULL comment '市',
   title                varchar(255) default NULL comment '标题',
   author               varchar(255) default NULL comment '作者',
   icon                 varchar(255) default NULL comment '图标',
   digest               varchar(255) default NULL comment '摘要',
   content              text comment '内容',
   is_banner            varchar(32) not null comment '是否设置为Banner',
   banner_icon          varchar(255) default NULL comment 'bannerIconbanner图标',
   banner_start_date    datetime default NULL comment 'bannerStartDate',
   banner_end_date      datetime default NULL comment 'banner结束时间',
   page_read            int not null default 0 comment '访问次数',
   status               varchar(32) comment '状态:1正常，2禁用',
   creator_name         varchar(512) comment '创建人',
   create_date          datetime comment '创建时间',
   creator_id           int comment '创建人ID',
   primary key (aii_id)
);

alter table ag_information_info comment '资讯';

/*==============================================================*/
/* Table: ag_inside_info                                        */
/*==============================================================*/
create table ag_inside_info
(
   aii_id               int not null auto_increment comment '内部业务员ID',
   name                 varchar(100) comment '业务员名称',
   mobile               varchar(100) comment '手机号',
   email                varchar(100) comment '邮箱',
   status               varchar(32) comment '状态:1正常，2禁用',
   create_ren           varchar(512) comment '创建人',
   create_date          datetime comment '创建时间',
   edit_ren             varchar(512) comment '修改人',
   edit_date            datetime comment '修改时间',
   primary key (aii_id)
);

alter table ag_inside_info comment '公司内部业务员';

/*==============================================================*/
/* Table: ag_integral_info                                      */
/*==============================================================*/
create table ag_integral_info
(
   aii_id               int not null auto_increment comment '积分记录ID',
   sui_id               int not null comment '用户ID',
   source               varchar(32) comment '积分来源:1签到；2创建新的代约;3邀请新宣传员;4邀请的新用户注册',
   comment              varchar(512) comment '描述',
   count                int comment '分数',
   status               varchar(32) comment '状态:1正常，2禁用',
   create_date          datetime comment '创建时间',
   primary key (aii_id)
);

alter table ag_integral_info comment '积分记录表';

/*==============================================================*/
/* Table: ag_integral_order                                     */
/*==============================================================*/
create table ag_integral_order
(
   aio_id               int not null auto_increment comment '积分订单ID',
   serial_number        varchar(100) comment '订单编号',
   sui_id               int comment '用户ID',
   goods_id             int comment '积分商品ID',
   integral_price       int comment '积分单价',
   goods_name           varchar(100) comment '商品名称',
   goods_type           varchar(32) comment '商品类型：0:实物类;1:电子类',
   supplier_name        varchar(100),
   amount               int comment '商品数量',
   goods_accumulate_point_value int comment '积分总数',
   delivery_name        varchar(100),
   delivery_mobile      varchar(100),
   delivery_prov_id     varchar(100) comment '收货地址--省',
   delivery_city_id     varchar(100) comment '收货地址-市',
   delivery_district_id varchar(100) comment '收货地址-地区',
   delivery_address     varchar(100) comment '收货地址-详细地址',
   delivery_status      varchar(32) comment '发货状态',
   delivery_date        datetime comment '发货日期',
   express_name         varchar(100) comment '快递公司',
   express_serial_number varchar(100),
   status               varchar(32) comment '状态:1正常，2禁用',
   create_ren           varchar(512) comment '创建人',
   create_date          datetime comment '创建时间',
   edit_ren             varchar(512) comment '修改人',
   edit_date            datetime comment '修改时间',
   primary key (aio_id)
);

alter table ag_integral_order comment '积分订单管理';

/*==============================================================*/
/* Table: ag_maid_info                                          */
/*==============================================================*/
create table ag_maid_info
(
   ami_id               int not null auto_increment comment '分佣信息ID',
   adi_id               int comment '诊疗ID',
   drug_fee             decimal(16,2) comment '药品费用',
   drug_fee_percent     decimal(16,2) comment '药品费用比例',
   treatment_fee        decimal(16,2) not null comment '诊疗费用',
   treatment_fee_percent decimal(16,2) not null comment '诊疗费用比例',
   reception_fee        decimal(16,2) not null comment '接洽费',
   total_fee_to_pay     decimal(16,2) not null comment '共支付费用',
   share_patient_id     int comment '患者ID',
   share_patient_amount decimal(16,2) default NULL comment '患者补贴金额',
   share_first_agent_id int default NULL comment '一级代理人ID',
   share_first_agent_amount decimal(16,2) default NULL comment '一级代理人分佣金额',
   share_second_agent_id int default NULL comment '二级代理人ID',
   share_second_agent_amount decimal(16,2) default NULL comment '二级代理人补贴金额',
   share_top_organization_id int comment '代理商ID',
   share_top_organization_amount decimal(16,2) default NULL comment '代理商分佣金额',
   share_top_reserved_agentId int default NULL comment '预约代理人ID',
   share_top_reserved_agent_amount decimal(16,2) default NULL comment '预约代理人佣金',
   share_portal_amount  decimal(16,2) not null comment '平台佣金',
   is_patient_withdraw  varchar(32) not null comment '病人是否提现',
   patient_withdraw_id  int default NULL comment '病人提现申请ID',
   is_first_agent_withdraw varchar(32) not null comment '一级代理人是否提现',
   first_agent_withdraw_id int default NULL comment '一级代理人提现ID',
   is_second_agent_withdraw varchar(32) not null comment '二级代理人是否提现',
   second_agent_withdraw_id int default NULL comment '二级代理人提现ID',
   is_top_organization_withdraw varchar(32) not null comment '代理商是否提现',
   top_organization_withdrawId int default NULL comment '代理商提现ID',
   is_top_reserved_agent_withdraw varchar(32) not null comment '预约代理人是否提现',
   top_reserved_agent_withdraw_id int default NULL comment '预约代理人提现ID',
   status               varchar(32) comment '状态:0正常',
   create_ren           varchar(512) comment '创建人',
   create_date          datetime comment '创建时间',
   edit_ren             varchar(512) comment '修改人',
   edit_date            datetime comment '修改时间',
   primary key (ami_id)
);

alter table ag_maid_info comment '分佣信息';

/*==============================================================*/
/* Table: ag_money_count                                        */
/*==============================================================*/
create table ag_money_count
(
   amc_id               int not null auto_increment comment '余额信息ID',
   sui_id               int comment '用户ID',
   amc_type             varchar(32) comment '用户类型:1医院；2代理商；3业务员；4患者',
   consume_count        numeric(16,2) comment '消费总额',
   money_count          numeric(16,2) comment '余额',
   withdraw_count       numeric(16,2) comment '提现总额',
   integral_count       int comment '积分总数',
   primary key (amc_id)
);

alter table ag_money_count comment '余额信息表';

/*==============================================================*/
/* Table: ag_news_info                                          */
/*==============================================================*/
create table ag_news_info
(
   ani_id               int not null auto_increment comment '消息ID',
   title                varchar(200) comment '标题',
   body                 varchar(512) comment '内容',
   status               varchar(32) comment '状态:1正常，2禁用',
   create_date          datetime comment '创建时间',
   portal_user_id       int comment '创建人ID',
   primary key (ani_id)
);

alter table ag_news_info comment '消息管理';

/*==============================================================*/
/* Table: ag_order_info                                         */
/*==============================================================*/
create table ag_order_info
(
   aoi_id               int not null auto_increment comment '预约ID',
   serial_number        varchar(100) comment '预约编号',
   organization_id      int comment '医院ID',
   agent_id             int comment '业务员ID',
   department_id        int comment '科室ID',
   shift_plan_id        int comment '排班ID',
   shift_period_id      int comment '排班时间ID',
   patient_id           int comment '患者ID',
   doctor_id            int comment '医生ID',
   parent_registration_id int comment '上一次预约ID',
   register_type        varchar(32) comment '业务类型：0:app代约;1:微信预约；3复诊',
   register_date        datetime comment '预约时间',
   patient_name         varchar(100) comment '患者名称',
   patient_mobile       varchar(100) comment '患者手机号',
   patient_gender       varchar(32) comment '性别',
   patient_age          varchar(32) comment '年龄',
   description          varchar(255) comment '描述',
   outpatient_name      varchar(100) comment '预约人姓名',
   register_status      varchar(32) comment '预约状态(0:预约成功;1:代约成功;2:代约取消)',
   outpatient_status    varchar(32) comment '门诊状态(0:结诊;1:未到;2:待诊中;3:已取消)',
   charge_type          varchar(32) comment '是否自增:0是1否',
   status               varchar(32) comment '状态:1正常，2禁用',
   create_ren           varchar(512) comment '创建人',
   create_date          datetime comment '创建时间',
   edit_ren             varchar(512) comment '修改人',
   edit_date            datetime comment '修改时间',
   primary key (aoi_id)
);

alter table ag_order_info comment '预约信息';

/*==============================================================*/
/* Table: ag_patient_info                                       */
/*==============================================================*/
create table ag_patient_info
(
   patient_id           int not null auto_increment comment '患者ID',
   wechat_user_id       int comment '微信ID',
   name                 varchar(100) comment '患者姓名',
   mobile               varchar(100) comment '患者手机号',
   gender               varchar(32) comment '性别',
   age                  varchar(32) comment '年龄',
   source               int comment '来源:上级业务员ID',
   bank_name            varchar(100) default NULL comment '银行名称',
   bank_account_name    varchar(100) default NULL comment '银行账户名称',
   bank_account_number  varchar(100) default NULL comment '银行账号',
   status               varchar(32) comment '状态:0正常',
   create_ren           varchar(512) comment '创建人',
   create_date          datetime comment '创建时间',
   edit_ren             varchar(512) comment '修改人',
   edit_date            datetime comment '修改时间',
   primary key (patient_id)
);

alter table ag_patient_info comment '患者信息';

/*==============================================================*/
/* Table: ag_wechat_info                                        */
/*==============================================================*/
create table ag_wechat_info
(
   wechat_user_id       int not null auto_increment comment '微信ID',
   open_id              varchar(255) not null default '' comment '微信openId',
   scene_id             int default NULL comment '业务员ID',
   wechat_name          varchar(255) default NULL comment '微信昵称',
   avatar               varchar(255) default NULL comment '头像',
   avatar_media_id      varchar(255) default NULL comment '头像mediaId',
   status               varchar(32) comment '状态:0正常',
   create_date          datetime comment '创建时间',
   primary key (wechat_user_id)
);

alter table ag_wechat_info comment '微信用户';

/*==============================================================*/
/* Table: ag_withdraw_info                                      */
/*==============================================================*/
create table ag_withdraw_info
(
   awi_id               int not null auto_increment comment '提现申请ID',
   awi_user_id          int comment '申请人ID',
   serial_number        varchar(100) comment '申请编号',
   withdraw_type        varchar(32) comment '申请类型:1医院提现申请，2员工提现申请，3供应商提现申请，4患者提现申请',
   withdraw_amount      decimal(16,2) comment '提现申请金额',
   context_name         varchar(100) comment '申请人姓名',
   context_mobile       varchar(100) comment '申请人手机号',
   context_bank_name    varchar(100) default NULL comment '银行名称',
   context_account_name varchar(100) default NULL comment '银行账户名称',
   context_account_number varchar(100) default NULL comment '银行账号',
   check_finish_date    datetime comment '审核时间',
   withdraw_finish_date datetime comment '打款时间',
   last_portal_user_id  int comment '最后一次操作人',
   check_failure_reason varchar(512) comment '审核失败原因',
   check_status         varchar(32) comment '审核状态',
   withdraw_status      varchar(32) comment '打款状态',
   withdraw_failure_reason varchar(512) comment '打款失败原因',
   status               varchar(32) comment '状态:1正常，2禁用',
   create_ren           varchar(512) comment '创建人',
   create_date          datetime comment '创建时间',
   edit_ren             varchar(512) comment '修改人',
   edit_date            datetime comment '修改时间',
   primary key (awi_id)
);

alter table ag_withdraw_info comment '提现申请';

/*==============================================================*/
/* Table: ag_withdraw_maid_gx                                   */
/*==============================================================*/
create table ag_withdraw_maid_gx
(
   awmg_id              int not null auto_increment comment '提现分佣ID',
   awi_id               int comment '提现申请ID',
   ami_id               int comment '分佣信息ID',
   primary key (awmg_id)
);

alter table ag_withdraw_maid_gx comment '提现分佣信息';

/*==============================================================*/
/* Table: ag_work_info                                          */
/*==============================================================*/
create table ag_work_info
(
   shift_plan_id        int not null auto_increment comment '排班ID',
   department_id        int comment '科室ID',
   organization_id      int comment '医院ID',
   doctor_id            int comment '医生ID',
   shift_period_id      int comment '排班时间ID',
   plan_date            varchar(32) comment '日期',
   plan_count           int comment '计划接待数',
   actual_count         int comment '实际接待数',
   status               varchar(32) comment '状态:0启用；1禁用',
   create_ren           varchar(512) comment '创建人',
   create_date          datetime comment '创建时间',
   edit_ren             varchar(512) comment '修改人',
   edit_date            datetime comment '修改时间',
   primary key (shift_plan_id)
);

alter table ag_work_info comment '排班信息';

/*==============================================================*/
/* Table: ag_work_model                                         */
/*==============================================================*/
create table ag_work_model
(
   shift_template_id    int not null auto_increment comment '排班模板ID',
   organization_id      int comment '医院ID',
   name                 varchar(100) comment '模板名称',
   status               varchar(32) comment '状态:0正常；1禁用',
   create_ren           varchar(512) comment '创建人',
   create_date          datetime comment '创建时间',
   edit_ren             varchar(512) comment '修改人',
   edit_date            datetime comment '修改时间',
   primary key (shift_template_id)
);

alter table ag_work_model comment '排班模板信息';

/*==============================================================*/
/* Table: ag_work_model_gx                                      */
/*==============================================================*/
create table ag_work_model_gx
(
   awmg_id              int not null auto_increment comment '排班模板关系ID',
   shift_period_id      int comment '排班时间ID',
   shift_template_id    int comment '排班模板ID',
   plan_count           int comment '接诊数量',
   primary key (awmg_id)
);

alter table ag_work_model_gx comment '排班模板关系';

/*==============================================================*/
/* Table: ag_work_time                                          */
/*==============================================================*/
create table ag_work_time
(
   shift_period_id      int not null auto_increment comment '排班时间ID',
   organization_id      int comment '医院ID',
   start_h              varchar(32) not null comment '开始时',
   start_m              varchar(32) not null,
   end_h                varchar(32) not null comment '结束时',
   end_m                varchar(32) not null comment '结束分',
   status               varchar(32) comment '状态:0禁用1启用',
   create_ren           varchar(512) comment '创建人',
   create_date          datetime comment '创建时间',
   edit_ren             varchar(512) comment '修改人',
   edit_date            datetime comment '修改时间',
   primary key (shift_period_id)
);

alter table ag_work_time comment '排班时间';

/*==============================================================*/
/* Table: sys_channel_info                                      */
/*==============================================================*/
create table sys_channel_info
(
   menu_id              int not null auto_increment comment '频道ID',
   name                 varchar(100) comment '频道名称',
   order_num            int comment '频道顺序',
   primary key (menu_id)
);

alter table sys_channel_info comment '系统频道管理';

/*==============================================================*/
/* Table: sys_role_channel_gx                                   */
/*==============================================================*/
create table sys_role_channel_gx
(
   srcg_id              int not null auto_increment comment '角色频道关系ID',
   menu_id              int comment '频道ID',
   srole_id             int comment '角色id',
   primary key (srcg_id)
);

alter table sys_role_channel_gx comment '角色频道关系';


ALTER TABLE  ag_business_user
  ADD COLUMN top_Primary_Agent_Name VARCHAR(128) NULL  COMMENT '初代业务员姓名' ;
  
  
  ALTER TABLE  ag_doctor_info
  ADD COLUMN department_Id VARCHAR(218) NULL  COMMENT '科室ID集合' ;


 
  ALTER TABLE  ag_doctor_info
  ADD COLUMN department_Name VARCHAR(218) NULL  COMMENT '科室名称集合' ;
ALTER TABLE  ag_patient_info
  ADD COLUMN scene_Mobile VARCHAR(218) NULL  COMMENT '一级业务员手机号' ;

 
