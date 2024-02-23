/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLADOR;

/**
 *
 * @author 59398
 */
import MODELO.Libro;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class LibroControlador {
    private Connection conectar;
    private PreparedStatement ejecutar;
    private ResultSet res;

    public LibroControlador() {
        ConexionBDD parametros = new ConexionBDD();
        conectar = parametros.conectar();
    }

    public void insertarLibro(Libro libro) {
        try {
            String sql = "CALL AgregarLibro(?, ?, ?, ?, ?, ?, ?, ?)";
            CallableStatement cs = conectar.prepareCall(sql);
            cs.setString(1, libro.getTitulo());
            cs.setString(2, libro.getAutor());
            cs.setString(3, libro.getISBN());
            cs.setInt(4, libro.getPaginas());
            cs.setInt(5, libro.getEdicion());
            cs.setString(6, libro.getEditorial());
            cs.setString(7, libro.getLugar());
            cs.setString(8, libro.getFechaEdicion());
            
            int resultado = cs.executeUpdate();
            
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Libro creado con éxito");
            } else {
                JOptionPane.showMessageDialog(null, "Error al crear el libro");
            }
            
            cs.close();
        } catch (SQLException e) {
            System.out.println("Error al insertar libro: " + e.getMessage());
        }
    }

    public ArrayList<Object[]> listarLibros() {
    ArrayList<Object[]> listaLibros = new ArrayList<>();
    
    try {
        String sql = "CALL ListarLibros()";
        ejecutar = conectar.prepareStatement(sql);
        res = ejecutar.executeQuery();
        
        int cont = 1;
        while (res.next()) {
            Object[] obLibro = new Object[9]; // Corregir el tamaño del arreglo a 9
            obLibro[0] = cont;
            obLibro[1] = res.getObject("titulo");
            obLibro[2] = res.getObject("autor");
            obLibro[3] = res.getObject("ISBN");
            obLibro[4] = res.getObject("paginas");
            obLibro[5] = res.getObject("edicion");
            obLibro[6] = res.getObject("editorial");
            obLibro[7] = res.getObject("lugar");
            obLibro[8] = res.getObject("fecha_edicion");
            
            listaLibros.add(obLibro);
            cont++;
        }
        
        ejecutar.close();
        return listaLibros;
    } catch (SQLException e) {
        System.out.println("Error al listar libros: " + e.getMessage());
    }
    
    return null;
}


    public void eliminarLibro(int id) {
        try {
            String sql = "DELETE FROM libros WHERE id = ?";
            ejecutar = conectar.prepareStatement(sql);
            ejecutar.setInt(1, id);
            ejecutar.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Libro eliminado con éxito");
        } catch (SQLException e) {
            System.out.println("Error al eliminar libro: " + e.getMessage());
        }
    }

    public ArrayList<Object[]> buscarLibros(String parteTitulo) {
        ArrayList<Object[]> listaLibros = new ArrayList<>();
        
        try {
            String sql = "CALL BuscarLibrosPorTitulo(?)";
            CallableStatement cs = conectar.prepareCall(sql);
            cs.setString(1, parteTitulo);
            res = cs.executeQuery();
            
            int cont = 1;
            while (res.next()) {
                Object[] obLibro = new Object[8];
                obLibro[0] = cont;
                obLibro[1] = res.getObject("titulo");
                obLibro[2] = res.getObject("autor");
                obLibro[3] = res.getObject("ISBN");
                obLibro[4] = res.getObject("paginas");
                obLibro[5] = res.getObject("edicion");
                obLibro[6] = res.getObject("editorial");
                obLibro[7] = res.getObject("lugar");
                obLibro[8] = res.getObject("fecha_edicion");
                
                listaLibros.add(obLibro);
                cont++;
            }
            
            cs.close();
            return listaLibros;
        } catch (SQLException e) {
            System.out.println("Error al buscar libros: " + e.getMessage());
        }
        
        return null;
    }

    public void editarLibro(int id, Libro libro) {
        try {
            String sql = "CALL EditarLibro(?, ?, ?, ?, ?, ?, ?, ?, ?)";
            CallableStatement cs = conectar.prepareCall(sql);
            cs.setInt(1, id);
            cs.setString(2, libro.getTitulo());
            cs.setString(3, libro.getAutor());
            cs.setString(4, libro.getISBN());
            cs.setInt(5, libro.getPaginas());
            cs.setInt(6, libro.getEdicion());
            cs.setString(7, libro.getEditorial());
            cs.setString(8, libro.getLugar());
            cs.setString(9, libro.getFechaEdicion());
            
            int resultado = cs.executeUpdate();
            
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Libro editado con éxito");
            } else {
                JOptionPane.showMessageDialog(null, "Error al editar el libro");
            }
            
            cs.close();
        } catch (SQLException e) {
            System.out.println("Error al editar libro: " + e.getMessage());
        }
    }
}

