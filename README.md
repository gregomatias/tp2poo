## CRM Teco Trabajo Práctico Programación orientada a Objetos
<h2>Requerimiento</h2>

<p>Teco SA, desde ahora <b>la empresa </b>, necesita el desarrollo de un CRM en un tiempo no mayor a 2 meses.
La empresa vende 3 familias de producto, internet, movil y Tv por cable. 
Sobre cada uno de estos productos ofrecemos una variada oferta de planes con distinto precio. A su vez, en el momento de la venta se le ofere al cliente un porcentaje de descuento a modo de promoción de venta.</p>
<p>La estructura del cliente se compone de la siguiente manera <br> Un cliente puede tener UNA cuentas de acuedo con el domicilio de instalación, a su vez la cuentas puede tener N productos y servicios. <br>En la empresa manejamos una cartera de más de 10 millones de clientes</p>
<p>A su vez la empresa necesita que el CRM sea manejada por usuarios</p>
<p>Cuando el cliente es nuevo, vendemos solamente los productos principales con su promocion, de acuerdo a la politica comercial. Una vez activo, el cliente puede acceder a servicios de venta adicionales, como ser peliculas.</p>
<h2>Alcance</h2>
<p>Dada la celeridad con que necesitan el desarrollo y la velocidad que requiere el sistema. Se decide prescindir de una interfaze visual optando por un CRM manejado por consola: </p>
<p>El lenguaje de programación utilizado será Java</p>
<h2>Flujo</h2>
<h3>Cliente Una cuenta multiproducto</h3>
<p>1)Inicio Valido Usuario 3 intentos </p>
<p>2)Muestro opciones de Cliente Nuevo o Cliente Existente </p>
<p>3)Cliente nuevo: cargo datos del cliente y cuenta, luego Paso a mostrar el carro: Vendo planes con dos variantes de promociones seún familia de productos 1-Internet 2 Movil 3 Tv. Luego muestro el resultado del carrito con los totales incluyendo la promoción.</p>
<p>4)Cliente existente: muestro los productos que tienen instanciado el cliente.</p>
<p>5)Muestro opciones de venta de productos adicionales</p>
<p>6)Envio el evento elegido a provisioning</p>