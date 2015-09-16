
package com.example.jpa.entities;


import com.example.jsf.controller.util.JsfUtil;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="USUARIOS")
public class Usuarios implements Serializable{
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="id_usuario")
    private int idusuario;
    
 
    private String nombres;
 
  
    private String apellidos;
    
  
    private String telefono;
    
    
    private String direccion;
    
    @ManyToOne
    @JoinColumns({
    @JoinColumn(name="id_ciudad",referencedColumnName="id_ciudad"),
    @JoinColumn(name="id_departamento",referencedColumnName="id_departamento")    
})
    private Ciudad idciudad;
   
    
    

    private String email;
    
    
    
    @Column(name="fecha_nac")
    @Temporal(TemporalType.DATE)
    private Date fecha_nac;
    
 
    private char sexo;
 
  
    private String password;
    
    @ManyToOne
    @JoinColumn(name="id_rol", referencedColumnName="id_rol")
    private Roles rol;
    
       @OneToMany(mappedBy = "usuario")
    private List<Calificaciones_Servicio> calificacionesServicios;
    
    public Usuarios(){
        
    }
    
    public Usuarios(int idusuario){
        this.idusuario = idusuario;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(Date fecha_nacimiento) {
        this.fecha_nac = fecha_nacimiento;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        
         try {
            this.password = JsfUtil.generateDigest(password);
        }catch (NoSuchAlgorithmException | UnsupportedEncodingException ex) {
             Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.password = password;
    }

    public Roles getIdrol() {
        return rol;
    }

    public void setIdrol(Roles idrol) {
        this.rol = idrol;
    }

    public Ciudad getIdciudad() {
        return idciudad;
    }

    public void setIdciudad(Ciudad idciudad) {
        this.idciudad = idciudad;
    }

    public List<Calificaciones_Servicio> getCalificacionesServicios() {
        return calificacionesServicios;
    }

    public void setCalificacionesServicios(List<Calificaciones_Servicio> calificacionesServicios) {
        this.calificacionesServicios = calificacionesServicios;
    }
    
    
    
}
