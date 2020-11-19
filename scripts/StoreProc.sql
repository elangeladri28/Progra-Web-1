CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_users`()
BEGIN
SELECT * FROM Users;
END