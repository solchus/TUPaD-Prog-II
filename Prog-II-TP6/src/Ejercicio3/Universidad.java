/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author Nicolás
 */
import java.util.ArrayList;
import java.util.List;

public class Universidad {

    private String nombre;
    private final List<Profesor> profesores = new ArrayList<>();
    private final List<Curso> cursos = new ArrayList<>();

    public Universidad(String nombre) {
        this.nombre = nombre;
    }

    public boolean agregarProfesor(Profesor p) {
        if (p == null || buscarProfesorPorId(p.getId()) != null) {
            return false;
        }
        return profesores.add(p);
    }

    public boolean agregarCurso(Curso c) {
        if (c == null || buscarCursoPorCodigo(c.getCodigo()) != null) {
            return false;
        }
        return cursos.add(c);
    }

    public boolean asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso c = buscarCursoPorCodigo(codigoCurso);
        Profesor p = buscarProfesorPorId(idProfesor);
        if (c == null || p == null) {
            return false;
        }
        c.setProfesor(p);
        return true;
    }

    public void listarProfesores() {
        if (profesores.isEmpty()) {
            System.out.println("No hay profesores.");
            return;
        }
        for (Profesor p : profesores) {
            p.mostrarInfo();
        }
    }

    public void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println("No hay cursos.");
            return;
        }
        for (Curso c : cursos) {
            c.mostrarInfo();
        }
    }

    public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : profesores) {
            if (p.getId().equalsIgnoreCase(id)) {
                return p;
            }
        }
        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : cursos) {
            if (c.getCodigo().equalsIgnoreCase(codigo)) {
                return c;
            }
        }
        return null;
    }

    public boolean eliminarCurso(String codigo) {
        Curso c = buscarCursoPorCodigo(codigo);
        if (c == null) {
            return false;
        }
        if (c.getProfesor() != null) {
            c.setProfesor(null);
        }
        return cursos.remove(c);
    }

    public boolean eliminarProfesor(String id) {
        Profesor p = buscarProfesorPorId(id);
        if (p == null) {
            return false;
        }
        for (Curso c : new ArrayList<>(p.getCursos())) {
            c.setProfesor(null);
        }
        return profesores.remove(p);
    }
}
