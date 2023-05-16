#------------------------------------------------------------
#        Script MySQL.
#------------------------------------------------------------


#------------------------------------------------------------
# Table: projects
#------------------------------------------------------------

CREATE TABLE projects(
        id                     Int  Auto_increment  NOT NULL ,
        progress_rate          Varchar (7) NOT NULL COMMENT "calcul = Somme(progressRate(each step))/nbre of steps"  ,
        status                 Varchar (20) NOT NULL COMMENT "enum = notStarted, inProgress, completed."  ,
        dead_line              Date NOT NULL ,
        url_remote_repository  Varchar (50) ,
        first_saving_date_time Datetime NOT NULL ,
        last_update_date_time  Datetime ,
        version                BigInt NOT NULL ,
        name                   Varchar (50) NOT NULL
	,CONSTRAINT projects_AK UNIQUE (name)
	,CONSTRAINT projects_PK PRIMARY KEY (id)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: resources
#------------------------------------------------------------

CREATE TABLE resources(
        id                     Int  Auto_increment  NOT NULL ,
        name                   Varchar (50) NOT NULL ,
        type                   Varchar (50) NOT NULL COMMENT "enum = pdf, word, png ...."  ,
        link_type              Varchar (50) NOT NULL COMMENT "enum = local, urlSite"  ,
        first_saving_date_time Datetime NOT NULL ,
        last_update_date_time  Datetime ,
        version                BigInt NOT NULL ,
        link                   Varchar (50) NOT NULL COMMENT "can be siteUrl or path to local source" 
	,CONSTRAINT resources_AK UNIQUE (link)
	,CONSTRAINT resources_PK PRIMARY KEY (id)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: languages_and_technos
#------------------------------------------------------------

CREATE TABLE languages_and_technos(
        id                     Int  Auto_increment  NOT NULL ,
        first_saving_date_time Datetime NOT NULL ,
        last_update_date_time  Datetime ,
        version                BigInt NOT NULL ,
        name                   Varchar (50) NOT NULL
	,CONSTRAINT languages_and_technos_AK UNIQUE (name)
	,CONSTRAINT languages_and_technos_PK PRIMARY KEY (id)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: time_lines
#------------------------------------------------------------

CREATE TABLE time_lines(
        id                     Int  Auto_increment  NOT NULL ,
        start_date             Date NOT NULL ,
        end_date               Date NOT NULL ,
        first_saving_date_time Datetime NOT NULL ,
        last_update_date_time  Datetime ,
        version                BigInt NOT NULL
	,CONSTRAINT time_lines_PK PRIMARY KEY (id)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: roadmaps
#------------------------------------------------------------

CREATE TABLE roadmaps(
        id                     BigInt NOT NULL ,
        date_or_timeframe      Datetime ,
        name_version           Varchar (50) ,
        goal                   Varchar (1000) ,
        features               Varchar (1000) ,
        metrics                Varchar (1000) ,
        completed_or_ignored   Bool NOT NULL ,
        status_progress        Varchar (20) NOT NULL COMMENT "enum = notStarted, inProgress, completed, ignored"  ,
        first_saving_date_time Datetime NOT NULL ,
        last_update_date_time  Datetime ,
        version                BigInt NOT NULL ,
        id_projects            Int NOT NULL
	,CONSTRAINT roadmaps_PK PRIMARY KEY (id)

	,CONSTRAINT roadmaps_projects_FK FOREIGN KEY (id_projects) REFERENCES projects(id)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: developments
#------------------------------------------------------------

CREATE TABLE developments(
        id                                           Int  Auto_increment  NOT NULL ,
        comment                                      Varchar (1000) ,
        front_end_conception                         Varchar (20) NOT NULL COMMENT "enum = notStarted, inProgress, completed, ignored"  ,
        front_end_implementation                     Varchar (20) NOT NULL COMMENT "enum = notStarted, inProgress, completed, ignored"  ,
        front_end_unit_testing                       Varchar (20) NOT NULL COMMENT "enum = notStarted, inProgress, completed, ignored"  ,
        front_end_integration_testing                Varchar (20) NOT NULL COMMENT "enum = notStarted, inProgress, completed, ignored"  ,
        front_end_code_correcting_and_refactoring    Varchar (20) NOT NULL COMMENT "enum = notStarted, inProgress, completed, ignored"  ,
        front_end_documentation_creating_or_updating Varchar (20) NOT NULL COMMENT "enum = notStarted, inProgress, completed, ignored"  ,
        back_end_conception                          Varchar (20) NOT NULL COMMENT "enum = notStarted, inProgress, completed, ignored"  ,
        back_end_implementation                      Varchar (20) NOT NULL COMMENT "enum = notStarted, inProgress, completed, ignored"  ,
        back_end_unit_testing                        Varchar (20) NOT NULL COMMENT "enum = notStarted, inProgress, completed, ignored"  ,
        back_end_integration_testing                 Varchar (20) NOT NULL COMMENT "enum = notStarted, inProgress, completed, ignored"  ,
        back_end_code_correcting_and_refactoring     Varchar (20) NOT NULL COMMENT "enum = notStarted, inProgress, completed, ignored"  ,
        back_end_documentation_creating_or_updating  Varchar (20) NOT NULL COMMENT "enum = notStarted, inProgress, completed, ignored"  ,
        first_saving_date_time                       Datetime NOT NULL ,
        last_update_date_time                        Datetime ,
        version                                      BigInt NOT NULL
	,CONSTRAINT developments_PK PRIMARY KEY (id)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: product_vision_boards
#------------------------------------------------------------

CREATE TABLE product_vision_boards(
        id                     Int  Auto_increment  NOT NULL ,
        vision                 Varchar (1000) ,
        target_group           Varchar (1000) ,
        needs                  Varchar (1000) ,
        product                Varchar (1000) ,
        business_goals         Varchar (1000) ,
        status_progress        Varchar (20) NOT NULL ,
        first_saving_date_time Datetime NOT NULL ,
        last_update_date_time  Datetime ,
        version                BigInt NOT NULL
	,CONSTRAINT product_vision_boards_PK PRIMARY KEY (id)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: ticketing
#------------------------------------------------------------

CREATE TABLE ticketing(
        id                     Int  Auto_increment  NOT NULL ,
        url                    Varchar (200) ,
        api_key                Varchar (200) ,
        token                  Varchar (1000) ,
        first_saving_date_time Datetime NOT NULL ,
        last_update_date_time  Datetime ,
        version                BigInt NOT NULL
	,CONSTRAINT ticketing_PK PRIMARY KEY (id)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: versions
#------------------------------------------------------------

CREATE TABLE versions(
        id                              Int  Auto_increment  NOT NULL ,
        major                           Int NOT NULL ,
        minor                           Int NOT NULL ,
        patch                           Int NOT NULL ,
        production_deployment_date_time Datetime ,
        first_saving_date_time          Datetime NOT NULL ,
        last_update_date_time           Datetime ,
        version                         BigInt NOT NULL ,
        id_projects                     Int NOT NULL
	,CONSTRAINT versions_PK PRIMARY KEY (id)

	,CONSTRAINT versions_projects_FK FOREIGN KEY (id_projects) REFERENCES projects(id)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: contains1
#------------------------------------------------------------

CREATE TABLE contains1(
        id          Int NOT NULL ,
        id_projects Int NOT NULL
	,CONSTRAINT contains1_PK PRIMARY KEY (id,id_projects)

	,CONSTRAINT contains1_languages_and_technos_FK FOREIGN KEY (id) REFERENCES languages_and_technos(id)
	,CONSTRAINT contains1_projects0_FK FOREIGN KEY (id_projects) REFERENCES projects(id)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: contains2
#------------------------------------------------------------

CREATE TABLE contains2(
        id          Int NOT NULL ,
        id_projects Int NOT NULL
	,CONSTRAINT contains2_PK PRIMARY KEY (id,id_projects)

	,CONSTRAINT contains2_resources_FK FOREIGN KEY (id) REFERENCES resources(id)
	,CONSTRAINT contains2_projects0_FK FOREIGN KEY (id_projects) REFERENCES projects(id)
)ENGINE=InnoDB;

