-- Query 1: Select all customers
use AdventureWorksLT2022;
SELECT * FROM SalesLT.Customer;

-- Query 2: Select all customers ordered by first name
select * from SalesLT.Customer order by FirstName;

-- Query 3: Select all customers ordered by first name ascending
select * from SalesLT.Customer order by FirstName asc;
-- Query 4: Select all customers ordered by first name descending
select * from SalesLT.Customer order by FirstName desc;
-- Query 5: Select all customers ordered by the third column
select * from SalesLT.Customer order by Title;

-- Query 6: Select all customers ordered by the third column descending
select * from SalesLT.Customer order by Title desc;
-- Query 7: Select customers with CustomerID less than 6
select * from  SalesLT.Customer where CustomerID<6;
-- Query 8: Select customers with last name 'GUINESS'
SELECT * 
FROM SalesLT.Customer 
WHERE LastName = 'Huff';

-- Query 9: Select all customers ordered by first name
-- Query 10: Select all customers ordered by first name ascending and last name descending
SELECT * 
FROM SalesLT.Customer 
ORDER BY FirstName asc , lastname desc;

-- Query 11: Select all customers ordered by third column ascending, second column descending
SELECT * 
FROM SalesLT.Customer 
ORDER BY Title ASC, NameStyle DESC;

-- Query 12: Select customers where condition is always false
SELECT * 
FROM SalesLT.Customer 
WHERE 1 = 2;

-- Query 13: Select customers where condition is always true
SELECT * 
FROM SalesLT.Customer 
WHERE 1 = 1;

-- Query 14: Select customers where 1 equals 1 (always true)
-- Query 15: Select customers where 1 equals 2 (always false)
-- Query 16: Count all customers
SELECT count(*) FROM SalesLT.Customer ;

-- Query 17: Select specific columns from SalesOrderHeader with aliases
SELECT SalesOrderID AS OrderID, CustomerID AS CustID, OrderDate AS DateOfOrder
FROM SalesLT.SalesOrderHeader;

-- Query 18: Select all sales order headers
SELECT * FROM SalesLT.SalesOrderHeader;

-- Query 19: Select constant values with aliases from SalesOrderHeader
SELECT 'AdventureWorks' AS Company, 2025 AS Year
FROM SalesLT.SalesOrderHeader;

-- Query 20: Select all sales order details
SELECT * FROM SalesLT.SalesOrderDetail;

-- Query 21: Select LineTotal and its rounded value from SalesOrderDetail
SELECT LineTotal, ROUND(LineTotal, 0) AS RoundedTotal
FROM SalesLT.SalesOrderDetail;

-- Query 22: Select rounded value of 8.45 for each row in SalesOrderDetail
SELECT ROUND(8.45, 1) AS RoundedValue
FROM SalesLT.SalesOrderDetail;

-- Query 23: Select rounded value of 8.5 for each row in SalesOrderDetail
SELECT ROUND(8.5, 0) AS RoundedValue
FROM SalesLT.SalesOrderDetail;

-- Query 24: Select rounded value of -14.33
SELECT ROUND(-14.33, 0) AS RoundedValue;

-- Query 25: Select rounded value of 1.234 to 0 decimal places
SELECT ROUND(1.234, 0) AS RoundedValue25;

-- Query 26: Select rounded value of -14.73
SELECT ROUND(-14.73, 0) AS RoundedValue26;

-- Query 27: Select rounded value of 1.234 to 1 decimal place
SELECT ROUND(1.234, 1) AS RoundedValue27;

-- Query 28: Select rounded value of 1234.567 to nearest 10
SELECT ROUND(1234.567, -1) AS RoundedValue28;

-- Query 29: Select rounded value of 1256.567 to nearest 100 with alias
SELECT ROUND(1256.567, -2) AS RoundedValue29;

-- Query 30: Select LineTotal from SalesOrderDetail
SELECT LineTotal FROM SalesLT.SalesOrderDetail;

-- Query 31: Select LineTotal rounded to 0 and 1 decimal places from SalesOrderDetail
SELECT LineTotal, ROUND(LineTotal, 0) AS Rounded0, ROUND(LineTotal, 1) AS Rounded1
FROM SalesLT.SalesOrderDetail;

-- Query 32: Select floor of 1.2
SELECT FLOOR(1.2) AS FloorValue32;

-- Query 33: Select ceiling of 1.2
SELECT CEILING(1.2) AS CeilingValue33;

-- Query 34: Select floor of -1.2
SELECT FLOOR(-1.2) AS FloorValue34;

-- Query 35: Select ceiling of -1.2
SELECT CEILING(-1.2) AS CeilingValue35;

-- Query 36: Add 1 and 1, alias as 'ADD'
SELECT 1 + 1 AS ADD36;

-- Query 37: Add string '1' and '1', alias as 'ADD'
SELECT CAST('1' AS INT) + CAST('1' AS INT) AS ADD37;

