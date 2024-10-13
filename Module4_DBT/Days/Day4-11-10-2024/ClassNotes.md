## DBT Lec4 11-10-2024

## ACID  Properties in RDBMDS :-
A -> Atomicity
* the entire transaction takes place at once or doesn't happen at all (e.g. You withdraw Rs. 50/- from your Bank account)

C -> Consistency
* the database must be consistent before and after the transaction (e.g. Same as above, Deposits/Withdrawal and Balances tables)

I -> Isolation
* multiple transactions occur independently without interference

D -> Durability
* the changes of a successful transaction are permanently, even if later the system failure occurs

## Automatic row locking mechanism in MySQL:-
* When you UPDATE or DELETE a row, that row is automatically "locked"
for other users

* ROW LOCKING IN MySQL IS AUTOMATIC

* When you UPDATE or DELETE a row, that row becomes READ ONLY
for other users

* Other users can SELECT from that table; they will view the old
data "before" your changes

* Other users can INSERT rows into that table

* Other users can UPDATE or DELETE "other" rows from that table

* No other user can UPDATE or DELETE your locked row till you have
issued a Rollback or Commit

* LOCKS ARE AUTOMATICALLY RELEASED WHEN YOU ROLLBACK OR COMMIT

## OPTIMISTIC LOCKING:-

* Automatic row locking mechanism in MySQL

## PESSIMISTIC LOCKING:-

* Lock the rows manually in advance "BEFORE" issuing UPDATE or DELETE

## To lock the rows manually:-
you have to use SELECT statement with the FOR UPDATE clause

```sql
mysql> select * from emp where empno = 101 for update;
```

```sql
mysql> select * from emp where empno = 10 for update;  -- (by default) it will WAIT in the Request Queue till the row becomes available

```
LOCKS ARE AUTOMATICALLY RELEASED WHEN YOU ROLLBACK OR COMMIT

```sql
mysql> select * from emp where empno = 10 for update nowait; -- if row is available, then lock it; else abort the operation
```

```sql
mysql> select * from emp 
where empno = 10
for update wait 60; -- seconds 
```

* if row is available, then lock it; wait in the Request for the specified time period; if row is still unavailable, then abort the operation
