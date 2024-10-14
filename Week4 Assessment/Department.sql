CREATE TABLE Worker (
WORKER_ID INT PRIMARY KEY,
FIRST_NAME VARCHAR(50),
LAST_NAME VARCHAR(50),
SALARY 	DECIMAL(15,2),
JOINING_DATE DATE,
DEPARTMENT VARCHAR(50)
);
INSERT INTO Worker(WORKER_ID, FIRST_NAME, LAST_NAME, SALARY, JOINING_DATE, DEPARTMENT) VALUES
(1, 'Mounika', 'Arora', 100000, '2020-02-14', 'HR'),
(2, 'Niharika', 'Verma', 80000, '2011-02-14', 'Admin'),
(3, 'Vishal', 'Singhal', 300000, '2020-02-14', 'HR'),
(4, 'Amitabh', 'Singh', 500000, '2020-02-14', 'Admin'),
(5, 'Vivek', 'Bhati', 500000, '2011-06-14', 'Admin'),
(6, 'Vipul', 'Diwan', 200000, '2011-06-14', 'Account'),
(7, 'Satish', 'Kumar', 75000, '2020-01-14', 'Account'),
(8, 'Geetika', 'Chauhan', 90000, '2011-04-14', 'Admin');

select * from Worker;

CREATE TABLE Bonus (
WORKER_REF_ID INT,
BONUS_AMOUNT INT,
BONUS_DATE DATE,
FOREIGN KEY(WORKER_REF_ID) REFERENCES Worker(WORKER_ID)
);
INSERT INTO Bonus(WORKER_REF_ID, BONUS_AMOUNT, BONUS_DATE) VALUES
(1, 5000, '2020-02-16'),
(2, 3000, '2011-06-16'),
(3, 4000, '2020-02-16'),
(1, 4500, '2020-02-16'),
(2, 3500, '2011-06-16'),
(4, 4500, '2011-06-16'),
(5, 3500, '2011-06-16');

select * from Bonus;

CREATE TABLE Title (
WORKER_REF_ID INT,
WORKER_TITLE VARCHAR(50),
AFFECTED_FROM DATE,
FOREIGN KEY (WORKER_REF_ID)REFERENCES Worker(WORKER_ID)
);
INSERT INTO Title (WORKER_REF_ID, WORKER_TITLE, AFFECTED_FROM) VALUES
(1, 'Manager', '2016-02-20'),
(2, 'Executive', '2016-06-11'),
(8, 'Executive', '2016-06-11'),
(5, 'Manager', '2016-06-11'),
(4, 'Asst. Manager','2016-06-11'),
(7, 'Executive', '2016-06-11'),
(6, 'Lead', '2016-06-11'),
(3, 'Lead', '2016-06-11');

select * from Title;

-------First One
SELECT W.FIRST_NAME, W.SALARY, T.WORKER_TITLE
FROM Worker W
JOIN Title T ON W.WORKER_ID = T.WORKER_REF_ID;

-------Second one
CREATE OR REPLACE FUNCTION count_workers_nth_highest_salary(nth INTEGER)
RETURNS INTEGER AS $$
DECLARE
    nth_salary BIGINT;
    Worker_count INT;
BEGIN
    SELECT DISTINCT salary
    INTO nth_salary
    FROM Worker
    ORDER BY salary DESC
    OFFSET nth - 1 LIMIT 1;
    SELECT COUNT(*)
    INTO Worker_count
    FROM Worker
    WHERE salary = nth_salary;
    RETURN Worker_count;
EXCEPTION
    WHEN NO_DATA_FOUND THEN
        RETURN 0;
END;
$$ LANGUAGE plpgsql;

-------example
SELECT count_workers_nth_highest_salary(4);
 