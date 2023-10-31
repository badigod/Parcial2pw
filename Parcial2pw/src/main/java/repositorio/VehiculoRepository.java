package repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import Controller.Vehiculo;

public interface VehiculoRepository extends JpaRepository<Vehiculo, Long> {
    
}

