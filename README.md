## CRM Teco Trabajo Práctico Programación orientada a Objetos
<h2>Requerimiento</h2>

<p>Teco SA, desde ahora <b>la empresa </b>, necesita el desarrollo de un CRM en un tiempo no mayor a 2 meses.
La empresa vende 3 familias de producto, internet, movil y Tv por cable. 
Sobre cada uno de estos productos ofrecemos una variada oferta de planes con distinto precio. A su vez, en el momento de la venta se le ofere al cliente un porcentaje de descuento a modo de promoción de venta.</p>
<p>La estructura del cliente se compone de la siguiente manera <br> Un cliente puede tener N cuentas de acuedo al domicilio de instalación, a su vez cada una de las cuentas puede tener N productos y servicios. <br>En la empresa manejamos una cartera de más de 10 millones de clientes</p>
<h2>Alcance</h2>
<p>Dada la celeridad con que necesitan el desarrollo y la velocidad que requiere el sistema. Se decide prescindir de una interfaze visual optando por un CRM manejado por consola: </p>
<h2>Flujo</h2>
<p>Cliente multicuenta multiproducto</p>
<p>#Inicio Valido Usuario 3 intentos </p>
<p>#Muestro opciones de Cliente Nuevo o Cliente Existente </p>
<p>#Cliente nuevo: cargo datos del cliente y cuenta, luego Paso a mostrar el carro: Vendo planes con dos variantes de promociones, seún familia de productos 1-Internet 2 Movil 3 Tv. Luego muestro el resultado del carrito con los totales incluyendo la promoción</p>
<p>#Cliente existente, muestro los productos que tienen instanciado el cliente</p>