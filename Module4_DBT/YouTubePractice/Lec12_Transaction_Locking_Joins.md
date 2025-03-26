# Transactions

## Optimistic Locking

- Automatically done by MySQL after update/delete row within transaction.
- When an USER update or delete a row (within a transaction), that row is locked and becomes read-only for other users.
- The other users see old row values, until transaction is committed by first user.
- If other users try to modify or delete such locked row, their transaction processing is blocked until row is unlocked.
- Other users can INSERT into that table. Also they can UPDATE or DELETE other
  rows.
- The locks are automatically released when COMMIT/ROLLBACK is done by
  the user.
- This whole process is done automatically in MySQL. It is called as "OPTIMISTIC
  LOCKING".

## Pessimistic Locking

- User can lock a row in advance, before update/deiete that row (within transaction).

- Manually locking the row in advanced before issuing UPDATE or DELETE is known as "PESSIMISTIC LOCKING".
- This is done by appending FOR UPDATE to the SELECT query.
- It will lock all selected rows, until transaction is committed or rollbacked.
- If these rows are already locked by another users, the SELECT operation is blocked until rows lock is released.
- By default MySQL does table locking. Row locking is possible only when table is indexed on the column.

```sql
-- CHAITU user
-- 1 command
START TRANSACTION;
-- 2
SELECT * FROM dept WHERE deptno=40 FOR UPDATE;

-- lock the row for update/delete PESSIMISTIC LOCK;
-- 4
UPDATE dept SET loc='BOSTON' WHERE deptno=40;
-- 5
COMMIT;
-- lock released
```

```sql
-- for root user
-- 3
SELECT * FROM dept WHERE deptno=40 FOR UPDATE;
-- blocked

-- 6
-- row is locked for this user transaction.
```
