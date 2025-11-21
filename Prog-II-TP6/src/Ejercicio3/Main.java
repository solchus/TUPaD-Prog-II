/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author Nicolás
 */
public class Main {

    public static void main(String[] args) {
        Universidad u = new Universidad("UTN");

        // 1) 3 profesores
        Profesor p1 = new Profesor("P1", "Ana Gómez", "POO");
        Profesor p2 = new Profesor("P2", "Luis Pérez", "BD");
        Profesor p3 = new Profesor("P3", "María Díaz", "Redes");

        // 2) 5 cursos
        Curso c1 = new Curso("CUR-101", "Programación 2");
        Curso c2 = new Curso("CUR-102", "Estructuras de Datos");
        Curso c3 = new Curso("CUR-103", "Base de Datos I");
        Curso c4 = new Curso("CUR-104", "Redes I");
        Curso c5 = new Curso("CUR-105", "Arquitectura");

        // Altas
        u.agregarProfesor(p1);
        u.agregarProfesor(p2);
        u.agregarProfesor(p3);
        u.agregarCurso(c1);
        u.agregarCurso(c2);
        u.agregarCurso(c3);
        u.agregarCurso(c4);
        u.agregarCurso(c5);

        // 3) Asignar profesores a cursos
        u.asignarProfesorACurso("CUR-101", "P1");
        u.asignarProfesorACurso("CUR-102", "P1");
        u.asignarProfesorACurso("CUR-103", "P2");
        u.asignarProfesorACurso("CUR-104", "P3");

        // 4) Listar cursos y profesores
        System.out.println("== Cursos ==");
        u.listarCursos();
        System.out.println("\n== Profesores ==");
        u.listarProfesores();
        System.out.println("\n== Cursos por profesor ==");
        p1.listarCursos();
        p2.listarCursos();
        p3.listarCursos();

        // 5) Cambiar profesor de un curso (CUR-104 pasa de P3 a P2)
        System.out.println("\n== Reasignación: CUR-104 -> P2 ==");
        u.asignarProfesorACurso("CUR-104", "P2");
        p2.listarCursos();
        p3.listarCursos();

        // 6) Remover un curso y confirmar que ya no está en la lista del profesor
        System.out.println("\n== Eliminar CUR-103 ==");
        u.eliminarCurso("CUR-103");
        p2.listarCursos();

        // 7) Remover un profesor (P1) y dejar profesor = null en sus cursos
        System.out.println("\n== Eliminar profesor P1 ==");
        u.eliminarProfesor("P1");
        u.listarCursos(); // los cursos de P1 ahora deben mostrar 'Sin profesor'

        // 8) Reporte: cantidad de cursos por profesor
        System.out.println("\n== Reporte: cantidad de cursos por profesor ==");
        for (Profesor p : new Profesor[]{p1, p2, p3}) {
            System.out.println(p.getNombre() + ": " + p.getCursos().size());
        }
    }
}
