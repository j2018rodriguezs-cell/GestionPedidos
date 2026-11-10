# Actividad Colaborativa #3: Programación funcional aplicada en Java

## 👥 Integrantes
* Jonathan David Rodríguez Suárez
* Juan José Benitez

## 📋 Descripción del Problema o Escenario Seleccionado
El proyecto implementa un sistema de **Gestión de Pedidos** para un establecimiento comercial. Permite administrar una lista de transacciones comerciales y aplicar comportamientos funcionales sobre los datos utilizando expresiones lambda e interfaces funcionales en Java.

## 📊 Descripción de los Datos Utilizados
El programa opera sobre una estructura de datos lineal basada en `List<Pedido>`, donde cada objeto almacena los siguientes atributos:
* `cliente` (`String`): Nombre del comprador.
* `total` (`double`): Monto monetario total del pedido.
* `pagado` (`boolean`): Estado financiero que indica si la factura ya fue pagada (`true`) o está pendiente (`false`).

## ⚡ Explicación de las Expresiones Lambda Implementadas
El programa hace uso de tres interfaces funcionales nativas de Java para procesar los datos:

1. **`Predicate<Pedido>`**:
   * **Qué recibe:** Un objeto de tipo `Pedido`.
   * **Qué operación realiza:** Evalúa una condición booleana para filtrar los pedidos cuyo monto total sea superior a $100.000 (`p.getTotal() > 100000.0`).
   * **Qué devuelve:** Un valor de tipo `boolean` (`true` o `false`).

2. **`Function<Pedido, String>`**:
   * **Qué recibe:** Un objeto de tipo `Pedido`.
   * **Qué operación realiza:** Transforma el dato aplicando un cálculo matemático (10% de descuento sobre el total) y estructurando una cadena de texto informativa[cite: 1].
   * **Qué devuelve:** Un objeto de tipo `String` con el resumen del descuento aplicado[cite: 1].

3. **`Consumer<Pedido>`**:
   * **Qué recibe:** Un objeto de tipo `Pedido`.
   * **Qué operación realiza:** Procesa la información consumiendo el objeto para imprimir un reporte detallado en forma de factura electrónica simulada según el estado del pago[cite: 1].
   * **Qué devuelve:** No retorna ningún valor (`void`), solo ejecuta la acción de salida en consola[cite: 1].

## 🚀 Instrucciones Claras para Compilar y Ejecutar el Programa
1. Asegúrate de tener instalado Java JDK (versión 8 o superior) en tu equipo.
2. Clona este repositorio o descarga el archivo fuente `GestionPedidos.java`[cite: 1].
3. Abre tu terminal o entorno de desarrollo preferido (como Visual Studio Code)[cite: 1].
4. Compila el archivo ejecutando en la terminal:
   ```bash
   javac GestionPedidos.java

1. Ejecuta el programa con el comando:
   ```bash
   java GestionPedidos

## 📈 Ejemplo de los Resultados Esperados
Al ejecutar el programa, la consola muestra de forma secuencial la lista original, el resultado del filtro con `Predicate`, la transformación del `Function` y el procesamiento de las facturas con `Consumer`:


=== 1. LISTA ORIGINAL DE PEDIDOS ===

Pedido [Cliente=Carlos Pérez, Total=$120000.0, Pagado=true]
Pedido [Cliente=Ana Gómez, Total=$45000.0, Pagado=false]

Pedido [Cliente=Mateo Rodríguez, Total=$250000.0, Pagado=true]

Pedido [Cliente=Lucía Torres, Total=$80000.0, Pagado=false]


=== 2. PEDIDOS MAYORES A $100.000 (Evaluación con Predicate) ===

-> Carlos Pérez tiene un pedido grande por: $120000.0

-> Mateo Rodríguez tiene un pedido grande por: $250000.0


=== 3. APLICACIÓN DE DESCUENTOS (Transformación con Function) ===

Cliente: Carlos Pérez | Total con 10% de descuento: $108000.0

Cliente: Ana Gómez | Total con 10% de descuento: $40500.0

Cliente: Mateo Rodríguez | Total con 10% de descuento: $225000.0

Cliente: Lucía Torres | Total con 10% de descuento: $72000.0


=== 4. PROCESAMIENTO DE FACTURAS (Consumo con Consumer) ===

[FACTURA ELECTRÓNICA] Carlos Pérez -- Estado: APROBADO Y PAGADO

[FACTURA ELECTRÓNICA] Ana Gómez -- Estado: PENDIENTE DE PAGO

[FACTURA ELECTRÓNICA] Mateo Rodríguez -- Estado: APROBADO Y PAGADO

[FACTURA ELECTRÓNICA] Lucía Torres -- Estado: PENDIENTE DE PAGO


## 🤖 Declaración sobre el Uso de Herramientas de Inteligencia Artificial
* **Herramienta utilizada:** Gemini (Google IA).
* **Para qué se utilizó:** Como apoyo conceptual y metodológico para estructurar la lógica orientada a interfaces funcionales en Java y redactar la documentación técnica del repositorio.
* **Qué parte de la respuesta se tuvo que verificar, modificar o corregir:** Se verificó y probó línea por línea la ejecución del código fuente en Visual Studio Code, ajustando la estructura del flujo de datos en la consola para garantizar el cumplimiento estricto de los requerimientos académicos. 