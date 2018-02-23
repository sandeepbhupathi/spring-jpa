DROP TABLE IF EXISTS user_sa; 
create table user_sa (id INTEGER IDENTITY(1,1) PRIMARY KEY,name varchar(100),email varchar(100),last_upd_ts TIMESTAMP,
                        last_upd_usr_id varchar(30),crt_dt date,crt_usr_id varchar(30));
DROP TABLE IF EXISTS address_sa; 
create table address_sa (id INTEGER PRIMARY KEY,zip INTEGER,add_st_cd INTEGER);
DROP TABLE IF EXISTS address_stat_cd;
create table address_stat_cd (add_st_cd INTEGER PRIMARY KEY,add_sht_desc VARCHAR(10));