-- Query 38: Add string '1A' and '1', alias as 'ADD'
SELECT TRY_CAST('1A' AS INT) + CAST('1' AS INT) AS ADD38;

-- Query 39: Add string '1A' and 'B', alias as 'ADD'
SELECT TRY_CAST('1A' AS INT) + TRY_CAST('B' AS INT) AS ADD39;

-- Query 40: Add string 'A2' and '1', alias as 'ADD'
SELECT TRY_CAST('A2' AS INT) + CAST('1' AS INT) AS ADD40;

-- Query 41: Add string 'A2' and '2', alias as 'ADD'
SELECT TRY_CAST('A2' AS INT) + CAST('2' AS INT) AS ADD41;

-- Query 42: Add string 'A2' and 'A2', alias as 'ADD'
SELECT TRY_CAST('A2' AS INT) + TRY_CAST('A2' AS INT) AS ADD42;
-- Query 43: Concatenate 1 and 1, alias as 'CONCATENATE'
SELECT CAST('1' AS VARCHAR) + CAST('1' AS VARCHAR) AS CONCATENATE

-- Query 44: Concatenate '1' and '1', alias as 'CONCATENATE'
SELECT '1' + '1' AS CONCATENATE44;

-- Query 45: Concatenate 'A2' and '2', alias as 'CONCATENATE'
SELECT 'A2' + '2' AS CONCATENATE45;
-- Query 46: Concatenate 'RED', ' GREEN', ' BLUE', alias as 'COLORS'
SELECT 'RED' + ' GREEN' + ' BLUE' AS COLORS46;
-- Query 47: Select all customers
SELECT * FROM SalesLT.Customer;
-- Query 48: Select CustomerID and concatenated full name
SELECT CustomerID, FirstName + ' ' + LastName AS FullName FROM SalesLT.Customer;
-- Query 49: Select first names in lowercase
SELECT LOWER(FirstName) AS LowerFirstName FROM SalesLT.Customer;
-- Query 50: Select first names in uppercase
SELECT UPPER(FirstName) AS UpperFirstName FROM SalesLT.Customer;
-- Query 51: Select first two letters of first names
SELECT SUBSTRING(FirstName, 1, 2) AS FirstTwoLetters FROM SalesLT.Customer
-- Query 52: Select first two letters of first names in lowercase
SELECT LOWER(SUBSTRING(FirstName, 1, 2)) AS FirstTwoLettersLower FROM
SalesLT.Customer;

-- Query 53: Select all customers
SELECT * FROM SalesLT.Customer;
-- Query 54: Concatenate reversed last and first names

SELECT REVERSE(LastName) + ' ' + REVERSE(FirstName) AS ReversedName
FROM SalesLT.Customer;

-- Query 55: Reverse concatenated full name, alias as 'REVERSE FULL NAME'
SELECT REVERSE(FirstName + ' ' + LastName) AS REVERSEFULLNAME FROM SalesLT.Customer;

-- Query 56: Concatenate last name and first initial from actor table
SELECT LastName + ' ' + SUBSTRING(FirstName, 1, 1) AS New_Name
FROM SalesLT.Customer;

-- Query 57: Select reversed first names
SELECT REVERSE(FirstName) AS ReversedFirstName FROM SalesLT.Customer;
-- Query 58: Select ModifiedDate from Customer
SELECT ModifiedDate FROM SalesLT.Customer;
-- Query 59: Format ModifiedDate as mm/dd/yy, alias as 'LAST UPDATE'
SELECT FORMAT(ModifiedDate, 'MM/dd/yy') AS LASTUPDATE59 FROM SalesLT.Customer;

-- Query 60: Format ModifiedDate as mm-dd-yy, alias as 'LAST UPDATE'
SELECT FORMAT(ModifiedDate, 'MM-dd-yy') AS LASTUPDATE60 FROM SalesLT.Customer;
-- Query 61: Select week number from ModifiedDate
SELECT DATEPART(WEEK, ModifiedDate) AS [WEEK NUMBER] FROM SalesLT.Customer;

-- Query 62: Select SalesOrderDetail_DATE from SalesOrderDetail
SELECT ModifiedDate FROM SalesLT.SalesOrderDetail; 
-- Query 63: Select all customers
SELECT * FROM SalesLT.Customer;


-- Query 64: Select first names ordered by first name
SELECT FirstName FROM SalesLT.Customer ORDER BY FirstName;
-- Query 65: Select distinct first names ordered by first name
SELECT DISTINCT FirstName FROM SalesLT.Customer ORDER BY FirstName;
-- Query 66: Count all customers
SELECT COUNT(*) FROM SalesLT.Customer;
-- Query 67: Count non-null first names in Customer
SELECT COUNT(FirstName) FROM SalesLT.Customer;
-- Query 68: Count distinct first names in Customer
SELECT COUNT(DISTINCT FirstName) FROM SalesLT.Customer;
-- Query 69: Count customers with first name 'NICK'
SELECT COUNT(*) FROM SalesLT.Customer WHERE FirstName = 'NICK';
-- Query 70: Select customers with first name 'NICK'

