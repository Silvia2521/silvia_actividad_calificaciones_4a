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
package com.example.silvias_actividad_calificaciones_4a

class AnalizadorCalificaciones {
    private val calificaciones = mutableListOf<Float>();

    fun agregarCalificacion (calificacion: Float) {
        calificaciones.add(calificacion);
    }

    fun calcularPromedio (): Float {
        var suma = 0.0f;
        if (calificaciones.size == 0) return 0.0F;
        for (cal in calificaciones) {
            suma += cal;
        };
        return suma / calificaciones.size;
    }

    fun contarAprobadas(): Int {
        var aprobadas = 0;
        for (cal in calificaciones) {
            if (cal >= 7.0) {
                aprobadas++;
            };
        }
        return aprobadas;
    }

    fun contarReprobadas(): Int {
        var reprobadas = 0;
        for (cal in calificaciones) {
            if (cal < 7.0) {
                reprobadas++;
            };
        };
        return reprobadas;
    }

    fun obtenerCalificacionMaxima(): Float? {
        if (calificaciones.size == 0) return null;
        return calificaciones.maxOrNull();
    }
//USO DEL maxOrNull y minOrNull
    fun obtenerCalificacionMinima(): Float? {
        if (calificaciones.size == 0) return null;
        return calificaciones.minOrNull();
    }
}



