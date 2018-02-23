DROP TABLE IF EXISTS user_sa; 
create table user_sa (id INTEGER IDENTITY(1,1) PRIMARY KEY,name varchar(100),email varchar(100),last_upd_ts TIMESTAMP,
                        last_upd_usr_id varchar(30),crt_dt date,crt_usr_id varchar(30),user_address_line1 varchar(40),
                        user_address_line2 varchar(40),city varchar(40),state varchar(40),zip varchar(6));
DROP TABLE IF EXISTS address_sa; 
create table address_sa (id INTEGER PRIMARY KEY,zip INTEGER,add_st_cd INTEGER);
DROP TABLE IF EXISTS address_stat_cd;
create table address_stat_cd (add_st_cd INTEGER PRIMARY KEY,add_sht_desc VARCHAR(10));
DROP TABLE IF EXISTS bank;
create table bank (id BIGINT IDENTITY(1,1) PRIMARY KEY,name varchar(30),address_line1 varchar(40),
address_line2 varchar(40),city varchar(40),state varchar(40),zip varchar(6),is_international boolean,last_upd_ts TIMESTAMP,
                        last_upd_usr_id varchar(30),crt_dt date,crt_usr_id varchar(30));
DROP TABLE IF EXISTS bank_contacts;
create table bank_contacts (id BIGINT,contact_name varchar(50));