-- Query 71: Select customers with CustomerID less than 5
SELECT * FROM SalesLT.Customer WHERE CustomerID < 5;
-- Query 72: Select customers with CustomerID between 1 and 5
SELECT * FROM SalesLT.Customer WHERE CustomerID BETWEEN 1 AND 5;
-- Query 73: Select customers with CustomerID not between 1 and 5
SELECT * FROM SalesLT.Customer WHERE CustomerID NOT BETWEEN 1 AND 5;
-- Query 74: Select customers with first name starting with 'A', ordered by first name ascending
SELECT * FROM SalesLT.Customer WHERE FirstName LIKE 'A%' ORDER BY FirstName ASC;
-- Query 75: Select customers with first name less than or equal to 'AL%'
SELECT * FROM SalesLT.Customer WHERE FirstName <= 'AL%';
-- Query 76: Select customers with first name length equal to 4
SELECT * FROM SalesLT.Customer WHERE LEN(FirstName) = 4;
-- Query 77: Select actors with first name of exactly 4 characters
SELECT * FROM SalesLT.Customer WHERE LEN(FirstName) = 4;
-- Query 78: Select customers with last name ending in 'y' and length 5, ordered by first name
SELECT * FROM SalesLT.Customer WHERE LastName LIKE '%y' AND LEN(LastName) =5
 ORDER BY FirstName;
-- Query 79: Select customers with last name length 5 and ending with 'y', ordered by last name
SELECT * FROM SalesLT.Customer WHERE LEN(LastName) = 5 AND LastName LIKE '%y'
ORDER BY LastName;
-- Query 80: Select customers with first name 'KENNETH'
SELECT * FROM SalesLT.Customer WHERE FirstName = 'KENNETH';
-- Query 81: Select customers with first name 'KENNETH', CustomerID < 100, and last name ending with 'I' or 'W'
SELECT * FROM SalesLT.Customer WHERE FirstName = 'KENNETH' AND CustomerID < 100
AND LastName LIKE '%I' OR LastName LIKE '%W';
-- Query 82: Select customers with CustomerID in specific list
SELECT * FROM SalesLT.Customer WHERE CustomerID IN (1, 2, 3,
4);
-- Query 83: Select customers with CustomerID not in specific list
SELECT * FROM SalesLT.Customer WHERE CustomerID NOT IN (1, 2, 3,
4);
-- Query 84: Select customers where actor_id matches any of specific values
SELECT * FROM SalesLT.Customer WHERE CustomerID IN (1, 2, 3,4);
-- Query 85: Select customers where actor_id does not match any of specific values
SELECT * FROM SalesLT.Customer WHERE CustomerID NOT IN (1, 2, 3,4);
-- Query 86: Select customers whose last name matches any customer with first name 'CUBA'
SELECT * FROM SalesLT.Customer WHERE LastName IN (SELECT LastName FROM SalesLT.Customer WHERE FirstName = '
CUBA');
-- Query 87: Select customers with last name 'OLIVIER', 'ALLEN', or 'BIRCH', ordered by CustomerID ascending
SELECT * FROM SalesLT.Customer WHERE LastName IN ('OLIVIER', 'ALLEN', 'BiRCH') ORDER BY CustomerID ASC;
-- Query 88: Select customers whose last name matches any customer with first name 'CUBA'

-- Query 89: Select all customers ordered by last name
SELECT * FROM SalesLT.Customer ORDER BY LastName;
-- Query 90: Select all addresses
select * from SalesLT.Address;

-- Query 91: Set Address2 to NULL for all addresses
UPDATE SalesLT.Address SET AddressLine2 = NULL;

-- Query 92: Set Address2 to 'DEMO Address' where Address_ID is 1
UPDATE SalesLT.Address SET AddressLine2 = 'DEMO Address' WHERE AddressID = 1;
-- Query 93: Set Address2 to 'DEMO Address 2' where Address_ID is 2
UPDATE SalesLT.Address SET AddressLine2 = 'DEMO Address 2' WHERE AddressID =2;
-- Query 94: Select addresses where Address2 is not NULL
select addressLine1,addressline2 from SalesLT.Address where AddressLine2 is not null;
-- Query 95: Select addresses where Address2 is NULL
select addressLine1,addressline2 from SalesLT.Address where AddressLine2 is  null;
-- Query 96: Set Address2 to empty string where Address_ID is 3
UPDATE SalesLT.Address SET AddressLine2 = '' WHERE AddressID = 3;
-- Query 97: Select addresses where Address2 is NULL
--same as 95
-- Query 98: Select addresses where Address2 is not NULL
--same as 94
-- Query 99: Select addresses where Address2 is empty string
select * from SalesLT.Address where AddressLine2=' ';
-- query 100 Returns the total number of addresses in the Address table
select count(*) from SalesLT.Address as count1;
SELECT COUNT(AddressID) FROM SalesLT.Address;