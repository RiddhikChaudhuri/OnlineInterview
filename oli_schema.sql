use oli_db;

create table contact_details (
        recruited_id integer not null AUTO_INCREMENT,
        company_phone integer,
        company_website varchar(255),
        contact_company varchar(255),
        recruiter_name varchar(255),
        primary key (recruited_id)
    );
 
    create table service_request (
        job_id integer not null AUTO_INCREMENT,
        company_profile BLOB,
        cost_to_company varchar(255),
        dcrequirement bit,
        pgrequirement bit,
        ugrequirement bit,
        experience integer,
        job_location varchar(255),
        position varchar(255),
        time_to_join integer,
        job_description BLOB,
        job_title varchar(255) not null,
        contact_details_recruited_id integer,
        primary key (job_id)
    );

    create table service_request_key_skills (
        service_request_job_id integer not null,
        key_skills_skill_id integer not null
    );

    create table skill (
        skill_id integer not null AUTO_INCREMENT,
        skill_name varchar(255),
        primary key (skill_id)
    );

    alter table service_request_key_skills 
        add constraint UK_mcw5si9foekee5j1idissmvqm unique (key_skills_skill_id);

    alter table service_request 
        add constraint FKft9yx7vxsvi6s25amj2tgv9dt 
        foreign key (contact_details_recruited_id) 
        references contact_details (recruited_id);

    alter table service_request_key_skills 
        add constraint FK699ervtwjpxn2edksb4a8ie8d 
        foreign key (key_skills_skill_id) 
        references skill (skill_id);

    alter table service_request_key_skills 
        add constraint FK2n77walsoka4rmfvxrvh6qy6c 
        foreign key (service_request_job_id) 
        references service_request (job_id) ;
    alter table skill 
        add constraint FKoe1ksm4c8fkku8gpf8a4ovca5 
        foreign key (skill_id) 
        references service_request (job_id);