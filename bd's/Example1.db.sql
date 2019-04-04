BEGIN TRANSACTION;
CREATE TABLE IF NOT EXISTS `Names_districts` (
	`Bashmakovo`	TEXT NOT NULL,
	`Bekovo`	TEXT NOT NULL,
	`Belinckii`	TEXT NOT NULL,
	`Bessonovckii`	TEXT NOT NULL,
	`Vadinckii`	TEXT NOT NULL,
	`Gorodishenckii`	TEXT NOT NULL,
	`Zemetchinckii`	TEXT NOT NULL,
	`Iccinckii`	TEXT NOT NULL,
	`Kamenckii`	TEXT NOT NULL,
	`Kameshkirckii`	TEXT NOT NULL,
	`Kolishleickii`	TEXT NOT NULL,
	`Kyzneckii`	TEXT NOT NULL,
	`Lopatinckii`	TEXT NOT NULL,
	`Luninckii`	TEXT NOT NULL,
	`Maloserdobinckii`	TEXT NOT NULL,
	`Mokshanckii`	TEXT NOT NULL,
	`Narovchatckii`	TEXT NOT NULL,
	`Neverkinckii`	TEXT NOT NULL,
	`Nizhnelomovckii`	TEXT NOT NULL,
	`Nikolckii`	TEXT NOT NULL,
	`Pachelmckii`	TEXT NOT NULL,
	`Penzenckii`	TEXT NOT NULL,
	`Serdobinckii`	TEXT NOT NULL,
	`Sosnovoborskii`	TEXT NOT NULL,
	`Spasskii`	TEXT NOT NULL,
	`Tamalinckii`	TEXT NOT NULL,
	`Shemisheickii`	TEXT NOT NULL
);
CREATE TABLE IF NOT EXISTS `Inform_about_district` (
	`InformID`	INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT UNIQUE,
	`InformationFirst`	TEXT NOT NULL
);
INSERT INTO `Inform_about_district` VALUES (1,'Библиотека имени В.Г. Белинского ведет свое начало с 1896 г. , когда открыта Чембарская бесплатная библиотека при городской управе. В 1897 г. на заседании городской думы учитель, член совета бесплатной библиотеки А.Д.Козьменков выступил с речью о необходимости открытия платной библиотеки им. В.Г. Белинского. Разрешение было получено в декабре 1901 г. Торжественное открытие состоялось 28 декабря 1901 г., через 4,5 года после начала ходатайства об её открытии. Руководило работой библиотеки правление под председательством одного из членов Городской управы. В 1903 г. в библиотеке имелась 721 книга, а читателей - 68 человек. В 1914 г. был открыт Народный дом, сейчас это районный дом культуры. Библиотека получила в этом здании просторное и удобное помещение на втором этаже. Количество книг увеличивалось с каждым годом. К 1914 г. насчитывалось 263 читателя и книжный фонд 3595 экземпляров. На 1 ноября 1947г. читателей насчитывалось 1200 человек, книжный фонд 12750 экземпляров. Зав. библиотекой в это время была З.Д. Архонтова. Зимой 1949 г. в райбиблиотеку А. Фадеев прислал 192 книги - произведения Шекспира, БСЭ и другие. В 1953 г. библиотека переехала в новое здание, специально построенное для неё. Архитектор здания – И.К. Хайдуров. Сегодня это информационное, культурное учреждение. Книжный фонд насчитывает 35 тыс. книг, читателей - 3,5 тыс. человек, книговыдача – 111 тыс. Библиотека использует разные формы работы. В ней работают несколько клубов по интересам.');
COMMIT;
