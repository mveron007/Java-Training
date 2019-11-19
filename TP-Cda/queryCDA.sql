use chino_market;

/* 1. Redacte una consulta que seleccione las sucursales de un barrio determinado */ 

select * from sucursales where barrio = 'F.Varela';

/* 2. Redacte una consulta que seleccione todas las ventas del mes de octubre */

select * from ventas where fecha like '2019-10%';

/* 3. Redacte una consulta que seleccione todas las ventas que sean mayores a la venta promedio, 
ordenadas de forma descendente */ 
/* select avg(monto) from ventas; */

select * from ventas where monto > (select avg(monto) from ventas) order by monto desc;

/* 4. Redacte una consulta que muestre las ventas de las sucursales de un barrio determinado, 
correspondientes al mes de octubre */ 

select * from ventas inner join sucursales 
on (sucursales.barrio = 'F.Varela') 
where ventas.fecha like '2019-10%';

/* 5. Redacte una consulta que cuente cuantas sucursales tuvieron ingresos mayores a 
un monto determinado, correspondientes al mes de octubre */

select count(*) from sucursales inner join ventas 
on (sucursales.idSucursales=ventas.idSucursales) 
where ventas.monto > 50;	
												
/* 6. Redacte una consulta que obtenga los ingresos de todas las sucursales durante la primera quincena de noviembre, 
y las ordene de menor a mayor */

select sucursales.barrio, ventas.fecha, ventas.monto 
from ventas inner join sucursales 
where ventas.fecha between '2019-11-01' and '2019-11-15' order by ventas.fecha asc;