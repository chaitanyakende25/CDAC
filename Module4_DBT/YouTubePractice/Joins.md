# Joins

## Entity Relations

![alt text](/Images/Realations.png)

- To avoid redundancy of the data, data should be organized into multiple
  tables so that tables are related to each other.
- The relations can be one of the following
  ![alt text](/Images/Realations2.png)
- Entity relations is outcome of Normalization process.

## SQL Joins

- Joins are only in SELECT query NOT in UPDATE, INSERT, DELETE.
- Join statements are used to SELECT data from multiple tables using single query.
- Typical RDBMS supports following types of joins:
  - Cross Join
  - Inner Join
  - Left Outer Join
  - Right Outer Join
  - Full Outer Join
  - Self join

```sql
DROP TABLE IF EXISTS depts;
DROP TABLE IF EXISTS emps;
DROP TABLE IF EXISTS addr;
DROP TABLE IF EXISTS meeting;
DROP TABLE IF EXISTS emp_meeting;

CREATE TABLE depts (deptno INT, dname VARCHAR(20));

INSERT INTO depts (deptno, dname)
VALUES
    (10, 'DEV'),
    (20, 'QA'),
    (30, 'OPS'),
    (40, 'ACC');


CREATE TABLE emps (emptno INT, ename VARCHAR(20), deptno INT, mgr INT);

INSERT INTO empt VALUES ((1,'Amit', 10, 4),(2,'Rahul', 10, 3),(3,'Nilesh', 20, 4),(4,'Nitin', 50, 5),(5,'Sarang', 50, NULL));

CREATE TABLE addr(empno INT, tal VARCHAR(20), dist VARCHAR(20));
INSERT INTO addr VALUES (1,'Gad', 'Kolhapur' );
INSERT INTO addr VALUES (2,'Satara','Karad');
INSERT INTO addr VALUES (3,'Junnar','Pune' );
INSERT INTO addr VALUES (4, 'Wai', 'Satara');
INSERT INTO addr VALUES (5, 'Karad','Satara');

CREATE TABLE meeting (meetno INT, topic VARCHAR(20), venue VARCHAR(20));
INSERT INTO meeting VALUES (100,'Scheduling','Director Cabin');
INSERT INTO meeting VALUES (200,'Annual meet','Board Room');
INSERT INTO meeting VALUES (300,'App Design', 'Co-director Count');


CREATE TABLE emp_meeting (meetno INT, empno INT);
INSERT INTO emp_meeting VALUES (100, 3);
INSERT INTO emp_meeting VALUES (100, 4);
INSERT INTO emp_meeting VALUES (200, 1);
INSERT INTO emp_meeting VALUES (200, 2);
INSERT INTO emp_meeting VALUES (200, 3);
INSERT INTO emp_meeting VALUES (200, 4);
INSERT INTO emp_meeting VALUES (200, 5);
INSERT INTO emp_meeting VALUES (300, 1);
INSERT INTO emp_meeting VALUES (300, 2);
INSERT INTO emp_meeting VALUES (300, 4);

```

## CROSS JOIN

![alt text](/Images/crossJoin.png)

```sql
SELECT ename, dname FROM emps CROSS JOIN depts;

-- if column names in both tables are same,
-- to avoid conflicts, coiurm nees are prepended by tablename.
SELECT emps.ename, depts.dname FROM emps CROSS JOIN depts;

-- table alias is used to shorten the table names while selecting columns
SELECT e.ename, d.dname FROM emps AS e CROSS JOIN depts AS d;

-- AS keyword optional
SELECT e.ename, d.dname FROM emps e CROSS JOIN depts d;

SELECT e.ename, d.dname FROM emps e , depts d;
```

![alt text](/Images/crossJoin2.png)

- Compares each row of Tablel with every row of Table2.
- Yields all possible combinations of Table1 and Table2.
- In MySQL, The larger table is referred as "Driving Table", while smaller table is referred as "Driven Table". Each row of Driving table is combined with every row of Driven table.
- Cross join is the fastest join, because there is no condition check involved.

```sql
SELECT e.ename, d.dname FROM depts d CROSS JOIN emps e;
-- Here sequence doesn't matter where is left table which and right table which
-- mysql takes lagre table as 'driving table' and small table as 'drived table'.
```

## Inner Join

![alt text](/Images/innerJoin.png)

```sql
SELECT e.ename, d.dname FROM emps e INNER JOIN depts d ON e.deptno=d.deptno;
```

- The inner JOIN is used to return rows from both tables that satisfy the join condition.
- Non-matchin rows from both tables are skipped.
- If join condition contains equality check, it is referred as equi-join; otherwise it is non-equi-join.
  ![alt text](/Images/innerJoin2.png)
