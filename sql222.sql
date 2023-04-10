USE [master]
GO
/****** Object:  Database [KhoQuanAo]    Script Date: 4/10/2023 4:05:32 PM ******/
CREATE DATABASE [KhoQuanAo]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'KhoQuanAo', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL16.MSSQLSERVER\MSSQL\DATA\KhoQuanAo.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'KhoQuanAo_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL16.MSSQLSERVER\MSSQL\DATA\KhoQuanAo_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT, LEDGER = OFF
GO
ALTER DATABASE [KhoQuanAo] SET COMPATIBILITY_LEVEL = 160
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [KhoQuanAo].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [KhoQuanAo] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [KhoQuanAo] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [KhoQuanAo] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [KhoQuanAo] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [KhoQuanAo] SET ARITHABORT OFF 
GO
ALTER DATABASE [KhoQuanAo] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [KhoQuanAo] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [KhoQuanAo] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [KhoQuanAo] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [KhoQuanAo] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [KhoQuanAo] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [KhoQuanAo] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [KhoQuanAo] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [KhoQuanAo] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [KhoQuanAo] SET  DISABLE_BROKER 
GO
ALTER DATABASE [KhoQuanAo] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [KhoQuanAo] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [KhoQuanAo] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [KhoQuanAo] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [KhoQuanAo] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [KhoQuanAo] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [KhoQuanAo] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [KhoQuanAo] SET RECOVERY FULL 
GO
ALTER DATABASE [KhoQuanAo] SET  MULTI_USER 
GO
ALTER DATABASE [KhoQuanAo] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [KhoQuanAo] SET DB_CHAINING OFF 
GO
ALTER DATABASE [KhoQuanAo] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [KhoQuanAo] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [KhoQuanAo] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [KhoQuanAo] SET ACCELERATED_DATABASE_RECOVERY = OFF  
GO
EXEC sys.sp_db_vardecimal_storage_format N'KhoQuanAo', N'ON'
GO
ALTER DATABASE [KhoQuanAo] SET QUERY_STORE = ON
GO
ALTER DATABASE [KhoQuanAo] SET QUERY_STORE (OPERATION_MODE = READ_WRITE, CLEANUP_POLICY = (STALE_QUERY_THRESHOLD_DAYS = 30), DATA_FLUSH_INTERVAL_SECONDS = 900, INTERVAL_LENGTH_MINUTES = 60, MAX_STORAGE_SIZE_MB = 1000, QUERY_CAPTURE_MODE = AUTO, SIZE_BASED_CLEANUP_MODE = AUTO, MAX_PLANS_PER_QUERY = 200, WAIT_STATS_CAPTURE_MODE = ON)
GO
/****** Object:  Login [NT SERVICE\Winmgmt]    Script Date: 4/10/2023 4:05:32 PM ******/
CREATE LOGIN [NT SERVICE\Winmgmt] FROM WINDOWS WITH DEFAULT_DATABASE=[master], DEFAULT_LANGUAGE=[us_english]
GO
/****** Object:  Login [NT SERVICE\SQLWriter]    Script Date: 4/10/2023 4:05:32 PM ******/
CREATE LOGIN [NT SERVICE\SQLWriter] FROM WINDOWS WITH DEFAULT_DATABASE=[master], DEFAULT_LANGUAGE=[us_english]
GO
/****** Object:  Login [NT SERVICE\SQLTELEMETRY]    Script Date: 4/10/2023 4:05:32 PM ******/
CREATE LOGIN [NT SERVICE\SQLTELEMETRY] FROM WINDOWS WITH DEFAULT_DATABASE=[master], DEFAULT_LANGUAGE=[us_english]
GO
/****** Object:  Login [NT SERVICE\SQLSERVERAGENT]    Script Date: 4/10/2023 4:05:32 PM ******/
CREATE LOGIN [NT SERVICE\SQLSERVERAGENT] FROM WINDOWS WITH DEFAULT_DATABASE=[master], DEFAULT_LANGUAGE=[us_english]
GO
/****** Object:  Login [NT Service\MSSQLSERVER]    Script Date: 4/10/2023 4:05:32 PM ******/
CREATE LOGIN [NT Service\MSSQLSERVER] FROM WINDOWS WITH DEFAULT_DATABASE=[master], DEFAULT_LANGUAGE=[us_english]
GO
/****** Object:  Login [NT AUTHORITY\SYSTEM]    Script Date: 4/10/2023 4:05:32 PM ******/
CREATE LOGIN [NT AUTHORITY\SYSTEM] FROM WINDOWS WITH DEFAULT_DATABASE=[master], DEFAULT_LANGUAGE=[us_english]
GO
/****** Object:  Login [LAPTOP-UUJ57800\khact]    Script Date: 4/10/2023 4:05:32 PM ******/
CREATE LOGIN [LAPTOP-UUJ57800\khact] FROM WINDOWS WITH DEFAULT_DATABASE=[master], DEFAULT_LANGUAGE=[us_english]
GO
/* For security reasons the login is created disabled and with a random password. */
/****** Object:  Login [##MS_PolicyTsqlExecutionLogin##]    Script Date: 4/10/2023 4:05:32 PM ******/
CREATE LOGIN [##MS_PolicyTsqlExecutionLogin##] WITH PASSWORD=N'F+d2B9BPzs6oFCfZ3cwXApEk4FEgYKiDeINM0pqbdRo=', DEFAULT_DATABASE=[master], DEFAULT_LANGUAGE=[us_english], CHECK_EXPIRATION=OFF, CHECK_POLICY=ON
GO
ALTER LOGIN [##MS_PolicyTsqlExecutionLogin##] DISABLE
GO
/* For security reasons the login is created disabled and with a random password. */
/****** Object:  Login [##MS_PolicyEventProcessingLogin##]    Script Date: 4/10/2023 4:05:32 PM ******/
CREATE LOGIN [##MS_PolicyEventProcessingLogin##] WITH PASSWORD=N'vjWDqGqxO1BCbsM1A9E68R99++b+1qv9oQKsz31jvvw=', DEFAULT_DATABASE=[master], DEFAULT_LANGUAGE=[us_english], CHECK_EXPIRATION=OFF, CHECK_POLICY=ON
GO
ALTER LOGIN [##MS_PolicyEventProcessingLogin##] DISABLE
GO
ALTER AUTHORIZATION ON DATABASE::[KhoQuanAo] TO [sa]
GO
ALTER SERVER ROLE [sysadmin] ADD MEMBER [NT SERVICE\Winmgmt]
GO
ALTER SERVER ROLE [sysadmin] ADD MEMBER [NT SERVICE\SQLWriter]
GO
ALTER SERVER ROLE [sysadmin] ADD MEMBER [NT SERVICE\SQLSERVERAGENT]
GO
ALTER SERVER ROLE [sysadmin] ADD MEMBER [NT Service\MSSQLSERVER]
GO
ALTER SERVER ROLE [sysadmin] ADD MEMBER [LAPTOP-UUJ57800\khact]
GO
USE [KhoQuanAo]
GO
GRANT VIEW ANY COLUMN ENCRYPTION KEY DEFINITION TO [public] AS [dbo]
GO
GRANT VIEW ANY COLUMN MASTER KEY DEFINITION TO [public] AS [dbo]
GO
/****** Object:  Table [dbo].[Customer]    Script Date: 4/10/2023 4:05:33 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Customer](
	[customerId] [int] NOT NULL,
	[customername] [nvarchar](100) NULL,
	[customerAddress] [nvarchar](200) NULL,
	[customerPhone] [int] NULL,
	[customerEmail] [nvarchar](100) NULL,
	[customerMoreInfo] [nvarchar](100) NULL,
	[customerContractDate] [date] NULL,
PRIMARY KEY CLUSTERED 
(
	[customerId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
ALTER AUTHORIZATION ON [dbo].[Customer] TO  SCHEMA OWNER 
GO
/****** Object:  Table [dbo].[Input]    Script Date: 4/10/2023 4:05:33 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Input](
	[inputId] [int] NOT NULL,
	[inputDate] [datetime] NULL,
PRIMARY KEY CLUSTERED 
(
	[inputId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
ALTER AUTHORIZATION ON [dbo].[Input] TO  SCHEMA OWNER 
GO
/****** Object:  Table [dbo].[InputInfo]    Script Date: 4/10/2023 4:05:33 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[InputInfo](
	[inputInfoId] [int] NOT NULL,
	[itemId] [int] NULL,
	[inputId] [int] NULL,
	[Quantity] [int] NULL,
	[inputPrice] [float] NULL,
	[outputPrice] [float] NULL,
	[inputInfoStatus] [nvarchar](200) NULL,
PRIMARY KEY CLUSTERED 
(
	[inputInfoId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
ALTER AUTHORIZATION ON [dbo].[InputInfo] TO  SCHEMA OWNER 
GO
/****** Object:  Table [dbo].[Item]    Script Date: 4/10/2023 4:05:33 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Item](
	[itemId] [int] NOT NULL,
	[itemName] [nvarchar](100) NULL,
	[suplierId] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[itemId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
ALTER AUTHORIZATION ON [dbo].[Item] TO  SCHEMA OWNER 
GO
/****** Object:  Table [dbo].[Out_put]    Script Date: 4/10/2023 4:05:33 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Out_put](
	[outnputId] [int] NOT NULL,
	[outputDate] [datetime] NULL,
PRIMARY KEY CLUSTERED 
(
	[outnputId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
ALTER AUTHORIZATION ON [dbo].[Out_put] TO  SCHEMA OWNER 
GO
/****** Object:  Table [dbo].[OutputInfo]    Script Date: 4/10/2023 4:05:33 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[OutputInfo](
	[outputInfoId] [int] NOT NULL,
	[itemId] [int] NULL,
	[inputInfoId] [int] NULL,
	[outnputId] [int] NULL,
	[Quantity] [int] NULL,
	[customerId] [int] NULL,
	[outputInfoDate] [datetime] NULL,
	[outputStatus] [nvarchar](200) NULL,
PRIMARY KEY CLUSTERED 
(
	[outputInfoId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
ALTER AUTHORIZATION ON [dbo].[OutputInfo] TO  SCHEMA OWNER 
GO
/****** Object:  Table [dbo].[Suplier]    Script Date: 4/10/2023 4:05:33 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Suplier](
	[suplierId] [int] NOT NULL,
	[suplierName] [nvarchar](100) NULL,
	[suplierAddress] [nvarchar](200) NULL,
	[suplierPhone] [int] NULL,
	[suplierEmail] [nvarchar](100) NULL,
	[suplierMoreInfo] [nvarchar](100) NULL,
	[suplierContractDate] [date] NULL,
PRIMARY KEY CLUSTERED 
(
	[suplierId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
ALTER AUTHORIZATION ON [dbo].[Suplier] TO  SCHEMA OWNER 
GO
/****** Object:  Table [dbo].[UserAccount]    Script Date: 4/10/2023 4:05:33 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[UserAccount](
	[username] [nvarchar](20) NOT NULL,
	[password] [nvarchar](50) NULL,
 CONSTRAINT [PK_User] PRIMARY KEY CLUSTERED 
(
	[username] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
ALTER AUTHORIZATION ON [dbo].[UserAccount] TO  SCHEMA OWNER 
GO
ALTER TABLE [dbo].[InputInfo]  WITH CHECK ADD FOREIGN KEY([inputId])
REFERENCES [dbo].[Input] ([inputId])
GO
ALTER TABLE [dbo].[InputInfo]  WITH CHECK ADD FOREIGN KEY([itemId])
REFERENCES [dbo].[Item] ([itemId])
GO
ALTER TABLE [dbo].[Item]  WITH CHECK ADD FOREIGN KEY([suplierId])
REFERENCES [dbo].[Suplier] ([suplierId])
GO
ALTER TABLE [dbo].[OutputInfo]  WITH CHECK ADD FOREIGN KEY([customerId])
REFERENCES [dbo].[Customer] ([customerId])
GO
ALTER TABLE [dbo].[OutputInfo]  WITH CHECK ADD FOREIGN KEY([inputInfoId])
REFERENCES [dbo].[InputInfo] ([inputInfoId])
GO
ALTER TABLE [dbo].[OutputInfo]  WITH CHECK ADD FOREIGN KEY([itemId])
REFERENCES [dbo].[Item] ([itemId])
GO
ALTER TABLE [dbo].[OutputInfo]  WITH CHECK ADD FOREIGN KEY([outnputId])
REFERENCES [dbo].[Out_put] ([outnputId])
GO
USE [master]
GO
ALTER DATABASE [KhoQuanAo] SET  READ_WRITE 
GO
