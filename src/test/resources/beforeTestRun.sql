insert into contact_details (recruited_id, company_phone, company_website, contact_company, recruiter_name) 
values (1, 12345678,'wwww','Mindtree', 'Mindtree');
insert into service_request (job_id, company_profile, contact_details_recruited_id, cost_to_company, dcrequirement, pgrequirement, ugrequirement, experience,
 job_location, position, time_to_join, job_description, job_title)
 values (1,'Mindtree', 1, '150000', true, true, false, 2, 'Bangalore', 'Engineer', 1, 'IT Engineer','Full Time');
insert into skill (skill_id, skill_name) 
values (1, 'Java');