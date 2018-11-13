# SuperStore
### App for store management.
### Developing by VovaBranch and MisterMax.

#### Постановка задачи: 

Есть Товары, которые продаются в Магазинах. У магазинов есть код (уникальный), 
название (можно уникальное) и адрес. У товаров есть уникальное название. В каждом 
магазине установлена своя цена на товар и есть в наличии определенное количество 
единиц товара (какого-то товара может и не быть) 
 
Написать методы для следующих операций: 
1)  Создать магазин 
2)  Создать товар 
3)  Завезти партию товаров в магазин (набор товар-количество с возможностью 
установить/изменить цену) 
4)  Найти магазин, в котором определенный товар самый дешевый 
5)  Понять, какие товары можно купить в магазине на некоторую сумму (например, на 
100 рублей можно купить три мороженки или две шоколадки) 
6)  Купить партию товаров в магазине (параметры - сколько каких товаров купить, 
метод возвращает общую стоимость покупки либо её невозможность, если товара 
не хватает) 
7)  Найти, в каком магазине партия товаров (набор товар-количество) имеет 
наименьшую сумму (в целом). Например, «в каком магазине дешевле всего купить 
10 гвоздей и 20 шурупов». Наличие товара в магазинах учитывается! 
 
(во всех пунктах «магазин» — это конкретный магазин, код или название которого 
передается в параметрах) 
 
Приложение должно содержать обособленные слои – клиент (в простейшем случае – 
функция main) обращается к сервисному слою, а за данными сервисный слой идёт в слой 
DAO. Слой DAO имеет две имплементации – реляционную базу данных либо файлы. Какая 
из имплементаций подключается, определяется в конфигурационном файле (.property). 
Программа при старте создаёт необходимые имплементации и сервисные классы, 
которыми потом может пользоваться клиентский тестовый метод. 
 
Требования к реляционной базе: схему определяем сами, запросы тоже, одна просьба – 
не использовать хранимые процедуры. 
 
Требования к файлам: два файла – для магазинов и для товаров в формате csv 
Для магазинов: на каждой строчке два значения – код магазина и название 
Пример: 
 
1,Магнит 
2,Ашан 
 
Для товаров: в каждой строчке название товара, за которым идут тройки вида – код 
магазина, где продается товар, количество в магазине, цена 
Пример: 
 
Шоколад ‘Аленка’,1,50,40.00,2,60,45.00 
Телевизор PHILIPS,2,1,21000.00 
 
В качестве дополнительного бонуса (и для удобства) можно написать скрипт (с отдельной 
точкой входа) для преобразования данных из файлов в базу данных и обратно
