package org.example.segurcolfx.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Segurcol implements IAuditable {

    private String nombreEmpresa;
    private String nit;
    private String direccion;
    private String telefono;

    private List<Empleado> empleados = new ArrayList<>();
    private List<Servicio> servicios = new ArrayList<>();
    private List<Equipo> equipos = new ArrayList<>();
    private List<RegistroNovedad> novedades = new ArrayList<>();

    // 🔹 Constructores
    public Segurcol(String nombreEmpresa, String nit, String direccion, String telefono) {
        this.nombreEmpresa = nombreEmpresa;
        this.nit = nit;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public Segurcol() {}

    //  Getters y Setters
    public String getNombreEmpresa() { return nombreEmpresa; }
    public void setNombreEmpresa(String nombreEmpresa) { this.nombreEmpresa = nombreEmpresa; }

    public String getNit() { return nit; }
    public void setNit(String nit) { this.nit = nit; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public List<Empleado> getEmpleados() { return empleados; }
    public List<Servicio> getServicios() { return servicios; }
    public List<Equipo> getEquipos() { return equipos; }
    public List<RegistroNovedad> getNovedades() { return novedades; }

    // 🔹 CRUD Empleados
    public void agregarEmpleado(Empleado e) {
        if (!empleados.contains(e)) empleados.add(e);
    }

    public void eliminarEmpleado(Empleado e) {
        empleados.remove(e);
    }

    public Empleado buscarEmpleadoPorDocumento(String documento) {
        return empleados.stream()
                .filter(emp -> emp.getDocumento().equalsIgnoreCase(documento))
                .findFirst()
                .orElse(null);
    }

    //  CRUD Servicios
    public void agregarServicio(Servicio s) {
        if (!servicios.contains(s)) servicios.add(s);
    }

    public void eliminarServicio(Servicio s) {
        servicios.remove(s);
    }

    public Servicio buscarServicioPorCodigo(String codigoContrato) {
        return servicios.stream()
                .filter(serv -> serv.getCodigoContrato().equalsIgnoreCase(codigoContrato))
                .findFirst()
                .orElse(null);
    }

    //  CRUD Equipos
    public void agregarEquipo(Equipo eq) {
        if (!equipos.contains(eq)) equipos.add(eq);
    }

    public void eliminarEquipo(Equipo eq) {
        equipos.remove(eq);
    }

    public Equipo buscarEquipoPorId(String id) {
        return equipos.stream()
                .filter(eq -> eq.getCodigo().equalsIgnoreCase(id))
                .findFirst()
                .orElse(null);
    }

    //  Implementación de IAuditable
    @Override
    public void registrarNovedad(RegistroNovedad novedad) {
        novedades.add(novedad);
    }

    @Override
    public ArrayList<RegistroNovedad> getNovedades(LocalDateTime desde, LocalDateTime hasta) {
        return novedades.stream()
                .filter(n -> n.fechaHora().isAfter(desde) && n.fechaHora().isBefore(hasta))
                .collect(Collectors.toCollection(ArrayList::new));
    }


    @Override
    public String toString() {
        return "Segurcol{" +
                "nombreEmpresa='" + nombreEmpresa + '\'' +
                ", nit='" + nit + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", empleados=" + empleados.size() +
                ", servicios=" + servicios.size() +
                ", equipos=" + equipos.size() +
                ", novedades=" + novedades.size() +
                '}';
    }
}
