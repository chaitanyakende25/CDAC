13-10-2024

# JOINTS

## MySQL - SQL - JOINS (V. Imp)

![alt text](/Images/TwoTables.png)

- all the data is stored in one table, data is stored in multiple
  tables
- if you want to see the columns of 2 or more tables, then you will
  have to write a join
- Searching full table is known as FULL TABLE SCAN
  dept -> driving table
  emp -> driven table
  <<-------
  select dname, ename from emp, dept
  where dept.deptno = emp.deptno;

dept.deptno -> tablename.columnname
emp.deptno -> tablename.columnname

select ename, dname from emp, dept
where dept.deptno = emp.deptno;

select dname, ename from emp, dept
where dept.deptno = emp.deptno;
OR
select dname, ename from emp, dept
where emp.deptno = dept.deptno;

                            <<----

select dname, ename from emp, dept --FAST
where dept.deptno = emp.deptno;

emp -> driving table
dept -> driven table
<<----
select dname, ename from dept, emp --SLOW
where dept.deptno = emp.deptno;

- the position of columns in SELECT clause will
  determine the position of columns in the output;
  this you will write as per Client requirements

dept -> driving table
emp -> driven table
<<-------
select dname, ename from emp, dept
where dept.deptno = emp.deptno;

emp -> driving table
dept -> driven table
<<----
select dname, ename from dept, emp --SLOW
where dept.deptno = emp.deptno;

- IN ORDER FOR THE JOIN TO WORK FASTER, PREFERABLY THE DRIVING TABLE
  SHOULD BE TABLE WITH LESSER NUMBER OF ROWS

select dname, ename from emp, dept
where dept.deptno = emp.deptno;

---

- the common column in both the tables is DEPTNO; the common column
  that is present in both the tables, the columnname need not be
  the same in both the tables, because same column may have a
  different meaning in the other table
  e.g. EXPORT and IMPORT, PUCHASE and SALE, etc.

select dname, ename from emp, dept
where dept. x = emp.y;

---

- the datatype of common column in both the tables should be the
  same and there has to be some logical reason on whose basis you
  are writing the join

select dname, ename from emp, dept
where dept.deptno = emp.empno;
![alt text](/Images/TwoTables2.png)

To make the output more presentable:-
select dname, ename from emp, dept
where dept.deptno = emp.deptno
order by 1;

---

- It's good to display lots of columns in the output; it
  becomes richer and more meaningful

select dname, loc, ename, job, sal from emp, dept
where dept.deptno = emp.deptno
order by 1;

---

- to display all the columns from both the tables
  select \* from emp, dept
  where dept.deptno = emp.deptno
  order by 1;

---

- column ambiguously defined (if the common column had different
  column names in both the tables, then this problem would not
  have arisen)
  (\*)
  select deptno, dname, loc, ename, job, sal from emp, dept
  where dept.deptno = emp.deptno
  order by 1;

---

```sql select dept.deptno, dname, loc, ename, job, sal from emp, dept
where dept.deptno = emp.deptno
order by 1;
OR
select emp.deptno, dname, loc, ename, job, sal from emp, dept
where dept.deptno = emp.deptno
order by 1;
```

---

- it's a good programming practice to use tablename.columnname for all the columns, becuase it makes the SELECT statement more Readable

select dept.deptno, dept.dname, dept.loc, emp.ename, emp.job, emp.sal
from emp, dept
where dept.deptno = emp.deptno
order by 1;
