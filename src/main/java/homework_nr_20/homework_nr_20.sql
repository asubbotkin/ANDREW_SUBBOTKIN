create table books(
	book_id serial primary key,
	name text not null,
	author text not null,
	date_of_publishing date,
	genre text not null,
	available_count int
)

insert into books (name, author, date_of_publishing, genre, available_count)
values
	('The Great Gatsby', 'F. Sco Fitzgerald', '1925-01-01', 'Classics', 3),
	('To Kill a Mockingbird', 'Harper Lee', '1960-01-01', 'Fiction', 5),
	('1984', 'George Orwell', '1949-01-01', 'Sience fiction', 2),
	('Pride and Prejudice', 'Jane Austen', '1813-01-01', 'Romance', 4)

-- Corrected grammatical error :)
update books
set genre = 'Science fiction'
where book_id = 3;

select *
from books

create table leased_books(
	leased_book_id serial primary key,
	name text not null,
	surname text not null,
	date_of_lease date,
	date_of_return date,
	fk_book_id int,
	constraint fk_book
		foreign key (fk_book_id)
		references books(book_id)
)

insert into leased_books (name, surname, date_of_lease, date_of_return, fk_book_id)
values
	('Alexei', 'Ivanov', '2024-02-11', '2024-02-18', 1),
	('Ivan', 'Pervov', '2024-02-11', '2024-02-18', 3),
	('Anna', 'Russu', '2024-03-01', '2024-03-09', 4),
	('Nikolai', 'Sidorov', '2024-01-27', '2024-02-10', 3),
	('Olga', 'Ciobanu', '2024-05-20', null, 4)

select *
from leased_books

select *
from books bs
left join leased_books lb on bs.book_id = lb.fk_book_id
where lb.date_of_lease is null

select *
from books bs
full outer join leased_books lb on bs.book_id = lb.fk_book_id

select name, surname, date_of_return
from leased_books
where name is not null
and surname is not null
and date_of_return is not null

select name, surname, date_of_return
from leased_books
where name is not null
and name like 'A%e%e%'
and surname is not null
and date_of_return is not null
