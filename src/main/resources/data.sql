insert into user_sa (name ,email,last_upd_ts,last_upd_usr_id,crt_dt ,crt_usr_id,user_address_line1,user_address_line2,city,state,zip ) values ('SandeepBhupathi','sandeepbupathi08@gmail.com',current_timestamp,'SYSTEM',current_date,'SYSTEM','3375 Spring Hill PKWY SE',' ','Smyrna','GA','30080');
insert into user_sa (name ,email,last_upd_ts,last_upd_usr_id,crt_dt ,crt_usr_id,user_address_line1,user_address_line2,city,state,zip ) values ('Sandeep1','sandeepbupathi07@gmail.com',current_timestamp,'SYSTEM',current_date,'SYSTEM','3375 Spring Hill PKWY SE',' ','Smyrna','GA','30080');
insert into user_sa (name ,email,last_upd_ts,last_upd_usr_id,crt_dt ,crt_usr_id,user_address_line1,user_address_line2,city,state,zip )  values ('Sandeep3','sandeepbupathi09@gmail.com',current_timestamp,'SYSTEM',current_date,'SYSTEM','3375 Spring Hill PKWY SE',' ','Smyrna','GA','30080');
insert into user_sa  (name ,email,last_upd_ts,last_upd_usr_id,crt_dt ,crt_usr_id,user_address_line1,user_address_line2,city,state,zip ) values ('Sowmya','sandeepbupathi10@gmail.com',current_timestamp,'SYSTEM',current_date,'SYSTEM','3375 Spring Hill PKWY SE',' ','Smyrna','GA','30080');
insert into address_sa values (1,30080,1);
insert into address_sa values (2,30081,2);
insert into address_sa values (3,30082,3);
insert into address_sa values (4,30084,2);
insert into address_sa values (5,30085,1);
insert into address_stat_cd values (1,'COM');
insert into address_stat_cd values (2,'RUR');
insert into address_stat_cd values (3,'CONT');
insert into bank (name,address_line1,address_line2,city,state,zip,is_international,last_upd_ts,last_upd_usr_id,crt_dt,crt_usr_id) values ('Sandeep','3375 Spring Hill PKWY SE',' ','Smyrna','GA','30080',TRUE,current_timestamp,'SYSTEM',current_date,'SYSTEM');
insert into bank_contacts(id,contact_name,position_type) values (1,'Sowmya Komuravelli','DM');
insert into bank_contacts(id,contact_name,position_type) values (1,'Srinika Bhupathi','RM');
insert into bank_contacts(id,contact_name,position_type) values (1,'Sudhakar B','CEO');
insert into bank_contacts(id,contact_name,position_type) values (1,'Sandhya B','FM');

insert into credentials(user_name,password,user_id) values ('Sandy','Sandy123',1);

insert into account(BANK_ID,ACCOUNT_TYPE_ID ,NAME,INITIAL_BALANCE,CLOSING_BALANCE,OPEN_DATE,CLOSE_DATE,
last_upd_ts,last_upd_usr_id,crt_dt,crt_usr_id) values (1,1,'Sandeep',10000,5000,current_date-30,current_date-20,current_timestamp,'SYSTEM',current_date,'SYSTEM');

insert into account(BANK_ID,ACCOUNT_TYPE_ID ,NAME,INITIAL_BALANCE,CLOSING_BALANCE,OPEN_DATE,CLOSE_DATE,
last_upd_ts,last_upd_usr_id,crt_dt,crt_usr_id) values (1,1,'Sowmya',100,50,current_date-60,current_date-40,current_timestamp,'SYSTEM',current_date,'SYSTEM');

insert into transaction(ACCOUNT_ID,TRANSACTION_TYPE,AMOUNT,INITIAL_BALANCE,CLOSING_BALANCE,NOTE,last_upd_ts,last_upd_usr_id,crt_dt,crt_usr_id)
values (1,'ATM',150.00,10000,9850,'ATM withdraw',current_timestamp,'SYSTEM',current_date,'SYSTEM');
insert into transaction(ACCOUNT_ID,TRANSACTION_TYPE,AMOUNT,INITIAL_BALANCE,CLOSING_BALANCE,NOTE,last_upd_ts,last_upd_usr_id,crt_dt,crt_usr_id)
values (1,'NEFT',4850.00,9850,5000,'NEFT Transfer',current_timestamp,'SYSTEM',current_date,'SYSTEM');
insert into transaction(ACCOUNT_ID,TRANSACTION_TYPE,AMOUNT,INITIAL_BALANCE,CLOSING_BALANCE,NOTE,last_upd_ts,last_upd_usr_id,crt_dt,crt_usr_id)
values (2,'INT',50,100,50,'Internal Transfer',current_timestamp,'SYSTEM',current_date,'SYSTEM');



