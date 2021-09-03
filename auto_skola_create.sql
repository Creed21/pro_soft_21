create table korisnik (
    id int primary key,
    ime text not null,
    prezime text not null,
    email text not null unique,
    jmbg text not null unique,
    telefon text not null,
    datrodj date not null,
    usc varchar(35),
    dtc date not null default current_timestamp,
    usm varchar(35),
    dtm varchar(35)
);

-- select COLUMN_NAME, CONSTRAINT_NAME, REFERENCED_COLUMN_NAME, REFERENCED_TABLE_NAME
-- from information_schema.KEY_COLUMN_USAGE
-- where TABLE_NAME = 'korisnik';



create table instruktor (
    id int primary key,
    username text not null unique,
    pass text not null,
    plata double,
    datzap date,
    constraint fk_korisnik foreign key (id) references korisnik(id) on delete restrict
);

create index idex_user on instruktor(username);


alter table korisnik modify column dtc date default now();
alter table korisnik modify column dtm date default now();

create table ucenik (
    id int primary key,
    zavrsio_teor int default 0, 
    zavrsio_prvu_pomoc int default 0, 
    zavrsio_prakticni int default 0, 
    polozio_prakticni int ,
    polozio_teor int,
    dt_polozio date,
    constraint fk_uc_korisnik foreign key(id) references korisnik(id) on delete restrict,
    constraint check_zavr_teor check (zavrsio_teor in (0,1)),
    constraint check_zavr_prvu_pom check (zavrsio_prvu_pomoc in (0,1)),
    constraint check_zavr_prakt check (zavrsio_prakticni in (0,1)),
    constraint check_polozio_prakt check (polozio_prakticni in (0,1)),
    constraint check_polozio_teor check (polozio_teor in (0,1)),
    constraint dt_polozio check (polozio_prakticni = 1 and polozio_teor = 1)
);

create table kategorija (
    id int primary key, 
    naziv text not null,
    min_god int, 
    usc varchar(35), 
    dtc date default now(), 
    usm varchar(35), 
    dtm date default now(),
--     constraint fk_kat_usc foreign key(usc) references instruktor(username),
--     constraint fk_kat_usm foreign key(usm) references instruktor(username),
    constraint check_kat_min_god check (min_god > 0)
);

alter table kategorija 
add constraint fk_kat_usc foreign key(usc) references instruktor(username);

create table grupa (
    id int primary key, 
    naziv text not null, 
    dtpoc date, 
    usc varchar(35), 
    dtc date default now(), 
    usm varchar(35), 
    dtm date default now(), 
    id_instr int, 
    id_kategor int,
    constraint fk_gr_inst foreign key(id_instr) references instruktor(id),
    constraint fk_gr_kateg foreign key(id_kategor) references kategorija(id)    
);
alter table grupa
add constraint fk_grupa_usc foreign key(usc) references instruktor(username);
alter table grupa
add constraint fk_grupa_usm foreign key(usm) references instruktor(username);

create table polaznici (
    id_grupa int, 
    id_ucenik int, 
    usc varchar(35), 
    dtc date default now(),
    constraint pk_polaznici primary key (id_grupa, id_ucenik),
    constraint fk_polaz_grupa foreign key(id_grupa) references grupa(id),
    constraint fk_polaz_ucenik foreign key(id_ucenik) references ucenik(id)
);
alter table polaznici
add constraint fk_polaznici_usc foreign key(usc) references instruktor(username);


create table prakticniCas (
    rbr int,
    id_instr int, 
    id_ucenik int, 
    naziv text, 
    odrzan date, 
    usc varchar(35),
    dtc date default now(),
    constraint pk_prakticniCas primary key (rbr, id_instr, id_ucenik),
    constraint fk_prakCas_instr foreign key(id_instr) references instruktor(id),
    constraint fk_prakCas_ucenik foreign key(id_ucenik) references ucenik(id)
);
alter table prakticniCas
add constraint fk_prakCas_usc foreign key(usc) references instruktor(username);
    
create table teorijskiCas (
    id_instr int,
    id_grupa int, 
    dt date, 
    rbr_teor_cas int not null unique, 
    tema text , 
    usc varchar(35), 
    dtc date default now(), 
    usm varchar(35), 
    dtm date default now(),
    constraint pk_teorijskiCas primary key (id_instr, id_grupa, dt),
    constraint fk_teorCas_grupa foreign key(id_grupa) references grupa(id),
    constraint fk_teorCas_instruktor foreign key(id_instr) references instruktor(id)
);
alter table teorijskicas
add constraint fk_teorCas_usc foreign key(usc) references instruktor(username);
alter table teorijskicas
add constraint fk_teorCas_usm foreign key(usm) references instruktor(username);

create table odslusaniCas (
    rbr_teor_cas int, 
    id_instr int, 
    id_ucenik int, 
    dt date, 
    usc varchar(35), 
    dtc date default now(),
    constraint pk_odslusaniCas primary key (rbr_teor_cas, id_instr, id_ucenik),
    constraint fk_odslusCas_teorCas foreign key(rbr_teor_cas) references teorijskiCas(rbr_teor_cas),
    constraint fk_odslusCas_instruktor foreign key(id_instr) references instruktor(id),
    constraint fk_odslusCas_ucenik foreign key(id_ucenik) references ucenik(id)
);
alter table odslusaniCas
add constraint fk_odslCas_usc foreign key(usc) references instruktor(username);



--------------------------------------------------------------------------------

INSERT INTO 
auto_skola.korisnik (id, ime, prezime, email, jmbg, telefon, datrodj,
                        usc, dtc, usm, dtm) 
VALUES(1, 'Aleksandar', 'Janković', 'akendar.jankovic95@yahoo.com', '1234567890123', '/', '1995-10-29',
                        '', current_timestamp, NULL, NULL);


INSERT INTO auto_skola.instruktor (id, username, pass, plata, datzap) 
                            values (1, 'aca', 'a', 123.0, NULL);

update auto_skola.instruktor 
set datzap = current_timestamp()
where id = 1; 

alter table korisnik
add constraint fk_kor_usc foreign key (usc) references instruktor(username);
alter table korisnik
add constraint fk_kor_usm foreign key (usm) references instruktor(username);