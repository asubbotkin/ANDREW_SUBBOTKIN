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

select *
from books