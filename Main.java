import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

// Clase que representa un Pedido
class Pedido {
    private String cliente;
    private double total;
    private boolean pagado;

    public Pedido(String cliente, double total, boolean pagado) {
        this.cliente = cliente;
        this.total = total;
        this.pagado = pagado;
    }

    public String getCliente() {
        return cliente;
    }

    public double getTotal() {
        return total;
    }

    public boolean isPagado() {
        return pagado;
    }

    @Override
    public String toString() {
        // Traduce el booleano a "Sí" o "No" para que se vea impecable
        String estadoPagado = pagado ? "Sí" : "No";
        return "Pedido [Cliente=" + cliente + ", Total=$" + total + ", Pagado=" + estadoPagado + "]";
    }
}

public class Main {
    public static void main(String[] args) {
        // 1. Crear la lista original de pedidos
        List<Pedido> pedidos = new ArrayList<>();
        pedidos.add(new Pedido("Carlos Pérez", 120000.0, true));
        pedidos.add(new Pedido("Ana Gómez", 45000.0, false));
        pedidos.add(new Pedido("Mateo Rodríguez", 250000.0, true));
        pedidos.add(new Pedido("Lucía Torres", 80000.0, false));

        System.out.println("=== 1. LISTA ORIGINAL DE PEDIDOS ===");
        pedidos.forEach(System.out::println);
        System.out.println();

        // 2. Filtrar pedidos mayores a $100.000 usando Predicate
        System.out.println("=== 2. PEDIDOS MAYORES A $100.000 (Evaluación con Predicate) ===");
        Predicate<Pedido> pedidoGrande = p -> p.getTotal() > 100000.0;
        
        for (Pedido p : pedidos) {
            if (pedidoGrande.test(p)) {
                System.out.println("-> " + p.getCliente() + " tiene un pedido grande por: $" + p.getTotal());
            }
        }
        System.out.println();

        // 3. Aplicar descuento del 10% usando Function
        System.out.println("=== 3. APLICACIÓN DE DESCUENTOS (Transformación con Function) ===");
        Function<Pedido, Double> aplicarDescuento = p -> p.getTotal() * 0.9;

        for (Pedido p : pedidos) {
            double totalConDescuento = aplicarDescuento.apply(p);
            System.out.println("Cliente: " + p.getCliente() + " | Total con 10% de descuento: $" + totalConDescuento);
        }
        System.out.println();

        // 4. Procesar y mostrar facturas electrónicas usando Consumer
        System.out.println("=== 4. PROCESAMIENTO DE FACTURAS (Consumo con Consumer) ===");
        Consumer<Pedido> procesarFactura = p -> {
            String estado = p.isPagado() ? "APROBADO Y PAGADO" : "PENDIENTE DE PAGO";
            System.out.println("[FACTURA ELECTRÓNICA] " + p.getCliente() + " -- Estado: " + estado);
        };

        pedidos.forEach(procesarFactura);
    }
}