create table departments(
	department_id serial primary key,
	name text not null
)

insert into departments (name)
values ('Software ingeneering'),
	('Hardware ingeneering'),
	('Testing software'),
	('Accounting')

create table employees (
    employee_id serial primary key,
    employee_name text not null,
    fk_department_id int,
    constraint fk_depertment
    foreign key (fk_department_id)
    references departments(department_id)
)

insert into employees (employee_name, fk_department_id)
values
	('Alexei', 1),
	('Ivan', 2),
	('Anna', 3),
	('Nikolai', 4),
	('Olga', null),
	('Petr', 1),
	('Svetlana', 2)

select *
from employees e


create table projects (
    project_id serial primary key,
    project_name text not null
)

insert into projects (project_name)
values
	('Project1'),
	('Project2'),
	('Project3'),
	('Project4'),
	('Project5')


create table employee_projects (
    fk_employee_id int,
    fk_project_id int,
    constraint fk_employee
    foreign key (fk_employee_id)
    references employees(employee_id),
    constraint fk_project
    foreign key (fk_project_id)
    references projects(project_id)
)

insert into employee_projects (fk_employee_id, fk_project_id)
values (1 ,5), (2, 4), (3, 3), (4, 5), (5, 1

)

-- a. All employees with departments names
select e.employee_name, d.name
from departments d
inner join employees e on department_id = fk_department_id

-- b. All employees without departments
select e.employee_name
from employees e
left join departments d  on fk_department_id = department_id
where d.name is null

-- c.
select e.employee_name, p.project_name
from employees e
inner join employee_projects ep on employee_id = fk_employee_id
inner join projects p on fk_project_id = project_id

-- d. All employees and without departmets too
select e.employee_name, d.name
from departments d
full outer join employees e on department_id = fk_department_id

-- c. Count of emplyees in every department
select d."name", count(e.fk_department_id)
from departments d
inner join employees e on department_id = fk_department_id
group by d."name", e.fk_department_id
