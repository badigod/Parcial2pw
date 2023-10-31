package Servicios;

import org.springframework.stereotype.Service;

@Service
public class VehiculoService {
    private final VehiculoRepository vehiculoRepository;
    private final TipoVehiculoRepository tipoVehiculoRepository;

    @Autowired
    public VehiculoService(VehiculoRepository vehiculoRepository, TipoVehiculoRepository tipoVehiculoRepository) {
        this.vehiculoRepository = vehiculoRepository;
        this.tipoVehiculoRepository = tipoVehiculoRepository;
    }

    public List<Vehiculo> obtenerTodosLosVehiculos() {
        return vehiculoRepository.findAll();
    }

    public Vehiculo guardarVehiculo(Vehiculo vehiculo) {
        return vehiculoRepository.save(vehiculo);
    }

    public List<TipoVehiculo> obtenerTodosLosTiposDeVehiculo() {
        return tipoVehiculoRepository.findAll();
    }
}
