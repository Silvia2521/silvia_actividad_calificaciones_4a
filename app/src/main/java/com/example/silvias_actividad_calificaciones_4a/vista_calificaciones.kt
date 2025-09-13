package com.example.silvias_actividad_calificaciones_4a

fun main() {
    val totalCalificaciones = 7;
    val analizador = AnalizadorCalificaciones();

    println("Ingresa tus $totalCalificaciones calificaciones (1-10)...");

    for (i in 0 until totalCalificaciones) {
        print("Calificacion ${i + 1}: ");
        val calificacion = readln().toFloat();
        analizador.agregarCalificacion(calificacion);
    };

    println("\n*** Resultado del Anslisis ***");

    println("Promedio final : ${analizador.calcularPromedio() }");
    println("Materias aprobadas: ${analizador.contarAprobadas()}");
    println("Materias reprobadas: ${analizador.contarReprobadas() }");
    println("Calificacion mas alta: ${analizador.obtenerCalificacionMaxima()  }");
    println("Calificacion mas baja: ${analizador.obtenerCalificacionMinima() }");
}