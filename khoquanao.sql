USE [master]
GO
/****** Object:  Database [KhoQuanAo]    Script Date: 4/10/2023 4:11:30 PM ******/
CREATE DATABASE [KhoQuanAo]
GO
USE [KhoQuanAo]
GO
/****** Object:  Table [dbo].[Customer]    Script Date: 4/10/2023 4:11:30 PM ******/
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
/****** Object:  Table [dbo].[Input]    Script Date: 4/10/2023 4:11:30 PM ******/
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
/****** Object:  Table [dbo].[InputInfo]    Script Date: 4/10/2023 4:11:30 PM ******/
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
/****** Object:  Table [dbo].[Item]    Script Date: 4/10/2023 4:11:30 PM ******/
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
/****** Object:  Table [dbo].[Out_put]    Script Date: 4/10/2023 4:11:30 PM ******/
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
/****** Object:  Table [dbo].[OutputInfo]    Script Date: 4/10/2023 4:11:30 PM ******/
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
/****** Object:  Table [dbo].[Suplier]    Script Date: 4/10/2023 4:11:30 PM ******/
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
/****** Object:  Table [dbo].[UserAccount]    Script Date: 4/10/2023 4:11:30 PM ******/
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
INSERT [dbo].[Item] ([itemId], [itemName], [suplierId]) VALUES (111, N'AO1', 123)
INSERT [dbo].[Item] ([itemId], [itemName], [suplierId]) VALUES (12234, N'quan1', 123)
GO
INSERT [dbo].[Suplier] ([suplierId], [suplierName], [suplierAddress], [suplierPhone], [suplierEmail], [suplierMoreInfo], [suplierContractDate]) VALUES (122, N'3vangngoc', N'long ien', 3423423, N'dfsdfsd', N'ban vang', CAST(N'2021-09-24' AS Date))
INSERT [dbo].[Suplier] ([suplierId], [suplierName], [suplierAddress], [suplierPhone], [suplierEmail], [suplierMoreInfo], [suplierContractDate]) VALUES (123, N'Cẩm Lan', N'Long Xuyên', 123456789, N'camlansuc@gmail.com', N'Chuyên sỉ ', CAST(N'2019-11-20' AS Date))
GO
INSERT [dbo].[UserAccount] ([username], [password]) VALUES (N'khacthien', N'thienzc123')
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
