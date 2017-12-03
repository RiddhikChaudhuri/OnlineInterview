Hibernate:
    drop table if exists contact_details
Hibernate:
    drop table if exists service_request
Hibernate:
    drop table if exists service_request_skills
Hibernate:
    drop table if exists skill
Hibernate:
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
        user_id bigint not null auto_increment,
        enabled bit not null,
        password varchar(255) not null,
        username varchar(255) not null,
        primary key (user_id)
)

alter table users  add constraint UK_r43af9ap4edm43mmtq01oddj6 unique (username)

alter table service_request add constraint FKft9yx7vxsvi6s25amj2tgv9dt foreign key (contact_details_recruited_id) references contact_details (recruited_id)

alter table service_request_skills  add constraint FKg2gsg8h0x50r0uacxr2xww7sa foreign key (skill_id) references skill (skill_id)

alter table service_request_skills add constraint FKfclu6yxparegemudps3je5jri foreign key (service_request_id) references service_request (service_request_id)