/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class LibroTableModel extends AbstractTableModel {
    private final String[] columnNames = {"Título", "Autor", "ISBN", "Páginas", "Edición", "Editorial", "Lugar", "Fecha"};
    private final Libro[] libros;

    public LibroTableModel(Libro[] libros) {
        this.libros = libros;
    }

    LibroTableModel(ArrayList<Libro> libros) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getRowCount() {
        return libros.length;
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public String getColumnName(int col) {
        return columnNames[col];
    }

    @Override
    public Object getValueAt(int row, int col) {
        Libro libro = libros[row];
        switch (col) {
            case 0:
                return libro.getTitulo();
            case 1:
                return libro.getAutor();
            case 2:
                return libro.getISBN();
            case 3:
                return libro.getPaginas();
            case 4:
                return libro.getEdicion();
            case 5:
                return libro.getEditorial();
            case 6:
                return libro.getLugar();
            case 7:
                return libro.getFecha();
            default:
                return null;
        }
    }
}
