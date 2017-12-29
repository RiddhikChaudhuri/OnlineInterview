use schema oli_db;

drop table if exists contact_details
drop table if exists service_request
drop table if exists service_request_skills
drop table if exists skill
drop table if exists users

create table contact_details (
        recruited_id integer not null auto_increment,
        company_phone integer,
        company_website varchar(255),
        contact_company varchar(255),
        recruiter_name varchar(255),
        primary key (recruited_id)
)

create table service_request (
        service_request_id integer not null auto_increment,
        company_profile longtext,
        created_date datetime,
        cost_to_company varchar(255),
        dcrequirement bit,
        pgrequirement bit,
        ugrequirement bit,
        experience integer,
        job_location varchar(255),
        position varchar(255),
        time_to_join integer,
        job_description longtext,
        job_title varchar(255),
        contact_details_recruited_id integer,
        primary key (service_request_id)
)

create table service_request_skills (
        service_request_id integer not null,
        skill_id integer not null
)

create table skill (
        skill_id integer not null auto_increment,
        skill_name varchar(255),
        primary key (skill_id)
)

create table users (
        id bigint not null auto_increment,
        email varchar(100),
        first_name varchar(100),
        last_name varchar(100),
        password varchar(255),
        primary key (id)
)
    
create table reset_token (
        id integer not null auto_increment,
        expiry_date datetime,
        token varchar(255),
        user_id bigint not null,
        primary key (id)
)

create table oauth_access_token (
  token_id VARCHAR(256),
  token BLOB,
  authentication_id VARCHAR(256) PRIMARY KEY,
  user_name VARCHAR(256),
  client_id VARCHAR(256),
  authentication BLOB,
  refresh_token VARCHAR(256)
)

create table oauth_refresh_token (
  token_id VARCHAR(256),
  token BLOB,
  authentication BLOB
)

alter table reset_token
        add constraint FK4vxwjrcj8j479hf5iehw6qnaa
        foreign key (user_id)
        references users (id)
        
alter table users  add constraint UK_r43af9ap4edm43mmtq01oddj6 unique (email)

alter table service_request add constraint FKft9yx7vxsvi6s25amj2tgv9dt foreign key (contact_details_recruited_id) references contact_details (recruited_id)

alter table service_request_skills  add constraint FKg2gsg8h0x50r0uacxr2xww7sa foreign key (skill_id) references skill (skill_id)

alter table service_request_skills add constraint FKfclu6yxparegemudps3je5jri foreign key (service_request_id) references service_request (service_request_id)