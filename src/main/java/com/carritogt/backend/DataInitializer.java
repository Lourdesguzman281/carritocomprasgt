package com.carritogt.backend;

import com.carritogt.backend.model.Producto;
import com.carritogt.backend.repository.ProductoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner initDatabase(ProductoRepository repository) {
        return args -> {
            if (repository.count() == 0) {
                repository.save(new Producto(null, "Hamburguesa Clásica", 45.00, 10));
                repository.save(new Producto(null, "Papas Fritas", 20.00, 25));
                repository.save(new Producto(null, "Refrescos Naturales", 15.00, 30));
                repository.save(new Producto(null, "Combo CarritoGT", 65.00, 15));
                System.out.println("¡Productos de prueba insertados correctamente!");
            }
        };
    }
}