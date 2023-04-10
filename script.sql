USE [KhoQuanAo]
GO
/****** Object:  Table [dbo].[Customer]    Script Date: 4/10/2023 3:49:42 PM ******/
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
	[customerContractDate] [date] NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Input]    Script Date: 4/10/2023 3:49:42 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Input](
	[inputId] [int] NOT NULL,
	[inputDate] [datetime] NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[InputInfo]    Script Date: 4/10/2023 3:49:42 PM ******/
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
	[inputInfoStatus] [nvarchar](200) NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Item]    Script Date: 4/10/2023 3:49:42 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Item](
	[itemId] [int] NOT NULL,
	[itemName] [nvarchar](100) NULL,
	[suplierId] [int] NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Out_put]    Script Date: 4/10/2023 3:49:42 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Out_put](
	[outnputId] [int] NOT NULL,
	[outputDate] [datetime] NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[OutputInfo]    Script Date: 4/10/2023 3:49:42 PM ******/
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
	[outputStatus] [nvarchar](200) NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Suplier]    Script Date: 4/10/2023 3:49:42 PM ******/
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
	[suplierContractDate] [date] NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[UserAccount]    Script Date: 4/10/2023 3:49:42 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[UserAccount](
	[username] [nvarchar](20) NOT NULL,
	[password] [nvarchar](50) NULL
) ON [PRIMARY]
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
